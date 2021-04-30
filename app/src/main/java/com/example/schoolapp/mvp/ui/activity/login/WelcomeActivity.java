package com.example.schoolapp.mvp.ui.activity.login;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.alibaba.android.arouter.launcher.ARouter;
import com.bumptech.glide.Glide;
import com.bumptech.glide.load.resource.bitmap.CenterCrop;
import com.example.lib_core.mvp.view.activity.BaseActivity;
import com.example.schoolapp.R;
import com.example.schoolapp.constants.Constants;
import com.example.schoolapp.mvp.constants.ARouterConstants;
import com.example.schoolapp.mvp.contract.LoginContract;
import com.example.schoolapp.mvp.model.loginbean.LoginSuccessEntity;
import com.example.schoolapp.mvp.model.loginbean.RegisterCodeEntity;
import com.example.schoolapp.mvp.model.loginbean.RegisterEntity;
import com.example.schoolapp.mvp.presenter.login.LoginPresenter;
import com.example.schoolapp.utils.SpUtils;

import java.util.Timer;
import java.util.TimerTask;

public class WelcomeActivity extends BaseActivity<LoginPresenter> implements LoginContract.LoginView {
    private ImageView welcomePageimg;
    private CardView jumpWelcome;
    private TextView jumpWelcomeTitle;
    private int index = 5;
    private Timer timer;
    private Handler handler = new Handler();
    @Override
    public int bondLayout() {
        return R.layout.activity_welcome;
    }

    @Override
    public void initInjec() {

    }

    @Override
    public void initView() {

        jumpWelcomeTitle = (TextView) findViewById(R.id.jump_welcome_title);
        jumpWelcome = (CardView) findViewById(R.id.jump_welcome);
        welcomePageimg = (ImageView) findViewById(R.id.welcome_pageimg);
        Glide.with(this).load("https://ss1.bdstatic.com/70cFvXSh_Q1YnxGkpoWK1HF6hhy/it/u=2510468191,2068707214&fm=26&gp=0.jpg")
                .transform(new CenterCrop())
                .into(welcomePageimg);

    }

    @Override
    public void initData() {
        timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                handler.post(new Runnable() {
                    @Override
                    public void run() {
                        jumpWelcomeTitle.setText("跳过("+index+")");
                        if (index == 0){
                            if (SpUtils.getInstance().getString(Constants.User_token,null)!=null){
                                ARouter.getInstance().build(ARouterConstants.MainActivity).navigation();
                            }else{
                                ARouter.getInstance().build(ARouterConstants.LoginActivity).navigation();
                            }
                            onDestroy();
                        }
                    }
                });
                index--;
            }
        },0,1000);
    }
    @Override
    public void initEvent() {
            jumpWelcome.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (SpUtils.getInstance().getString(Constants.User_token,null)!=null){
                        ARouter.getInstance().build(ARouterConstants.MainActivity).navigation();
                    }else{
                        ARouter.getInstance().build(ARouterConstants.LoginActivity).navigation();
                    }
                    onDestroy();
                }
            });
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        timer.cancel();
        finish();
    }

    @Override
    public void getRegisterCode(RegisterCodeEntity registerCodeEntity) {

    }

    @Override
    public void getRegister(RegisterEntity RegisterEntity) {

    }

    @Override
    public void getLogin(LoginSuccessEntity loginEntity) {

    }
}