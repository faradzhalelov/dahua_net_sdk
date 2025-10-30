package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * logic channel  
 * \else
 * 逻辑通道号
 * \endif
 */
public class NET_EM_LOGIC_CHANNEL implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * \if ENGLISH_LANG
	 * invalid  
	 * \else
	 * 无效
	 * \endif
	 */
	public static final int NET_EM_LOGIC_CHANNEL_INVALID = -1;                         
	
	/**
	 * \if ENGLISH_LANG
	 * composite channel id  
	 * \else
	 * 视频组合通道号
	 * \endif
	 */
    public static final int NET_EM_LOGIC_CHANNEL_COMPOSITE = 0;                             
    
	/**
	 * \if ENGLISH_LANG
	 * PPT logic channel id  
	 * \else
	 * PPT显示逻辑通道号
	 * \endif
	 */
    public static final int NET_EM_LOGIC_CHANNEL_PPT = 1;                                   
    
	/**
	 * \if ENGLISH_LANG
	 * blackboard logic channel id  
	 * \else
	 * 板书特写逻辑通道号
	 * \endif
	 */
    public static final int NET_EM_LOGIC_CHANNEL_BLACKBOARD = 2;                            
    
	/**
	 * \if ENGLISH_LANG
	 * student feature logic channel id  
	 * \else
	 * 学生特写逻辑通道号
	 * \endif
	 */
    public static final int NET_EM_LOGIC_CHANNEL_STUDENTFEATURE = 3;                       
    
	/**
	 * \if ENGLISH_LANG
	 * student fullview logic channel id  
	 * \else
	 * 学生全景逻辑通道号
	 * \endif
	 */
    public static final int NET_EM_LOGIC_CHANNEL_STUDENTFULLVIEW = 4;                      
    
	/**
	 * \if ENGLISH_LANG
	 * teacher feature logic channel id  
	 * \else
	 * 教师特写逻辑通道号
	 * \endif
	 */
    public static final int NET_EM_LOGIC_CHANNEL_TEACHERFEATURE = 5;                        
    
	/**
	 * \if ENGLISH_LANG
	 * teacher fullview logic channel id  
	 * \else
	 * 教师全景逻辑通道号
	 * \endif
	 */
    public static final int NET_EM_LOGIC_CHANNEL_TEACHERFULLVIEW = 6;                       
    
	/**
	 * \if ENGLISH_LANG
	 * teacher detect logic channel id  
	 * \else
	 * 教师检测逻辑通道号
	 * \endif
	 */
    public static final int NET_EM_LOGIC_CHANNEL_TEACHERDETECT = 7;                         
    
	/**
	 * \if ENGLISH_LANG
	 * blackboard detect logic channel id  
	 * \else
	 * 板书检测逻辑通道号
	 * \endif
	 */
    public static final int NET_EM_LOGIC_CHANNEL_BLACKBOARDDETECT = 8;                      
}
