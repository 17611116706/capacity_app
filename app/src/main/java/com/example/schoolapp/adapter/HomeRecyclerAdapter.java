package com.example.schoolapp.adapter;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.Nullable;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.resource.bitmap.RoundedCorners;
import com.bumptech.glide.request.RequestOptions;
import com.chad.library.adapter.base.BaseMultiItemQuickAdapter;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.example.schoolapp.R;
import com.example.schoolapp.mvp.model.homebean.HomeListBean;

import java.util.List;

public class HomeRecyclerAdapter extends BaseMultiItemQuickAdapter<HomeListBean, BaseViewHolder> {


    /**
     * Same as QuickAdapter#QuickAdapter(Context,int) but with
     * some initialization data.
     *
     * @param data A new list is created out of this one to avoid mutable list
     */
    public HomeRecyclerAdapter(List<HomeListBean> data) {
        super(data);
        addItemType(1,R.layout.home_recyclerview_item_single);
        addItemType(2,R.layout.home_recyclerview_item_double);
        addItemType(3,R.layout.home_recyclerview_item_three);
        addItemType(4,R.layout.home_recyclerview_item);
    }

    @Override
    protected void convert(BaseViewHolder helper, HomeListBean item) {
        int itemType = item.getItemType();
            Glide.with(mContext).load(R.drawable.resultimg).apply(RequestOptions.bitmapTransform(new RoundedCorners(40))).into((ImageView) helper.getView(R.id.home_recyclerview_item_headimg));
            helper.setText(R.id.home_recyclerview_item_name,item.getName());
            helper.setText(R.id.home_recyclerview_sendtime,item.getSendtime());
            helper.setText(R.id.home_recyclerview_item_title,item.getTitle());
            helper.setText(R.id.home_recyclerview_item_message,"\t\t\t\t\t\t\t\t\t\t\t\t\t "+item.getMessage());
        switch (itemType){
            case 1:
                Glide.with(mContext).load(R.drawable.resultimg).apply(RequestOptions.bitmapTransform(new RoundedCorners(10))).into((ImageView) helper.getView(R.id.singimg));
                break;
            case 2:
                Glide.with(mContext).load(R.drawable.resultimg).apply(RequestOptions.bitmapTransform(new RoundedCorners(10))).into((ImageView) helper.getView(R.id.doubleimg1));
                Glide.with(mContext).load(R.drawable.resultimg).apply(RequestOptions.bitmapTransform(new RoundedCorners(10))).into((ImageView) helper.getView(R.id.doubleimg2));

                break;
            case 3:
                Glide.with(mContext).load(R.drawable.resultimg).apply(RequestOptions.bitmapTransform(new RoundedCorners(10))).into((ImageView) helper.getView(R.id.threeimg1));
                Glide.with(mContext).load(R.drawable.resultimg).apply(RequestOptions.bitmapTransform(new RoundedCorners(10))).into((ImageView) helper.getView(R.id.threeimg2));
                Glide.with(mContext).load(R.drawable.resultimg).apply(RequestOptions.bitmapTransform(new RoundedCorners(10))).into((ImageView) helper.getView(R.id.threeimg3));

                break;
            case 4:
                Glide.with(mContext).load(R.drawable.resultimg).apply(RequestOptions.bitmapTransform(new RoundedCorners(10))).into((ImageView) helper.getView(R.id.moreimg1));
                Glide.with(mContext).load(R.drawable.resultimg).apply(RequestOptions.bitmapTransform(new RoundedCorners(10))).into((ImageView) helper.getView(R.id.moreimg2));
                Glide.with(mContext).load(R.drawable.resultimg).apply(RequestOptions.bitmapTransform(new RoundedCorners(10))).into((ImageView) helper.getView(R.id.moreimg3));
                Glide.with(mContext).load(R.drawable.resultimg).apply(RequestOptions.bitmapTransform(new RoundedCorners(10))).into((ImageView) helper.getView(R.id.moreimg4));
        }
        helper.setText(R.id.home_recyclerview_item_love_count,item.getLovecount());
        helper.setText(R.id.home_recyclerview_item_comment_count,item.getCommentcount());
    }
}
