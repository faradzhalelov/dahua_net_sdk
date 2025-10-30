package com.company.NetSDK;

import java.io.Serializable;
/**
 * \if ENGLISH_LANG
 * interface {@link INetSDK#MatchTwoFaceImage} output parameter
 * \else
 * 接口 {@link INetSDK#MatchTwoFaceImage} 输出参数
 * \endif
 */

public class NET_MATCH_TWO_FACE_OUT implements Serializable{
	private static final long serialVersionUID = 1L;
	
	/**
	 * \if ENGLISH_LANG
	 * Similarity of two image ,from 0 to 100
	 * \else
	 * 两张图片的相似度,范围0~100
	 * \endif
	 */
	public int						nSimilarity;		
}
