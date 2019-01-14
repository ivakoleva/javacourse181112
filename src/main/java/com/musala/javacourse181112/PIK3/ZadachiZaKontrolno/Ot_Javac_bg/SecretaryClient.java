package com.musala.javacourse181112.PIK3.ZadachiZaKontrolno.Ot_Javac_bg;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;

public class SecretaryClient {

    public static void main(String[] args) throws IOException, ClassNotFoundException{
        Socket sock = new Socket("localhost", 5001);
        ObjectInputStream in = new ObjectInputStream(sock.getInputStream());
        System.out.println(in.readUTF());
        ObjectOutputStream out = new ObjectOutputStream(sock.getOutputStream());
        out.writeUTF("secret");
        out.flush();
        String passOK = in.readUTF();
        if(!passOK.equals("OK")){
            System.out.println("BAD PASSWORD!");
            return;
        }
        String doctype = in.readUTF();
        if(doctype.equals("NO DOCS")){
            System.out.println("Няма документи");
            return;
        }
        Document doc = (Document)in.readObject();
        if(doctype.equals("special")){
            if(doc.mark < 5.30){
                System.out.println("По-нисък успех за специална молба на "+doc.name+". Отхвърлен!");
            }
            else if(doc.income > 300.0){
                System.out.println("По-висок доход за специална молба на "+doc.name+". Отхвърлен!");
            }
            else{
                Socket sock2 = new Socket("localhost", 5002);
                ObjectOutputStream out2 = new ObjectOutputStream(sock2.getOutputStream());
                //out2.writeObject(doc);
                out2.flush();
                ObjectInputStream in2 = new ObjectInputStream(sock2.getInputStream());
                System.out.println(in2.readUTF());
                out2.writeUTF("secret");
                String response = in2.readUTF();
                if(!response.equals("OK")){
                    System.out.println("BAD PASSWORD WHEN CHECKING FOR ODOBRENI");
                    return;
                }
                out2.writeObject(doc);
                int odobreni = in2.readInt();
                if(odobreni > 5){
                    System.out.println("Отхвърлена специална молба на "+doc.name+" заради повече от 5 одобрени");
                }
                else System.out.println("Одобрена специална молба на "+doc.name);
            }
        }
        else if(doctype.equals("normal")){
            if(doc.mark < 5.50){
                System.out.println("По-нисък успех за нормална молба на "+doc.name+". Отхвърлен!");
            }
            else if(doc.income > 500.0){
                System.out.println("По-висок доход за нормална молба на "+doc.name+". Отхвърлен!");
            }
            else{
                Socket sock2 = new Socket("localhost", 5002);
                ObjectOutputStream out2 = new ObjectOutputStream(sock2.getOutputStream());
                out2.flush();
                ObjectInputStream in2 = new ObjectInputStream(sock2.getInputStream());
                System.out.println(in2.readUTF());
                out2.writeUTF("secret");
                String response = in2.readUTF();
                if(!response.equals("OK")){
                    System.out.println("BAD PASSWORD WHEN CHECKING FOR ODOBRENI");
                    return;
                }
                out2.writeObject(doc);
                int odobreni = in2.readInt();
                if(odobreni > 4){
                    System.out.println("Отхвърлена нормална молба на "+doc.name+" заради повече от 4 одобрени");
                }
                else System.out.println("Одобрена нормална молба на "+doc.name);
            }
        }
    }
}
