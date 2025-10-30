package com.company.NetSDK;

import java.io.Serializable;

public class SDK_CONFIG_CONTROLER implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Com attribution
	 * \else
	 * 串口属性
	 * \endif
	 */
	public SDK_COMM_PROP        struComm = new SDK_COMM_PROP(); 
	
	/**
	 * \if ENGLISH_LANG
	 * Controlled light group,light number start from 1,such as[1,3,8,0?-0]present control light number 1,3,8 light
	 * \else
	 * 受控灯数组（灯序号从1开始计数，比如[1,3,8,0…0]表示控制序号为1,3,8的灯
	 * \endif
	 */
	public byte                bLightGroup[] = new byte[FinalVar.SDK_MAX_LIGHT_NUM];
	
	/**
	 * \if ENGLISH_LANG
	 * Controller address
	 * \else
	 * 控制器地址
	 * \endif
	 */
	public byte                bDeviceAddr; 
	
	/**
	 * \if ENGLISH_LANG
	 * Com Type 0:485 COM, 1:232 COM
	 * \else
	 * 串口类型 0:485串口, 1:232串口
	 * \endif
	 */
	public byte                bComPortType; 
}
