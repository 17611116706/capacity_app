package com.example.schoolapp.mvp.presenter.login;

import com.example.lib_core.mvp.presenter.BasePresenter;
import com.example.schoolapp.mvp.contract.LoginContract;
import com.example.schoolapp.mvp.model.loginbean.RegisterCodeEntity;
import com.example.schoolapp.mvp.model.loginbean.RegisterEntity;
import com.example.schoolapp.network.NetWorkApi;

import javax.inject.Inject;

import io.reactivex.Observer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.annotations.NonNull;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;

public class LoginPresenter extends BasePresenter<LoginContract.LoginModel, LoginContract.LoginView> {

    @Inject
    public LoginPresenter(LoginContract.LoginModel loginModel, LoginContract.LoginView loginView)  {
    }
    //获取验证码
    public void getRegisterCode(String phontNumber){
        m.registerCode(NetWorkApi.getRegisterCode,phontNumber).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new Observer<RegisterCodeEntity>() {
            @Override
            public void onSubscribe(@NonNull Disposable d) {

            }

            @Override
            public void onNext(@NonNull RegisterCodeEntity registerCodeEntity) {
                v.getRegisterCode(registerCodeEntity);
            }

            @Override
            public void onError(@NonNull Throwable e) {

            }

            @Override
            public void onComplete() {

            }
        });
    }


    //注册用户
    public void getRegister(String phontCode,String phontNumber){
        m.register(NetWorkApi.getRegister,phontCode,phontNumber).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new Observer<RegisterEntity>() {
            @Override
            public void onSubscribe(@NonNull Disposable d) {

            }

            @Override
            public void onNext(@NonNull RegisterEntity registerEntity) {
                v.getRegister(registerEntity);
            }

            @Override
            public void onError(@NonNull Throwable e) {

            }

            @Override
            public void onComplete() {

            }
        });
    }
}
