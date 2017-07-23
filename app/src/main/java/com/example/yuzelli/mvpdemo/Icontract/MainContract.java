package com.example.yuzelli.mvpdemo.Icontract;

import android.app.Activity;

import com.example.yuzelli.mvpdemo.Interface.IModel;
import com.example.yuzelli.mvpdemo.Interface.IPresenter;
import com.example.yuzelli.mvpdemo.Interface.IView;
import com.example.yuzelli.mvpdemo.bean.MyBean;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.Map;

/**
 * Created by 51644 on 2017/7/28.
 */

public interface MainContract {
    interface View extends IView {

        void updataView(MyBean bean);

    }

    interface Model extends IModel {



        MyBean creartMyBean(JSONObject jsonObject);


    }

    interface Presenter extends IPresenter<View> {
        MyBean getMyBean();



        void getMyBeanData(Activity activity, String p1, String p2);

    }
}
