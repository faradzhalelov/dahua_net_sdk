package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Log information. Corresponding to {@link INetSDK#QueryLog}
 * \else
 * 日志信息,对应接口 {@link INetSDK#QueryLog}
 * \endif
 */
public class SDK_LOG_ITEM implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Date
	 * \else
	 * 日期
	 * \endif
	 */
	public SDKDEVTIME			time = new SDKDEVTIME();
	
	/**
	 * \if ENGLISH_LANG
	 * Type
	 * \else
	 * 类型
	 * \endif
	 */
	public short				type;
	
	/**
	 * \if ENGLISH_LANG
	 * Data
	 * \else
	 * 数据
	 * \endif
	 */
	public byte				data;
	
	/**
	 * \if ENGLISH_LANG
	 * Content
	 * \else
	 * 内容
	 * \endif
	 */
	public byte				context[] = new byte[8];
}
