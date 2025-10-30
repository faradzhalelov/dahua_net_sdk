package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * input parameter, the corresponding interface {@link INetSDK#QueryDevInfo},the corresponding command {@link FinalVar#NET_QUERY_DEV_STORAGE_INFOS}
 * \else
 * 输入参数, 对应接口{@link INetSDK#QueryDevInfo},对应命令 {@link FinalVar#NET_QUERY_DEV_STORAGE_INFOS}
 * \endif
 */

public class NET_IN_STORAGE_DEV_INFOS implements Serializable{
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * \if ENGLISH_LANG
	 * volume type to get, refer to {@link NET_VOLUME_TYPE}
	 * \else
	 * 要获取的卷类型,取值参考 {@link NET_VOLUME_TYPE}
	 * \endif
	 */
     public int         emVolumeType;       
}
