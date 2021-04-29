package com.example.schoolapp.network;

import java.util.concurrent.TimeUnit;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

public class NetWorkManager {
    private Retrofit retrofit;

    private static NetWorkManager netWorkManager = new NetWorkManager();

    private NetWorkManager(){};

    public static NetWorkManager getInstance(){
        return  netWorkManager;
    }

    public Retrofit retrofit(){
        if(retrofit == null){
            HttpLoggingInterceptor interceptor = new HttpLoggingInterceptor();
            interceptor.setLevel(HttpLoggingInterceptor.Level.BODY);
            OkHttpClient.Builder http = new OkHttpClient.Builder();
            http.addInterceptor(interceptor);
            http.connectTimeout(1, TimeUnit.MINUTES);
            http.readTimeout(1, TimeUnit.MINUTES);
            Retrofit.Builder builder = new Retrofit.Builder();
            builder.client(http.build());
            builder.addConverterFactory(GsonConverterFactory.create());
            builder.addCallAdapterFactory(RxJava2CallAdapterFactory.create());
            builder.baseUrl(NetWorkApi.domin);
            retrofit = builder.build();
        }
        return retrofit;
    }



}
