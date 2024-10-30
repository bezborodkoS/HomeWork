package com.exemple.app;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class DownloadFileExample {
    public static void downloadFileUsingURL(String fileUrl, String destination) throws IOException {
        try (InputStream in = new URL(fileUrl).openStream()) {
            Files.copy(in, Paths.get(destination), StandardCopyOption.REPLACE_EXISTING);
            System.out.println("File downloaded to " + destination);
        }
    }

    public static void main(String[] args) throws IOException {
        String fileUrl = "https://example.com/file.jpg";
        String destination = "file.jpg";
        downloadFileUsingURL(fileUrl, destination);
    }
}
