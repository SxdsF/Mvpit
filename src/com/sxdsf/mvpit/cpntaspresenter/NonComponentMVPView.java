package com.sxdsf.mvpit.cpntaspresenter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.sxdsf.mvpit.presenter.Presenter;
import com.sxdsf.mvpit.view.View;

public abstract class NonComponentMVPView<T extends Presenter> implements
		View {

	protected T presenterLayer;

	public NonComponentMVPView() {
	}

	public abstract void setPresenter(T presenter);

	public abstract void init(LayoutInflater inflater, ViewGroup container);

	public abstract View getView();
}
