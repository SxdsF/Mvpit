package com.sxdsf.mvpit.cpntasview;

/**
 * Activity组件作为View的默认实现
 */

import android.app.Activity;
import android.os.Bundle;

import com.sxdsf.mvpit.ActivityInserter;
import com.sxdsf.mvpit.MVPView;

public abstract class ComponentViewBaseActivity<T extends NonComponentMVPPresenter<? extends MVPView>, I extends ActivityInserter>
		extends Activity {

	protected T presenterLayer;
	protected I inserter;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		Class<I> iCls = this.getInserterClass();
		if (iCls != null) {
			try {
				this.inserter = iCls.newInstance();
			} catch (InstantiationException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IllegalAccessException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		Class<T> vCls = this.getPresenterClass();
		if (vCls != null) {
			try {
				this.presenterLayer = vCls.newInstance();
			} catch (InstantiationException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IllegalAccessException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IllegalArgumentException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		if (this.inserter != null) {
			this.inserter.onCreate();
		}
	}

	@Override
	protected void onStart() {
		// TODO Auto-generated method stub
		super.onStart();
		if (this.inserter != null) {
			this.inserter.onStart();
		}
	}

	@Override
	protected void onDestroy() {
		// TODO Auto-generated method stub
		super.onDestroy();
		if (this.inserter != null) {
			this.inserter.onDestroy();
		}
	}

	@Override
	protected void onPause() {
		// TODO Auto-generated method stub
		super.onPause();
		if (this.inserter != null) {
			this.inserter.onPause();
		}
	}

	@Override
	protected void onResume() {
		// TODO Auto-generated method stub
		super.onResume();
		if (this.inserter != null) {
			this.inserter.onResume();
		}
	}

	@Override
	protected void onStop() {
		// TODO Auto-generated method stub
		super.onStop();
		if (this.inserter != null) {
			this.inserter.onStop();
		}
	}

	protected abstract Class<T> getPresenterClass();

	protected abstract Class<I> getInserterClass();
}
