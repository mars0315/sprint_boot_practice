package com.test.testAPI;

import org.apache.http.HttpRequest;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class TestMyHttpClient {
    public static void main(String[] args) {
        doGetWithCookies();
    }


    public static String doGetWithCookies(){
        HttpGet httpGet=new HttpGet("http://localhost:3001/getwithparam");
        CloseableHttpClient client= HttpClients.createDefault();
        try {
            HttpResponse hr=client.execute(httpGet);
            InputStream is=hr.getEntity().getContent();
            ByteArrayOutputStream outputStream=new ByteArrayOutputStream();
            byte[] bytes=new byte[1024];
            int lentgh=0;
            while ((lentgh=is.read(bytes))!=-1){
                outputStream.write(bytes,0,lentgh);
            }
            outputStream.close();
            is.close();
            return outputStream.toString();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return "";
    }
}
