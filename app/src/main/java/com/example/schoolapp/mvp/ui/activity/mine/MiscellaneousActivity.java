package com.example.schoolapp.mvp.ui.activity.mine;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.example.lib_core.mvp.view.activity.BaseActivity;
import com.example.schoolapp.R;
import com.example.schoolapp.mvp.constants.ARouterConstants;
import com.example.schoolapp.mvp.contract.MineContract;
import com.example.schoolapp.mvp.model.minebean.LogoutEntity;
import com.example.schoolapp.mvp.presenter.MinePresenter;
@Route(path = ARouterConstants.MiscellaneousActivity)
public class MiscellaneousActivity  extends BaseActivity<MinePresenter> implements MineContract.MineView {


    @Override
    public int bondLayout() {
        return R.layout.activity_miscellaneous;
    }

    @Override
    public void initInjec() {

    }

    @Override
    public void initView() {

    }

    @Override
    public void initData() {

    }

    @Override
    public void initEvent() {

    }

    @Override
    public void getLogout(LogoutEntity logoutEntity) {

    }
}