package api;

import java.io.BufferedReader;
 
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.List;
 
/**
 * This utility class provides an abstraction layer for sending multipart HTTP
 * POST requests to a web server.
 * @author www.codejava.net
 *
 */
public class MultipartUtility {
    private final String boundary;
    private static final String LINE_FEED = "\r\n";
    private HttpURLConnection httpConn;
    private String charset;
    private OutputStream outputStream;
    private PrintWriter writer;
 
    /**
     * This constructor initializes a new HTTP POST request with content type
     * is set to multipart/form-data
     * @param requestURL
     * @param charset
     * @throws IOException
     */
    public MultipartUtility(String requestURL, String charset)
            throws IOException {
        this.charset = charset;
         
        // creates a unique boundary based on time stamp
        boundary = "===" + System.currentTimeMillis() + "===";
         
        URL url = new URL(requestURL);
        httpConn = (HttpURLConnection) url.openConnection();
        httpConn.setUseCaches(false);
        httpConn.setDoOutput(true); // indicates POST method
        httpConn.setDoInput(true);
        httpConn.setRequestProperty("Content-Type",
                "multipart/form-data; boundary=" + boundary);
        httpConn.setRequestProperty("User-Agent", "CodeJava Agent");
        httpConn.setRequestProperty("Test", "Bonjour");
        httpConn.setRequestProperty( "Authorization", "Bearer eyJhbGciOiJSUzI1NiIsInR5cCI6IkpXVCJ9.eyJ0ZW5hbnRfaWQiOiI0MTQyNDMyMC00MzZmLTZkNzAtNjE2ZS03OTIwMjAyMDIwMjAiLCJhdWQiOlsiYWJjLXBheW1lbnQtZ2F0ZXdheSIsInNlY3VyZS1kb2N1bWVudCIsInNlY3VyZS1hdXRob3JpemF0aW9uIl0sIl90IjoiQ0xJRU5UX09OTFkiLCJzY29wZSI6WyJzZWN1cmU6cHJvdGVjdGVkIl0sImV4cCI6MTU4NTkxMjgxNywiYXV0aG9yaXRpZXMiOlsiY29tcGFueTpjbGllbnQtcmVhZCIsIm1lcmNoYW50OmNsaWVudC1kZWxldGUiLCJiYW5rLWNhdGFsb2c6Y2xpZW50LWRlbGV0ZSIsInRyYW5zYWN0aW9uOmNsaWVudC1yZWFkIiwid2ViaG9vazpjbGllbnQtZGVsZXRlIiwicGF5bWVudC10b2tlbjpjbGllbnQtZGVsZXRlIiwicHVibGljLWZpbGUtcmVjb3JkOmNsaWVudC13cml0ZSIsInB1YmxpYy1maWxlLXJlY29yZDpjbGllbnQtcmVhZCIsInB1YmxpYy1maWxlLXJlY29yZDpjbGllbnQtcHJvdGVjdGVkIiwicGF5bWVudDpjbGllbnQtY3JlYXRlIiwicHJvY2Vzc29yOmNsaWVudC1yZWFkIiwic2VjdXJlLWRvY3VtZW50OmNsaWVudC1hZG1pbiJdLCJqdGkiOiIxNzc4ZmMyZi0yN2E3LTQ1YzgtYmRkZC1lYWRhYzFmNzFlYTAiLCJjbGllbnRfaWQiOiJNSUdSQVRJT05fQUdFTlQifQ.fi7WY_twsJV-hlBOhgZ2l0NlpFOo_Gs5dwrHp4l-HfQOUrwW8gcblK-7Iy5QOxwlgeRAK2VPyZLMT530qTqbPrfpNKPYWNDev00wFu-T5MqtPKSFGEhRiA43w-fvwb14SeoBMB9BBEWzztnX3f-PDMhRgvZxToK4ACh99X0GxTBBCoQzpodhi6ouEl5hTfNFoT4mZR2lqmxOKV0sdMHwu7nHv0QXJfnNzSpMSx3fE1Krafs0Z-6ycUNmo0tYm28ejmtRBARQmD25LFwdpuOZ2k0hH5uMlxfyA22JFWxceQrPQFJdTRs2EKxa0fI21P4qpufcRFQMJl81KtJXw2vJDA" );//migration agent
        outputStream = httpConn.getOutputStream();
        writer = new PrintWriter(new OutputStreamWriter(outputStream, charset),
                true);
    }
 
    /**
     * Adds a form field to the request
     * @param name field name
     * @param value field value
     */
    public void addFormField(String name, String value) {
        writer.append("--" + boundary).append(LINE_FEED);
        writer.append("Content-Disposition: form-data; name=\"" + name + "\"")
                .append(LINE_FEED);
        writer.append("Content-Type: text/plain; charset=" + charset).append(
                LINE_FEED);
        writer.append(LINE_FEED);
        writer.append(value).append(LINE_FEED);
        writer.flush();
    }
 
    /**
     * Adds a upload file section to the request
     * @param fieldName name attribute in <input type="file" name="..." />
     * @param uploadFile a File to be uploaded
     * @throws IOException
     */
    public void addFilePart(String fieldName, File uploadFile)
            throws IOException {
        String fileName = uploadFile.getName();
        writer.append("--" + boundary).append(LINE_FEED);
        writer.append(
                "Content-Disposition: form-data; name=\"" + fieldName
                        + "\"; filename=\"" + fileName + "\"")
                .append(LINE_FEED);
        writer.append(
                "Content-Type: "
                        + URLConnection.guessContentTypeFromName(fileName))
                .append(LINE_FEED);
        writer.append("Content-Transfer-Encoding: binary").append(LINE_FEED);
        writer.append(LINE_FEED);
        writer.flush();
 
        FileInputStream inputStream = new FileInputStream(uploadFile);
        byte[] buffer = new byte[4096];
        int bytesRead = -1;
        while ((bytesRead = inputStream.read(buffer)) != -1) {
            outputStream.write(buffer, 0, bytesRead);
        }
        outputStream.flush();
        inputStream.close();
         
        writer.append(LINE_FEED);
        writer.flush();    
    }
 
    /**
     * Adds a header field to the request.
     * @param name - name of the header field
     * @param value - value of the header field
     */
    public void addHeaderField(String name, String value) {
        writer.append(name + ": " + value).append(LINE_FEED);
        writer.flush();
    }
     
    /**
     * Completes the request and receives response from the server.
     * @return a list of Strings as response in case the server returned
     * status OK, otherwise an exception is thrown.
     * @throws IOException
     */
    public List<String> finish() throws IOException {
        List<String> response = new ArrayList<String>();
 
        writer.append(LINE_FEED).flush();
        writer.append("--" + boundary + "--").append(LINE_FEED);
        writer.close();
 
        // checks server's status code first
        int status = httpConn.getResponseCode();
        if (status == HttpURLConnection.HTTP_OK) {
            BufferedReader reader = new BufferedReader(new InputStreamReader(
                    httpConn.getInputStream()));
            String line = null;
            while ((line = reader.readLine()) != null) {
                response.add(line);
            }
            reader.close();
            httpConn.disconnect();
        } else {
            throw new IOException("Server returned non-OK status: " + status);
        }
 
        return response;
    }
}