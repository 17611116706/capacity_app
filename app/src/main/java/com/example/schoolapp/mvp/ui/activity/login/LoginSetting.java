package com.example.schoolapp.mvp.ui.activity.login;

import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.TextView;

import com.example.lib_core.mvp.view.activity.BaseActivity;
import com.example.schoolapp.R;
import com.example.schoolapp.mvp.contract.LoginContract;
import com.example.schoolapp.mvp.model.loginbean.RegisterCodeEntity;
import com.example.schoolapp.mvp.model.loginbean.RegisterEntity;
import com.example.schoolapp.mvp.presenter.login.LoginPresenter;
import com.example.schoolapp.utils.CommonUtils;

import java.util.Calendar;
import java.util.Locale;

public class LoginSetting extends BaseActivity<LoginPresenter> implements LoginContract.LoginView, View.OnClickListener {

    private ImageView loginsettingBack;
    private TextView loginsettingFinish;
    private ImageView loginsettingAvator;
    private EditText loginsettingName;
    private RadioButton loginsettingSexNan;
    private RadioButton loginsettingSexNv;
    private EditText loginsettingData;
    private EditText loginsettingUnivercity;
    private EditText loginsettingHome;
    Calendar calendar= Calendar.getInstance(Locale.CHINA);

    @Override
    public int bondLayout() {
        return R.layout.activity_login_setting;
    }

    @Override
    public void initInjec() {

    }

    @Override
    public void initView() {

        loginsettingBack = (ImageView) findViewById(R.id.loginsetting_back);
        loginsettingFinish = (TextView) findViewById(R.id.loginsetting_finish);
        loginsettingAvator = (ImageView) findViewById(R.id.loginsetting_avator);
        loginsettingName = (EditText) findViewById(R.id.loginsetting_name);
        loginsettingSexNan = (RadioButton) findViewById(R.id.loginsetting_sex_nan);
        loginsettingSexNv = (RadioButton) findViewById(R.id.loginsetting_sex_nv);
        loginsettingData = (EditText) findViewById(R.id.loginsetting_data);
        loginsettingUnivercity = (EditText) findViewById(R.id.loginsetting_univercity);
        loginsettingHome = (EditText) findViewById(R.id.loginsetting_home);
        loginsettingData.setOnClickListener(this);
        loginsettingHome.setOnClickListener(this);



    }

    @Override
    public void initData() {

    }

    @Override
    public void initEvent() {

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.loginsetting_data:
                CommonUtils.showDatePickerDialog(this,4,loginsettingData,calendar);
                break;
            case R.id.loginsetting_univercity:

                break;
            case R.id.loginsetting_home:

                break;
            case R.id.loginsetting_finish:

                break;
        }
    }

    @Override
    public void getRegisterCode(RegisterCodeEntity registerCodeEntity) {

    }

    @Override
    public void getRegister(RegisterEntity RegisterEntity) {

    }
}