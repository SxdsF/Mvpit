package com.sxdsf.mvpit.cpntaspresenter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.sxdsf.mvpit.MVPPresenter;
import com.sxdsf.mvpit.MVPView;

public abstract class NonComponentMVPView<T extends MVPPresenter> implements
		MVPView {

	protected T presenterLayer;

	public NonComponentMVPView() {
	}

	public abstract void setPresenter(T presenter);

	public abstract void init(LayoutInflater inflater, ViewGroup container);

	public abstract View getView();
}
