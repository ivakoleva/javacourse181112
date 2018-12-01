package com.musala.javacourse181112.tasks;

import java.io.*;

public class FileCreator {
    public static void main(String[] args) throws IOException {
        final File file = new File("src","file.txt");
        file.createNewFile();
        final OutputStream outputStream=new FileOutputStream("file.txt");
        final byte[] buffer = new byte[1027];
        buffer[0]=(byte)'a';
        buffer[1]=(byte)'b';
        buffer[2]=(byte)'c';
        int i;
        final FileInputStream inputStream = new FileInputStream("tasks.md");
        while ((i = inputStream.read(buffer,3,buffer.length-3)) != -1) {
            outputStream.write(buffer,3,i);
        }
        System.out.println("file:" + file.exists());
    }
}
