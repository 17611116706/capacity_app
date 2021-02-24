package com.example.schoolapp.network;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

public class NetWorkHeaderManager {

    private Retrofit retrofit;
    private static NetWorkHeaderManager netWorkManager = new NetWorkHeaderManager();

    private NetWorkHeaderManager(){};

    public static NetWorkHeaderManager getInstance(){
        return  netWorkManager;
    }

    public  Retrofit getRetrofit(final String token){
            if(retrofit == null){
                HttpLoggingInterceptor interceptor = new HttpLoggingInterceptor();
                interceptor.setLevel(HttpLoggingInterceptor.Level.BODY);
                OkHttpClient.Builder okhttp = new OkHttpClient.Builder();
                okhttp.addInterceptor(interceptor);
                okhttp.addInterceptor(new Interceptor() {
                    @Override
                    public Response intercept(Chain chain) throws IOException {
                        Request request = chain.request().newBuilder().addHeader("token",token).build();
                        return chain.proceed(request);
                    }
                });
                okhttp.readTimeout(1, TimeUnit.MINUTES);
                okhttp.writeTimeout(1, TimeUnit.MINUTES);
                okhttp.connectTimeout(1, TimeUnit.MINUTES);
                Retrofit.Builder builder = new Retrofit.Builder();
                builder.client(okhttp.build());
                builder.addConverterFactory(GsonConverterFactory.create());
                builder.addCallAdapterFactory(RxJava2CallAdapterFactory.create());
                builder.baseUrl(NerWorkApi.domin);
                retrofit = builder.build();


            }
        return retrofit;
    };


}
