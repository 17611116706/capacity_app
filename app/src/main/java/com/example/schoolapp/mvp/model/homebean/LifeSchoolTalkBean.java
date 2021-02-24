package com.example.schoolapp.mvp.model.homebean;

public class LifeSchoolTalkBean {

    String school_talk_hostimg;
    String school_talk_headimg;
    String school_talk_title;
    String school_talk_message;
    String school_talk_helpimg;
    int school_talk_helpcount;
    int number;

    public LifeSchoolTalkBean(String school_talk_hostimg, String school_talk_headimg, String school_talk_title, String school_talk_message, String school_talk_helpimg, int school_talk_helpcount, int number) {
        this.school_talk_hostimg = school_talk_hostimg;
        this.school_talk_headimg = school_talk_headimg;
        this.school_talk_title = school_talk_title;
        this.school_talk_message = school_talk_message;
        this.school_talk_helpimg = school_talk_helpimg;
        this.school_talk_helpcount = school_talk_helpcount;
        this.number = number;
    }

    public String getSchool_talk_hostimg() {
        return school_talk_hostimg;
    }

    public void setSchool_talk_hostimg(String school_talk_hostimg) {
        this.school_talk_hostimg = school_talk_hostimg;
    }

    public String getSchool_talk_headimg() {
        return school_talk_headimg;
    }

    public void setSchool_talk_headimg(String school_talk_headimg) {
        this.school_talk_headimg = school_talk_headimg;
    }

    public String getSchool_talk_title() {
        return school_talk_title;
    }

    public void setSchool_talk_title(String school_talk_title) {
        this.school_talk_title = school_talk_title;
    }

    public String getSchool_talk_message() {
        return school_talk_message;
    }

    public void setSchool_talk_message(String school_talk_message) {
        this.school_talk_message = school_talk_message;
    }

    public String getSchool_talk_helpimg() {
        return school_talk_helpimg;
    }

    public void setSchool_talk_helpimg(String school_talk_helpimg) {
        this.school_talk_helpimg = school_talk_helpimg;
    }

    public int getSchool_talk_helpcount() {
        return school_talk_helpcount;
    }

    public void setSchool_talk_helpcount(int school_talk_helpcount) {
        this.school_talk_helpcount = school_talk_helpcount;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}
