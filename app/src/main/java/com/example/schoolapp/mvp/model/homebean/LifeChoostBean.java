package com.example.schoolapp.mvp.model.homebean;

public class LifeChoostBean {

    String imgUrl;
    String title;
    String sign;

    public LifeChoostBean(String imgUrl, String title, String sign) {
        this.imgUrl = imgUrl;
        this.title = title;
        this.sign = sign;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSign() {
        return sign;
    }

    public void setSign(String sign) {
        this.sign = sign;
    }
}
