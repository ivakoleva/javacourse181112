package com.musala.javacourse181112.tasks;

import java.io.*;
import java.util.function.BiConsumer;

public class PipedOutputInputStreamExercise {
    private static BiConsumer<InputStream, OutputStream> inputStreamOutputStreamBiConsumer = ((inputStream, outputStream) -> {
        Thread writingThread = new Thread(() -> {
            try {
                final Writer writer = new OutputStreamWriter(outputStream);
                for (int i = 0; i < 5; i++) {
                    Thread.sleep(1000);
                    writer.write("String" + i + System.lineSeparator());
                    writer.flush();
                    System.out.println(Thread.currentThread().getName() + " wrote String" + i);
                }

                outputStream.close();
            } catch (IOException | InterruptedException e) {
                e.printStackTrace();
            }
        });

        Thread readingThread = new Thread(() -> {
            try {
                final LineNumberReader lineNumberReader = new LineNumberReader(new InputStreamReader(inputStream));
                String testString;
                while ((testString = lineNumberReader.readLine()) != null) {
                    System.out.println(Thread.currentThread().getName() + " read- " + testString);
                    Thread.sleep(1000);
                }

            } catch (IOException | InterruptedException e) {
                e.printStackTrace();
            }
        });

        writingThread.start();
        readingThread.start();
        try {
            writingThread.join();
            readingThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    });

    public static void main(final String[] args) {
        PipedOutputStream pipedOutputStream = null;
        PipedInputStream pipedInputStream = null;

        try {
            pipedInputStream = new PipedInputStream();
            pipedOutputStream = new PipedOutputStream(pipedInputStream);
            inputStreamOutputStreamBiConsumer.accept(pipedInputStream, pipedOutputStream);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (pipedInputStream != null) {
                try {
                    pipedInputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                if (pipedOutputStream != null) {
                    try {
                        pipedOutputStream.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }
}
