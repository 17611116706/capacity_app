package com.example.schoolapp.adapter;

import android.widget.ImageView;

import androidx.annotation.Nullable;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.resource.bitmap.RoundedCorners;
import com.bumptech.glide.request.RequestOptions;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.example.schoolapp.R;
import com.example.schoolapp.mvp.model.homebean.LifeSchoolTalkBean;

import java.util.List;

public class LifeSchoolTalkAdapter extends BaseQuickAdapter<LifeSchoolTalkBean, BaseViewHolder> {
    public LifeSchoolTalkAdapter(int layoutResId, @Nullable List<LifeSchoolTalkBean> data) {
        super(layoutResId, data);
    }

    @Override
    protected void convert(BaseViewHolder helper, LifeSchoolTalkBean item) {
        switch (item.getNumber()){
            case 1:
                Glide.with(mContext).load(R.mipmap.src_life_commit_fast).into((ImageView) helper.getView(R.id.school_talk_hostimg));
                Glide.with(mContext).load(R.mipmap.src_life_school_talk_hosthelp).into((ImageView) helper.getView(R.id.school_talk_helpimg));
                break;
            case 2:
                Glide.with(mContext).load(R.mipmap.src_life_commit_one).into((ImageView) helper.getView(R.id.school_talk_hostimg));
                Glide.with(mContext).load(R.mipmap.src_life_school_talk_onehelp).into((ImageView) helper.getView(R.id.school_talk_helpimg));
                break;
            case 3:
                Glide.with(mContext).load(R.mipmap.src_life_commit_two).into((ImageView) helper.getView(R.id.school_talk_hostimg));
                Glide.with(mContext).load(R.mipmap.src_life_school_talk_twohelp).into((ImageView) helper.getView(R.id.school_talk_helpimg));
                break;
            case 4:
                Glide.with(mContext).load(R.mipmap.src_life_commit_three).into((ImageView) helper.getView(R.id.school_talk_hostimg));
                Glide.with(mContext).load(R.mipmap.src_life_school_talk_threehelp).into((ImageView) helper.getView(R.id.school_talk_helpimg));
                break;
            case 5:
                Glide.with(mContext).load(R.mipmap.src_life_commit_four).into((ImageView) helper.getView(R.id.school_talk_hostimg));
                Glide.with(mContext).load(R.mipmap.src_life_school_talk_fourhelp).into((ImageView) helper.getView(R.id.school_talk_helpimg));
                break;
        }
        Glide.with(mContext).load(R.mipmap.app_school_talk_head).apply(RequestOptions.bitmapTransform(new RoundedCorners(20))).into((ImageView) helper.getView(R.id.school_talk_headimg));
        helper.setText(R.id.school_talk_title,item.getSchool_talk_title());
        helper.setText(R.id.school_talk_message,item.getSchool_talk_message());
        helper.setText(R.id.school_talk_helpcount,"助力："+item.getSchool_talk_helpcount());
    }
}
