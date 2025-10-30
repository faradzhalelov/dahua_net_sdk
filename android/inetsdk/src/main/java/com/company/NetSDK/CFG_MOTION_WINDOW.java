package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Motion detection supported video window config
 * \else
 * 动检支持的视频窗口配置
 * \endif
 */
public class CFG_MOTION_WINDOW implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Area threshold，value [0, 100]
	 * \else
	 * 面积阀值，取值[0, 100]
	 * \endif
	 */
	public int                  nThreshold;           

	/**
	 * \if ENGLISH_LANG
	 * Sensitivity，value[0, 100]
	 * \else
	 * 灵敏度，取值[0, 100]
	 * \endif
	 */
	public int                  nSensitive;           

	/**
	 * \if ENGLISH_LANG
	 * Motion detection area, coordinate value [0, 8192)
	 * \else
	 * 动检窗口区域, 坐标位置取值[0, 8192)
	 * \endif
	 */
	public CFG_RECT             stuWindow = new CFG_RECT();            
}
