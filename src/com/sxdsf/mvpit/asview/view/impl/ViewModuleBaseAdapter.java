package com.sxdsf.mvpit.asview.view.impl;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import com.sxdsf.mvpit.MvpMode;
import com.sxdsf.mvpit.PresenterModule;
import com.sxdsf.mvpit.asview.view.CpntAsViewBaseViewModule;

public abstract class ViewModuleBaseAdapter<T extends PresenterModule> extends
		BaseAdapter implements CpntAsViewBaseViewModule<T> {

	protected T presenterModule;

	private static final String TAG = "ViewModuleBaseAdapter";

	public ViewModuleBaseAdapter() {
		super();
		// TODO Auto-generated constructor stub
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
	}

	@Override
	public MvpMode getMvpMode() {
		// TODO Auto-generated method stub
		return MvpMode.AndroidComponentAsView;
	}

	@Override
	public final void initDatas() {
		// TODO Auto-generated method stub

	}

	@Override
	public final void initComponentsInActivity() {
		// TODO Auto-generated method stub

	}

	@Override
	public final View initComponentsInFragment(LayoutInflater inflater,
			ViewGroup container) {
		// TODO Auto-generated method stub
		return null;
	}

}
