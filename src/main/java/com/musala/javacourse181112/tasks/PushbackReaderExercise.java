package com.musala.javacourse181112.tasks;

import com.sun.org.apache.xml.internal.serialize.LineSeparator;
import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;

import java.io.FileReader;
import java.io.IOException;
import java.io.PushbackReader;
import java.io.Reader;
import java.nio.charset.Charset;

public class PushbackReaderExercise {

    public static void main(String[] args) {
        int i;
        int toBeUnread = 3;
        char[] buff = new char[128];
        try(PushbackReader pushbackReader = new PushbackReader(new FileReader("WritingParameters.txt"), toBeUnread+1)) {
            while ((i = pushbackReader.read(buff)) != -1) {
                System.out.print(buff);
                int j=0;
                while(Character.isWhitespace(buff[i-1-j])){
                    j++;
                }
                if (buff[i -1-j] >= 'a' && buff[i -1- j] <= ('a' + 'z') / 2) {
                    for(int k=0;k<toBeUnread+j;k++){
                        pushbackReader.unread(buff[i-k-1]);
                    }
                }

            }
            System.out.println(System.lineSeparator());
        }catch (IOException ignored){
        }
    }
}
