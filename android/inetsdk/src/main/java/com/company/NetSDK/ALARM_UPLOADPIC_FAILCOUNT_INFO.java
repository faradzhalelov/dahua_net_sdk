package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * upload pic fail count, the corresponding interface {@link INetSDK#StartListenEx},the corresponding command {@link FinalVar#SDK_ALARM_UPLOADPIC_FAILCOUNT}
 * \else
 * 上传失败数据个数, 对应接口 {@link INetSDK#StartListenEx},对应命令 {@link FinalVar#SDK_ALARM_UPLOADPIC_FAILCOUNT}
 * \endif
 */
public class ALARM_UPLOADPIC_FAILCOUNT_INFO implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;


	/**
	 * \if ENGLISH_LANG
	 *  upload failed count
	 * \else
	 * 上传失败个数
	 * \endif
	 */
	public int         nFailCount;   
	
}
