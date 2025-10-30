package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Filter for all specified objects
 * \else
 * 各种物体特定的过滤器
 * \endif
 */

public class CFG_OBJECT_SIZEFILTER_INFO implements Serializable{
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Object type
	 * \else
	 * 物体类型
	 * \endif
	 */
	public byte[]				szObjectType = new byte[FinalVar.MAX_NAME_LEN];              
	
	/**
	 * \if ENGLISH_LANG
	 * Corresponding size filter
	 * \else
	 * 对应的尺寸过滤器
	 * \endif
	 */
	public CFG_SIZEFILTER_INFO  stSizeFilter = new CFG_SIZEFILTER_INFO();                            
}
