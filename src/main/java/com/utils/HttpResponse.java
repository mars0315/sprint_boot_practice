package com.utils;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import okhttp3.Headers;

public class HttpResponse {
    private String bodyString;
    private int code;
    private Headers headers;
    private Exception exception=null;

    public HttpResponse() {
    }

    public HttpResponse(String bodyString, int code) {
        this.bodyString = bodyString;
        this.code = code;
    }

    public HttpResponse(String bodyString, int code, Headers headers) {
        this.bodyString = bodyString;
        this.code = code;
        this.headers = headers;
    }

    public String getBodyString() {
        return bodyString;
    }

    public HttpResponse setBodyString(String bodyString) {
        this.bodyString = bodyString;
        return this;
    }

    public int getCode() {
        return code;
    }

    public HttpResponse setCode(int code) {
        this.code = code;
        return this;
    }

    public Headers getHeaders() {
        return headers;
    }

    public HttpResponse setHeaders(Headers headers) {
        this.headers = headers;
        return this;
    }

    public Exception get_exception(){return  this.exception;}

    public <T> T getBody(Class<T> classT){
        if(this.exception!=null){
            if (classT == JSONObject.class) {
                return (T) JSONObject.parseObject("{\"exception\":\""+this.exception.getMessage()+"\"}");
            } else if (classT== JSONArray.class) {
                return (T) JSONArray.parseArray("[{\"exception\":\""+this.exception.getMessage()+"\"]}");
            } else {
                return (T) this.exception.getMessage();
            }
        }
        return this.convertContent(classT);
    }

    private <T> T convertContent(Class<T> classT){
        T myT=null;
        if (classT == JSONObject.class) {
            myT = (T) JSONObject.parseObject(this.bodyString);
        } else if (classT== JSONArray.class) {
            myT = (T) JSONArray.parseArray(this.bodyString);
        } else {
            myT = (T) this.bodyString;
        }
        return myT;
    }
}
