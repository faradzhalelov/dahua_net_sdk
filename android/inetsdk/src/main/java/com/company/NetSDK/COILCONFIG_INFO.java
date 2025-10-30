package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Coil configuration
 * \else
 * 线圈配置
 * \endif
 */
public class COILCONFIG_INFO implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Delay flash id, 0~5,0 means not delay any flash 
	 * \else
	 * 延时闪光灯序号	每个线圈对应的延时闪关灯序号，范围0~5，0表示不延时任何闪光灯
	 * \endif
	 */
    public int               nDelayFlashID;                  
    
	/**
	 * \if ENGLISH_LANG
	 * Flash serial number,0~5,0 means not open the flash
	 * \else
	 * 闪光灯序号	范围0~5，0表示不打开闪光灯
	 * \endif
	 */
    public int               nFlashSerialNum;               
    
	/**
	 * \if ENGLISH_LANG
	 * Red light direction,0-not bonding,1-turn left,2-straight,3-turn right,4-wait left,5-wait straight,6-wait right
	 * \else
	 * 红灯方向	每个线圈对应的红灯方向：0-不关联,1-左转红灯,2-直行红灯,3-右转红灯,4-待左,5-待直,6-待右, 只在电警中有效
	 * \endif
	 */
    public int               nRedDirection;                 
    
	/**
	 * \if ENGLISH_LANG
	 * Trigger mode, 0-in, 1-out
	 * \else
	 * 线圈触发模式	触发模式：0-入线圈触发1-出线圈触发
	 * \endif
	 */
    public int               nTriggerMode ;                
    
	/**
	 * \if ENGLISH_LANG
	 * Snapshot 2nd corresponding to flashlight no. range 0~5, 0 means do not open flashlight
	 * \else
	 * 多抓第二张对应闪光灯序号 范围0~5，0表示不打开闪光灯
	 * \endif
	 */
    public int				  nFlashSerialNum2;				 
    
	/**
	 * \if ENGLISH_LANG
	 * Snapshot third corresponding to flashlight no. range 0~5, 0 means do not oen flashlight
	 * \else
	 * 多抓第三张对应闪光灯序号 范围0~5，0表示不打开闪光灯
	 * \endif
	 */
    public int				  nFlashSerialNum3;				 
}
