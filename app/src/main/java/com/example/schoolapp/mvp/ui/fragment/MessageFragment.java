package com.example.schoolapp.mvp.ui.fragment;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.example.lib_core.mvp.view.fragment.BaseFragment;
import com.example.schoolapp.R;
import com.example.schoolapp.adapter.MessageAdapter;
import com.example.schoolapp.mvp.constants.ARouterConstants;
import com.example.schoolapp.mvp.contract.MessageContract;
import com.example.schoolapp.mvp.model.messagebean.MessageListBean;
import com.example.schoolapp.mvp.presenter.MessagePresenter;

import java.util.ArrayList;

@Route(path = ARouterConstants.MessageFragment)
public class MessageFragment extends BaseFragment<MessagePresenter> implements MessageContract.MessageView {
    private RecyclerView messageList;
    private ArrayList<MessageListBean> messageListBeans;
    private MessageAdapter messageAdapter;



    @Override
    public int bondLayouy() {
        return R.layout.fragment_message;
    }

    @Override
    public void initInjec() {

    }

    @Override
    public void initView() {
        messageList = (RecyclerView) findViewById(R.id.message_list);
        messageListBeans = new ArrayList<>();
        messageListBeans.add(new MessageListBean("https://profile.csdnimg.cn/D/B/5/3_xiaoqun999","熊大","最新消息？"));
        messageListBeans.add(new MessageListBean("https://profile.csdnimg.cn/D/B/5/3_xiaoqun999","熊大","最新消息？"));
        messageListBeans.add(new MessageListBean("https://profile.csdnimg.cn/D/B/5/3_xiaoqun999","熊大","最新消息？"));
        messageListBeans.add(new MessageListBean("https://profile.csdnimg.cn/D/B/5/3_xiaoqun999","熊大","最新消息？"));
        messageAdapter = new MessageAdapter(R.layout.message_list_item,messageListBeans);
        messageList.setLayoutManager(new LinearLayoutManager(getContext()));
        messageList.setAdapter(messageAdapter);
        messageAdapter.notifyDataSetChanged();
    }

    @Override
    public void initData() {

    }

    @Override
    public void initEvent() {

    }
}