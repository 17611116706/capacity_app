package com.example.schoolapp.mvp.ui.activity;

import androidx.fragment.app.Fragment;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import com.example.lib_core.mvp.view.activity.BaseActivity;
import com.example.schoolapp.R;
import com.example.schoolapp.mvp.contract.MainContract;
import com.example.schoolapp.mvp.presenter.MainPresenter;
import com.example.schoolapp.mvp.ui.fragment.HomeFragment;
import com.example.schoolapp.mvp.ui.fragment.LifeFragment;
import com.example.schoolapp.mvp.ui.fragment.MessageFragment;
import com.example.schoolapp.mvp.ui.fragment.MineFragment;

import crossoverone.statuslib.StatusUtil;

public class MainActivity extends BaseActivity<MainPresenter> implements MainContract.MainView, View.OnClickListener {
    private RadioButton homeTab;
    private RadioButton lifeTab;
    private RadioButton msgTab;
    private RadioButton mineTab;
    private RadioGroup tabGroup;
    private HomeFragment homeFragment;
    private LifeFragment lifeFragment;
    private MessageFragment messageFragment;
    private MineFragment mineFragment;


    @Override
    public int bondLayout() {
        return R.layout.activity_main;
    }

    @Override
    public void initInjec() {

    }

    @Override
    public void initView() {
        StatusUtil.setUseStatusBarColor(this, Color.parseColor("#55CBC4"));
        StatusUtil.setSystemStatus(this,false,false);
        homeFragment = new HomeFragment();
        lifeFragment = new LifeFragment();
        messageFragment = new MessageFragment();
        mineFragment = new MineFragment();

        tabGroup = (RadioGroup) findViewById(R.id.tab_group);

        homeTab = (RadioButton) findViewById(R.id.home_tab);
        lifeTab = (RadioButton) findViewById(R.id.life_tab);
        msgTab = (RadioButton) findViewById(R.id.msg_tab);
        mineTab = (RadioButton) findViewById(R.id.mine_tab);
        initTab();
        homeTab.setChecked(true);
        getSupportFragmentManager().beginTransaction()
                .add(R.id.main_viewpager,homeFragment)
                .add(R.id.main_viewpager,lifeFragment)
                .add(R.id.main_viewpager,messageFragment)
                .add(R.id.main_viewpager,mineFragment)
                .commit();
        viewpagerChange(homeFragment);
       tabGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
           @Override
           public void onCheckedChanged(RadioGroup group, int checkedId) {
               initTab();
               if (homeTab.isChecked()){
                   Drawable drawable11 = getResources().getDrawable(R.drawable.src_main_home_select);
                   drawable11.setBounds(0,0,80,80);
                   homeTab.setCompoundDrawables(null,drawable11,null,null);
                   viewpagerChange(homeFragment);
                   StatusUtil.setUseStatusBarColor(MainActivity.this, Color.parseColor("#55CBC4"));
                   StatusUtil.setSystemStatus(MainActivity.this,false,false);
               }
               if (lifeTab.isChecked()){
                   Drawable drawable22 = getResources().getDrawable(R.drawable.src_main_life_select);
                   drawable22.setBounds(0,0,80,80);
                   lifeTab.setCompoundDrawables(null,drawable22,null,null);
                   viewpagerChange(lifeFragment);
                   StatusUtil.setUseStatusBarColor(MainActivity.this, Color.parseColor("#FFFFFF"));
                   StatusUtil.setSystemStatus(MainActivity.this,false,true);
               }
               if (msgTab.isChecked()){
                   Drawable drawable33 = getResources().getDrawable(R.drawable.src_main_msg_select);
                   drawable33.setBounds(0,0,80,80);
                   msgTab.setCompoundDrawables(null,drawable33,null,null);
                   viewpagerChange(messageFragment);
                   StatusUtil.setUseStatusBarColor(MainActivity.this, Color.parseColor("#55CBC4"));
                   StatusUtil.setSystemStatus(MainActivity.this,false,false);
               }
               if (mineTab.isChecked()){
                   Drawable drawable44 = getResources().getDrawable(R.drawable.src_main_mine_select);
                   drawable44.setBounds(0,0,80,80);
                   mineTab.setCompoundDrawables(null,drawable44,null,null);
                   viewpagerChange(mineFragment);
                   StatusUtil.setUseStatusBarColor(MainActivity.this, Color.parseColor("#55CBC4"));
                   StatusUtil.setSystemStatus(MainActivity.this,false,false);
               }
           }
       });


    }


    public void viewpagerChange(Fragment fragment){
        getSupportFragmentManager().beginTransaction()
                .hide(homeFragment)
                .hide(lifeFragment)
                .hide(messageFragment)
                .hide(mineFragment)
                .show(fragment)
                .commit();
    }

    public void initTab(){
        Drawable drawable1 = getResources().getDrawable(R.drawable.src_main_home_unselect);
        drawable1.setBounds(0,0,80,80);
        homeTab.setCompoundDrawables(null,drawable1,null,null);
        Drawable drawable2 = getResources().getDrawable(R.drawable.src_main_life_unselect);
        drawable2.setBounds(0,0,80,80);
        lifeTab.setCompoundDrawables(null,drawable2,null,null);
        Drawable drawable3 = getResources().getDrawable(R.drawable.src_main_msg_unselect);
        drawable3.setBounds(0,0,80,80);
        msgTab.setCompoundDrawables(null,drawable3,null,null);
        Drawable drawable4 = getResources().getDrawable(R.drawable.src_main_mine_unselect);
        drawable4.setBounds(0,0,80,80);
        mineTab.setCompoundDrawables(null,drawable4,null,null);
    }

    @Override
    public void initData() {

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.home_tab:
                break;
            case R.id.life_tab:
                break;
            case R.id.msg_tab:
                break;
            case R.id.mine_tab:
                break;
        }
    }
}