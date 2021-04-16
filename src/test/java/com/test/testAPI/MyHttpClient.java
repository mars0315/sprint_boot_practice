package com.test.testAPI;

import com.alibaba.fastjson.JSONObject;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.testng.annotations.Test;

import java.io.IOException;

public class MyHttpClient {

    @Test
    public void testDemo(){
        String result;
        HttpGet get=new HttpGet("http://www.baidu.com");
        CloseableHttpClient client= HttpClients.createDefault();
        try {
            CloseableHttpResponse hr=client.execute(get);
            result=EntityUtils.toString(hr.getEntity());
            System.out.println(result);


        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
