package com.utils;

import com.alibaba.fastjson.JSONObject;
import com.fasterxml.jackson.databind.JsonNode;
import com.github.fge.jackson.JsonNodeReader;
import com.github.fge.jsonschema.core.exceptions.ProcessingException;
import com.github.fge.jsonschema.core.report.ProcessingReport;
import com.github.fge.jsonschema.main.JsonSchemaFactory;
import org.apache.http.HttpResponse;

import java.io.*;

public class ReadJsonFileUitl {

    public static void main(String[] args) {
        // System.out.println(readJsonFileAsString("/testdemo.json"));
        // JsonNode schema=readJsonFileAsJsonNode("/testdemo.json");

    }

    public static boolean assertSchemaAndResponse(String filePath1, HttpResponse httpResponse){
        JsonNode schema=readJsonFileAsJsonNode(filePath1);
        JsonNode data=readResponseEntity(httpResponse);
        ProcessingReport report= null;
        try {
            report = JsonSchemaFactory.byDefault().getValidator().validate(schema,data);
        } catch (ProcessingException e) {
            e.printStackTrace();
        }
        return report.isSuccess();
    }

    public static String readJsonFileAsString(String filePath){
        String str =null;
        try {
            InputStream inputStream=ReadJsonFileUitl.class.getResourceAsStream(filePath);
            ByteArrayOutputStream outputStream=new ByteArrayOutputStream();
            byte[] bytes=new byte[1024];
            int lentgh=0;
            while ((lentgh=inputStream.read(bytes))!=-1){
                outputStream.write(bytes,0,lentgh);
            }
            outputStream.close();
            inputStream.close();
            return outputStream.toString();
            } catch (Exception e){
                e.printStackTrace();
            }
         return str;
    }

    public static JsonNode readJsonFileAsJsonNode(String filePath){
        JsonNode instance=null;
        InputStream inputStream=ReadJsonFileUitl.class.getResourceAsStream(filePath);
        BufferedReader reader=new BufferedReader(new InputStreamReader(inputStream));
        try {
            instance=new JsonNodeReader().fromReader(reader);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return instance;
    }

    public static JsonNode readResponseEntity(HttpResponse httpResponse){
        JsonNode instance=null;
        InputStream inputStream= null;
        try {
            inputStream = httpResponse.getEntity().getContent();
            BufferedReader reader=new BufferedReader(new InputStreamReader(inputStream));
            instance=new JsonNodeReader().fromReader(reader);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return instance;
    }

}
