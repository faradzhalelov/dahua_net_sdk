package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * MAC,IP filter configuration
 * \else
 * MAC,IP过滤配置结构体
 * \endif
 */
public class SDKDEV_MACIPFILTER_CFG implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * enable
	 * \else
	 * 使能
	 * \endif
	 */
	public int                    dwEnable;

	/**
	 * \if ENGLISH_LANG
	 * The current list type;0:Allow list 1:Blocklist(The device can enable only one type of list) can only user one kind of device
	 * \else
	 * 当前名单类型：0：允许名单 1：禁止名单（设备只能使一种名单生效，或者是允许名单或者是禁止名单）
	 * \endif
	 */
	public int                    dwType;

	/**
	 * \if ENGLISH_LANG
	 * block list MAC,IP count (MAC,IP one to one)
	 * \else
	 * 禁止名单MAC,IP个数(MAC,IP一一对应)
	 * \endif
	 */
	public int                    dwBannedMacIpNum;

	/**
	 * \if ENGLISH_LANG
	 * block list Mac,IP
	 * \else
	 * 禁止名单Mac,IP
	 * \endif
	 */
	public MACIP_INFO               stuBannedMacIp[] = new MACIP_INFO[FinalVar.SDK_MACIPFILTER_NUM];

	/**
	 * \if ENGLISH_LANG
	 * allow list MAC,IP count(MAC,IP one to one)
	 * \else
	 * 允许名单MAC,IP个数(MAC,IP一一对应)
	 * \endif
	 */
	public int                    dwTrustMacIpNum;

	/**
	 * \if ENGLISH_LANG
	 * allow list Mac,IP
	 * \else
	 * 允许名单Mac,IP
	 * \endif
	 */
	public MACIP_INFO               stuTrustMacIp[] = new MACIP_INFO[FinalVar.SDK_MACIPFILTER_NUM];
    
    public SDKDEV_MACIPFILTER_CFG() {
    	for (int i = 0; i < FinalVar.SDK_MACIPFILTER_NUM; i++) {
    		stuBannedMacIp[i] = new MACIP_INFO();
    		stuTrustMacIp[i] = new MACIP_INFO();
    	}
    }
}
