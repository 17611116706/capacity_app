package com.example.schoolapp.mvp.ui.fragment;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.lib_core.mvp.view.fragment.BaseFragment;
import com.example.schoolapp.R;
import com.example.schoolapp.adapter.MineListAdapter;
import com.example.schoolapp.mvp.contract.MineContract;
import com.example.schoolapp.mvp.model.minebean.MineListBean;
import com.example.schoolapp.mvp.presenter.MinePresenter;

import java.util.ArrayList;


public class MineFragment extends BaseFragment<MinePresenter> implements MineContract.MineView {
    private RecyclerView mineList;
    private ArrayList<MineListBean> mineListBeans = new ArrayList<>();
    private MineListAdapter mineListAdapter;
    @Override
    public int bondLayouy() {
        return R.layout.fragment_mine;
    }

    @Override
    public void initInjec() {

    }

    @Override
    public void initView() {
        mineList = (RecyclerView) findViewById(R.id.mine_list);
        mineListAdapter = new MineListAdapter(R.layout.mine_list_item,mineListBeans);
        mineListBeans.add(new MineListBean(R.mipmap.src_mine_list_wallet,"我的钱包"));
        mineListBeans.add(new MineListBean(R.mipmap.src_mine_list_manager,"兼职管理"));
        mineListBeans.add(new MineListBean(R.mipmap.src_mine_list_fun,"辅助功能"));
        mineListBeans.add(new MineListBean(R.mipmap.src_mine_list_center,"合作中心"));
        mineListBeans.add(new MineListBean(R.mipmap.src_mine_list_suggest,"意见反馈"));
        mineList.setLayoutManager(new LinearLayoutManager(getContext()));
        mineList.setAdapter(mineListAdapter);
        mineListAdapter.notifyDataSetChanged();
    }

    @Override
    public void initData() {

    }
}