package com.example.schoolapp.mvp.ui.fragment;

import android.content.Context;
import android.graphics.Outline;
import android.graphics.drawable.Drawable;
import android.os.Build;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.View;
import android.view.ViewOutlineProvider;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.bumptech.glide.Glide;
import com.bumptech.glide.load.resource.bitmap.RoundedCorners;
import com.bumptech.glide.request.RequestOptions;
import com.example.lib_core.mvp.view.fragment.BaseFragment;
import com.example.schoolapp.R;
import com.example.schoolapp.adapter.HomeRecyclerAdapter;
import com.example.schoolapp.adapter.LifeChooseAdapter;
import com.example.schoolapp.adapter.LifeSchoolTalkAdapter;
import com.example.schoolapp.mvp.constants.ARouterConstants;
import com.example.schoolapp.mvp.contract.LifeContract;
import com.example.schoolapp.mvp.model.homebean.HomeListBean;
import com.example.schoolapp.mvp.model.homebean.LifeChoostBean;
import com.example.schoolapp.mvp.model.homebean.LifeSchoolTalkBean;
import com.example.schoolapp.mvp.presenter.LifePresenter;
import com.youth.banner.Banner;
import com.youth.banner.loader.ImageLoader;

import java.util.ArrayList;

@Route(path = ARouterConstants.LifeFragment)
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
        strings.add("https://gimg2.baidu.com/image_search/src=http%3A%2F%2Fwww.qu4c.com%2Fuploads%2Fallimg%2F191230%2F2329456446-5.jpg&refer=http%3A%2F%2Fwww.qu4c.com&app=2002&size=f9999,10000&q=a80&n=0&g=0n&fmt=jpeg?sec=1621850763&t=fed00a68817c02be43e82deb49cfd647");
        strings.add("https://gimg2.baidu.com/image_search/src=http%3A%2F%2Fimg.51miz.com%2Fpreview%2Fmuban%2F00%2F00%2F42%2F63%2FM-426373-EA0B4316.jpg-0.jpg&refer=http%3A%2F%2Fimg.51miz.com&app=2002&size=f9999,10000&q=a80&n=0&g=0n&fmt=jpeg?sec=1621850846&t=4e205ac91f9e89d21a62404a979a2280");
        strings.add("https://ss3.bdstatic.com/70cFv8Sh_Q1YnxGkpoWK1HF6hhy/it/u=1986720659,1908690322&fm=26&gp=0.jpg");
        strings.add("https://gimg2.baidu.com/image_search/src=http%3A%2F%2Fp2.qhimgs4.com%2Ft014cf3ac564e0ab687.jpg&refer=http%3A%2F%2Fp2.qhimgs4.com&app=2002&size=f9999,10000&q=a80&n=0&g=0n&fmt=jpeg?sec=1621850880&t=9b90f03848a649c5c2ec50ea9d4d064d");
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
        lifeChoostBeans.add(new LifeChoostBean("https://gimg2.baidu.com/image_search/src=http%3A%2F%2F6.pic.pc6.com%2Fup%2F2016-12%2F20161214142929118.png&refer=http%3A%2F%2F6.pic.pc6.com&app=2002&size=f9999,10000&q=a80&n=0&g=0n&fmt=jpeg?sec=1621850662&t=5a016e9fae8672227d7cceecef58399d","XXX兼职","暑假直聘"));
        lifeChoostBeans.add(new LifeChoostBean("https://gimg2.baidu.com/image_search/src=http%3A%2F%2Fwww.huaxiaqiumei.com%2FuploadInput%2Fimage%2F20171126%2F20171126084553_31093.jpg&refer=http%3A%2F%2Fwww.huaxiaqiumei.com&app=2002&size=f9999,10000&q=a80&n=0&g=0n&fmt=jpeg?sec=1621850763&t=07db963181a4ba7ede4a34dbdd11f866","XXX兼职","暑假直聘"));
        lifeChoostBeans.add(new LifeChoostBean("https://gimg2.baidu.com/image_search/src=http%3A%2F%2F6.pic.pc6.com%2Fup%2F2016-12%2F20161214142929118.png&refer=http%3A%2F%2F6.pic.pc6.com&app=2002&size=f9999,10000&q=a80&n=0&g=0n&fmt=jpeg?sec=1621850662&t=5a016e9fae8672227d7cceecef58399d","XXX兼职","暑假直聘"));
        lifeChoostBeans.add(new LifeChoostBean("https://gimg2.baidu.com/image_search/src=http%3A%2F%2F6.pic.pc6.com%2Fup%2F2016-12%2F20161214142929118.png&refer=http%3A%2F%2F6.pic.pc6.com&app=2002&size=f9999,10000&q=a80&n=0&g=0n&fmt=jpeg?sec=1621850662&t=5a016e9fae8672227d7cceecef58399d","XXX兼职","暑假直聘"));
        lifeChoostBeans.add(new LifeChoostBean("https://gimg2.baidu.com/image_search/src=http%3A%2F%2F6.pic.pc6.com%2Fup%2F2016-12%2F20161214142929118.png&refer=http%3A%2F%2F6.pic.pc6.com&app=2002&size=f9999,10000&q=a80&n=0&g=0n&fmt=jpeg?sec=1621850662&t=5a016e9fae8672227d7cceecef58399d","XXX兼职","暑假直聘"));
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
        schoolTalkList.setNestedScrollingEnabled(false);
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

    @Override
    public void initEvent() {

    }
}