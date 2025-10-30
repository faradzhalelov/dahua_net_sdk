package com.company.NetSDK;

import java.io.Serializable;

public class NET_OUT_GET_DEVICE_INFO_ALL implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	 /**
	 * \if ENGLISH_LANG
	 * max count of device info 
	 * \else
	 * 设备信息的最大个数, 指明pstuInfo内存空间
	 * \endif
	 */
	public int                         nDevMax;        
	
	 /**
	 * \if ENGLISH_LANG
	 * return device info count
	 * \else
	 * 实际返回的设备信息的个数
	 * \endif
	 */
	public int                         nDevNum;        
	
	 /**
	 * \if ENGLISH_LANG
	 * device info
	 * \else
	 * 设备信息指针，该结构体内部成员 dwSize 需用户赋值
	 * \endif
	 */
	public SDK_REMOTE_DEVICE            pstuInfo[];    
	
	public NET_OUT_GET_DEVICE_INFO_ALL(int nDevMax) {
		this.nDevMax = nDevMax;
		pstuInfo = new SDK_REMOTE_DEVICE[this.nDevMax];
		for (int i = 0; i < this.nDevMax; i++) {
			pstuInfo[i] = new SDK_REMOTE_DEVICE();
		}
	}
}
