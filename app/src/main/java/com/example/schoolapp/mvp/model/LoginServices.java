package com.example.schoolapp.mvp.model;

import com.example.schoolapp.mvp.model.loginbean.LoginSuccessEntity;
import com.example.schoolapp.mvp.model.loginbean.RegisterCodeEntity;
import com.example.schoolapp.mvp.model.loginbean.RegisterEntity;

import java.util.HashMap;

import io.reactivex.Observable;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.QueryMap;

public interface LoginServices {


    @POST("{methodName}")
    Observable<RegisterCodeEntity> postRegisterCode(@Path(value = "methodName",encoded = true) String methodName,@QueryMap HashMap<String,String> map);

    @POST("{methodName}")
    Observable<RegisterEntity> postRegister(@Path(value = "methodName",encoded = true) String methodName,@QueryMap HashMap<String,String> map);

    @POST("{methodName}")
    Observable<LoginSuccessEntity> postLogin(@Path(value = "methodName",encoded = true) String methodName, @QueryMap HashMap<String,String> map);

}
