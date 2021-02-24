package com.example.schoolapp.mvp.model;

import com.example.lib_core.mvp.model.BaseModel;
import com.example.schoolapp.mvp.contract.MainContract;

import javax.inject.Inject;

public class MainModel extends BaseModel implements MainContract.MainModel {

    @Inject
    public MainModel() {
    }
}
