package com.example.yuzelli.mvpdemo.base;

import android.app.Activity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.Window;
import android.view.WindowManager;
import android.widget.TextView;


/**
 * @author Hoyn
 * @version 1.0
 * @Title：SAFEYE@
 * @Description：
 */
public abstract class BaseActiviy extends Activity {

    private TextView tv_title;


    /**
     * activity控制
     */
    //public static Map<String, WeakReference<Activity>> openedActivitys = new LinkedHashMap<String, WeakReference<Activity>>();// 已经打开的activity

    protected Bundle savedInstanceState;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // 隐藏软键盘
        getWindow().setSoftInputMode(
                WindowManager.LayoutParams.SOFT_INPUT_STATE_HIDDEN);
        // 隐藏actionBar
        requestWindowFeature(Window.FEATURE_NO_TITLE);

        this.savedInstanceState = savedInstanceState;

        setContentView(layoutInit());
        init(savedInstanceState);


    }

    protected abstract int layoutInit();

    /**
     * 处理返回键
     *
     * @param item
     * @return
     */
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                onBackPressed();
                return true;
        }

        return super.onOptionsItemSelected(item);
    }

    /**
     * TODO:需要考虑savedInstanceState 设置布局文件
     *
     * @author Hoyn
     *
     */
    protected void init(Bundle savedInstanceState) {

    }



    public Bundle getSavedInstanceState() {
        return savedInstanceState;
    }

}
