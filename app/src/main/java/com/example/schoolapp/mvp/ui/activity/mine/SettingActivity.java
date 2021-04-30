package com.example.schoolapp.mvp.ui.activity.mine;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.provider.Settings;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.Toast;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.launcher.ARouter;
import com.example.lib_core.mvp.view.activity.BaseActivity;
import com.example.schoolapp.R;
import com.example.schoolapp.di.compont.DaggerMineComponts;
import com.example.schoolapp.di.modules.MineModules;
import com.example.schoolapp.mvp.constants.ARouterConstants;
import com.example.schoolapp.mvp.contract.MineContract;
import com.example.schoolapp.mvp.model.minebean.LogoutEntity;
import com.example.schoolapp.mvp.presenter.MinePresenter;
import com.example.schoolapp.mvp.ui.activity.MainActivity;
import com.example.schoolapp.mvp.ui.activity.login.LoginActivity;
import com.example.schoolapp.utils.SpUtils;

import crossoverone.statuslib.StatusUtil;

@Route(path = ARouterConstants.SettingActivity)
public class SettingActivity extends BaseActivity<MinePresenter> implements MineContract.MineView, View.OnClickListener {
    private RelativeLayout settingActivityAccountSafety;
    private RelativeLayout settingActivityMyCertification;
    private RelativeLayout settingActivityClearChat;
    private RelativeLayout settingActivityAbout;
    private CardView settingActivityLogout;

    @Override
    public int bondLayout() {
        return R.layout.activity_setting;
    }

    @Override
    public void initInjec() {
        DaggerMineComponts.builder().mineModules(new MineModules(this)).build().injectSettingActivity(this);
    }

    @Override
    public void initView() {
        StatusUtil.setSystemStatus(SettingActivity.this,false,true);
        settingActivityAccountSafety = (RelativeLayout) findViewById(R.id.settingActivity_accountSafety);
        settingActivityMyCertification = (RelativeLayout) findViewById(R.id.settingActivity_myCertification);
        settingActivityClearChat = (RelativeLayout) findViewById(R.id.settingActivity_clearChat);
        settingActivityAbout = (RelativeLayout) findViewById(R.id.settingActivity_about);
        settingActivityLogout = (CardView) findViewById(R.id.settingActivity_logout);

    }

    @Override
    public void initData() {

    }

    @Override
    public void initEvent() {
        settingActivityLogout.setOnClickListener(this);
    }

    @Override
    public void getLogout(LogoutEntity logoutEntity) {
        if (logoutEntity.getCode() == 200){
            SpUtils.getInstance().clearAll();
            startActivity(new Intent(SettingActivity.this, LoginActivity.class));
            Toast.makeText(this, "退出登录成功", Toast.LENGTH_SHORT).show();
            finish();
        }else{
            Toast.makeText(this, "退出失败", Toast.LENGTH_SHORT).show();
        }
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.settingActivity_logout:
                p.getLogout();
                break;
        }
    }
}