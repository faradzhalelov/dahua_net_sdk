package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * {@link INetSDK#AttachVideoAnalyseState} Interface input parameters
 * \else
 * {@link INetSDK#AttachVideoAnalyseState} 接口输入参数
 * \endif
 */
public class NET_IN_ATTACH_VIDEOANALYSE_STATE implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * channel id
	 * \else
	 * 通道号
	 * \endif
	 */
	public int                nChannleId;            
}
