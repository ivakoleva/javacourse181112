package com.musala.javacourse181112.FirstPartJava.nio;

import java.io.IOException;
import java.nio.file.*;

/**
 * Created by Iva Koleva on 9/9/15.
 */
public class WatchServiceExample {
    public static void main(final String[] args) throws IOException {
        final WatchService watcher = FileSystems.getDefault().newWatchService();
        final Path path = Paths.get("/tmp");

        path.register(watcher, StandardWatchEventKinds.ENTRY_CREATE, StandardWatchEventKinds.ENTRY_DELETE);

        while (true) {
            WatchKey key = null;
            try {
                key = watcher.take();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            if (key != null) {
                for (WatchEvent<?> watchEvent : key.pollEvents()) {
                    final WatchEvent<Path> event = (WatchEvent<Path>) watchEvent;
                    if (StandardWatchEventKinds.ENTRY_CREATE.equals(event.kind())) {
                        System.out.println("Creating " + event.context().toString());
                    } else if (StandardWatchEventKinds.ENTRY_DELETE.equals(event.kind())) {
                        System.out.println("Deleting " + event.context().toString());
                    } else {
                        System.out.println("hm?");
                    }
                }

                // Reset the key -- this step is critical if you want to
                // receive further watch events.  If the key is no longer valid,
                // the directory is inaccessible so exit the loop.
                boolean valid = key.reset();
                if (!valid) {
                    break;
                }
            }
        }
    }
}
