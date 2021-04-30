package com.example.schoolapp.mvp.ui.fragment;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.launcher.ARouter;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.example.lib_core.mvp.view.fragment.BaseFragment;
import com.example.schoolapp.R;
import com.example.schoolapp.adapter.MineListAdapter;
import com.example.schoolapp.mvp.constants.ARouterConstants;
import com.example.schoolapp.mvp.contract.MineContract;
import com.example.schoolapp.mvp.model.minebean.LogoutEntity;
import com.example.schoolapp.mvp.model.minebean.MineListBean;
import com.example.schoolapp.mvp.presenter.MinePresenter;

import java.util.ArrayList;

@Route(path = ARouterConstants.MinFragment)
public class MineFragment extends BaseFragment<MinePresenter> implements MineContract.MineView, View.OnClickListener {
    private ArrayList<MineListBean> mineListBeans = new ArrayList<>();
    private MineListAdapter mineListAdapter;
    private ImageView mineSetting;
    private ImageView infoImg;
    private RecyclerView mineList;
    private LinearLayout persionInfo;
    @Override
    public int bondLayouy() {
        return R.layout.fragment_mine;
    }

    @Override
    public void initInjec() {

    }

    @Override
    public void initView() {

        persionInfo = (LinearLayout) findViewById(R.id.persion_info);
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
        mineSetting = (ImageView) findViewById(R.id.mine_setting);
        infoImg = (ImageView) findViewById(R.id.info_img);



    }

    @Override
    public void initData() {

    }

    @Override
    public void initEvent() {
        mineSetting.setOnClickListener(this);
        persionInfo.setOnClickListener(this);
        mineListAdapter.setOnItemClickListener(new BaseQuickAdapter.OnItemClickListener() {
            @Override
            public void onItemClick(BaseQuickAdapter adapter, View view, int position) {
                switch (position){
                    case 0:

                        break;
                    case 1:

                        break;
                    case 2:
                        ARouter.getInstance().build(ARouterConstants.MiscellaneousActivity).navigation();
                        break;
                    case 3:
                        ARouter.getInstance().build(ARouterConstants.CollaborateCenterActivity).navigation();
                        break;
                    case 4:

                        break;
                }
            }
        });
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.mine_setting:
                ARouter.getInstance().build(ARouterConstants.SettingActivity).navigation();
                break;
            case R.id.persion_info:
                ARouter.getInstance().build(ARouterConstants.PersionActivity).navigation();
                break;

        }
    }

    @Override
    public void getLogout(LogoutEntity logoutEntity) {

    }
}