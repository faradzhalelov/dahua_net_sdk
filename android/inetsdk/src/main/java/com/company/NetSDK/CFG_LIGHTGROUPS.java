package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Traffic light configuration
 * \else
 * 交通灯组配置信息
 * \endif
 */
public class CFG_LIGHTGROUPS implements Serializable{
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * \if ENGLISH_LANG
	 * Light group id
	 * \else
	 * 灯组编号
	 * \endif
	 */
	public int                	 nLightGroupId;                     
	
	/**
	 * \if ENGLISH_LANG
	 * Light group location
	 * \else
	 * 灯组坐标
	 * \endif
	 */
	public CFG_RECT           	 stuLightLocation = new CFG_RECT(); 
	
	/**
	 * \if ENGLISH_LANG
	 * Light group direction,1- horizontal,2- vertical
	 * \else
	 * 灯组的方向,1- 灯组水平向,2- 灯组垂直向
	 * \endif
	 */
	public int                	 nDirection;                        
	
	/**
	 * \if ENGLISH_LANG
	 * Instruct whether circumscribe traffic light signal; when be true, it will be trigger rule while the signal changed
	 * \else
	 * 是否为外接红绿灯信号,当外接红绿灯时，以外界信号为判断依据。外界信号每次跳变时通知
	 * \endif
	 */
	public boolean               bExternalDetection;               
	
	/**
	 * \if ENGLISH_LANG
	 *  Whether support self-adaptation light swing detect, when be in a sence that easy to swing, the light location will be lillte changed, it will cost a longer time that let the algorithm do the detect
	 * \else
	 * 是否支持自适应灯组摇摆检测,在风吹或者容易震动的场景下，位置会进行一定的浮动偏差。如果由算法自行检测，会增加检测时间
	 * \endif
	 */
	public boolean               bSwingDetection;                   
	
	/**
	 * \if ENGLISH_LANG
	 * The number of light in the group
	 * \else
	 * 灯组中交通灯的数量
	 * \endif
	 */
	public int                	 nLightNum;                         
	
	/**
	 * \if ENGLISH_LANG
	 * Each light's attribute
	 * \else
	 * 灯组中各交通灯的属性
	 * \endif
	 */
	public CFG_LIGHTATTRIBUTE[]  stuLightAtrributes = new CFG_LIGHTATTRIBUTE[FinalVar.MAX_LIGHT_NUM]; 
	
	public CFG_LIGHTGROUPS() {
		for(int i=0; i<FinalVar.MAX_LIGHT_NUM; ++i) {
			stuLightAtrributes[i] = new CFG_LIGHTATTRIBUTE();
		}
	}
}
