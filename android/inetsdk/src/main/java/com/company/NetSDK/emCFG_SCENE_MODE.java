package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Scene mode 
 * \else
 * 情景模式
 * \endif
 */
public class emCFG_SCENE_MODE implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Unknown type
	 * \else
	 * 未知
	 * \endif
	 */
	public static final int emCFG_SCENE_MODE_UNKNOWN = 0;		
	
	/**
	 * \if ENGLISH_LANG
	 * AWAY Mode
	 * \else
	 * 外出模式
	 * \endif
	 */
	public static final int emCFG_SCENE_MODE_OUTDOOR = 1;			
	
	/**
	 * \if ENGLISH_LANG
	 * Home mode
	 * \else
	 * 在家模式
	 * \endif
	 */
	public static final int emCFG_SCENE_MODE_INDOOR = 2;			
	
	/**
	 * \if ENGLISH_LANG
	 * global mode
	 * \else
	 * 全局模式
	 * \endif
	 */
	public static final int emCFG_SCENE_MODE_WHOLE = 3;            
	
	/**
	 * \if ENGLISH_LANG
	 * instant mode
	 * \else
	 * 立即模式
	 * \endif
	 */
	public static final int emCFG_SCENE_MODE_RIGHTNOW = 4;          
	
	/**
	 * \if ENGLISH_LANG
	 * auto mode
	 * \else
	 * 自动模式
	 * \endif
	 */
	public static final int emCFG_SCENE_MODE_AUTO = 5;              
	
	/**
	 * \if ENGLISH_LANG
	 * duress mode
	 * \else
	 * 强制模式
	 * \endif
	 */
	public static final int emCFG_SCENE_MODE_FORCE = 6;             
	
	/**
	 * \if ENGLISH_LANG
	 * sleeping mode
	 * \else
	 * 就寝模式
	 * \endif
	 */
	public static final int emCFG_SCENE_MODE_SLEEPING = 7; 			
	
	/**
	 * \if ENGLISH_LANG
	 * costom mode
	 * \else
	 * 自定义模式
	 * \endif
	 */
	public static final int emCFG_SCENE_MODE_CUSTOM = 8;			
}
