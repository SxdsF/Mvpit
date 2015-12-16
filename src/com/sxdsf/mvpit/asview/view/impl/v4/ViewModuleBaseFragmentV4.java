package com.sxdsf.mvpit.asview.view.impl.v4;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.sxdsf.mvpit.MvpMode;
import com.sxdsf.mvpit.PresenterModule;
import com.sxdsf.mvpit.annotation.MvpitAnnotationProcessor;
import com.sxdsf.mvpit.asview.view.CpntAsViewBaseViewModule;

public abstract class ViewModuleBaseFragmentV4<T extends PresenterModule>
		extends Fragment implements CpntAsViewBaseViewModule<T> {

	protected T presenterModule;

	private static final String TAG = "ViewModuleBaseFragmentV4";

	@Override
	public void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		Class<T> cls = this.getPresenterModuleClass();
		if (cls != null) {
			try {
				this.presenterModule = cls.newInstance();
			} catch (java.lang.InstantiationException e) {
				// TODO Auto-generated catch block
				Log.e(TAG, e.getMessage());
			} catch (IllegalAccessException e) {
				// TODO Auto-generated catch block
				Log.e(TAG, e.getMessage());
			}

		}
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		this.initDatas();
		View view = this.initComponentsInFragment(inflater, container);
		return view;
	}

	@Override
	public final void initComponentsInActivity() {
		// TODO Auto-generated method stub
		// do nothing
	}

	@Override
	public View initComponentsInFragment(LayoutInflater inflater,
			ViewGroup container) {
		// TODO Auto-generated method stub
		int layoutId = MvpitAnnotationProcessor.autoBindLayout(this);
		View view = inflater.inflate(layoutId, container, false);
		return view;
	}

	@Override
	public MvpMode getMvpMode() {
		// TODO Auto-generated method stub
		return MvpMode.AndroidComponentAsView;
	}

}
