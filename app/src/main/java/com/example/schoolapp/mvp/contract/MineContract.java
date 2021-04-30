package com.example.schoolapp.mvp.contract;

import com.example.lib_core.mvp.model.IModel;
import com.example.lib_core.mvp.view.view.IView;
import com.example.schoolapp.mvp.model.minebean.LogoutEntity;

import io.reactivex.Observable;

public interface MineContract {
    interface MineView extends IView {
        void getLogout(LogoutEntity logoutEntity);
    }

    interface MineModel extends IModel {

        Observable<LogoutEntity> getLogout(String method);

    }
}
