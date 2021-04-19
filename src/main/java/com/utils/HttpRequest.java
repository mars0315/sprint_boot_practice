package com.utils;

import com.alibaba.fastjson.JSON;
import okhttp3.*;
import org.jetbrains.annotations.NotNull;
import java.io.IOException;

import java.net.Proxy;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class HttpRequest {
    private HttpHeaders headers=null;
    private APIServer server=null;
    private Proxy proxy=null;
    private final int durationTime=30;
    private HashMap<String, List<Cookie>> cookiesList = new HashMap<>();

    public HttpRequest(){}

    public HttpRequest(HttpHeaders headers){this.headers=headers;}

    public HttpRequest(HttpHeaders headers,APIServer server){
        this.headers=headers;
        this.server=server;
    }

    public HttpResponse httpGet(String url){
        return this.httpGet(url,durationTime);
    }

    public HttpResponse httpGet(String url,int durationTime){
        if (this.server != null) {
            url=this.server.getAPIServer()+"/"+url;
        }
        Request.Builder builder=new Request.Builder().url(url).get();
        if (this.headers!= null) {
            builder.headers(this.headers.buildHeaders());
        }
        Request request=builder.build();
        return this.buildResponse(request,null,durationTime);
    }


    public HttpResponse buildResponse(Request request, JSON JsonObject,int durationTime){
        OkHttpClient.Builder clientBuild=new OkHttpClient()
                .newBuilder().connectTimeout(durationTime, TimeUnit.SECONDS)
                .writeTimeout(durationTime,TimeUnit.SECONDS)
                .readTimeout(durationTime,TimeUnit.SECONDS)
                .cookieJar(new CookieJar() {
                    @Override
                    public void saveFromResponse(@NotNull HttpUrl httpUrl, @NotNull List<Cookie> list) {
                        List<Cookie> cookies=new ArrayList<>();
                        cookies.addAll(list);
                        for (String key:cookiesList.keySet()) {
                            if (key.equals(httpUrl.host())) {
                                cookies.removeAll(cookiesList.get(key));
                                cookies.addAll(cookiesList.get(key));
                            }
                        }
                        cookiesList.put(httpUrl.host(),cookies);
                    }

                    @NotNull
                    @Override
                    public List<Cookie> loadForRequest(@NotNull HttpUrl httpUrl) {
                        List<Cookie> cookies=cookiesList.get(httpUrl.host());
                        return cookies!=null?cookies:new ArrayList<Cookie>();
                    }
                });
        if (this.proxy != null) {
            clientBuild.proxy(this.proxy);
        }
        OkHttpClient client=clientBuild.build();
        HttpResponse hr=null;

        Response response= null;
        try {
            response = client.newCall(request).execute();
            String bodyStr=response.body().string();
            hr=new HttpResponse(bodyStr,response.code(),response.headers());
            response.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return hr;

    }


}
