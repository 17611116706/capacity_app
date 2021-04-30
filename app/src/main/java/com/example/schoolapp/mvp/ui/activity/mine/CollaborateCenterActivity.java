package com.example.schoolapp.mvp.ui.activity.mine;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.RelativeLayout;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.example.lib_core.mvp.view.activity.BaseActivity;
import com.example.schoolapp.R;
import com.example.schoolapp.mvp.constants.ARouterConstants;
import com.example.schoolapp.mvp.contract.MineContract;
import com.example.schoolapp.mvp.model.minebean.LogoutEntity;
import com.example.schoolapp.mvp.presenter.MinePresenter;

@Route(path = ARouterConstants.CollaborateCenterActivity)
public class CollaborateCenterActivity extends BaseActivity<MinePresenter> implements MineContract.MineView  {
    private ImageView collaborateBack;
    private RelativeLayout collaborateParttimeJob;
    private RelativeLayout collaborateArea;
    private RelativeLayout collaborateSchoolyard;
    private RelativeLayout collaborateGeneralize;
    private RelativeLayout collaborateAboutComponty;

    @Override
    public int bondLayout() {
        return R.layout.activity_collaborate_center;
    }

    @Override
    public void initInjec() {

    }

    @Override
    public void initView() {
        collaborateBack = (ImageView) findViewById(R.id.collaborate_back);
        collaborateParttimeJob = (RelativeLayout) findViewById(R.id.collaborate_parttimeJob);
        collaborateArea = (RelativeLayout) findViewById(R.id.collaborate_area);
        collaborateSchoolyard = (RelativeLayout) findViewById(R.id.collaborate_schoolyard);
        collaborateGeneralize = (RelativeLayout) findViewById(R.id.collaborate_generalize);
        collaborateAboutComponty = (RelativeLayout) findViewById(R.id.collaborate_aboutComponty);

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