package com.utils;

public class APIServer {
    private String server;

    public APIServer(){}

    public APIServer setAPIServer(String server){
        this.server=server;
        return this;
    }

    public String getAPIServer(){
        return this.server;
    }
}
