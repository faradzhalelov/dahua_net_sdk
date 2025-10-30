package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * interface {@link INetSDK#AIOScreen} output parameter(get NVR screen)
 * \else
 *  接口 {@link INetSDK#AIOScreen} 接口输出参数(NVR截屏)
 * \endif
 */

public class NET_OUT_AIO_SCREEN implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	/**
	 * \if ENGLISH_LANG
	 *get screen path
	 * \else
	 *截屏图片路径
	 * \endif
	 */
	public byte[]		szName = new byte[FinalVar.SDK_COMMON_STRING_256];	
}
