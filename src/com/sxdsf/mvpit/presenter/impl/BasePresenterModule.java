package com.sxdsf.mvpit.presenter.impl;

import com.sxdsf.mvpit.MvpMode;
import com.sxdsf.mvpit.presenter.PresenterModule;
import com.sxdsf.mvpit.view.ViewModule;

public abstract class BasePresenterModule<T extends ViewModule> implements
		PresenterModule<T> {

	protected T view;

	@Override
	public MvpMode getMvpMode() {
		// TODO Auto-generated method stub
		return MvpMode.AndroidComponentAsView;
	}

	@Override
	public void setViewModule(T view) {
		// TODO Auto-generated method stub
		this.view = view;
	}

}
