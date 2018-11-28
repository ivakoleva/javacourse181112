package com.musala.javacourse181112.tasks;
//** OutputStreamWriterExercise exercise
//        *** using FileOutputStream, bridge to Writer then write some content
//        *** content encoding - Windows-1251
//        *** add buffering (Buffered*)

import java.io.*;
import java.nio.charset.Charset;

public class OutputStreamWriterExercise {
    public static void main(final String[] args) {

        try (final OutputStreamWriter outputStreamWriter = new OutputStreamWriter(
                new FileOutputStream("non_default_encoding_file.txt"), "Windows-1251");
             final InputStreamReader inputStreamReader = new InputStreamReader(
                     new FileInputStream("non_default_encoding_file.txt"),
                     Charset.forName("Windows-1251"))
        ) {
            outputStreamWriter.write("Здравей! Днес се упражняваме от вкъщи.");
            outputStreamWriter.flush();
            outputStreamWriter.close();

            int i;
            while ((i = inputStreamReader.read()) != -1) {
                System.out.print((char) i);
            }
            inputStreamReader.close();


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
