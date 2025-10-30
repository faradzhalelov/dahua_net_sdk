package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Many Scene Calibration Area Basic Unit Configuration
 * \else
 * 多场景标定区域配置基本单元
 * \endif
 */
public class CFG_CALIBRATEAREA_SCENE_UNIT implements Serializable{
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Calibrate Area Number
	 * \else
	 * 此场景内标定区域数
	 * \endif
	 */
	public int           			 nCalibrateAreaNum;                                
	
	/**
	 * \if ENGLISH_LANG
	 * Calibrate Area(If the field does not exist, the whole scene is the calibrate Area)
	 * \else
	 * 标定区域(若该字段不存在，则以整幅场景为标定区域)
	 * \endif
	 */
	public CFG_CALIBRATEAREA_INFO[]  stuCalibrateArea = new CFG_CALIBRATEAREA_INFO[FinalVar.MAX_CALIBRATEBOX_NUM]; 

	public CFG_CALIBRATEAREA_SCENE_UNIT() {
		for(int i=0; i<FinalVar.MAX_CALIBRATEBOX_NUM; ++i) {
			stuCalibrateArea[i] = new CFG_CALIBRATEAREA_INFO();
		}
	}
}
