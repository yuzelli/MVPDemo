package com.example.yuzelli.mvpdemo.Interface;


/**
 * Created by xiaos on 2017/7/24.
 */

public interface IPresenter <T extends IView> {

    void attachView(T view);
    void start();
    void detachView();
}