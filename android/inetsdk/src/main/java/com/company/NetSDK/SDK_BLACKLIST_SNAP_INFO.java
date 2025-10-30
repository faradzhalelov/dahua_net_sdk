package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * block list snap info, the corresponding interface {@link INetSDK#StartListenEx},the corresponding command {@link FinalVar#SDK_BLACKLIST_SNAP}
 * \else
 * 禁止名单车辆抓拍事件, 对应接口 {@link INetSDK#StartListenEx},对应命令 {@link FinalVar#SDK_BLACKLIST_SNAP}
 * \endif
 */
public class SDK_BLACKLIST_SNAP_INFO implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

 	/**
	 * \if ENGLISH_LANG
	 * number of plate
	 * \else
	 * 车牌号
	 * \endif
	 */
	public byte      szPlateNumber[] = new byte[32];
	
 	/**
	 * \if ENGLISH_LANG
	 * time
	 * \else
	 * 事件发生时间
	 * \endif
	 */
	public NET_TIME  stuTime = new NET_TIME();
}
