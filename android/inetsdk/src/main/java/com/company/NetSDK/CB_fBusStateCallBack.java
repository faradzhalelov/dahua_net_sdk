package com.company.NetSDK;

/**
 * \if ENGLISH_LANG
 * order Bus status call function model
 * \else
 * 订阅Bus状态回调函数原型
 * \endif
 */
public interface CB_fBusStateCallBack {
	
	/**
	 * \if ENGLISH_LANG
	 * Callback prototype of order Bus status
	 * @param lAttachHandle return from{@link INetSDK#AttachBusState}
	 * @param lCommand Command.
	 * @param pBuf Data information
	 * \else
	 * 订阅Bus状态回调函数
	 * @param lAttachHandle {@link INetSDK#AttachBusState}返回值
	 * @param lCommand  命令
	 * @param pBuf 数据信息
	 * \endif
	 */
	public void invoke(long lAttachHandle, long lCommand, Object pBuf);
}
