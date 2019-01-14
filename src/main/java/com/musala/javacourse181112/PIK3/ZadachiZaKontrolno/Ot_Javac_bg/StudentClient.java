package com.musala.javacourse181112.PIK3.ZadachiZaKontrolno.Ot_Javac_bg;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.Scanner;

public class StudentClient {

    public static void main(String[] args) {
        System.out.print("�������� ����� ��: ");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        System.out.print("�������� ������ �����: ");
        double uspeh = sc.nextDouble();
        sc.nextLine();
        System.out.print("�������� �����: ");
        double dohod = sc.nextDouble();
        sc.nextLine();
        System.out.print("�������� ��������: ");
        String fakultet = sc.nextLine();
        System.out.print("�������� ��� �� ���������: ");
        String doctype = sc.nextLine();
        Document doc = new Document(name, uspeh, dohod, fakultet);
        Socket sock;
        try {
            sock = new Socket("localhost", 5000);
        } catch (IOException ex) {
            System.out.println("Can't connect to server");
            return;
        }
        try(ObjectInputStream in = new ObjectInputStream(sock.getInputStream())){
            System.out.println(in.readUTF());
            try(ObjectOutputStream out = new ObjectOutputStream(sock.getOutputStream())){
                System.out.print("���������� ������� ���� �� ��������� ��� �������...");
                out.writeUTF(doctype);
                out.flush();
                System.out.println(" ������!");
                String response = in.readUTF();
                System.out.println(response);
                if(!response.equals("OK")){
                    System.out.println("���������� ������������� ��� ��������");
                    return;
                }
                System.out.print("���������� ������� ��������� ��� �������...");
                out.writeObject(doc);
                out.flush();
                System.out.println(" ������!");
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
            return;
        }
    }
}
