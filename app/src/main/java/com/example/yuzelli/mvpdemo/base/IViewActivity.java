package com.example.yuzelli.mvpdemo.base;

import android.os.Bundle;

import com.example.yuzelli.mvpdemo.Interface.IPresenter;
import com.example.yuzelli.mvpdemo.Interface.IView;

/**
 * Created by xiaos on 2017/7/24.
 */

public abstract class IViewActivity<P extends IPresenter> extends BaseActiviy implements IView {

    protected P mPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mPresenter = onLoadPresenter();
        getPresenter().attachView(this);

        if(getPresenter() != null) {
            getPresenter().start();
        }
        initEventAndData();
    }

    public P getPresenter() {
        return mPresenter;
    }

    @Override
    protected void onDestroy() {
        if (getPresenter() != null) {
            getPresenter().detachView();
        }
        super.onDestroy();
    }

    protected abstract P onLoadPresenter();
   // protected abstract void initViews(Bundle savedInstanceState);
    protected abstract void initEventAndData();
}