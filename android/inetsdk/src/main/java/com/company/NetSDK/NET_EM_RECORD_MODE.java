package com.company.NetSDK;

import java.io.Serializable;
/**
 * \if ENGLISH_LANG
 * record mode
 * \else
 * 录像模式
 * \endif
 */
public class NET_EM_RECORD_MODE implements Serializable {
	private static final long serialVersionUID = 1L;
	
	/**
	 * \if ENGLISH_LANG
	 * mode unknown
	 * \else
	 * 未知类型
	 * \endif
	 */
	public static final int	NET_EM_RECORD_MODE_UNKNOWN = 0; 
	
	/**
	 * \if ENGLISH_LANG
	 * course record mode
	 * \else
	 *  录播模式
	 * \endif
	 */
	public static final int	NET_EM_RECORD_MODE_COURESE = 1;
	
	/**
	 * \if ENGLISH_LANG
	 * normal record mode
	 * \else
	 * 普通模式
	 * \endif
	 */
	public static final int	NET_EM_RECORD_MODE_NORMAL = 2;

}
