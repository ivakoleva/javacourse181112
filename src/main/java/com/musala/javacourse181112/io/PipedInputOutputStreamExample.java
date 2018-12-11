package com.musala.javacourse181112.io;

import java.io.*;
import java.util.function.BiConsumer;

/**
 * Created by Iva Koleva on 06.12.2018
 */
public class PipedInputOutputStreamExample {
    public static void main(final String[] args) {
        PipedInputStream pipedInputStream = null;
        PipedOutputStream pipedOutputStream = null;
        // TODO: try-with-resources
        try {
            pipedInputStream = new PipedInputStream();
            pipedOutputStream = new PipedOutputStream(pipedInputStream);

            //useInputOutputStream(pipedInputStream, pipedOutputStream);
            inputStreamOutputStreamBiConsumer.accept(pipedInputStream, pipedOutputStream);
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

    @Deprecated
    private static void useInputOutputStream(final InputStream inputStream, final OutputStream outputStream) {
    }

    private static BiConsumer<InputStream, OutputStream> inputStreamOutputStreamBiConsumer = ((inputStream, outputStream) -> {

        final Runnable writingRunnable = () -> {
            try {
                final Writer writer = new OutputStreamWriter(outputStream);
                while (!Thread.interrupted()) {
                    final String result = "Hi";
                    writer.write(result + System.lineSeparator());
                    writer.flush();
                    System.out.println(Thread.currentThread().getName() + ": just written - " + result);

                    Thread.sleep(1000 * 2);
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


        // forever running
        try {
            readingThread.join();
            writingThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    });
}
