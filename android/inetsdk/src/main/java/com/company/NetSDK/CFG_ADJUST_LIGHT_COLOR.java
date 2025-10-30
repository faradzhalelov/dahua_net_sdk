package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Traffic light color correction configuration
 * \else
 * 交通灯颜色校正配置
 * \endif
 */
public class CFG_ADJUST_LIGHT_COLOR implements Serializable{
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;
	
	 /**
	 * \if ENGLISH_LANG
	 * traffic light color correction mode 0:undefined 1:traffic light corrected 2:always correct
	 * \else
	 * 红灯颜色校正模式 0:未定义 1:红绿灯才校正 2:一直校正
	 * \endif
	 */
    public int                    nMode;                                  
    
	 /**
	 * \if ENGLISH_LANG
	 * whether allow correction of traffic color in picture
	 * \else
	 * 是否允许图片红绿灯颜色校正
	 * \endif
	 */
    public boolean                bEnable;                               
    
	 /**
	 * \if ENGLISH_LANG
	 * correction level range 0~100 the higher the value, the more obvious the correction will be
	 * \else
	 * 校正等级 范围0~100，数值越大矫正越明显
	 * \endif
	 */
    public int                	  nLevel;                                 
    
	 /**
	 * \if ENGLISH_LANG
	 * Whether enable video red paint function, when this option exists, level value uses Level value under LevelSeparate             
	 * \else
	 * 是否启用视频涂红功能，存在此项时，Level值使用LevelSeparate下的Level值      
	 * \endif
	 */
    public boolean                bVideoEnable;                                                     
    
	 /**
	 * \if ENGLISH_LANG
	 * separate level, currently there are 4
	 * \else
	 * 分立等级，目前为4个
	 * \endif
	 */
    public ADJUST_LEVEL_SEP[]     stLevelSep = new ADJUST_LEVEL_SEP[4];   
    
    public CFG_ADJUST_LIGHT_COLOR() {
    	for(int i=0; i<4; ++i) {
    		stLevelSep[i] = new ADJUST_LEVEL_SEP();
    	}
    }
}
