package com.example.schoolapp.adapter;

import android.annotation.SuppressLint;
import android.widget.ImageView;

import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.example.schoolapp.R;
import com.example.schoolapp.mvp.model.homebean.TodayListBean;

import java.util.List;

public class TodayListAdapter extends BaseQuickAdapter<TodayListBean, BaseViewHolder> {


    public TodayListAdapter(int layoutResId, @Nullable List<TodayListBean> data) {
        super(layoutResId, data);
    }

    @SuppressLint("ResourceAsColor")
    @Override
    protected void convert(BaseViewHolder helper, TodayListBean item) {
        helper.setVisible(R.id.todaylist_item_helper_img,false);
        helper.setVisible(R.id.todaylist_item_helper_no,false);
        helper.setText(R.id.todaylist_item_helper_title,item.getTitle());
        helper.setText(R.id.todaylist_item_helper_count,item.getHelpcount()+"");
        switch (helper.getPosition()){
            case 0:
                helper.setVisible(R.id.todaylist_item_helper_img,true);
                Glide.with(mContext).load(R.mipmap.src_todaylist_top).into((ImageView) helper.getView(R.id.todaylist_item_helper_img));
                Glide.with(mContext).load(R.mipmap.src_life_school_talk_hosthelp).into((ImageView) helper.getView(R.id.todaylist_item_helper_icon));
                helper.setText(R.id.todaylist_item_helper_title,item.getTitle());
                break;
            case 1:
                helper.setVisible(R.id.todaylist_item_helper_no,true);
                helper.setTextColor(R.id.todaylist_item_helper_no,mContext.getResources().getColor(R.color.color_FA5151));
                helper.setText(R.id.todaylist_item_helper_no,helper.getPosition()+"");
                helper.setText(R.id.todaylist_item_helper_title,item.getTitle());
                Glide.with(mContext).load(R.mipmap.src_life_school_talk_onehelp).into((ImageView) helper.getView(R.id.todaylist_item_helper_icon));
                break;
            case 2:
                helper.setVisible(R.id.todaylist_item_helper_no,true);
                helper.setText(R.id.todaylist_item_helper_no,helper.getPosition()+"");
                helper.setTextColor(R.id.todaylist_item_helper_no,mContext.getResources().getColor(R.color.color_FF9E41));
                helper.setText(R.id.todaylist_item_helper_title,item.getTitle());
                Glide.with(mContext).load(R.mipmap.src_life_school_talk_twohelp).into((ImageView) helper.getView(R.id.todaylist_item_helper_icon));
                break;
            case 3:
                helper.setVisible(R.id.todaylist_item_helper_no,true);
                helper.setText(R.id.todaylist_item_helper_no,helper.getPosition()+"");
                helper.setTextColor(R.id.todaylist_item_helper_no,mContext.getResources().getColor(R.color.color_D3AC80));
                helper.setText(R.id.todaylist_item_helper_title,item.getTitle());
                Glide.with(mContext).load(R.mipmap.src_life_school_talk_threehelp).into((ImageView) helper.getView(R.id.todaylist_item_helper_icon));

                break;
            default:
                helper.setVisible(R.id.todaylist_item_helper_no,true);
                helper.setText(R.id.todaylist_item_helper_no,helper.getPosition()+"");
                helper.setTextColor(R.id.todaylist_item_helper_no,mContext.getResources().getColor(R.color.color_999999));
                helper.setText(R.id.todaylist_item_helper_title,item.getTitle());
                Glide.with(mContext).load(R.mipmap.src_life_school_talk_fourhelp).into((ImageView) helper.getView(R.id.todaylist_item_helper_icon));
                break;
        }
    }
}
