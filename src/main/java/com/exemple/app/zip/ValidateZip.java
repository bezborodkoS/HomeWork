package com.exemple.app.zip;

import java.io.File;
import java.io.IOException;
import java.util.zip.ZipFile;

public class ValidateZip {

    //    Задача 5: Валідація ZIP-архіву
//    Завдання: Напишіть програму, яка перевіряє, чи є дійсним формат ZIP-файлу.
    public boolean isValidZipFile(String filePath) {
        try (ZipFile zipFile = new ZipFile(new File(filePath))) {
            return true;
        } catch (IOException e) {
            return false;
        }
    }
}
