package com.sxdsf.mvpit.inserter;

/**
 * 此接口的作用是当执行到某一步可能进行一些统计的工作，所以需要插入一些方法来执行
 * 
 * @author sunbowen
 * 
 */
public interface Inserter {

	public void onCreate();

	public void onStart();

	public void onResume();

	public void onPause();

	public void onStop();

	public void onDestroy();
}
