package com.example.schoolapp.di.modules;

import com.example.schoolapp.mvp.contract.LifeContract;
import com.example.schoolapp.mvp.model.LifeModel;

import dagger.Module;
import dagger.Provides;

@Module
public class LifeModules {

    private LifeContract.LifeView lifeView;

    public LifeModules(LifeContract.LifeView lifeView) {
        this.lifeView = lifeView;
    }
    
    @Provides
    public LifeContract.LifeView provideLifeView(){
        return lifeView;
    }
    
    @Provides
    public LifeContract.LifeModel provideLifeModel(LifeModel lifeModel){
        return lifeModel;
    }
    
}
