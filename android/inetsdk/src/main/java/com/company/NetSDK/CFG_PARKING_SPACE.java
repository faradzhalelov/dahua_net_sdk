package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * parking config info
 * \else
 * 车位配置信息
 * \endif
 */
public class CFG_PARKING_SPACE implements Serializable{
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * \if ENGLISH_LANG
	 * parking no
	 * \else
	 * 车位编号
	 * \endif
	 */
    public int             nNumber;               					 
    
	/**
	 * \if ENGLISH_LANG
	 * detection zone
	 * \else
	 * 检测区域
	 * \endif
	 */
    public CFG_REGION      stArea = new CFG_REGION();                
    
	/**
	 * \if ENGLISH_LANG
	 * valid shield zone number
	 * \else
	 * 有效屏蔽区个数
	 * \endif
	 */
    public int             nShieldAreaNum;                           
    
	/**
	 * \if ENGLISH_LANG
	 * shield zone
	 * \else
	 * 屏蔽区域
	 * \endif
	 */
    public CFG_REGION[]    stShieldArea = new CFG_REGION[FinalVar.MAX_SHIELD_AREA_NUM];   
    
    public CFG_PARKING_SPACE() {
    	for(int i=0; i<FinalVar.MAX_SHIELD_AREA_NUM; ++i) {
    		stShieldArea[i] = new CFG_REGION();
    	}
    }
}
