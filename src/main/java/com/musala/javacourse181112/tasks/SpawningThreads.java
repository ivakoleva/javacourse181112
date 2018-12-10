package com.musala.javacourse181112.tasks;

import java.io.*;
import java.util.Objects;
import java.util.function.BiConsumer;

public class SpawningThreads {
    private final static int LIMIT = 5;

    public interface TriConsumer<T, U, V> {
        public void accept(T t, U u, V v);

        public default TriConsumer<T, U, V> andThen(TriConsumer<? super T, ? super U, ? super V> after) {
            Objects.requireNonNull(after);
            return (a, b, c) -> {
                accept(a, b, c);
                after.accept(a, b, c);
            };
        }
    }

    public static void main(String[] args) {
        PipedInputStream pipedInputStream = null;
        PipedOutputStream pipedOutputStream = null;
        // TODO: try-with-resources
        try {
            pipedInputStream = new PipedInputStream();
            pipedOutputStream = new PipedOutputStream(pipedInputStream);
            Thread thread = new Thread();

            //useInputOutputStream(pipedInputStream, pipedOutputStream);
            TriConsumer.accept(pipedInputStream, pipedOutputStream, thread);
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


    private static TriConsumer<InputStream, OutputStream, Thread> TriConsumer = ((inputStream, outputStream, thread) -> {

        final Runnable writingRunnable = () -> {
            try {
                final Writer writer = new OutputStreamWriter(outputStream);
                int i = 0;
                while (!thread.interrupted() && i < LIMIT) {
                    final String result = "Hi";
                    writer.write(result + System.lineSeparator());
                    writer.flush();
                    System.out.println(thread.currentThread().getName() + ": just written - " + result);
                    i++;
                    thread.sleep(1000 * 2);
                }
            } catch (IOException | InterruptedException e) {
                e.printStackTrace();
            }
        };

        final Runnable readingRunnable = () -> {
            try {
                final LineNumberReader lineNumberReader = new LineNumberReader(new InputStreamReader(inputStream));
                String line;

                while (!thread.interrupted() &&  (line = lineNumberReader.readLine()) != null) { // pipe broken exception
                    System.out.println(thread.currentThread().getName() + ": just read - " +
                            lineNumberReader.readLine());

                    thread.sleep(1000 * 2);
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




