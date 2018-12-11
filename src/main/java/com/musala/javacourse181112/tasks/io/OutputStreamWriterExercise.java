package com.musala.javacourse181112.tasks.io;
//** OutputStreamWriterExercise exercise
//        *** using FileOutputStream, bridge to Writer then write some content
//        *** content encoding - Windows-1251
//        *** add buffering (Buffered*) - TO DO !!!

import java.io.*;
import java.nio.charset.Charset;
import java.util.Scanner;

public class OutputStreamWriterExercise {
    public static final Scanner SCANNER = new Scanner(System.in);

    public static void main(final String[] args) {
//        usingOutputStreamWriterAndReader();
//        usingBufferedWriterAndReader();
    }

//    public static void usingBufferedWriterAndReader() {
//        try (final Writer writer = new BufferedWriter(new OutputStreamWriter(
//                new FileOutputStream("another_non_default_encoding_file.txt"),
//                "Windows-1251"));
//             final Reader reader = new BufferedReader(new InputStreamReader(
//                     new FileInputStream("another_non_default_encoding_file.txt"),
//                     Charset.forName("Windows-1251"))) {
//            writer.write(SCANNER.nextLine());
//            writer.write("Дали работи по този начин?\n");
//            writer.flush();
//
//                 int i;
//            while((i =reader.read())!=-1)
//
//                 {
//                     System.out.print((char) i);
//                 }
//
//            reader.close();
//             }
//    }
//
//    {
//    } catch(
//    UnsupportedEncodingException e)
//
//    {
//            e.printStackTrace();
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }


//        public static void usingOutputStreamWriterAndReader() {
//            try (final OutputStreamWriter outputStreamWriter = new OutputStreamWriter(
//                    new FileOutputStream("non_default_encoding_file.txt"), "Windows-1251");
//                 final InputStreamReader inputStreamReader = new InputStreamReader(
//                         new FileInputStream("non_default_encoding_file.txt"),
//                         Charset.forName("Windows-1251"))
//            ) {
//                outputStreamWriter.write("Здравей! Днес се упражняваме от вкъщи.\n");
//                outputStreamWriter.write(SCANNER.nextLine());
//
//                SCANNER.close();
//
//                outputStreamWriter.flush();
//                outputStreamWriter.close();
//
//                int i;
//                while ((i = inputStreamReader.read()) != -1) {
//                    System.out.print((char) i);
//                }
//                inputStreamReader.close();
//
//
//            } catch (FileNotFoundException e) {
//                e.printStackTrace();
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//        }
}
