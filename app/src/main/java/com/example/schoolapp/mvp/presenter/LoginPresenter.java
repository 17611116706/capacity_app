package com.example.schoolapp.mvp.presenter;

import com.example.lib_core.mvp.presenter.BasePresenter;
import com.example.schoolapp.mvp.contract.LoginContract;
import com.example.schoolapp.mvp.model.LoginModel;

import javax.inject.Inject;

public class LoginPresenter extends BasePresenter<LoginContract.LoginModel, LoginContract.LoginView> {

    @Inject
    public LoginPresenter(LoginContract.LoginModel loginModel, LoginContract.LoginView loginView)  {
    }
}
