package com.musala.javacourse181112.tasks.collections;

import java.util.LinkedList;
import java.util.Queue;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class ThreadsSerializingDeserializingHW {

    public static void main(String[] args) {
        Queue<Integer> integerQueue = new LinkedList<>();

        for (int i = 0; i <= 20; i++) ((LinkedList<Integer>) integerQueue).add(i);

        File directory = getSerializedDirectory();
        writeObjects(directory, integerQueue);
    }

    public static void writeObjects(File directory, Object object)
    {
        try
        {
            FileOutputStream fileOut =
                    new FileOutputStream(directory+"//serializedData");
            ObjectOutputStream out =
                    new ObjectOutputStream(fileOut);
            out.writeObject(object);
            out.close();
            fileOut.close();
        }catch(IOException i)
        {
            i.printStackTrace();
        }
    }

    public static File getSerializedDirectory()
    {
        File serializedDir = new File("serialized");
        if (!serializedDir.exists()) {
            serializedDir.mkdir();
        }
        return serializedDir;
    }

}
