package com.exemple.app.gzip;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.GZIPInputStream;

public class DecompressGZIP {

//    Читання GZIP-файлу
//    Завдання: Напишіть програму для читання файлу, стиснутого у форматі GZIP.
    public  void decompressGzip(String gzipFile, String newFile) {
        try (GZIPInputStream gzipIS = new GZIPInputStream(new FileInputStream(gzipFile));
             FileOutputStream fos = new FileOutputStream(newFile)) {

            byte[] buffer = new byte[1024];
            int length;
            while ((length = gzipIS.read(buffer)) > 0) {
                fos.write(buffer, 0, length);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
