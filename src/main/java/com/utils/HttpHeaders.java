package com.utils;

import okhttp3.Headers;

import java.util.HashMap;

public class HttpHeaders {
    //声明一个变量以key+value方式接收header
    private HashMap<String,String> headers=new HashMap<>();

    //构造函数便于使用中的反射方法
    public HttpHeaders(){};

    public HttpHeaders(HashMap<String,String> headers){
        this.headers=headers;
    }

    //创建一个get和set方法获取header
    public HttpHeaders setHttpHeaders(String key,String value){
        this.headers.put(key,value);
        return this;
    }

    public String getHttpHeaders(String key){
        return this.headers.get(key);
    }

    public Headers buildHeaders(){
        return Headers.of(this.headers);
    }
}
