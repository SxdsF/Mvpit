package com.sxdsf.mvpit.sample.onepresenter.fragment;


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.sxdsf.mvpit.annotation.BindLayout;
import com.sxdsf.mvpit.annotation.BindPresenterModule;
import com.sxdsf.mvpit.sample.BaseFragment;
import com.sxdsf.mvpit.sample.R;

import butterknife.ButterKnife;

@BindLayout(R.layout.fragment_one)
@BindPresenterModule(OnePresenter.class)
public class OneFragment extends BaseFragment<OnePresenter> {

    @Override
    public void initData() {

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
    }
}
