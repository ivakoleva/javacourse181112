package com.musala.javacourse181112.nio;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.file.*;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Iva Koleva on 9/29/15.
 */
public class NewZipFileSystemExample {
    public static void main(final String[] args) throws IOException, URISyntaxException {
        final Path zipFilePath = Paths.get("/tmp/asd.zip");
        final Map<String, String> env = new HashMap<>();
        env.put("create", String.valueOf(!zipFilePath.toFile().exists()));

        final URI zipFilePathURI = zipFilePath.toUri();
        final URI zipFileFullURI = new URI("jar:" + zipFilePathURI.getScheme(), zipFilePathURI.getPath(), null);

        try (FileSystem zipFileSystem = FileSystems.newFileSystem(zipFileFullURI, env)) { // with resources; creating the zip file
            final Path zipRootDir = zipFileSystem.getPath("myziproot");
            Files.createDirectory(zipRootDir);
            Files.copy(Paths.get("/tmp/asd"), zipRootDir, StandardCopyOption.REPLACE_EXISTING);
        }
    }
}