package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * source video info
 * \else
 * 视频源信息
 * \endif
 */
public class SDK_LOGIC_BYDEVICE_ADD_CAMERA_PARAM implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * \if ENGLISH_LANG
	 * UniqueChannel
	 * \else
	 * 统一通道号
	 * \endif
	 */
	public                  int           nUniqueChannel;
	
	/**
	 * \if ENGLISH_LANG
	 * channel 
	 * \else
	 * 通道号
	 * \endif
	 */
	public                  int           nChannel;
	

}
