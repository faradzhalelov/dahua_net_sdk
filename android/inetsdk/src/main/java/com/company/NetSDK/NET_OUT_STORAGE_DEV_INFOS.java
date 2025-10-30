package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * output parameter, the corresponding interface {@link INetSDK#QueryDevInfo},the corresponding command {@link FinalVar#NET_QUERY_DEV_STORAGE_INFOS}
 * \else
 * 输出参数, 对应接口{@link INetSDK#QueryDevInfo},对应命令 {@link FinalVar#NET_QUERY_DEV_STORAGE_INFOS}
 * \endif
 */

public class NET_OUT_STORAGE_DEV_INFOS implements Serializable{
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * \if ENGLISH_LANG
	 * device storage moduleinfo list to get
	 * \else
	 * 获取到设备的存储模块信息列表
	 * \endif
	 */
    public int                 nDevInfosNum;         
    
	/**
	 * \if ENGLISH_LANG
	 * device info list, SDK_STORAGE_DEVICE dwSsize need to assign value
	 * \else
	 * 设备信息列表, SDK_STORAGE_DEVICE 的dwSize需赋值
	 * \endif
	 */
    public SDK_STORAGE_DEVICE[]  stuStoregeDevInfos = new SDK_STORAGE_DEVICE[FinalVar.MAX_DEVICE_VOLUME_NUMS]; 
    
    public NET_OUT_STORAGE_DEV_INFOS() {
    	for(int i = 0; i < FinalVar.MAX_DEVICE_VOLUME_NUMS; i++) {
    		stuStoregeDevInfos[i] = new SDK_STORAGE_DEVICE();
    	}
    }
}
