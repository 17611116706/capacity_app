package com.example.schoolapp.mvp.model.homebean;

import com.chad.library.adapter.base.entity.MultiItemEntity;

import java.util.ArrayList;

public class HomeListBean implements MultiItemEntity {

    String useravatorUrl;
    String name;
    String sendtime;
    String title;
    String message;
    String[] imgs;
    String lovecount;
    String commentcount;
    int type;

    public HomeListBean(String useravatorUrl, String name, String sendtime, String title, String message, String[] imgs, String lovecount, String commentcount) {
        this.useravatorUrl = useravatorUrl;
        this.name = name;
        this.sendtime = sendtime;
        this.title = title;
        this.message = message;
        this.imgs = imgs;
        this.lovecount = lovecount;
        this.commentcount = commentcount;
    }

    public HomeListBean(String useravatorUrl, String name, String sendtime, String title, String message, String[] imgs, String lovecount, String commentcount, int type) {
        this.useravatorUrl = useravatorUrl;
        this.name = name;
        this.sendtime = sendtime;
        this.title = title;
        this.message = message;
        this.imgs = imgs;
        this.lovecount = lovecount;
        this.commentcount = commentcount;
        this.type = type;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public String getUseravatorUrl() {
        return useravatorUrl;
    }

    public void setUseravatorUrl(String useravatorUrl) {
        this.useravatorUrl = useravatorUrl;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSendtime() {
        return sendtime;
    }

    public void setSendtime(String sendtime) {
        this.sendtime = sendtime;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String[] getImgs() {
        return imgs;
    }

    public void setImgs(String[] imgs) {
        this.imgs = imgs;
    }

    public String getLovecount() {
        return lovecount;
    }

    public void setLovecount(String lovecount) {
        this.lovecount = lovecount;
    }

    public String getCommentcount() {
        return commentcount;
    }

    public void setCommentcount(String commentcount) {
        this.commentcount = commentcount;
    }

    @Override
    public int getItemType() {
        return type;
    }
}
