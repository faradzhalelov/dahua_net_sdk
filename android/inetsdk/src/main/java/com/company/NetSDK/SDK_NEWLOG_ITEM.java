package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Log information. Corresponding to {@link INetSDK#QueryLogEx}
 * \else
 * 日志信息,对应扩展接口{@link INetSDK#QueryLogEx},参数 reserved(int nType=1;reserved=&nType;)
 * \endif
 */

public class SDK_NEWLOG_ITEM implements Serializable{
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
	 * Type, refer to {@link SDK_NEWLOG_TYPE}
	 * \else
	 * 类型,取值参考  {@link SDK_NEWLOG_TYPE}
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
	public short    			data;
	
	/**
	 * \if ENGLISH_LANG
	 * username
	 * \else
	 * 用户名
	 * \endif
	 */
    public byte[]              szOperator = new byte[8];              
    
	/**
	 * \if ENGLISH_LANG
	 * Content
	 * \else
	 * 内容
	 * \endif
	 */
	public byte				  context[] = new byte[16];
}
