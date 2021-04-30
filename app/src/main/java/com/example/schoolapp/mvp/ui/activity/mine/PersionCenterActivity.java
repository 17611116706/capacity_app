package com.example.schoolapp.mvp.ui.activity.mine;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.example.lib_core.mvp.view.activity.BaseActivity;
import com.example.schoolapp.R;
import com.example.schoolapp.mvp.constants.ARouterConstants;
import com.example.schoolapp.mvp.contract.MineContract;
import com.example.schoolapp.mvp.model.minebean.LogoutEntity;
import com.example.schoolapp.mvp.presenter.MinePresenter;

import java.nio.file.Path;

@Route(path = ARouterConstants.PersionActivity)
public class PersionCenterActivity extends BaseActivity<MinePresenter> implements MineContract.MineView{
    private RelativeLayout persionAvater;
    private RelativeLayout persionNickname;
    private RelativeLayout persionQrcode;
    private RelativeLayout persionSex;
    private RelativeLayout persionBirthday;
    private RelativeLayout persionUnivercity;
    private RelativeLayout persionOldhome;
    private RelativeLayout persionSignature;
    private ImageView persionBack;
    private TextView persionExsits;

    @Override
    public int bondLayout() {
        return R.layout.activity_persion_center;
    }

    @Override
    public void initInjec() {

    }

    @Override
    public void initView() {

        persionBack = (ImageView) findViewById(R.id.persion_back);
        persionExsits = (TextView) findViewById(R.id.persion_exsits);
        persionAvater = (RelativeLayout) findViewById(R.id.persion_avater);
        persionNickname = (RelativeLayout) findViewById(R.id.persion_nickname);
        persionQrcode = (RelativeLayout) findViewById(R.id.persion_qrcode);
        persionSex = (RelativeLayout) findViewById(R.id.persion_sex);
        persionBirthday = (RelativeLayout) findViewById(R.id.persion_birthday);
        persionUnivercity = (RelativeLayout) findViewById(R.id.persion_univercity);
        persionOldhome = (RelativeLayout) findViewById(R.id.persion_oldhome);
        persionSignature = (RelativeLayout) findViewById(R.id.persion_signature);

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