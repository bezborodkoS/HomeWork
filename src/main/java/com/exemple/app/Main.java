package com.exemple.app;

import com.exemple.app.zip.ListFilesInZip;

import java.util.Arrays;
import java.util.List;


public class Main {
    public static void main(String[] args) {
        String directory ="D:\\test";
        String nameZipFile ="tom_first.zip";
        List<String>files = Arrays.asList("one.txt", "two.txt", "three.txt");
//        №1
//        new CreateZipArchive().createZip(nameZipFile, files);
//        №2
//        new UnzipArchive().unzip(nameZipFile,directory);
//        №3
//        new CompressGZIP().compressGzip(directory+"\\"+files.get(0), "file.txt.gz");
//        №4
//        new DecompressGZIP().decompressGzip("file.txt.gz", "newfile.txt");
//        №5
//        System.out.println(new ValidateZip().isValidZipFile(nameZipFile));
//        №6
//        System.out.println(new FindFileInZip().isFileInZip(nameZipFile, files.get(0)));
//        №7
        new ListFilesInZip().listFiles(nameZipFile).forEach(System.out::println);
    }
}
