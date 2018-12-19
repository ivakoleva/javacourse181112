package com.musala.javacourse181112.tasks;

import java.io.*;
import java.nio.charset.Charset;

public class InputStreamWriter {

    private static final String INPUT_FILE_NAME = "non_default_encoding_file.txt";
    private static final String OUTPUT_FILE_NAME = "output.txt";
    private static final String ENCODING = "Windows-1251";

    public static void main(final String[] args) {

        useInputStream();
    }

    private static void useInputStream() {
        try(
                final InputStreamReader inputStream   = new InputStreamReader (new FileInputStream(INPUT_FILE_NAME)
                                                                                , Charset.forName(ENCODING));
                final OutputStreamWriter outputStream = new OutputStreamWriter(new FileOutputStream(OUTPUT_FILE_NAME)
                                                                                ,Charset.forName(ENCODING));
                final BufferedReader buffReader = new BufferedReader(inputStream);
                final BufferedWriter buffWriter = new BufferedWriter(outputStream);
           ) {

            int i;
            while ((i = buffReader.read())!= -1){
                buffWriter.write((char) i);
                System.out.print  ((char) i);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
