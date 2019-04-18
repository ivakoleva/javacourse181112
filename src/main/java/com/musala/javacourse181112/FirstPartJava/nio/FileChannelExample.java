package com.musala.javacourse181112.FirstPartJava.nio;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

/**
 * Created by Iva Koleva on 9/10/15.
 */
public class FileChannelExample {
    public static void main(final String[] args) throws IOException {
        /*try (final FileChannel fileChannel = FileChannel.open(Paths.get("/tmp/asd"), StandardOpenOption.CREATE, StandardOpenOption.WRITE)) {
            fileChannel.write(ByteBuffer.wrap(new byte[]{'a', 'b'}));
        }*/

        try (final FileChannel fileChannel = FileChannel.open(Paths.get("/tmp/asd"), StandardOpenOption.READ)) {
            final ByteBuffer byteBuffer = ByteBuffer.allocate(1);
            int i;
            while ((i = fileChannel.read(byteBuffer)) != -1) {
                System.out.println((char) byteBuffer.get(0));
                byteBuffer.clear(); // important, otherwise will loop forever on  buffer data populated on first loop !
            }
        }
    }
}
