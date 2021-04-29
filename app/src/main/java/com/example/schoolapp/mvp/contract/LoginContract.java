package com.example.schoolapp.mvp.contract;

import com.example.lib_core.mvp.model.IModel;
import com.example.lib_core.mvp.view.view.IView;
import com.example.schoolapp.mvp.model.loginbean.RegisterCodeEntity;
import com.example.schoolapp.mvp.model.loginbean.RegisterEntity;

import io.reactivex.Observable;

public interface LoginContract {

    interface LoginModel extends IModel {
        Observable<RegisterCodeEntity> registerCode(String methodName,String phontNumber);
        Observable<RegisterEntity> register(String methodName, String phoneCode,String phoneNumber);
    }

    interface LoginView extends IView{
        void getRegisterCode(RegisterCodeEntity registerCodeEntity);
        void getRegister(RegisterEntity RegisterEntity);
    }


}
