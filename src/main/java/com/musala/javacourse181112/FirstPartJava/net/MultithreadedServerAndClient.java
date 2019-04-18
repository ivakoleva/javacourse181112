package com.musala.javacourse181112.FirstPartJava.net;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/**
 * Created by Iva Koleva on 9/20/15.
 */
public class MultithreadedServerAndClient {
    public static void main(final String[] args) throws IOException {
        final Executor executor = Executors.newFixedThreadPool(6);
        final ServerSocket server = new ServerSocket(31337);

        final Runnable clientRunnable = () -> {
            System.out.println(Thread.currentThread() + ": trying to connect now");

            for (int i = 0; i < 10; i++) {
                Socket socket = null;
                try {
                    socket = new Socket("localhost", 31337);
                    final PrintWriter printWriter = new PrintWriter(socket.getOutputStream());
                    final BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));

                    final String ping = Thread.currentThread() + ": ping " + i + " [hi :)]\n";
                    printWriter.write(ping);
                    printWriter.flush();
                    System.out.print(ping);

                    String responseMsg = null;
                    while ((responseMsg = reader.readLine()) == null) {
                        // wait
                    }
                    System.out.println(responseMsg + " pong from the server!");
                } catch (IOException e) {
                    e.printStackTrace();
                } finally {
                    if (socket != null) {
                        try {
                            socket.close();
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
        };
        executor.execute(clientRunnable);
        executor.execute(clientRunnable);

        while (true) {
            executor.execute(new ServerRunnable(server.accept()));
        }
    }
}

class ServerRunnable implements Runnable {
    private final Socket socket;

    public ServerRunnable(Socket socket) {
        super();
        this.socket = socket;
    }

    @Override
    public void run() {
        try {
            final BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            final PrintWriter printWriter = new PrintWriter(socket.getOutputStream());
            printWriter.write(bufferedReader.readLine());
            printWriter.flush();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (socket != null) {
                try {
                    socket.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
