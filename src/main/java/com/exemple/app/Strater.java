package com.exemple.app;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

//import static com.exemple.app.DownloadFileHttpURLConnection.downloadFileUsingHttpURLConnection;

public class Strater {

    private CreateZip createZip = new CreateZip();
    public static final String D_TEST_ZIP_ARC_ZIP = "D:\\test\\zip\\arc.zip";

    public List<String> downloadJPG(List<String> urlList, String directory){
        List<String> nameFileList = new ArrayList<>();
        for (String s : urlList) {
            String name = null;
            try {
                name = new DownloadFileHttpURLConnection().downloadFileUsingHttpURLConnection(s,directory);
                if (name!=null) {
                    nameFileList.add(name);
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            checkSize(nameFileList);
        }
        return nameFileList;
    }

    public void checkSize (List<String> nameFile){
        if (nameFile.size()>=2){
            createZip.createZipArchive(D_TEST_ZIP_ARC_ZIP,nameFile);
        }
    }
}
