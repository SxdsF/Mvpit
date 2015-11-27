package com.sxdsf.mvpit.presenter;

import com.sxdsf.mvpit.MvpMode;
import com.sxdsf.mvpit.view.ViewModule;

public interface PresenterModule<T extends ViewModule> {
	public MvpMode getMvpMode();

	public void setViewModule(T view);
}
