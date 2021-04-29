package com.example.schoolapp.di.modules;

import com.example.schoolapp.mvp.contract.MineContract;
import com.example.schoolapp.mvp.model.MineModel;

import dagger.Module;
import dagger.Provides;

@Module
public class MineModules {

    private MineContract.MineView mineView;

    public MineModules(MineContract.MineView mineView) {
        this.mineView = mineView;
    }
    
    @Provides
    public MineContract.MineView provideMineView(){
        return mineView;
    }
    
    @Provides
    public MineContract.MineModel provideMineModel(MineModel mineModel){
        return mineModel;
    }
    
}
