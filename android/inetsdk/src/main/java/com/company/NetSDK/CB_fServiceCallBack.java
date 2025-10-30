package com.company.NetSDK;

/**
 * \if ENGLISH_LANG
 * Listening server callback function original shape
 * \else
 * 监听回调
 * \endif
 */
public interface CB_fServiceCallBack {
	/**
	 * \if ENGLISH_LANG
	 * Listening server callback function original shape
	 * @param lHandle recall info servier handle , return from {@link INetSDK#ListenServer}
	 * @param pIp upload info device Ip 
	 * @param wPort upload info device Port 
	 * @param lCommand alarm type，as {@link EM_DEV_INFO}
	 * @param pParam alarm info buffering area
	 * \else
	 * 侦听服务器回调函数
	 * @param lHandle 服务句柄 ,{@link INetSDK#ListenServer}返回值
	 * @param pIp 连接到服务的设备端ip 
	 * @param wPort 连接到服务的设备端port 
	 * @param lCommand 设备请求命令, 详见  {@link EM_DEV_INFO}
	 * @param pParam 设备请求命令的参数：设备序列号 
	 * \endif
	 */
	public int invoke(long lHandle, String pIp, short wPort, int lCommand, Object pParam);
}
