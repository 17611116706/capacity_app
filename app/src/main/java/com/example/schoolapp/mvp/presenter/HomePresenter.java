package com.example.schoolapp.mvp.presenter;

import com.example.lib_core.mvp.presenter.BasePresenter;
import com.example.schoolapp.mvp.contract.HomeContract;

import javax.inject.Inject;

public class HomePresenter extends BasePresenter<HomeContract.HomeModel,HomeContract.HomeView> {

    @Inject
    public HomePresenter(HomeContract.HomeModel homeModel,HomeContract.HomeView homeView) {
    }



}
