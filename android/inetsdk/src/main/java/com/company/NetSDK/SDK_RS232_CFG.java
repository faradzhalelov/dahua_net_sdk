package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * 232 Serial port configuration
 * \else
 * 232串口配置
 * \endif
 */
public class SDK_RS232_CFG implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Serial port Property
	 * \else
	 * 串口属性
	 * \endif
	 */
	public SDK_COMM_PROP        struComm = new SDK_COMM_PROP();
	
	/**
	 * \if ENGLISH_LANG
	 * Serial port functions,Correspond"{@link SDKDEV_COMM_CFG}""s232FuncName"(Function name list)
	 * \else
	 * 串口功能，对应"{@link SDKDEV_COMM_CFG}"中"s232FuncName"(功能名列表)的下标
	 * \endif
	 */
	public byte                byFunction;
}
