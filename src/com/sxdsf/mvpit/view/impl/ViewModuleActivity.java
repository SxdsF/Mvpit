package com.sxdsf.mvpit.view.impl;

import com.sxdsf.mvpit.MvpMode;
import com.sxdsf.mvpit.presenter.PresenterModule;
import com.sxdsf.mvpit.view.ViewModule;
import android.app.Activity;
import android.os.Bundle;
import android.util.Log;

public abstract class ViewModuleActivity<T extends PresenterModule<? extends ViewModule>>
		extends Activity implements ViewModule {

	protected T presenter;

	private static final String TAG = "ViewModuleActivity";

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		Class<T> cls = this.getPresenterClass();
		if (cls != null) {
			try {
				this.presenter = cls.newInstance();
			} catch (InstantiationException e) {
				// TODO Auto-generated catch block
				Log.e(TAG, e.getMessage());
			} catch (IllegalAccessException e) {
				// TODO Auto-generated catch block
				Log.e(TAG, e.getMessage());
			}
		}
//		if (this.presenter != null) {
//			this.presenter.setViewModule(this);
//		}
	}

	@Override
	public MvpMode getMvpMode() {
		// TODO Auto-generated method stub
		return MvpMode.AndroidComponentAsView;
	}

	protected abstract Class<T> getPresenterClass();

}
