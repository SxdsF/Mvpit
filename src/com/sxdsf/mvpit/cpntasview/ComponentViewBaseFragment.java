package com.sxdsf.mvpit.cpntasview;

import android.app.Fragment;
import android.os.Bundle;

import com.sxdsf.mvpit.FragmentInserter;
import com.sxdsf.mvpit.cpntaspresenter.NonComponentMVPView;
import com.sxdsf.mvpit.presenter.Presenter;

public abstract class ComponentViewBaseFragment<T extends NonComponentMVPView<? extends Presenter>, I extends FragmentInserter>
		extends Fragment {

	protected T presenterLayer;
	protected I inserter;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		Class<I> iCls = this.getInserterClass();
		if (iCls != null) {
			try {
				this.inserter = iCls.newInstance();
			} catch (IllegalAccessException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (java.lang.InstantiationException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		Class<T> vCls = this.getPresenterClass();
		if (vCls != null) {
			try {
				this.presenterLayer = vCls.newInstance();
			} catch (IllegalAccessException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IllegalArgumentException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (java.lang.InstantiationException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		if (this.inserter != null) {
			this.inserter.onCreate();
		}
	}

	@Override
	public void onStart() {
		// TODO Auto-generated method stub
		super.onStart();
		if (this.inserter != null) {
			this.inserter.onStart();
		}
	}

	@Override
	public void onDestroy() {
		// TODO Auto-generated method stub
		super.onDestroy();
		if (this.inserter != null) {
			this.inserter.onDestroy();
		}
	}

	@Override
	public void onPause() {
		// TODO Auto-generated method stub
		super.onPause();
		if (this.inserter != null) {
			this.inserter.onPause();
		}
	}

	@Override
	public void onResume() {
		// TODO Auto-generated method stub
		super.onResume();
		if (this.inserter != null) {
			this.inserter.onResume();
		}
	}

	@Override
	public void onStop() {
		// TODO Auto-generated method stub
		super.onStop();
		if (this.inserter != null) {
			this.inserter.onStop();
		}
	}

	protected abstract Class<T> getPresenterClass();

	protected abstract Class<I> getInserterClass();
}
