package com.example.schoolapp.adapter;

import android.widget.ImageView;

import androidx.annotation.Nullable;

import com.bumptech.glide.Glide;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.example.schoolapp.R;
import com.example.schoolapp.mvp.model.minebean.MineListBean;

import java.util.List;

public class MineListAdapter extends BaseQuickAdapter<MineListBean, BaseViewHolder> {
    public MineListAdapter(int layoutResId, @Nullable List<MineListBean> data) {
        super(layoutResId, data);
    }

    @Override
    protected void convert(BaseViewHolder helper, MineListBean item) {
        helper.setText(R.id.mine_item_title,item.getTitle());
        Glide.with(mContext).load(item.getIcon()).into((ImageView) helper.getView(R.id.mine_item_img));
    }
}
