package com.example.eyepetizer.util;

import okhttp3.OkHttpClient;

public class HttpUtil {
    private static OkHttpClient singleton;

    private HttpUtil() {

    }

    public static OkHttpClient getInstance() {
        if (singleton == null) {
            synchronized (HttpUtil.class) {
                if (singleton == null) {
                    singleton = new OkHttpClient();
                }
            }
        }
        return singleton;
    }


//    public static void sendHttpRequest(String address, Callback callback){
//        OkHttpClient client=new OkHttpClient();
//        Request request=new Request.Builder().url(address).build();
//        client.newCall(request).enqueue(callback);
//    }
}
