package com.musala.javacourse181112.tasks;

import java.io.*;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;

public class InputStreamWriterExercise {
    public static void main(final String[] args) {
        try(InputStream reader=new BufferedInputStream(new FileInputStream("sketch.txt"),128);
            Writer writer= new OutputStreamWriter(new FileOutputStream("BufferedOutputStreamExercise.txt"),
                    Charset.forName("Windows-1251"))) {
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
            byte[] buffer=new byte[128];
            while ((reader.read(buffer)) != -1) {
                text.add(returnIntoString(buffer));
            }
        }catch (IOException ignored){
        }
        finally {
            return text;
        }
    }

    private static String returnIntoString(byte[] buffer){
        String str="";
        for(byte i:buffer){
            str+=((char)i);
        }
        return str;
    }
}
}
