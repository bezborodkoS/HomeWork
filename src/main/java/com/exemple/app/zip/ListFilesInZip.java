package com.exemple.app.zip;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

public class ListFilesInZip {

//    Задача 7: Виведення списку файлів у ZIP-архіві
//    Завдання: Напишіть програму, яка виводить список файлів у ZIP-архіві.
    public List<String> listFiles(String zipFilePath){
        List<String> filesInZip = new ArrayList<>();
        try (ZipFile zipFile = new ZipFile(zipFilePath)) {
            for (ZipEntry entry : zipFile.stream().toList()) {
                filesInZip.add(entry.getName());
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return filesInZip;
    }
}
