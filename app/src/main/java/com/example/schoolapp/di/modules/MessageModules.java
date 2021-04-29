package com.example.schoolapp.di.modules;

import com.example.schoolapp.mvp.contract.MessageContract;
import com.example.schoolapp.mvp.model.MessageModel;

import dagger.Module;
import dagger.Provides;

@Module
public class MessageModules {

    private MessageContract.MessageView messageView;

    public MessageModules(MessageContract.MessageView messageView) {
        this.messageView = messageView;
    }
    
    @Provides
    public MessageContract.MessageView provideMessageView(){
        return messageView;
    }
    
    @Provides
    public MessageContract.MessageModel provideMessageModel(MessageModel messageModel){
        return messageModel;
    }
    
}
