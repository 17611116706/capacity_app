package com.example.schoolapp.adapter;

import android.widget.ImageView;

import androidx.annotation.Nullable;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.resource.bitmap.RoundedCorners;
import com.bumptech.glide.request.RequestOptions;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.example.schoolapp.R;
import com.example.schoolapp.mvp.model.messagebean.MessageListBean;

import java.util.List;

public class MessageAdapter extends BaseQuickAdapter<MessageListBean, BaseViewHolder> {
    public MessageAdapter(int layoutResId, @Nullable List<MessageListBean> data) {
        super(layoutResId, data);

    }

    @Override
    protected void convert(BaseViewHolder helper, MessageListBean item) {
        Glide.with(mContext).load(item.getImgUrl()).apply(RequestOptions.bitmapTransform(new RoundedCorners(60))).into((ImageView) helper.getView(R.id.message_item_img));
        helper.setText(R.id.message_name,item.getName());
        helper.setText(R.id.message_content,item.getContent());
        helper.setText(R.id.message_time,"00:00");
    }
}
