package com.sxdsf.mvpit.test;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.sxdsf.mvpit.cpntaspresenter.NonComponentMVPView;

public class MainActivityView extends
		NonComponentMVPView<MainActivityPresenter> {

	@Override
	public void init(LayoutInflater inflater, ViewGroup container) {
		// TODO Auto-generated method stub
	}

	@Override
	public View getView() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setPresenter(MainActivityPresenter presenter) {
		// TODO Auto-generated method stub
		this.presenterLayer = presenter;
	}
}
