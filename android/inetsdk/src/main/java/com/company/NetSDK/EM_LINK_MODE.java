package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * network connection mode
 * \else
 * 网络连接模式 
 * \endif
 */
public class EM_LINK_MODE implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * \if ENGLISH_LANG
	 * unknow mode
	 * \else
	 * 未知模式
	 * \endif
	 */
	public static final int EM_LINK_MODE_UNKNOWN = 0;                                      
	
	/**
	 * \if ENGLISH_LANG
	 * auto select
	 * \else
	 * 自动选择合适的模式
	 * \endif
	 */
	public static final int EM_LINK_MODE_AUTO = 1;                                           
	
	/**
	 * \if ENGLISH_LANG
	 * ADHOC
	 * \else
	 * 是一种特殊的无线网络应用模式, 一群计算机接上无线网络卡, 即可相互连接, 资源共享, 无需透过Access Point
	 * \endif
	 */
	public static final int EM_LINK_MODE_ADHOC = 1;                                         
	
	/**
	 * \if ENGLISH_LANG
	 * infrastructure
	 * \else
	 * 是一种整合有线与无线局域网络架构的应用模式, 可以网络资源共享, 此应用需透过Access Point。
	 * \endif
	 */
	public static final int EM_LINK_MODE_INFRASTRUCTURE = 2;                                
}
