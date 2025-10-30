package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * {@link INetSDK#StartDeviceDiscovery} The Input Parameters of the Interface 
 * \else
 * {@link INetSDK#StartDeviceDiscovery} 接口的输入参数
 * \endif
 */
public class NET_IN_START_DEVICE_DISCOVERY implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * \if ENGLISH_LANG
	 * subclassID type, refer to  {@link EM_NET_DEVICE_DISCOVERY_SUBCLASSID_TYPE}
	 * \else
	 * 接口子类型, 取值参考 {@link EM_NET_DEVICE_DISCOVERY_SUBCLASSID_TYPE}
	 * \endif
	 */
	public int 		emSubClassID;			
    
	/**
	 * \if ENGLISH_LANG
	 * timeout, unit:s
	 * \else
	 * 搜索超时,搜索结果上报时间,超过此时间后,不再上报设备信息. 单位秒
	 * \endif
	 */
	public int												nTimeOut;				
}
