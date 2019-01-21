package com.musala.javacourse181112.homeworks;

import java.io.*;


public class PipedIOSpawningThreadsHomework {
    public static void main(String[] args) {
        PipedInputStream pipedInputStream = null;
        PipedOutputStream pipedOutputStream = null;
        try {
            pipedInputStream = new PipedInputStream();
            pipedOutputStream = new PipedOutputStream(pipedInputStream);
            inputStreamOutputStreamTriConsumer.accept(pipedInputStream, pipedOutputStream, "Exiting program");

        } catch (IOException e) {

        } finally {
            if (pipedInputStream != null) {
                try {
                    pipedInputStream.close();
                } catch (IOException ignored) {
                }
            }
            if (pipedOutputStream != null) {
                try {
                    pipedOutputStream.close();

                } catch (IOException ignored) {
                }

            }

        }

    }

    private static TriConsumer<InputStream, OutputStream, String> inputStreamOutputStreamTriConsumer = ((inputStream, outputStream, message) -> {
        final Runnable writingRunnable = () -> {
            try {
                int i = 0;
                final Writer writer = new OutputStreamWriter(outputStream);
                while (!Thread.interrupted() && i < 5) {
                    final String result = "Hi";
                    writer.write(result + System.lineSeparator());
                    writer.flush();
                    System.out.println(Thread.currentThread().getName() + ": just written - " + result);
                    Thread.sleep(1000 * 2);
                    i++;
                }
            } catch (IOException | InterruptedException e) {
                e.printStackTrace();
            }

        };
        final Runnable readingRunnable = () -> {
            try {
                final LineNumberReader lineNumberReader = new LineNumberReader(new InputStreamReader(inputStream));
                while (!Thread.interrupted()) {
                    System.out.println(Thread.currentThread().getName() + ": just read - " +
                            lineNumberReader.readLine());

                    Thread.sleep(1000 * 2);
                }
            } catch (IOException | InterruptedException e) {
                e.printStackTrace();
            }
        };
        final Thread readingThread = new Thread(readingRunnable);
        final Thread writingThread = new Thread(writingRunnable);
        readingThread.start();
        writingThread.start();
        try {
            readingThread.join();
            writingThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(message);
        System.exit(0);
    });
}
