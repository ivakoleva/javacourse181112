package com.musala.javacourse181112.PIK3.ZadachiZaKontrolno.Ot_Javac_bg;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class StipendiiServer {

    final static LinkedList<Document> normalDocs = new LinkedList<>();
    final static LinkedList<Document> specialDocs = new LinkedList<>();
    final static HashMap<String, Integer> odobreni = new HashMap<>();
    private final static String ODOBRENIPASSWORD = "secret";

    public static void main(String[] args) {
        ConnectionThread studentt;
        ConnectionThread secretariest;
        try {
            studentt = new ConnectionThread(5000, true);
            secretariest = new ConnectionThread(5001, false);
        } catch (IOException e) {
            System.out.println("Can't start server");
            return;
        }
        studentt.start();
        secretariest.start();

        ServerSocket ss;
        try {
            ss = new ServerSocket(5002);
        } catch (IOException e) {
            System.out.println("WARNING: Odobreni service failed to start!!!");
            return;
        }
        while (true) {
            try (Socket sock = ss.accept()) {
                ObjectInputStream in = new ObjectInputStream(sock.getInputStream());
                ObjectOutputStream out = new ObjectOutputStream(sock.getOutputStream());
                out.flush();
                out.writeUTF("Please send your password");
                out.flush();
                String userpass = in.readUTF();
                if (!userpass.equals(ODOBRENIPASSWORD)) {
                    out.writeUTF("BAD PASSWORD. BYE");
                    out.flush();
                    continue;
                }
                out.writeUTF("OK");
                Document doc = (Document) in.readObject();
                synchronized (StipendiiServer.odobreni) {
                    Integer i = StipendiiServer.odobreni.get(doc.name);
                    if (i == null) {
                        i = 0;
                    }
                    StipendiiServer.odobreni.put(doc.name, i + 1);

                    out.writeInt(i + 1);
                    out.flush();
                }
            } catch (IOException e) {
                System.out.println("Secretary IO error in odobreni thread");
            } catch (ClassNotFoundException ex) {
                System.out.println("Secretary sent wrong object in odobreni thread");
            }
        }
    }
}

class ConnectionThread extends Thread {

    ServerSocket ss;
    boolean isStudentAccepter;

    ConnectionThread(int port, boolean isStudentAccepter) throws IOException {
        this.ss = new ServerSocket(port);
        this.isStudentAccepter = isStudentAccepter;
    }

    @Override
    public void run() {
        while (true) {
            Socket sock;
            try {
                sock = this.ss.accept();
                Thread t;
                if (this.isStudentAccepter) {
                    System.out.println("Student connected");
                    t = new StudentThread(sock);
                } else {
                    System.out.println("Secretary connected");
                    t = new SecretariesThread(sock);
                }
                t.start();
            } catch (IOException e) {
                System.out.println("New connection failure");
            }
        }
    }
}

class StudentThread extends Thread {

    Socket sock;

    StudentThread(Socket sock) {
        this.sock = sock;
    }

    @Override
    public void run() {
        try (ObjectOutputStream out = new ObjectOutputStream(this.sock.getOutputStream())) {
            out.writeUTF("Send doctype: \"normal\" or \"speical\"");
            out.flush();
            try (ObjectInputStream in = new ObjectInputStream(this.sock.getInputStream())) {
                String doctype = in.readUTF();
                if (doctype.equals("normal") || doctype.equals("special")) {
                    out.writeUTF("OK");
                    out.flush();
                } else {
                    out.writeUTF("BAD TYPE");
                    out.flush();
                    this.sock.close();
                    return;
                }

                Document doc = (Document) in.readObject();
                if (doctype.equals("normal")) {
                    synchronized (StipendiiServer.normalDocs) {
                        StipendiiServer.normalDocs.add(doc);
                    }
                    System.out.println("New normal document saved.");
                } else {
                    synchronized (StipendiiServer.specialDocs) {
                        StipendiiServer.specialDocs.add(doc);
                    }
                    System.out.println("New special document saved");
                }

            } catch (ClassNotFoundException ex) {
                System.out.println("Client sent invalid object");
            }
        } catch (IOException ex) {
            System.out.println("IO problem with student thread");
        }
    }
}

class SecretariesThread extends Thread {

    Socket sock;
    private final static String PASSWORD = "secret";

    SecretariesThread(Socket sock) {
        this.sock = sock;
    }

    @Override
    public void run() {
        try (ObjectOutputStream out = new ObjectOutputStream(this.sock.getOutputStream())) {
            out.writeUTF("Send your password");
            out.flush();
            try (ObjectInputStream in = new ObjectInputStream(this.sock.getInputStream())) {
                String userpass = in.readUTF();
                if (userpass.equals(SecretariesThread.PASSWORD)) {
                    out.writeUTF("OK");
                    out.flush();
                    System.out.println("Secretary connected");
                } else {
                    out.writeUTF("BAD PASSWORD");
                    out.flush();
                    this.sock.close();
                    System.out.println("Bad password for secretary connection");
                    return;
                }
                Document doc;
                synchronized (StipendiiServer.specialDocs) {
                    if (!StipendiiServer.specialDocs.isEmpty()) {
                        out.writeUTF("special");
                        out.flush();
                        doc = StipendiiServer.specialDocs.getFirst();
                        out.writeObject(doc);
                        out.flush();
                        StipendiiServer.specialDocs.removeFirst();
                        System.out.println("Special doc sent to secretary");
                        return;
                    }
                }

                synchronized (StipendiiServer.normalDocs) {
                    if (!StipendiiServer.normalDocs.isEmpty()) {
                        out.writeUTF("normal");
                        out.flush();
                        doc = StipendiiServer.normalDocs.getFirst();
                        out.writeObject(doc);
                        out.flush();
                        StipendiiServer.normalDocs.removeFirst();
                        System.out.println("Normal doc sent to secretary");
                        return;
                    }
                }
                out.writeUTF("NO DOCS");
                out.flush();
            }
        } catch (IOException ex) {
            System.out.println("IO error with secretary: " + ex.getMessage());
        }
    }
}
