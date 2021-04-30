package com.example.schoolapp.utils;

import android.content.Context;
import android.content.SharedPreferences;

import com.example.schoolapp.MyApplication;

public class SpUtils {
    private  static SpUtils instance=new SpUtils();
    private static SharedPreferences mSp;
    private SpUtils(){}


    public static SpUtils getInstance(){
        if (mSp==null){
            mSp= MyApplication.getContext().getSharedPreferences("intelligence_app_UserInfo", Context.MODE_PRIVATE);
        }
            return instance;
    }
    //保存

    public void save(String key,Object value){
        if (value instanceof String){
            mSp.edit().putString(key,(String)value).commit();
        }else   if (value instanceof Integer){
            mSp.edit().putInt(key,(Integer)value).commit();
        }else   if (value instanceof Boolean){
            mSp.edit().putBoolean(key,(Boolean)value).commit();
        }
    }
    //取
     public String getString(String key,String defValue){
        return mSp.getString(key,defValue);
     }
    public boolean getBoolean(String key,boolean defValue){
        return mSp.getBoolean(key,defValue);
    }
    public int getInteger(String key,int defValue){
        return mSp.getInt(key,defValue);
    }


    public void clearAll(){
        SharedPreferences.Editor edit = mSp.edit();
        edit.clear().commit();
    }


}
