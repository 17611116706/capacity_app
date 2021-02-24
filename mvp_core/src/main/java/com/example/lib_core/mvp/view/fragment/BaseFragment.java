package com.example.lib_core.mvp.view.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.IdRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.lib_core.mvp.presenter.IPresenter;
import com.example.lib_core.mvp.view.view.IView;
import com.example.lib_core.widget.LoadDialog;

import javax.inject.Inject;

public  abstract  class BaseFragment<P extends IPresenter> extends Fragment implements IFragment, IView {



    private View baseView;
    @Inject
    protected P p;
    private LoadDialog loadDialog;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return baseView = inflater.inflate(bondLayouy(),container,false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        loadDialog = new LoadDialog(getContext());
        initView();
        initInjec();
        initData();
    }

    public <T extends View> T findViewById(@IdRes int id) {
        return baseView.findViewById(id);
    }

    @Override
    public void showDialog() {
//        loadDialog = new LoadDialog(getContext());
        loadDialog.show();
    }

    @Override
    public void hideDialog() {
//        loadDialog = new LoadDialog(getContext());
        loadDialog.dismiss();
    }

    @Override
    public void showMsg(String msg) {

    }
}
