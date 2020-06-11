package api;

import java.io.File;
import java.io.IOException;
import java.util.List;
 
/**
 * This program demonstrates a usage of the MultipartUtility class.
 * @author www.codejava.net
 *
 */
public class MultipartFileUploader {
 
    public static void main(String[] args) {
        String charset = "UTF-8";
        File uploadFile1 = new File("E:\\pra\\07a26427-64e5-4e08-8a04-9e844ed26b04.tif");
       // File uploadFile2 = new File("e:/Test/PIC2.JPG");
        String requestURL = "https://secure.dev.30preprod.com/api/secure-document/11ea7317-224d-132a-b4a4-23974c1c95b4/file-record?file-category=AGREEMENT&owner-type=member";
 
        try {
            MultipartUtility multipart = new MultipartUtility(requestURL, charset);
             
            multipart.addHeaderField("User-Agent", "CodeJava");
            multipart.addHeaderField("Test-Header", "Header-Value");
             
            multipart.addFormField("description", "Cool Pictures");
            multipart.addFormField("keywords", "Java,upload,Spring");
             
            multipart.addFilePart("fileUpload", uploadFile1);
            //multipart.addFilePart("fileUpload", uploadFile2);
 
            List<String> response = multipart.finish();
             
            System.out.println("SERVER REPLIED:");
             
            for (String line : response) {
                System.out.println(line);
            }
        } catch (IOException ex) {
            System.err.println(ex);
        }
    }
}