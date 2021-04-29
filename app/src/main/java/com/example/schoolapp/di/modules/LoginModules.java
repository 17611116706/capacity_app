package com.example.schoolapp.di.modules;

import com.example.schoolapp.mvp.contract.LoginContract;
import com.example.schoolapp.mvp.model.LoginModel;

import dagger.Module;
import dagger.Provides;

@Module
public class LoginModules {

    private LoginContract.LoginView loginView;

    public LoginModules(LoginContract.LoginView loginView) {
        this.loginView = loginView;
    }

    @Provides
    public LoginContract.LoginView provideLoginView(){
        return loginView;
    }

    @Provides
    public LoginContract.LoginModel provideLoginModel(LoginModel loginModel){
        return loginModel;
    }

}
