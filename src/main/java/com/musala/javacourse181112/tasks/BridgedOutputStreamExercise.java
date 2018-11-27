package com.musala.javacourse181112.tasks;

import java.io.*;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;

public class BridgedOutputStreamExercise {
    public static void main(final String[] args) {
        try(InputStream reader=new BufferedInputStream(new FileInputStream("sketch.txt"),64) ;Writer writer= new OutputStreamWriter(new FileOutputStream("BufferedOutputStreamExercise.txt"),Charset.forName("Windows-1251"))) {
           List textList= read(reader);
           write(textList, writer);
        } catch (IOException ignored) {
        }
    }

    private static void write(final List text,final Writer writer) {
            text.forEach(i-> {
                try {
                    writer.write(i.toString());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            });
    }

    private static List read(final InputStream reader) {
        List<String> text=new ArrayList<>();
        try{
            byte[] b=new byte[64];
            int i;
            while ((i=(reader.read(b))) != -1) {
                text.add(stringing(b));
            }
        }catch (IOException ignored){
        }
        finally {
            return text;
        }
    }

    private static String stringing(byte[] b){
        String s="";
        for(byte i:b){
            s+=((char)i);
        }
        return s;
    }
}
