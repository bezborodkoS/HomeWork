package com.exemple.app;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class CreateZip {
    public void  createZipArchive(String nameZipFile, List<String> files){
        try(ZipOutputStream zipOutputStream = new ZipOutputStream(new FileOutputStream(nameZipFile))) {
            for (String file : files) {
                try (FileInputStream fileInputStream = new FileInputStream(file)){
                    ZipEntry zipEntry = new ZipEntry(file);
                    zipOutputStream.putNextEntry(zipEntry);
                    byte[] buffer = new byte[1024];
                    int leng;
                    while ((leng = fileInputStream.read(buffer))>0){
                        zipOutputStream.write(buffer,0,leng);
                    }
                }

            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
