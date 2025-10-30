package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Get successful code item number, the corresponding interface {@link INetSDK#QueryDevState},the corresponding command {@link FinalVar#SDK_DEVSTATE_GET_CODEID_COUNT}
 * \else
 * 获取对码成功的总条数, 对应接口 {@link INetSDK#QueryDevState},对应命令{@link FinalVar#SDK_DEVSTATE_GET_CODEID_COUNT}
 * \endif
 */
public class NET_GET_CODEID_COUNT implements Serializable {
	private static final long serialVersionUID = 1L;
	
	/**
	 * \if ENGLISH_LANG
	 * Code successful total items
	 * \else
	 * 对码成功的总条数
	 * \endif
	 */
	public int nCodeIDCount;      
}
