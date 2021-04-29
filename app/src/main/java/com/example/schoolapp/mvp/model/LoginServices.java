package com.example.schoolapp.mvp.model;

import com.example.schoolapp.mvp.model.loginbean.RegisterCodeEntity;
import com.example.schoolapp.mvp.model.loginbean.RegisterEntity;

import java.util.HashMap;

import io.reactivex.Observable;
import retrofit2.http.Body;
import retrofit2.http.Field;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface LoginServices {



    @POST("{methodName}")
    Observable<RegisterCodeEntity> getRegisterCode(@Path(value = "methodName",encoded = true) String methodName
                                                  , @Body String body);

    @POST("{methodName}")
    Observable<RegisterEntity> getRegister(@Path(value = "methodName",encoded = true) String methodName
            , @Body String body);

}
