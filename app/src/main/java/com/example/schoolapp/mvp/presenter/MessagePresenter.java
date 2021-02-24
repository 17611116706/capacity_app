package com.example.schoolapp.mvp.presenter;

import com.example.lib_core.mvp.presenter.BasePresenter;
import com.example.lib_core.mvp.view.fragment.BaseFragment;
import com.example.schoolapp.mvp.contract.MessaageContract;

import javax.inject.Inject;

public class MessagePresenter extends BasePresenter<MessaageContract.MessageModel,MessaageContract.MessageView> {

    @Inject
    public MessagePresenter(MessaageContract.MessageModel messageModel,MessaageContract.MessageView messageView) {
    }
}
