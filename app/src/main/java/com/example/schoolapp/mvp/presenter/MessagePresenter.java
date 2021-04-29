package com.example.schoolapp.mvp.presenter;

import com.example.lib_core.mvp.presenter.BasePresenter;
import com.example.schoolapp.mvp.contract.MessageContract;

import javax.inject.Inject;

public class MessagePresenter extends BasePresenter<MessageContract.MessageModel, MessageContract.MessageView> {

    @Inject
    public MessagePresenter(MessageContract.MessageModel messageModel, MessageContract.MessageView messageView) {
    }
}
