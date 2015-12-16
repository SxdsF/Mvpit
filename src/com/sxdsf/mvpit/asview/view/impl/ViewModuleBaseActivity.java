package com.sxdsf.mvpit.asview.view.impl;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.sxdsf.mvpit.MvpMode;
import com.sxdsf.mvpit.PresenterModule;
import com.sxdsf.mvpit.annotation.MvpitAnnotationProcessor;
import com.sxdsf.mvpit.asview.view.CpntAsViewBaseViewModule;

public abstract class ViewModuleBaseActivity<T extends PresenterModule> extends
		Activity implements CpntAsViewBaseViewModule<T> {

	protected T presenterModule;

	private static final String TAG = "ViewModuleBaseActivity";

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		Class<T> cls = this.getPresenterModuleClass();
		if (cls != null) {
			try {
				this.presenterModule = cls.newInstance();
			} catch (InstantiationException e) {
				// TODO Auto-generated catch block
				Log.e(TAG, e.getMessage());
			} catch (IllegalAccessException e) {
				// TODO Auto-generated catch block
				Log.e(TAG, e.getMessage());
			}
		}
		this.initDatas();
		this.initComponentsInActivity();
	}

	@Override
	public void initComponentsInActivity() {
		// TODO Auto-generated method stub
		MvpitAnnotationProcessor.autoBindLayout(this);
	}

	@Override
	public final View initComponentsInFragment(LayoutInflater inflater,
			ViewGroup container) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public MvpMode getMvpMode() {
		// TODO Auto-generated method stub
		return MvpMode.AndroidComponentAsView;
	}

}
