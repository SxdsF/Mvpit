package com.sxdsf.mvpit.inserter;

/**
 * �˽ӿڵ������ǵ�ִ�е�ĳһ�����ܽ���һЩͳ�ƵĹ�����������Ҫ����һЩ������ִ��
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
