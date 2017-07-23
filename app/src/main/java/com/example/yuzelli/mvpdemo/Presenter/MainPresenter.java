package com.example.yuzelli.mvpdemo.Presenter;

import android.app.Activity;

import com.example.yuzelli.mvpdemo.Icontract.MainContract;
import com.example.yuzelli.mvpdemo.base.BasePresenter;
import com.example.yuzelli.mvpdemo.bean.MyBean;
import com.example.yuzelli.mvpdemo.model.MainModel;

import org.json.JSONObject;

/**
 * Created by 51644 on 2017/7/28.
 */

public class MainPresenter extends BasePresenter<MainContract.View,MainContract.Model> implements MainContract.Presenter {
    private MyBean myBean;
    @Override
    public void start() {
        mModel = new MainModel();
    }

    @Override
    public MyBean getMyBean() {
        return myBean;
    }

    @Override
    public void getMyBeanData(Activity activity, String p1, String p2) {
           //加载网络数据
        //....
        myBean = mModel.creartMyBean(new JSONObject());
        mView.updataView(myBean);
    }


}
