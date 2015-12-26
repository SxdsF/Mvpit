package com.sxdsf.mvpit.sample.multipresenter.fragment;


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.sxdsf.mvpit.annotation.BindLayout;
import com.sxdsf.mvpit.sample.BaseFragment;
import com.sxdsf.mvpit.sample.R;

import butterknife.ButterKnife;

@BindLayout(R.layout.fragment_multi)
public class MultiFragment extends BaseFragment<MultiPresenter> implements CommonViewModule {

    private CommonPresenter commonPresenter;

    @Override
    public void initData(Bundle savedInstanceState) {
        this.commonPresenter = new CommonPresenter(this);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = super.onCreateView(inflater, container, savedInstanceState);
        ButterKnife.bind(this, view);
        return view;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        ButterKnife.unbind(this);
        this.commonPresenter.close();
    }

    @Override
    public void get() {

    }
}
