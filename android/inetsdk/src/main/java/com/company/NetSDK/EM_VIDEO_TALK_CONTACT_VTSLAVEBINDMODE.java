package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * visual talk analog VTH input mode 
 * \else
 * 可视对讲模拟室内机接入时的模式
 * \endif
 */
public class EM_VIDEO_TALK_CONTACT_VTSLAVEBINDMODE implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * \if ENGLISH_LANG
	 * unknown
	 * \else
	 * 未知
	 * \endif
	 */
    public static final int EM_VIDEO_TALK_CONTACT_VTSLAVEBINDMODE_UNKNOWN = 0;             
    
	/**
	 * \if ENGLISH_LANG
	 * via SubAddress
	 * \else
	 * 通过SubAddress
	 * \endif
	 */
    public static final int EM_VIDEO_TALK_CONTACT_VTSLAVEBINDMODE_SLAVEADDRESS = 1;         
    
	/**
	 * \if ENGLISH_LANG
	 * via SubID+SubPort
	 * \else
	 * 通过SubID+SubPort
	 * \endif
	 */
    public static final int EM_VIDEO_TALK_CONTACT_VTSLAVEBINDMODE_SLAVEID_SLAVEPORT = 2;    

}
