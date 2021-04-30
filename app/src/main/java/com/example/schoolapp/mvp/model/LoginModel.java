package com.example.schoolapp.mvp.model;

import com.example.lib_core.mvp.model.BaseModel;
import com.example.schoolapp.mvp.contract.LoginContract;
import com.example.schoolapp.mvp.model.loginbean.LoginSuccessEntity;
import com.example.schoolapp.mvp.model.loginbean.RegisterCodeEntity;
import com.example.schoolapp.mvp.model.loginbean.RegisterEntity;
import com.example.schoolapp.network.NetWorkManager;

import java.util.HashMap;

import javax.inject.Inject;

import io.reactivex.Observable;

public class LoginModel extends BaseModel implements LoginContract.LoginModel {

    @Inject
    public LoginModel() {
    }

    @Override
    public Observable<RegisterCodeEntity> registerCode(String methodName, String phontNumber) {
//        String s = methodName + "?" + "phone=" + phontNumber;
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("phone",phontNumber);
        return NetWorkManager.getInstance().retrofit().create(LoginServices.class).postRegisterCode(methodName,hashMap);
    }

    @Override
    public Observable<RegisterEntity> register(String methodName, String phoneCode, String phoneNumber) {
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("code",phoneCode);
        hashMap.put("phone",phoneNumber);
        return NetWorkManager.getInstance().retrofit().create(LoginServices.class).postRegister(methodName,hashMap);
    }

    @Override
    public Observable<LoginSuccessEntity> login(String methodName, String phone, String password) {
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("phone",phone);
        hashMap.put("pwd",password);
        return NetWorkManager.getInstance().retrofit().create(LoginServices.class).postLogin(methodName,hashMap);
    }
}
