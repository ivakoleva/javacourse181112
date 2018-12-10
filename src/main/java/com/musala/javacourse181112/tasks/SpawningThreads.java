package com.musala.javacourse181112.tasks;

import java.io.*;

public class SpawningThreads {
    private final static int LIMIT = 5;

    public static void main(String[] args) {
        PipedInputStream pipedInputStream = null;
        PipedOutputStream pipedOutputStream = null;
        // TODO: try-with-resources
        try {
            pipedInputStream = new PipedInputStream();
            pipedOutputStream = new PipedOutputStream(pipedInputStream);

            //useInputOutputStream(pipedInputStream, pipedOutputStream);
            triConsumer.accept(pipedInputStream, pipedOutputStream, "exiting...");
        } catch (IOException e) {
            e.printStackTrace();
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

    private static TriConsumer<InputStream, OutputStream, String> triConsumer = (inputStream, outputStream, exitMessage) -> {
        final Runnable writingRunnable = () -> {
            try {
                final Writer writer = new OutputStreamWriter(outputStream);
                int i = 0;
                while (!Thread.interrupted() && i < LIMIT) {
                    final String result = "Hi";
                    writer.write(result + System.lineSeparator());
                    writer.flush();
                    System.out.println(Thread.currentThread().getName() + ": just written - " + result);
                    i++;
                    Thread.sleep(1000 * 2);
                }
                writer.close();
            } catch (IOException | InterruptedException e) {
                e.printStackTrace();
            }
        };

        final Runnable readingRunnable = () -> {
            try {
                final LineNumberReader lineNumberReader = new LineNumberReader(new InputStreamReader(inputStream));
                String line;

                while (!Thread.interrupted() && (line = lineNumberReader.readLine()) != null) { // pipe broken exception
                    System.out.println(Thread.currentThread().getName() + ": just read - " + line);
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

        // forever running
        try {
            readingThread.join();
            writingThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(exitMessage);
        System.exit(0);
    };
}




