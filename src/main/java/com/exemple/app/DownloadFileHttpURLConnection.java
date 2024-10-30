package com.exemple.app;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class DownloadFileHttpURLConnection {

//    public static final String IMAGE = "image";

    public static String downloadFileUsingHttpURLConnection(String fileUrl, String directory) throws IOException {

        URL url = new URL(fileUrl);
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
//
        connection.setRequestMethod("GET");
        System.out.println(connection.getContentType()+" format");
        String nameFile = directory+fileUrl.substring(fileUrl.lastIndexOf("/")+1,fileUrl.length());
String format = fileUrl.substring(fileUrl.lastIndexOf("."),fileUrl.length());
        if (format.equals(".jpg")){
        try (InputStream in = connection.getInputStream();
             FileOutputStream out = new FileOutputStream(nameFile)) {
            byte[] buffer = new byte[1024];
            int bytesRead;
            while ((bytesRead = in.read(buffer)) != -1) {
                out.write(buffer, 0, bytesRead);
            }
            return nameFile;
        }

//            System.out.println("File downloaded to " + nameFile);
        }

        return null;
    }

//    public static void main(String[] args) throws IOException {
//        String fileUrl = "https://www.google.com/search?sca_esv=362529b1f3dde5c1&rlz=1C1CHZN_ruUA988UA988&sxsrf=ADLYWIID5tOTcPhrfGY43H-zIKTy1ypyCQ:1730309654570&q=tiger+png&udm=2&fbs=AEQNm0A8NLnHQsnv3eSO77JkwM6y1-IPBOxhEyeMFSOL5X2tD93-zCml69Blud-h-QQE3YzdRbJyDUxfAE74oxz5I2wLVW7pVnAiMMaRSmFF49-62i4s-lxkvfEI-WiayMqgpeYY0s9uQmXjCKeH0bl_0pdR6ycGZpt_8QZlwC38mZEdwlu5uvJCdee3OQCOPftDpg0e6y_fQ_314sthDRloWx3kS8Q15q1ZmdpWjdg1f-XfJ-Q1Xg-6RUdwfijfYieeFEWENV25&sa=X&sqi=2&ved=2ahUKEwjGmL_i0baJAxXwLBAIHS8vCCoQtKgLegQIJxAB&biw=1920&bih=911&dpr=1";
//        String destination = "file.jpg";
//        downloadFileUsingHttpURLConnection(fileUrl, destination);
//    }
}
