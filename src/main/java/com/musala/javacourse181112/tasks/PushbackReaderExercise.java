package com.musala.javacourse181112.tasks;

import java.io.FileReader;
import java.io.IOException;
import java.io.PushbackReader;

public class PushbackReaderExercise {
    private static final String INPUT_FILE_NAME = "input.txt";
    private static final int LIMIT = 3;

    public static void main(String[] args) {
        getUsePushbackReader();
    }

    private static void getUsePushbackReader() {
        try(PushbackReader pushbackReader = new PushbackReader(new FileReader(INPUT_FILE_NAME), LIMIT+1);
        ) {
            int i,j,repeat = 0;
            char[] buf2 = new char[LIMIT];
            final char[] buf = new char[138];
               while ((i = pushbackReader.read(buf))!=-1){
                for (j = 0;( buf[j]!='\0' || j < i ); j++) {
                    System.out.print(buf[j]);
                    char curChar = buf[j];

                    if (curChar >= 'a' && curChar <= 'p') {
                        //System.out.println("\n>"+curChar);
                        /*for(int k=0; k <LIMIT; k++){
                            pushbackReader.unread(buf2[i-k+1]);
                        }*/
                        pushbackReader.unread(buf[j]);
                        pushbackReader.unread(buf[--j]);
                        pushbackReader.unread(buf[--j]);
                        System.out.println();
                        break;
                    }

                }
                   if (++repeat > 1){
                       break ;
                   }
               }
        } catch (IOException e) {
            System.err.println(e.getMessage());;
        }
    }
}
