package com.example.schoolapp.mvp.view.fragment;

import android.content.Context;
import android.graphics.Outline;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.resource.bitmap.CenterCrop;
import com.bumptech.glide.load.resource.bitmap.CircleCrop;
import com.bumptech.glide.load.resource.bitmap.RoundedCorners;
import com.bumptech.glide.request.RequestOptions;
import com.example.lib_core.mvp.view.fragment.BaseFragment;
import com.example.schoolapp.R;
import com.example.schoolapp.adapter.HomeRecyclerAdapter;
import com.example.schoolapp.adapter.LifeChooseAdapter;
import com.example.schoolapp.adapter.LifeSchoolTalkAdapter;
import com.example.schoolapp.mvp.contract.LifeContract;
import com.example.schoolapp.mvp.model.homebean.HomeListBean;
import com.example.schoolapp.mvp.model.homebean.LifeChoostBean;
import com.example.schoolapp.mvp.model.homebean.LifeSchoolTalkBean;
import com.example.schoolapp.mvp.presenter.LifePresenter;
import com.youth.banner.Banner;
import com.youth.banner.loader.ImageLoader;

import java.util.ArrayList;


public class LifeFragment extends BaseFragment<LifePresenter> implements LifeContract.LifeView {
    private TextView locationTitle;
    private EditText lifeSearch;
    private Banner lifeBanner;
    private LinearLayout everyDay;
    private LifeChooseAdapter lifeChooseAdapter;
    private ArrayList<LifeChoostBean> lifeChoostBeans;
    private RecyclerView everydayChooseList;
    private RecyclerView schoolTalkList;
    private ArrayList<LifeSchoolTalkBean> lifeSchoolTalkBeans;
    private LifeSchoolTalkAdapter lifeSchoolTalkAdapter;
    private RecyclerView schoolTalkDynamic;
    private ArrayList<HomeListBean> homeListBeans;
    private HomeRecyclerAdapter homeRecyclerAdapter;
    @Override
    public int bondLayouy() {
        return R.layout.fragment_life;
    }

    @Override
    public void initInjec() {

    }

    @Override
    public void initView() {




        schoolTalkDynamic = (RecyclerView) findViewById(R.id.school_talk_dynamic);

        schoolTalkList = (RecyclerView) findViewById(R.id.school_talk_list);
        everydayChooseList = (RecyclerView) findViewById(R.id.everyday_choose_list);
        everyDay = (LinearLayout) findViewById(R.id.every_day);
        lifeBanner = (Banner) findViewById(R.id.life_banner);
        locationTitle = (TextView) findViewById(R.id.location_title);
        lifeSearch = (EditText) findViewById(R.id.life_search);

        Drawable search = getResources().getDrawable(R.mipmap.src_life_search);
        search.setBounds(0,0,60,60);
        lifeSearch.setCompoundDrawables(search,null,null,null);

        ArrayList<String> strings = new ArrayList<>();
        strings.add("https://goss3.cfp.cn/creative/vcg/800/new/VCG211275572644.jpg");
        strings.add("https://goss3.cfp.cn/creative/vcg/800/new/VCG211275572644.jpg");
        strings.add("https://goss3.cfp.cn/creative/vcg/800/new/VCG211275572644.jpg");
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            lifeBanner.setOutlineProvider(new ViewOutlineProvider() {
                @Override
                public void getOutline(View view, Outline outline) {
                    outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), 15);
                }
            });
            lifeBanner.setClipToOutline(true);
        }
        lifeBanner.setImages(strings);
        lifeBanner.setImageLoader(new ImageLoader() {
            @Override
            public void displayImage(Context context, Object path, ImageView imageView) {
                Glide.with(context).load(path).apply(RequestOptions.bitmapTransform(new RoundedCorners(10))).into(imageView);
            }
        });
        lifeBanner.start();

        //每日精选

        lifeChoostBeans = new ArrayList<>();
        lifeChoostBeans.add(new LifeChoostBean("https://avatar.csdnimg.cn/F/C/8/3_qq_38945720_1564489741.jpg","XXX兼职","暑假直聘"));
        lifeChoostBeans.add(new LifeChoostBean("https://avatar.csdnimg.cn/F/C/8/3_qq_38945720_1564489741.jpg","XXX兼职","暑假直聘"));
        lifeChoostBeans.add(new LifeChoostBean("https://avatar.csdnimg.cn/F/C/8/3_qq_38945720_1564489741.jpg","XXX兼职","暑假直聘"));
        lifeChoostBeans.add(new LifeChoostBean("https://avatar.csdnimg.cn/F/C/8/3_qq_38945720_1564489741.jpg","XXX兼职","暑假直聘"));
        lifeChoostBeans.add(new LifeChoostBean("https://avatar.csdnimg.cn/F/C/8/3_qq_38945720_1564489741.jpg","XXX兼职","暑假直聘"));
        lifeChooseAdapter = new LifeChooseAdapter(R.layout.life_recyclerview_choose_item,lifeChoostBeans);
        everydayChooseList.setLayoutManager(new LinearLayoutManager(getContext(),RecyclerView.HORIZONTAL,false));
        everydayChooseList.setAdapter(lifeChooseAdapter);
        lifeChooseAdapter.notifyDataSetChanged();
        // 校园话题
        lifeSchoolTalkBeans = new ArrayList<>();
        lifeSchoolTalkBeans.add(new LifeSchoolTalkBean("","","#河北新增20例本土确诊","1-20日0-24小时，31个省自治区","",99999,1));
        lifeSchoolTalkBeans.add(new LifeSchoolTalkBean("","","#河北新增20例本土确诊","1-20日0-24小时，31个省自治区","",99999,2));
        lifeSchoolTalkBeans.add(new LifeSchoolTalkBean("","","#河北新增20例本土确诊","1-20日0-24小时，31个省自治区","",99999,3));
        lifeSchoolTalkBeans.add(new LifeSchoolTalkBean("","","#河北新增20例本土确诊","1-20日0-24小时，31个省自治区","",99999,4));
        lifeSchoolTalkBeans.add(new LifeSchoolTalkBean("","","#河北新增20例本土确诊","1-20日0-24小时，31个省自治区","",99999,5));
        lifeSchoolTalkAdapter = new LifeSchoolTalkAdapter(R.layout.life_school_talk_item,lifeSchoolTalkBeans);
        schoolTalkList.setLayoutManager(new LinearLayoutManager(getContext()));
        schoolTalkList.setAdapter(lifeSchoolTalkAdapter);
        lifeSchoolTalkAdapter.notifyDataSetChanged();
        //校园动态
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
        homeListBeans.add(homeListBean1);
        homeListBeans.add(homeListBean2);
        homeListBeans.add(homeListBean3);
        homeListBeans.add(homeListBean4);
        homeListBeans.add(homeListBean1);
        homeListBeans.add(homeListBean2);
        homeListBeans.add(homeListBean3);
        homeListBeans.add(homeListBean4);
        schoolTalkDynamic.setLayoutManager(new LinearLayoutManager(getContext()));
        schoolTalkDynamic.setAdapter(homeRecyclerAdapter);
        homeRecyclerAdapter.notifyDataSetChanged();
    }

    @Override
    public void initData() {

    }
}