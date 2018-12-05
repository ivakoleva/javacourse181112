package com.musala.javacourse181112.MyStuff;
/*
* ** PushbackReader exercise *** use buffer of 128 length
* *** print to stdout *** if last buffer char read is [a-p]
 * - unread 3 chars, in order to print them again
 * todo try-catch
* */

import java.io.FileReader;
import java.io.IOException;
import java.io.PushbackReader;
/*
*   todo: Bonus: subclass FilterInputStream
 *** count all read operations (each time read() is being called from outside)
 *** add a counter class field
 *** implement getCount() method
* */

public class PushbackReaderExersice {
    public static void main(String[] args) throws IOException {
        int i;
        final char buffer[]= new char [128];
        final PushbackReader reader = new PushbackReader(new FileReader("tasks_copy.md"), 3);
        while((i = reader.read(buffer))!= -1){
            if (buffer[i-1] >= 'a' && buffer[i-1] <= ('a'+'z')/2){ // buffer starts from 0
                reader.unread(buffer, i-4, 3); // -3 -1
            }
            System.out.println(buffer);
        }
        reader.close();
    }
}
