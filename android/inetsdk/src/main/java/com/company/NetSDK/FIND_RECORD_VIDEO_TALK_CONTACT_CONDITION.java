package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * contact record search criteria
 * \else
 * 联系人记录查询条件
 * \endif
 */
public class FIND_RECORD_VIDEO_TALK_CONTACT_CONDITION implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * \if ENGLISH_LANG
	 * visual talk short no. search criteria  is valid or not 
	 * \else
	 * 可视对讲短号查询条件是否有效
	 * \endif
	 */
    public boolean	bVTShortNumberEnable;
    
	/**
	 * \if ENGLISH_LANG
	 * visual talk short no.
	 * \else
	 * 可视对讲短号
	 * \endif
	 */
    public byte[]	szVTShortNumber =  new byte[FinalVar.SDK_COMMON_STRING_32];
}
