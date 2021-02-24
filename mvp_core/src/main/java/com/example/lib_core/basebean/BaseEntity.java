package com.example.lib_core.basebean;

public class BaseEntity {

    String statues;
    String msg;

    public BaseEntity() {
    }

    public BaseEntity(String statues, String msg) {
        this.statues = statues;
        this.msg = msg;
    }

    public String getStatues() {
        return statues;
    }

    public void setStatues(String statues) {
        this.statues = statues;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    @Override
    public String toString() {
        return "BaseEntity{" +
                "statues='" + statues + '\'' +
                ", msg='" + msg + '\'' +
                '}';
    }
}
