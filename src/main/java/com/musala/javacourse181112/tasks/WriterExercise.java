package com.musala.javacourse181112.tasks;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class WriterExercise {

    public static void main(final String[] args) {

        try( final Writer writer=new FileWriter("test.txt")) {
for(int i=0;i<args.length;i++){
    writer.write(args[i]);

}

        } catch (IOException ignored) {

        }

    }


    }

