package com.example.schoolapp;

import android.app.Application;
import android.content.Context;

import com.alibaba.android.arouter.launcher.ARouter;

import me.jessyan.autosize.AutoSizeConfig;

public class MyApplication extends Application {

    private static Context context;

    public static Context getContext() {
        return context;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        context = this;
        AutoSizeConfig.getInstance()
                .setDesignWidthInDp(375)
                .setDesignHeightInDp(863);
        ARouter.init(this);
    }
}
