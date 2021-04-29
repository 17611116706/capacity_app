package com.example.schoolapp.network;

public interface NetWorkApi {

    public final static String domin = "http://39.100.239.148:8125/";

    //获取验证码
    public final static String getRegisterCode = "getRegisterCode";
    //注册
    public final static String getRegister = "register";
    //重置密码
    public final static String resetPwd = "resetPwd";


}
