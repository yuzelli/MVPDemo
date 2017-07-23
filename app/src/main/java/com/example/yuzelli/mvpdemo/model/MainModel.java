package com.example.yuzelli.mvpdemo.model;

import com.example.yuzelli.mvpdemo.Icontract.MainContract;
import com.example.yuzelli.mvpdemo.Presenter.MainPresenter;
import com.example.yuzelli.mvpdemo.bean.MyBean;

import org.json.JSONObject;

/**
 * Created by 51644 on 2017/7/28.
 */

public class MainModel implements MainContract.Model {
    @Override
    public MyBean creartMyBean(JSONObject jsonObject) {
        MyBean bean = new MyBean();
//        解析数据

        return bean;
    }
}
