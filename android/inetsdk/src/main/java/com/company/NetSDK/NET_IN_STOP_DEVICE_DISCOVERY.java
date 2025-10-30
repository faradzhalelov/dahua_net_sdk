package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * {@link INetSDK#StopDeviceDiscovery} The Input Parameters of the Interface 
 * \else
 * {@link INetSDK#StopDeviceDiscovery} 接口的输入参数
 * \endif
 */
public class NET_IN_STOP_DEVICE_DISCOVERY implements Serializable {
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
	public int 						emSubClassID;
}
