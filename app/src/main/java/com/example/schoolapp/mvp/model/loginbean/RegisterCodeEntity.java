package com.example.schoolapp.mvp.model.loginbean;

public class RegisterCodeEntity {


    /**
     * code : 200
     * token :
     * msg : null
     * data : 发送验证码成功
     */

    private int code;
    private String token;
    private Object msg;
    private String data;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public Object getMsg() {
        return msg;
    }

    public void setMsg(Object msg) {
        this.msg = msg;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
}
