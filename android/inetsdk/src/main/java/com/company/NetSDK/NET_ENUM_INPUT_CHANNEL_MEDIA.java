package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * input media 	
 * \else
 * 输入媒体介质
 * \endif
 */
public class NET_ENUM_INPUT_CHANNEL_MEDIA implements Serializable {

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
    public static final int NET_ENUM_INPUT_MEDIA_UNKNOWN = 0;                                    
    
	/**
	 * \if ENGLISH_LANG
	 * VGA 	
	 * \else
	 * VGA
	 * \endif
	 */
    public static final int NET_ENUM_INPUT_MEDIA_VGA = 1;                                           
    
	/**
	 * \if ENGLISH_LANG
	 * HDMI 	
	 * \else
	 * HDMI
	 * \endif
	 */
    public static final int NET_ENUM_INPUT_MEDIA_HDMI = 2;                                          
}
