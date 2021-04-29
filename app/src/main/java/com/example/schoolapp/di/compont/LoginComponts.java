package com.example.schoolapp.di.compont;

import com.example.schoolapp.di.modules.LoginModules;
import com.example.schoolapp.mvp.model.LoginModel;
import com.example.schoolapp.mvp.ui.activity.login.LoginActivity;

import dagger.Component;

@Component(modules = LoginModules.class)
public interface LoginComponts {

    void injectLoginActivity(LoginActivity loginActivity);

}
