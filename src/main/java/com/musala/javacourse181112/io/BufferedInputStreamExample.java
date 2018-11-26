package com.musala.javacourse181112.io;

        import java.io.*;

public class BufferedInputStreamExample {
    public static void main(String[] args) {
        try (final InputStream inputStream = new BufferedInputStream(new FileInputStream("tasks.md"),128)) {
            printInputStreamToStdout(inputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static void printInputStreamToStdout(final InputStream inputStream) throws  IOException {
        int i;
        while((i = inputStream.read()) != -1){
            System.out.println((char)i);
        }
    }
}
