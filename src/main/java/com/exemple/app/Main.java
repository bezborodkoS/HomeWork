package com.exemple.app;

import javax.crypto.spec.PSource;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static com.exemple.app.DownloadFileHttpURLConnection.downloadFileUsingHttpURLConnection;

public class Main {
    public static void main(String[] args) throws IOException {
        List<String> urlList = new ArrayList<>();
        List<String> nameFileList = new ArrayList<>();
        String fileUrl1 = "https://p7.hiclipart.com/preview/124/426/559/tiger-flame-lion-tigon-tiger.jpg";
        String fileUrl = "https://png.pngtree.com/png-vector/20230930/ourmid/pngtree-panda-png-with-ai-generated-png-image_10153558.png";
        String fileUrl2 = "https://img.freepik.com/free-vector/cute-koala-cartoon-character_1308-132636.jpg";
//        String fileUrl3 ="https://images.pexels.com/photos/1670413/pexels-photo-1670413.jpeg?cs=srgb&dl=pexels-prasanthdas-1670413.jpg&fm=jpg";
//        urlList.add(fileUrl3);
        urlList.add(fileUrl);
        urlList.add(fileUrl1);
        urlList.add(fileUrl2);

        String directory ="D:\\test\\";
        String nameZipFile ="D:\\test\\zip\\arc.zip";
        new Strater().downloadJPG(urlList,directory);

        System.out.println(nameFileList.size());
//        downloadFileUsingHttpURLConnection(fileUrl, destination);

//        new CreateZip().createZipArchive(nameZipFile, Collections.singletonList(destination));
    }
}
