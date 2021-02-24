package com.example.schoolapp.mvp.view.fragment;

import android.content.Context;
import android.graphics.drawable.Drawable;

import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.lib_core.mvp.view.fragment.BaseFragment;
import com.example.schoolapp.R;
import com.example.schoolapp.adapter.HomeRecyclerAdapter;
import com.example.schoolapp.mvp.contract.HomeContract;
import com.example.schoolapp.mvp.model.homebean.HomeListBean;
import com.example.schoolapp.mvp.presenter.HomePresenter;
import com.scwang.smartrefresh.layout.SmartRefreshLayout;
import com.scwang.smartrefresh.layout.api.DefaultRefreshFooterCreator;
import com.scwang.smartrefresh.layout.api.DefaultRefreshHeaderCreator;
import com.scwang.smartrefresh.layout.api.RefreshFooter;
import com.scwang.smartrefresh.layout.api.RefreshHeader;
import com.scwang.smartrefresh.layout.api.RefreshLayout;
import com.scwang.smartrefresh.layout.constant.SpinnerStyle;
import com.scwang.smartrefresh.layout.footer.BallPulseFooter;
import com.scwang.smartrefresh.layout.footer.ClassicsFooter;
import com.scwang.smartrefresh.layout.header.ClassicsHeader;
import com.scwang.smartrefresh.layout.listener.OnRefreshLoadMoreListener;

import java.util.ArrayList;

public class HomeFragment extends BaseFragment<HomePresenter> implements HomeContract.HomeView {
    private LinearLayout homeMore;
    private TextView todayLi1;
    private TextView todayLi2;
    private TextView todayLi3;
    private TextView todayLi4;
    private RecyclerView homeRcyclerViewList;
    private ArrayList<HomeListBean> homeListBeans;
    private HomeRecyclerAdapter homeRecyclerAdapter;
    private SmartRefreshLayout smartrefresh;
    static {
        //设置全局的Header构建器
        SmartRefreshLayout.setDefaultRefreshHeaderCreator(new DefaultRefreshHeaderCreator() {
            @Override
            public RefreshHeader createRefreshHeader(Context context, RefreshLayout layout) {
                layout.setPrimaryColorsId(R.color.theme, android.R.color.white);//全局设置主题颜色
                return new ClassicsHeader(context);//.setTimeFormat(new DynamicTimeFormat("更新于 %s"));//指定为经典Header，默认是 贝塞尔雷达Header
            }
        });
        //设置全局的Footer构建器
        SmartRefreshLayout.setDefaultRefreshFooterCreator(new DefaultRefreshFooterCreator() {
            @Override
            public RefreshFooter createRefreshFooter(Context context, RefreshLayout layout) {
                //指定为经典Footer，默认是 BallPulseFooter
                return new ClassicsFooter(context).setDrawableSize(20);
            }
        });

    }
    @Override
    public int bondLayouy() {
        return R.layout.fragment_home;
    }

    @Override
    public void initInjec() {

    }

    @Override
    public void initView() {
        smartrefresh = (SmartRefreshLayout) findViewById(R.id.smartrefresh);
        //设置 Footer 为 球脉冲 样式
        smartrefresh.setRefreshFooter(new BallPulseFooter(getActivity()).setSpinnerStyle(SpinnerStyle.Scale));
        homeMore = (LinearLayout) findViewById(R.id.home_more);
        todayLi1 = (TextView) findViewById(R.id.today_li1);
        todayLi2 = (TextView) findViewById(R.id.today_li2);
        todayLi3 = (TextView) findViewById(R.id.today_li3);
        todayLi4 = (TextView) findViewById(R.id.today_li4);
        homeRcyclerViewList = (RecyclerView) findViewById(R.id.home_rcyclerView_list);
        homeListBeans = new ArrayList<>();

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
        homeRecyclerAdapter = new HomeRecyclerAdapter(homeListBeans);
        Drawable host_icon = getResources().getDrawable(R.mipmap.src_home_host);
        host_icon.setBounds(0,0,56,30);
        todayLi1.setCompoundDrawables(null,null,host_icon,null);
        todayLi3.setCompoundDrawables(null,null,host_icon,null);

        homeListBeans.add(homeListBean1);
        homeListBeans.add(homeListBean2);
        homeListBeans.add(homeListBean3);
        homeListBeans.add(homeListBean4);
        homeListBeans.add(homeListBean1);
        homeListBeans.add(homeListBean2);
        homeListBeans.add(homeListBean3);
        homeListBeans.add(homeListBean4);
        homeRcyclerViewList.setLayoutManager(new LinearLayoutManager(getContext()));
        homeRcyclerViewList.setAdapter(homeRecyclerAdapter);
        homeRecyclerAdapter.notifyDataSetChanged();


        smartrefresh.setOnRefreshLoadMoreListener(new OnRefreshLoadMoreListener() {
            @Override
            public void onLoadMore(@NonNull RefreshLayout refreshLayout) {
                smartrefresh.finishLoadMore();
            }

            @Override
            public void onRefresh(@NonNull RefreshLayout refreshLayout) {
                smartrefresh.finishRefresh();
            }
        });
    }

    @Override
    public void initData() {

    }
}