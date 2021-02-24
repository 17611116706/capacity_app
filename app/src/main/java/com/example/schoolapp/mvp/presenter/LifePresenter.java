package com.example.schoolapp.mvp.presenter;

import com.example.lib_core.mvp.presenter.BasePresenter;
import com.example.schoolapp.mvp.contract.LifeContract;

import javax.inject.Inject;

public class LifePresenter extends BasePresenter<LifeContract.LifeModel,LifeContract.LifeView> {

    @Inject
    public LifePresenter(LifeContract.LifeModel lifeModel,LifeContract.LifeView lifeView) {
    }
}
