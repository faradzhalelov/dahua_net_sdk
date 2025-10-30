package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Storage device name
 * \else
 * 存储设备名称
 * \endif
 */
public class SDK_STORAGE_DEVICE_NAME implements Serializable{
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * \if ENGLISH_LANG
	 * Name
	 * \else
	 * 名称
	 * \endif
	 */
    public byte[]                szName = new byte[FinalVar.SDK_STORAGE_NAME_LEN];
}
