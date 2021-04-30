package com.example.schoolapp.mvp.model;

import com.example.schoolapp.mvp.model.minebean.LogoutEntity;

import java.util.HashMap;

import io.reactivex.Observable;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.QueryMap;

public interface MineServices {


    @GET("{methodName}")
    Observable<LogoutEntity> getLogout(@Path(value = "methodName",encoded = true) String methodName, @QueryMap HashMap<String,String> map);

}
