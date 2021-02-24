package com.example.schoolapp.mvp.model;

import com.example.lib_core.mvp.model.BaseModel;
import com.example.schoolapp.mvp.contract.MainContract;
import com.example.schoolapp.mvp.contract.MessaageContract;

import javax.inject.Inject;

public class MessageModel extends BaseModel implements MessaageContract.MessageModel {

    @Inject
    public MessageModel() {
    }
}
