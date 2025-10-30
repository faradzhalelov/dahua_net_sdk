package com.company.NetSDK;

/**
 * \if ENGLISH_LANG
 * Asynchronous data callback
 * \else
 * 异步数据回调
 * \endif
 */ 
public interface CB_fMessDataCallBack {
	/**
	 * \if ENGLISH_LANG
	 * Asynchronous data callback
	 * @param lCommand command type
	 * @param lpData asynchronous recall function
	 * \else
	 * 异步数据回调函数
	 * @param lCommand 回调类型
	 * @param lpData 设备信息
	 * \endif
	 */
	public void invoke(long lCommand , NET_CALLBACK_DATA lpData);
}
