package com.musala.javacourse181112.tasks;

import java.io.*;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;

public class BridgedOutputStreamExercise {
    public static void main(final String[] args) {
        try (//final Reader reader = new InputStreamReader(new BufferedInputStream(new FileInputStream("non_default_encoding_file.txt"), 64), Charset.forName("Windows-1251"));
             final Reader reader = new BufferedReader(new InputStreamReader(new FileInputStream("non_default_encoding_file.txt"), Charset.forName("Windows-1251")), 64);
             final Writer writer = new OutputStreamWriter(new FileOutputStream("BufferedOutputStreamExercise.txt"), Charset.forName("Windows-1251"))
        ) {
            final List textList = read(reader);
            writeToWriter(writer, textList);
        } catch (IOException ignored) {
        }
    }

    private static void writeToWriter(final Writer writer, final List<?> text) {
        text.forEach(i -> {
            try {
                writer.write(i.toString());
            } catch (IOException e) {
                e.printStackTrace();
            }
        });
    }

    private static List read(final Reader reader) {
        final List<String> text = new ArrayList<>();
        try {
            final char[] b = new char[64];
            int i;
            while ((i = (reader.read(b))) != -1) {
                text.add(stringing(b, i));
            }
        } catch (IOException ignored) {
        }
        return text;
    }

    private static String stringing(final char[] buffer, final int length) {
        final StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < length; i++) {
            stringBuilder.append(buffer[i]);
        }
        return stringBuilder.toString();
    }
}
