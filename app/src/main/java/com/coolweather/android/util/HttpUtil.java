package com.coolweather.android.util;
/*
 * @创建者     wangb
 * @创建时间   2018/3/8 15:13
 * @描述       ${TODO}
 */

import okhttp3.OkHttpClient;
import okhttp3.Request;

public class HttpUtil {

    public static void sendOkHttpRequest(String address,okhttp3.Callback callback) {
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder().url(address).build();
        client.newCall(request).enqueue(callback);
    }
}
