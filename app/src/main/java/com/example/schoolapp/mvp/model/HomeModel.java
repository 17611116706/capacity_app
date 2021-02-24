package com.example.schoolapp.mvp.model;

import com.example.lib_core.mvp.model.BaseModel;
import com.example.schoolapp.mvp.contract.HomeContract;

import javax.inject.Inject;

public class HomeModel extends BaseModel implements HomeContract.HomeModel {

    @Inject
    public HomeModel() {
    }
}
