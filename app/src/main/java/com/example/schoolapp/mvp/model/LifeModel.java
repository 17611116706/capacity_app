package com.example.schoolapp.mvp.model;

import com.example.lib_core.mvp.model.BaseModel;
import com.example.schoolapp.mvp.contract.LifeContract;
import com.example.schoolapp.mvp.contract.MainContract;

import javax.inject.Inject;

public class LifeModel extends BaseModel implements LifeContract.LifeModel {

        @Inject
    public LifeModel() {
    }
}
