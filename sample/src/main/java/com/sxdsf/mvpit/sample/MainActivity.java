package com.sxdsf.mvpit.sample;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.sxdsf.mvpit.annotation.BindLayout;
import com.sxdsf.mvpit.annotation.BindPresenterModule;
import com.sxdsf.mvpit.sample.multipresenter.activity.MultiPresenterActivity;
import com.sxdsf.mvpit.sample.multipresenter.fragment.MultiFragmentActivity;
import com.sxdsf.mvpit.sample.onepresenter.activity.OnePresenterActivity;
import com.sxdsf.mvpit.sample.onepresenter.fragment.OneFragmentActivity;

import butterknife.ButterKnife;
import butterknife.OnClick;

//绑定本activity的布局
@BindLayout(R.layout.activity_main)
//绑定本activity的presenter
@BindPresenterModule(MainActivityPresenter.class)
public class MainActivity extends BaseActivity<MainActivityPresenter> {

    @Override
    public void initData() {
        //在这里做数据初始化，比如接收上一个界面的传值
    }

    @Override
    public void initComponents(Bundle saveInstanceState) {
        //这里做控件初始化，要先使用super
        super.initComponents(saveInstanceState);
        ButterKnife.bind(this);
    }

    @OnClick({R.id.one_presenter_activity, R.id.multi_presenter_activity, R.id.one_presenter_fragment, R.id.multi_presenter_fragment})
    void jump(View view) {
        int id = view.getId();
        Intent intent = new Intent();
        switch (id) {
            case R.id.one_presenter_activity:
                intent.setClass(this, OnePresenterActivity.class);
                this.startActivity(intent);
                break;
            case R.id.multi_presenter_activity:
                intent.setClass(this, MultiPresenterActivity.class);
                this.startActivity(intent);
                break;
            case R.id.one_presenter_fragment:
                intent.setClass(this, OneFragmentActivity.class);
                this.startActivity(intent);
                break;
            case R.id.multi_presenter_fragment:
                intent.setClass(this, MultiFragmentActivity.class);
                this.startActivity(intent);
                break;
            default:
                break;
        }
    }

    @Override
    protected void onDestroy() {
        this.presenterModule.close();
        super.onDestroy();
    }
}
