package com.example.schoolapp.mvp.model;

import com.example.lib_core.mvp.model.BaseModel;
import com.example.schoolapp.constants.Constants;
import com.example.schoolapp.mvp.contract.MineContract;
import com.example.schoolapp.mvp.model.minebean.LogoutEntity;
import com.example.schoolapp.network.NetWorkApi;
import com.example.schoolapp.network.NetWorkHeaderManager;
import com.example.schoolapp.network.NetWorkManager;
import com.example.schoolapp.utils.SpUtils;

import java.util.HashMap;

import javax.inject.Inject;

import io.reactivex.Observable;

public class MineModel extends BaseModel implements MineContract.MineModel {
    @Inject
    public MineModel() {
    }

    @Override
    public Observable<LogoutEntity> getLogout(String methodName) {
        String token = SpUtils.getInstance().getString(Constants.User_token, "");
        String mobile = SpUtils.getInstance().getString(Constants.User_phone, "");
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("phone",mobile);
        hashMap.put("token",token);
        return NetWorkManager.getInstance().retrofit().create(MineServices.class).getLogout(methodName,hashMap);
    }
}
