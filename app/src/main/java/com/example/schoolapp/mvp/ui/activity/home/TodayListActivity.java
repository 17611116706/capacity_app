package com.example.schoolapp.mvp.ui.activity.home;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.example.lib_core.mvp.view.activity.BaseActivity;
import com.example.schoolapp.R;
import com.example.schoolapp.adapter.TodayListAdapter;
import com.example.schoolapp.mvp.constants.ARouterConstants;
import com.example.schoolapp.mvp.contract.HomeContract;
import com.example.schoolapp.mvp.model.homebean.TodayListBean;
import com.example.schoolapp.mvp.presenter.HomePresenter;

import java.util.ArrayList;

@Route(path = ARouterConstants.TodayListActivity)
public class TodayListActivity extends BaseActivity<HomePresenter> implements HomeContract.HomeView {

    private RecyclerView todayListActivityList;
    private TextView todayListActivityTitle;
    private ImageView todayListActivityMore;
    private LinearLayout todayListActivityBack;
    private ArrayList<TodayListBean> todayListBeans = new ArrayList<>();
    private TodayListAdapter todayListAdapter;
    @Override
    public int bondLayout() {
        return R.layout.activity_today_list;
    }

    @Override
    public void initInjec() {

    }

    @Override
    public void initView() {

        todayListActivityList = (RecyclerView) findViewById(R.id.todayListActivity_list);
        todayListActivityTitle = (TextView) findViewById(R.id.todayListActivity_title);
        todayListActivityMore = (ImageView) findViewById(R.id.todayListActivity_more);
        todayListActivityBack = (LinearLayout) findViewById(R.id.todayListActivity_back);
        todayListAdapter = new TodayListAdapter(R.layout.todaylistactivity_item_list,todayListBeans);
        todayListActivityList.setLayoutManager(new LinearLayoutManager(this));
        todayListActivityList.setAdapter(todayListAdapter);
        todayListActivityList.setOverScrollMode(View.OVER_SCROLL_NEVER);
//        homeRcyclerViewList.setNestedScrollingEnabled(false);
        todayListAdapter.notifyDataSetChanged();


    }

    @Override
    public void initData() {
        todayListBeans.add(new TodayListBean("#河北新增20例本土确诊",458236));
        todayListBeans.add(new TodayListBean("#河北新增20例本土确诊",458236));
        todayListBeans.add(new TodayListBean("#河北新增20例本土确诊",458236));
        todayListBeans.add(new TodayListBean("#河北新增20例本土确诊",458236));
        todayListBeans.add(new TodayListBean("#河北新增20例本土确诊",458236));
        todayListBeans.add(new TodayListBean("#河北新增20例本土确诊",458236));
        todayListBeans.add(new TodayListBean("#河北新增20例本土确诊",458236));
        todayListBeans.add(new TodayListBean("#河北新增20例本土确诊",458236));
        todayListBeans.add(new TodayListBean("#河北新增20例本土确诊",458236));
        todayListBeans.add(new TodayListBean("#河北新增20例本土确诊",458236));
        todayListBeans.add(new TodayListBean("#河北新增20例本土确诊",458236));
        todayListAdapter.notifyDataSetChanged();
    }

    @Override
    public void initEvent() {
        todayListActivityBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}