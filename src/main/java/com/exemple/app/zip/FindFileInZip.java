package com.exemple.app.zip;

import java.io.IOException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

public class FindFileInZip {
//    Задача 6: Пошук файлу в ZIP-архіві
//    Завдання: Напишіть програму, яка перевіряє наявність конкретного файлу у ZIP-архіві.
    public boolean isFileInZip(String zipFilePath, String fileName) {
        try (ZipFile zipFile = new ZipFile(zipFilePath)) {
            ZipEntry entry = zipFile.getEntry(fileName);
            return entry != null;
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
