package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * set net AutoAdapt Encode policy, in parameter
 * \else
 * 设置网络自适应编码缓冲策略入参
 * \endif
 */
public class NET_IN_BUFFER_POLICY implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * \if ENGLISH_LANG
	 * tream type, refer to {@link SDK_RealPlayType}
	 * \else
	 * 码流类型。只支持主码流，辅码流，自适应测试码流, 详见 {@link SDK_RealPlayType}
	 * \endif
	 */
	public int         emRealPlayType;          
	
	/**
	 * \if ENGLISH_LANG
	 * 0:default, 1:fluency, 2:actual time
	 * \else
	 * 缓冲策略，0默认，1流畅，2实时
	 * \endif
	 */
	public int         nPolicy;                 
}
