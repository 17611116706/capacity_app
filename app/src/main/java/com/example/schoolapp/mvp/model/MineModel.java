package com.example.schoolapp.mvp.model;

import com.example.lib_core.mvp.model.BaseModel;
import com.example.schoolapp.mvp.contract.MineContract;

import javax.inject.Inject;

public class MineModel extends BaseModel implements MineContract.MineModel {
    @Inject
    public MineModel() {
    }
}
