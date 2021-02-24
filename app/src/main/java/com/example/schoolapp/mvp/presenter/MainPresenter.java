package com.example.schoolapp.mvp.presenter;

import com.example.lib_core.mvp.presenter.BasePresenter;
import com.example.schoolapp.mvp.contract.HomeContract;
import com.example.schoolapp.mvp.contract.MainContract;

import javax.inject.Inject;

public class MainPresenter extends BasePresenter<MainContract.MainModel,MainContract.MainView> {

    @Inject
    public MainPresenter(MainContract.MainModel mainModel, MainContract.MainView mainView) {
    }



}
