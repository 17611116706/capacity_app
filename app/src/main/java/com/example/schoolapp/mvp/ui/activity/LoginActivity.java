package com.example.schoolapp.mvp.ui.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.example.lib_core.mvp.view.activity.BaseActivity;
import com.example.lib_core.mvp.view.view.IView;
import com.example.schoolapp.R;
import com.example.schoolapp.mvp.contract.LoginContract;
import com.example.schoolapp.mvp.presenter.LoginPresenter;

public class LoginActivity extends BaseActivity<LoginPresenter> implements LoginContract.LoginView {

    private TextView login;
    private TextView regist;
    private TextView useRules;
    private TextView privacy;


    @Override
    public int bondLayout() {
        return R.layout.activity_login;
    }

    @Override
    public void initInjec() {

    }

    @Override
    public void initView() {
        login = (TextView) findViewById(R.id.login);
        regist = (TextView) findViewById(R.id.regist);
        useRules = (TextView) findViewById(R.id.use_rules);
        privacy = (TextView) findViewById(R.id.privacy);

    }

    @Override
    public void initData() {

    }
}