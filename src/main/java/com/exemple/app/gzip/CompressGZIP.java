package com.exemple.app.gzip;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.GZIPOutputStream;

//Задача 3: Стиснення текстових файлів у GZIP
//Завдання: Напишіть програму для стиснення текстового файлу у формат GZIP.
public class CompressGZIP {
    public void compressGzip(String sourceFile, String gzipFile) {
        try (FileInputStream fis = new FileInputStream(sourceFile);
             GZIPOutputStream gzipOS = new GZIPOutputStream(new FileOutputStream(gzipFile))) {

            byte[] buffer = new byte[1024];
            int length;
            while ((length = fis.read(buffer)) > 0) {
                gzipOS.write(buffer, 0, length);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
