package com.example.schoolapp.di.compont;

import com.example.schoolapp.di.modules.MessageModules;
import com.example.schoolapp.di.modules.MineModules;
import com.example.schoolapp.mvp.ui.activity.login.LoginActivity;
import com.example.schoolapp.mvp.ui.activity.mine.SettingActivity;

import dagger.Component;

@Component(modules = MineModules.class)
public interface MineComponts {

    void injectSettingActivity(SettingActivity settingActivity);

}
