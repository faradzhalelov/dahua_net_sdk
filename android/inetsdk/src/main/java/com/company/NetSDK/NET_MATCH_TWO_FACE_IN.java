package com.company.NetSDK;

import java.io.Serializable;
/**
 * \if ENGLISH_LANG
 * interface {@link INetSDK#MatchTwoFaceImage} input parameter
 * \else
 * 接口 {@link INetSDK#MatchTwoFaceImage} 输入参数
 * \endif
 */

public class NET_MATCH_TWO_FACE_IN implements Serializable{
	private static final long serialVersionUID = 1L;
	
	/**
	 * \if ENGLISH_LANG
	 * original image
	 * \else
	 * 原图
	 * \endif
	 */
	public NET_IMAGE_COMPARE_INFO  stuOriginalImage = new NET_IMAGE_COMPARE_INFO();	
	
	/**
	 * \if ENGLISH_LANG
	 * Comparsion image
	 * \else
	 * 比较图
	 * \endif
	 */
	public NET_IMAGE_COMPARE_INFO  stuCompareImage  = new NET_IMAGE_COMPARE_INFO();	
	
	/**
	 * \if ENGLISH_LANG
	 * original image name 
	 * \else
	 * 原图名称
	 * \endif
	 */
	public String 				OriginalImageName;
	
	/**
	 * \if ENGLISH_LANG
	 * Comparsion image name
	 * \else
	 * 比较图名称
	 * \endif
	 */
	public String               compareImageName;
}
