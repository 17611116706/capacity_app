package com.example.schoolapp.mvp.model;

import com.example.lib_core.mvp.model.BaseModel;
import com.example.schoolapp.mvp.contract.MessageContract;

import javax.inject.Inject;

public class MessageModel extends BaseModel implements MessageContract.MessageModel {

    @Inject
    public MessageModel() {
    }
}
