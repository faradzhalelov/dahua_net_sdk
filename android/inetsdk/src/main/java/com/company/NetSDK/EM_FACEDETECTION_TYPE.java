package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Target detection type
 * \else
 * 目标检测类型
 * \endif
 */
public class EM_FACEDETECTION_TYPE implements Serializable{
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * unknow
	 * \else
	 * 未知
	 * \endif
	 */
	public static final int EM_FACEDETECTION_TYPE_ERR = 0;
	
	/**
	 * \if ENGLISH_LANG
	 * Little face, about 17% of the total target in the video
	 * \else
	 * 小脸类型，目标在视频中的比重大概17%
	 * \endif
	 */
	public static final int EM_FACEDETECTION_TYPE_SMALLFACE = 1;					
	
	/**
	 * \if ENGLISH_LANG
	 * Big face, about 33% of the total target in the video
	 * \else
	 * 大脸类型，目标在视频中的比重大概33%
	 * \endif
	 */
	public static final int EM_FACEDETECTION_TYPE_LARGEFACE = 2;					
	
	/**
	 * \if ENGLISH_LANG
	 * Detection type
	 * \else
	 * 测类型
	 * \endif
	 */
	public static final int EM_FACEDETECTION_TYPE_BOTH = 3;							
}
