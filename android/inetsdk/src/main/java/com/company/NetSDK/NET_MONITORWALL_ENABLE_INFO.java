package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * tv wall enable info 
 * \else
 * 电视墙使能信息
 * \endif
 */
public class NET_MONITORWALL_ENABLE_INFO implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * \if ENGLISH_LANG
	 * enable
	 * \else
	 * 使能
	 * \endif
	 */
	public boolean             bEanble;                        
	
	/**
	 * \if ENGLISH_LANG
	 * tv wall  name 
	 * \else
	 * 电视墙名称
	 * \endif
	 */
	public byte[]              szName = new byte[FinalVar.SDK_COMMON_STRING_128];  

}
