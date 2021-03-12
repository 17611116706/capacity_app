package com.example.schoolapp.mvp.ui.activity;

import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.TextView;

import com.example.lib_core.mvp.view.activity.BaseActivity;
import com.example.lib_core.mvp.view.view.IView;
import com.example.schoolapp.R;
import com.example.schoolapp.mvp.contract.LoginContract;
import com.example.schoolapp.mvp.presenter.LoginPresenter;

import java.sql.Time;
import java.util.Timer;
import java.util.TimerTask;

public class LoginActivity extends BaseActivity<LoginPresenter> implements LoginContract.LoginView, View.OnClickListener {

    private TextView login;
    private TextView regist;
    private TextView useRules;
    private TextView privacy;
    private PopupWindow registPopupWindow;
    private View registPopupWindowView;
    private PopupWindow loginPopupWindow;
    private View loginPopupWindowView;
    //popwindow regist
    private ImageView closePop;
    private EditText username;
    private EditText phoneCode;
    private TextView sendCode;
    private TextView popRegist;
    private LinearLayout wechatLogin;
    private LinearLayout tencentLogin;
    //popwindow login
    private ImageView loginClosePop;
    private EditText loginPhone;
    private EditText loginPassword;
    private TextView forgotPassword;
    private TextView notAccount;
    private TextView toRegister;
    private TextView popLogin;
    private LinearLayout loginWechatLogin;
    private LinearLayout loginTencentLogin;


    private Handler handler = new Handler(){
        @SuppressLint("ResourceAsColor")
        @Override
        public void handleMessage(@NonNull Message msg) {
            super.handleMessage(msg);
            if (msg.what == 1){
                int arg1 = msg.arg1;
                if (arg1==0){
                    timer.cancel();
                    sendCode.setClickable(true);
                    sendCode.setTextColor(Color.parseColor("#55CBC4"));
                    sendCode.setText("发送验证码");
                }else{
                    sendCode.setTextColor(Color.parseColor("#C4C4C6"));
                    sendCode.setText("已发送"+arg1+"s");
                }
            }
        }
    };


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
        login.setOnClickListener(this);
        regist.setOnClickListener(this);
        useRules.setOnClickListener(this);
        privacy.setOnClickListener(this);
        registPopupWindowView = getLayoutInflater().inflate(R.layout.regist_popwindow,null);
        loginPopupWindowView = getLayoutInflater().inflate(R.layout.login_popwindow,null);
        //popwindow view
        closePop = (ImageView) registPopupWindowView.findViewById(R.id.close_pop);
        closePop.setOnClickListener(this);
        username = (EditText) registPopupWindowView.findViewById(R.id.username);
        phoneCode = (EditText) registPopupWindowView.findViewById(R.id.phone_code);
        sendCode = (TextView) registPopupWindowView.findViewById(R.id.send_code);
        sendCode.setOnClickListener(this);
        popRegist = (TextView) registPopupWindowView.findViewById(R.id.pop_regist);
        popRegist.setOnClickListener(this);
        wechatLogin = (LinearLayout) registPopupWindowView.findViewById(R.id.wechat_login);
        tencentLogin = (LinearLayout) registPopupWindowView.findViewById(R.id.tencent_login);
        wechatLogin.setOnClickListener(this);
        tencentLogin.setOnClickListener(this);
        initRegiestPopWindow();
        //popwindow login
        loginClosePop = (ImageView) loginPopupWindowView.findViewById(R.id.login_close_pop);
        loginClosePop.setOnClickListener(this);
        loginPhone = (EditText) loginPopupWindowView.findViewById(R.id.login_phone);
        loginPassword = (EditText) loginPopupWindowView.findViewById(R.id.login_password);
        forgotPassword = (TextView) loginPopupWindowView.findViewById(R.id.forgot_password);
        forgotPassword.setOnClickListener(this);
        notAccount = (TextView) loginPopupWindowView.findViewById(R.id.not_account);
        toRegister = (TextView) loginPopupWindowView.findViewById(R.id.to_register);
        toRegister.setOnClickListener(this);
        popLogin = (TextView) loginPopupWindowView.findViewById(R.id.pop_login);
        popLogin.setOnClickListener(this);
        loginWechatLogin = (LinearLayout) loginPopupWindowView.findViewById(R.id.login_wechat_login);
        loginWechatLogin.setOnClickListener(this);
        loginTencentLogin = (LinearLayout) loginPopupWindowView.findViewById(R.id.login_tencent_login);
        loginTencentLogin.setOnClickListener(this);
        initLoginPopWindow();


    }

    private void initLoginPopWindow() {
        loginPopupWindow = new PopupWindow();
        loginPopupWindow.setOutsideTouchable(false);
        // 设置弹出窗体可点击
        loginPopupWindow.setFocusable(true);
        loginPopupWindow.setContentView(loginPopupWindowView);
        loginPopupWindow.setWidth(LinearLayout.LayoutParams.MATCH_PARENT);
        loginPopupWindow.setHeight(LinearLayout.LayoutParams.MATCH_PARENT);
        // 实例化一个ColorDrawable颜色为半透明
        ColorDrawable dw = new ColorDrawable(0xb0000000);
        // 设置弹出窗体的背景
        loginPopupWindow.setBackgroundDrawable(dw);
        // 设置弹出窗体显示时的动画，从底部向上弹出
        loginPopupWindow.setAnimationStyle(R.style.login_pop_show);

    }

    private void initRegiestPopWindow() {
        registPopupWindow = new PopupWindow();
        registPopupWindow.setOutsideTouchable(false);
        // 设置弹出窗体可点击
        registPopupWindow.setFocusable(true);
        registPopupWindow.setContentView(registPopupWindowView);
        registPopupWindow.setWidth(LinearLayout.LayoutParams.MATCH_PARENT);
        registPopupWindow.setHeight(LinearLayout.LayoutParams.MATCH_PARENT);
        // 实例化一个ColorDrawable颜色为半透明
        ColorDrawable dw = new ColorDrawable(0xb0000000);
        // 设置弹出窗体的背景
        registPopupWindow.setBackgroundDrawable(dw);
        // 设置弹出窗体显示时的动画，从底部向上弹出
        registPopupWindow.setAnimationStyle(R.style.login_pop_show);

    }

    @Override
    public void initData() {

    }
    private int timeindex = 60;
    private Timer timer;
    @RequiresApi(api = Build.VERSION_CODES.KITKAT)
    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.close_pop:
                //关闭pop
                registPopupWindow.dismiss();
                if (timer!=null){
                    timer.cancel();
                }
                break;
            case R.id.send_code:
                //发送验证码
                sendCode.setClickable(false);
                timer = new Timer();
                timeindex = 60;
                timer.schedule(new TimerTask() {
                    @Override
                    public void run() {
                        Message obtain = Message.obtain();
                        obtain.what =1;
                        obtain.arg1 = (timeindex--);
                        handler.sendMessage(obtain);
                    }
                },0,1000);
                break;
            case R.id.wechat_login:
                //微信登录
                break;
            case R.id.tencent_login:
                //QQ登录
                break;
            case R.id.login_close_pop:
                //登录关闭
                loginPopupWindow.dismiss();
                break;
            case R.id.to_register:
                //去注册
                loginPopupWindow.dismiss();
            case R.id.regist:
                registPopupWindow.showAsDropDown(getLayoutInflater().inflate(R.layout.activity_login,null),0,0, Gravity.BOTTOM);
                break;
            case R.id.login:
                loginPopupWindow.showAsDropDown(getLayoutInflater().inflate(R.layout.activity_login,null),0,0, Gravity.BOTTOM);
                break;
            case R.id.pop_login:
                // 登录
                break;
            case R.id.login_wechat_login:
                //登录 微信
                break;
            case R.id.login_tencent_login:
                //登录 QQ
                break;

        }
    }
}