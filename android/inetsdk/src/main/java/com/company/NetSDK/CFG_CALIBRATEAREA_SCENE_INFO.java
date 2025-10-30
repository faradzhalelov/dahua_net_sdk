package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Many Scene calibrate Area Configuration
 * \else
 * 多场景标定区域配置
 * \endif
 */
public class CFG_CALIBRATEAREA_SCENE_INFO implements Serializable{
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Many Scene Calibrate Area Maximum Number(Need to apply for the size of memory)
	 * \else
	 * 多场景标定区域最大个数(需要申请此大小内存)
	 * \endif
	 */
	public int                       	   dwMaxSceneCalibrateAreaNum;                
	
	/**
	 * \if ENGLISH_LANG
	 * Actually Contains Many Scene Calibrate Area Number
	 * \else
	 * 实际包含多场景标定区域个数
	 * \endif
	 */
	public int                        	   dwRetSceneCalibrateAreaNum;                 
	
	/**
	 * \if ENGLISH_LANG
	 * Many Scene Calibration Area unit
	 * \else
	 * 多场景标定区域单元
	 * \endif
	 */
	public CFG_CALIBRATEAREA_SCENE_UNIT[]  pstuCalibrateArea;  

	public CFG_CALIBRATEAREA_SCENE_INFO(int dwMaxSceneCalibrateAreaNum) {
		this.dwMaxSceneCalibrateAreaNum = dwMaxSceneCalibrateAreaNum;
		pstuCalibrateArea = new CFG_CALIBRATEAREA_SCENE_UNIT[dwMaxSceneCalibrateAreaNum];
		for(int i=0; i<dwMaxSceneCalibrateAreaNum; ++i) {
			pstuCalibrateArea[i] = new CFG_CALIBRATEAREA_SCENE_UNIT();
		}
	}
}
