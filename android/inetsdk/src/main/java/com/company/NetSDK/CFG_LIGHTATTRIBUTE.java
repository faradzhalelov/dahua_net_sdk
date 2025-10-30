package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Traffic light attribute
 * \else
 * 交通灯的属性
 * \endif
 */
public class CFG_LIGHTATTRIBUTE implements Serializable{
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * \if ENGLISH_LANG
	 * Instruct the current traffic light's effectiveness 
	 * \else
	 * 当前交通灯是否有效，与车辆通行无关的交通需要设置无效
	 * \endif
	 */
	public boolean           bEnable;                           
	
	public int               nTypeNum; 
	
	/**
	 * \if ENGLISH_LANG
	 * Current light display(include:Red,Yellow,Green,Countdown),for example some traffic light has red, yellow, green three color, and other only can only display countdown
	 * \else
	 * 当前交通灯显现内容（包括:红-Red,黄-Yellow,绿-Green,倒计时-Countdown），如某交通灯可以显示红黄绿三种颜色，某交通灯只显示倒计时
	 * \endif
	 */
	public byte[][]		     szLightType = new byte[FinalVar.MAX_LIGHT_TYPE][FinalVar.MAX_NAME_LEN];      
	
	public int               nDirectionNum;
	
	/**
	 * \if ENGLISH_LANG
	 * The direction of traffic light display,"Straight","TurnLeft","TurnRight","U-Turn"
	 * \else
	 * 交通灯指示的行车方向,"Straight": 直行，"TurnLeft":左转，"TurnRight":右转，"U-Turn": 掉头
	 * \endif
	 */
	public byte[][]          szDirection = new byte[FinalVar.MAX_LIGHT_DIRECTION][FinalVar.MAX_NAME_LEN];      
	
	/**
	 * \if ENGLISH_LANG
	 * Yellow light on time
	 * \else
	 * 黄灯亮时间
	 * \endif
	 */
	public int               nYellowTime;                        
}
