package com.utils;

import java.net.Proxy;

public class HttpRequest {
    private HttpHeaders headers=null;
    private APIServer server=null;
    private Proxy proxy=null;
    private final int durationTime=30;

    public HttpRequest(){}

    public HttpRequest(HttpHeaders headers){this.headers=headers;}

    public HttpRequest(HttpHeaders headers,APIServer server){
        this.headers=headers;
        this.server=server;
    }




}
