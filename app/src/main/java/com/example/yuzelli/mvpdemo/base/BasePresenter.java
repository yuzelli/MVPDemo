package com.example.yuzelli.mvpdemo.base;


import com.example.yuzelli.mvpdemo.Interface.IModel;
import com.example.yuzelli.mvpdemo.Interface.IPresenter;
import com.example.yuzelli.mvpdemo.Interface.IView;

/**
 * Created by xiaos on 2017/7/24.
 */

public abstract class BasePresenter<T extends IView,M extends IModel> implements IPresenter<T> {

    protected static final String TAG = "BasePresenter";
    protected T mView;
    protected M mModel;

    @Override
    public void attachView(T view) {
        mView = view;
    }

    @Override
    public void detachView() {
        mView = null;
    }

    public boolean isViewAttached() {
        return mView != null;
    }

    public T getView() {
        return mView;
    }

    public M getModel() {
        return mModel;
    }

}
