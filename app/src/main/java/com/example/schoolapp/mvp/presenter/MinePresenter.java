package com.example.schoolapp.mvp.presenter;

import com.example.lib_core.mvp.presenter.BasePresenter;
import com.example.schoolapp.mvp.contract.MineContract;

import javax.inject.Inject;

public class MinePresenter extends BasePresenter<MineContract.MineModel,MineContract.MineView> {

    @Inject
    public MinePresenter(MineContract.MineModel mineModel,MineContract.MineView mineView)  {
    }
}
