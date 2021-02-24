package com.example.schoolapp.adapter;

import android.widget.ImageView;

import androidx.annotation.Nullable;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.resource.bitmap.RoundedCorners;
import com.bumptech.glide.request.RequestOptions;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.example.schoolapp.R;
import com.example.schoolapp.mvp.model.homebean.LifeChoostBean;

import java.util.List;

public class LifeChooseAdapter extends BaseQuickAdapter<LifeChoostBean, BaseViewHolder> {
    public LifeChooseAdapter(int layoutResId, @Nullable List<LifeChoostBean> data) {
        super(layoutResId, data);
    }

    @Override
    protected void convert(BaseViewHolder helper, LifeChoostBean item) {
            helper.setText(R.id.every_choose_sign,item.getSign());
            helper.setText(R.id.every_choose_title,item.getTitle());
            Glide.with(mContext).load(item.getImgUrl()).apply(RequestOptions.bitmapTransform(new RoundedCorners(20))).into((ImageView) helper.getView(R.id.every_choose_img));
    }
}
