package com.example.schoolapp.mvp.model;

import com.example.lib_core.mvp.model.BaseModel;
import com.example.schoolapp.mvp.contract.LifeContract;
import com.example.schoolapp.mvp.contract.MainContract;

import javax.inject.Inject;

public class LifeModle extends BaseModel implements LifeContract.LifeModel {

        @Inject
    public LifeModle() {
    }
}
