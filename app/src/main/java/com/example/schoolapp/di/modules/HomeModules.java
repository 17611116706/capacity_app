package com.example.schoolapp.di.modules;

import com.example.schoolapp.mvp.contract.HomeContract;
import com.example.schoolapp.mvp.contract.HomeContract;
import com.example.schoolapp.mvp.model.HomeModel;

import dagger.Module;
import dagger.Provides;

@Module
public class HomeModules {

    private HomeContract.HomeView homeView;

    public HomeModules(HomeContract.HomeView homeView) {
        this.homeView = homeView;
    }
    
    @Provides
    public HomeContract.HomeView provideHomeView(){
        return homeView;
    }
    
    @Provides
    public HomeContract.HomeModel provideHomeModel(HomeModel homeModel){
        return homeModel;
    }
    
}
