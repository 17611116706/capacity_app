package com.example.schoolapp.mvp.model.homebean;

public class TodayListBean {

    String title;
    int helpcount;

    public TodayListBean(String title, int helpcount) {
        this.title = title;
        this.helpcount = helpcount;
    }


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getHelpcount() {
        return helpcount;
    }

    public void setHelpcount(int helpcount) {
        this.helpcount = helpcount;
    }
}
