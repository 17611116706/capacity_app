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
import com.example.schoolapp.adapter.HomeRecyclerAdapter;
import com.example.schoolapp.adapter.TodayListAdapter;
import com.example.schoolapp.mvp.constants.ARouterConstants;
import com.example.schoolapp.mvp.contract.HomeContract;
import com.example.schoolapp.mvp.model.homebean.HomeListBean;
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
    private RecyclerView todayListActivityList1;
    private ArrayList<HomeListBean>  homeListBeans = new ArrayList<>();
    private HomeRecyclerAdapter homeRecyclerAdapter;


    @Override
    public int bondLayout() {
        return R.layout.activity_today_list;
    }

    @Override
    public void initInjec() {

    }

    @Override
    public void initView() {
        todayListActivityList1 = (RecyclerView) findViewById(R.id.todayListActivity_list1);
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


        HomeListBean homeListBean1 = new HomeListBean("http://p1.music.126.net/yC_df5u0myXVp-bM99K3Lw==/5870292580832850.jpg","小小的太阳",
                "4分钟之前","#句子、文案","要做的事情总找的出时间和机会,不要做的事情总找的出借口",new String[]{
                "http://p1.music.126.net/yC_df5u0myXVp-bM99K3Lw==/5870292580832850.jpg",
                "http://p1.music.126.net/yC_df5u0myXVp-bM99K3Lw==/5870292580832850.jpg",
                "http://p1.music.126.net/yC_df5u0myXVp-bM99K3Lw==/5870292580832850.jpg"}
                ,"456"
                ,"179"
                ,3
        );
        HomeListBean homeListBean2 = new HomeListBean("http://p1.music.126.net/yC_df5u0myXVp-bM99K3Lw==/5870292580832850.jpg","小小的太阳",
                "4分钟之前","#句子、文案","要做的事情总找的出时间和机会,不要做的事情总找的出借口",new String[]{
                "http://p1.music.126.net/yC_df5u0myXVp-bM99K3Lw==/5870292580832850.jpg",
                "http://p1.music.126.net/yC_df5u0myXVp-bM99K3Lw==/5870292580832850.jpg"}
                ,"456"
                ,"179"
                ,2
        );
        HomeListBean homeListBean3 = new HomeListBean("http://p1.music.126.net/yC_df5u0myXVp-bM99K3Lw==/5870292580832850.jpg","小小的太阳",
                "4分钟之前","#句子、文案","要做的事情总找的出时间和机会,不要做的事情总找的出借口",new String[]{
                "http://p1.music.126.net/yC_df5u0myXVp-bM99K3Lw==/5870292580832850.jpg"}
                ,"456"
                ,"179"
                ,1
        );
        HomeListBean homeListBean4 = new HomeListBean("http://p1.music.126.net/yC_df5u0myXVp-bM99K3Lw==/5870292580832850.jpg","小小的太阳",
                "4分钟之前","#句子、文案","要做的事情总找的出时间和机会,不要做的事情总找的出借口",new String[]{
                "http://p1.music.126.net/yC_df5u0myXVp-bM99K3Lw==/5870292580832850.jpg",
                "http://p1.music.126.net/yC_df5u0myXVp-bM99K3Lw==/5870292580832850.jpg",
                "http://p1.music.126.net/yC_df5u0myXVp-bM99K3Lw==/5870292580832850.jpg",
                "http://p1.music.126.net/yC_df5u0myXVp-bM99K3Lw==/5870292580832850.jpg",
                "http://p1.music.126.net/yC_df5u0myXVp-bM99K3Lw==/5870292580832850.jpg"}
                ,"456"
                ,"179"
                ,4
        );
        homeListBeans.add(homeListBean1);
        homeListBeans.add(homeListBean2);
        homeListBeans.add(homeListBean3);
        homeListBeans.add(homeListBean4);
        homeRecyclerAdapter = new HomeRecyclerAdapter(homeListBeans);
        todayListActivityList1.setLayoutManager(new LinearLayoutManager(this));
        todayListActivityList1.setAdapter(homeRecyclerAdapter);
        homeRecyclerAdapter.notifyDataSetChanged();
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