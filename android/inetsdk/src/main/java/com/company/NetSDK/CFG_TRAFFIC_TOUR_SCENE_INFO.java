package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Traffic Patrol Scene
 * \else
 * 交通巡视场景
 * \endif
 */
public class CFG_TRAFFIC_TOUR_SCENE_INFO implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
 	/**
	 * \if ENGLISH_LANG
	 * Plate Characters Hint Number
	 * \else
	 * 车牌字符暗示个数
	 * \endif
	 */
	public int              nPlateHintNum;                  
	
 	/**
	 * \if ENGLISH_LANG
	 * late Characters Hint Array. Plate Characters Hint Array When you take a picture of poor quality and license plate recognition uncertain. According to this array of characters to match. The smaller array subscript, the higher the match priority
	 * \else
	 * 车牌字符暗示数组，在拍摄图片质量较差车牌识别不确定时，根据此数组中的字符进行匹配，数组下标越小，匹配优先级越高
	 * \endif
	 */
	public byte[][]         szPlateHints = new byte[FinalVar.MAX_PLATEHINT_NUM][FinalVar.MAX_NAME_LEN]; 
															
}
