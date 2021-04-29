package com.example.schoolapp.mvp.model;

import android.util.Log;

import com.example.lib_core.mvp.model.BaseModel;
import com.example.schoolapp.mvp.contract.LoginContract;
import com.example.schoolapp.mvp.model.loginbean.RegisterCodeEntity;
import com.example.schoolapp.mvp.model.loginbean.RegisterEntity;
import com.example.schoolapp.network.NetWorkManager;
import com.google.gson.Gson;

import java.util.HashMap;

import javax.inject.Inject;

import io.reactivex.Observable;

public class LoginModel extends BaseModel implements LoginContract.LoginModel {

    @Inject
    public LoginModel() {
    }

    @Override
    public Observable<RegisterCodeEntity> registerCode(String methodName, String phontNumber) {
        HashMap<String, Object> hashMap = new HashMap<>();
        hashMap.put("phone",phontNumber);
        String s = new Gson().toJson(hashMap);
        return NetWorkManager.getInstance().retrofit().create(LoginServices.class).getRegisterCode(methodName,s);
    }

    @Override
    public Observable<RegisterEntity> register(String methodName, String phoneCode, String phoneNumber) {
        HashMap<String, Object> hashMap = new HashMap<>();
        hashMap.put("code",phoneCode);
        hashMap.put("phone",phoneNumber);
        String s = new Gson().toJson(hashMap);
        return NetWorkManager.getInstance().retrofit().create(LoginServices.class).getRegister(methodName,s);
    }
}
