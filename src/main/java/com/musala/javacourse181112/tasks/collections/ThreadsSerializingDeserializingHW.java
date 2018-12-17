package com.musala.javacourse181112.tasks.collections;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class ThreadsSerializingDeserializingHW {

    public static void main(String[] args) {
        Queue<LinkedList<Integer>> integerQueue = new LinkedList<>();

        LinkedList<Integer> intList = new LinkedList<>();

        for (int i = 0; i <20; i++){
            intList.add(i);
        }
        for(int i=0 ; i<10; i++){
            integerQueue.offer(intList);
        }

        File directory = getSerializedDirectory();
        writeObjects(directory, integerQueue);
    }

    public static void writeObjects(File directory,Queue<LinkedList<Integer>> integerQueue)
    {
        try
        {
            FileOutputStream fileOut =
                    new FileOutputStream(directory+"//serializedData");
            ObjectOutputStream out =
                    new ObjectOutputStream(fileOut);
            for(LinkedList i:integerQueue){
                out.writeObject(i);
            }
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
