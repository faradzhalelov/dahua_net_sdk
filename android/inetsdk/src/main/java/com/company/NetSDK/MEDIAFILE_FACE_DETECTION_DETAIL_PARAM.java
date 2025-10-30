package com.company.NetSDK;

import java.io.Serializable;

public class MEDIAFILE_FACE_DETECTION_DETAIL_PARAM implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * \if ENGLISH_LANG
	 * object ID
	 * \else
	 * 物体ID
	 * \endif
	 */
	public long			    dwObjectId;
	
	/**
	 * \if ENGLISH_LANG
	 * frame no.
	 * \else
	 * 帧序号
	 * \endif
	 */
	public long             dwFrameSequence;
	
	/**
	 * \if ENGLISH_LANG
	 * time
	 * \else
	 * 发生时间
	 * \endif
	 */
	public NET_TIME_EX      stTime = new NET_TIME_EX();
}
