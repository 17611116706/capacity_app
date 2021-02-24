package com.example.schoolapp.mvp.model.messagebean;

public class MessageListBean {
    String imgUrl;
    String name;
    String content;


    public MessageListBean(String imgUrl, String name, String content) {
        this.imgUrl = imgUrl;
        this.name = name;
        this.content = content;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
