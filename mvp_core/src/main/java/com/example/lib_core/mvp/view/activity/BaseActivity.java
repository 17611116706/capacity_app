package com.example.lib_core.mvp.view.activity;

import android.os.Bundle;

import androidx.fragment.app.FragmentActivity;

import com.example.lib_core.mvp.presenter.IPresenter;
import com.example.lib_core.mvp.view.view.IView;
import com.example.lib_core.widget.LoadDialog;

import javax.inject.Inject;

public abstract class BaseActivity<P extends IPresenter> extends FragmentActivity implements IView,IActivity {

    @Inject
    protected  P p;
    private LoadDialog loadDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(bondLayout());
        loadDialog = new LoadDialog(this);
        initView();
        initInjec();
        initData();
    }

    @Override
    public void showDialog() {
        loadDialog.show();
    }

    @Override
    public void hideDialog() {
        loadDialog.dismiss();
    }

    @Override
    public void showMsg(String msg) {

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
//        EventBus.getDefault().unregister(this);
    }
}
