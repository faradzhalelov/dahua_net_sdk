package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Device Discovery subclassID type
 * \else
 * 搜索设备接口子类型
 * \endif
 */
public class EM_NET_DEVICE_DISCOVERY_SUBCLASSID_TYPE implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * \if ENGLISH_LANG
	 * unknown
	 * \else
	 * 未知
	 * \endif
	 */
	public static final int EM_NET_DEVICE_DISCOVERY_SUBCLASSID_TYPE_UNKNOWN = -1;					 
	
	/**
	 * \if ENGLISH_LANG
	 * private
	 * \else
	 * 私有标准规范
	 * \endif
	 */
	public static final int EM_NET_DEVICE_DISCOVERY_SUBCLASSID_TYPE_NONE = 0;						 
	
	/**
	 * \if ENGLISH_LANG
	 * Onvif
	 * \else
	 * Onvif标准规范
	 * \endif
	 */
	public static final int EM_NET_DEVICE_DISCOVERY_SUBCLASSID_TYPE_ONVIF = 1;                         
	
	/**
	 * \if ENGLISH_LANG
	 * UPnP
	 * \else
	 * UPnP标准规范
	 * \endif
	 */
	public static final int EM_NET_DEVICE_DISCOVERY_SUBCLASSID_TYPE_UPNP = 2;                           
}
