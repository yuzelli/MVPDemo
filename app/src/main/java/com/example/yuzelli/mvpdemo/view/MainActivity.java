package com.example.yuzelli.mvpdemo.view;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.yuzelli.mvpdemo.Icontract.MainContract;
import com.example.yuzelli.mvpdemo.Presenter.MainPresenter;
import com.example.yuzelli.mvpdemo.R;
import com.example.yuzelli.mvpdemo.base.IViewActivity;
import com.example.yuzelli.mvpdemo.bean.MyBean;

public class MainActivity extends IViewActivity<MainContract.Presenter> implements MainContract.View {

    @Override
    protected int layoutInit() {
        return R.layout.activity_main;
    }

    @Override
    protected MainContract.Presenter onLoadPresenter() {
        return new MainPresenter();
    }

    @Override
    protected void initEventAndData() {
           //  this equals onCreate()
    }


    @Override
    public void updataView(MyBean bean) {
        //加载视图

    }
    MyBean mb = mPresenter.getMyBean();
}
