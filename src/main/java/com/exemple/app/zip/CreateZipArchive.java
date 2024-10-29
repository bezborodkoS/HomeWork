package com.exemple.app.zip;

import java.io.*;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import java.util.zip.ZipOutputStream;

public class CreateZipArchive {


//    Задача 1: Створення ZIP-архіву з декількох файлів
//    Завдання: Напишіть програму, яка створює ZIP-архів із трьох файлів.
    public void createZip(String nameZipFile, List<String> files) {

        try (ZipOutputStream zipOutputStream = new ZipOutputStream(new FileOutputStream(nameZipFile))) {
            for (String file : files) {
                File fileCreate = new File(file);
                fileCreate.createNewFile();
                try (FileInputStream fis = new FileInputStream(file)) {
                    ZipEntry zipEntry = new ZipEntry(file);
                    zipOutputStream.putNextEntry(zipEntry);

                    byte[] buffer = new byte[1024];
                    int length;
                    while ((length = fis.read(buffer)) > 0) {
                        zipOutputStream.write(buffer, 0, length);
                    }
                }
                fileCreate.delete();
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
