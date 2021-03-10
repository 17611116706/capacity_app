package com.example.schoolapp.mvp.model;

import com.example.lib_core.mvp.model.BaseModel;
import com.example.schoolapp.mvp.contract.LoginContract;

import javax.inject.Inject;

public class LoginModel extends BaseModel implements LoginContract.LoginModel {

    @Inject
    public LoginModel() {
    }
}
