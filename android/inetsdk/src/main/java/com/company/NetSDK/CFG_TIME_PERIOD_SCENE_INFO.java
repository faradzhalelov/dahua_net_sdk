package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Many Scene  Calibrate Day and night  Configuration
 * \else
 * 多场景标定白天和黑夜配置
 * \endif
 */
public class CFG_TIME_PERIOD_SCENE_INFO implements Serializable{
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * \if ENGLISH_LANG
	 * Many Scene calibration  Day and night configuration Maximum number(Need to apply for the size of memory)
	 * \else
	 * 多场景标定白天和黑夜配置最大个数(需要申请此大小内存)
	 * \endif
	 */
	public int                        		dwMaxTimePeriodSceneNum;    
	
	/**
	 * \if ENGLISH_LANG
	 * Actually Contains Many  Scene Calibrate  Day and Night Configuration Number
	 * \else
	 * 实际包含多场景标定白天和黑夜配置个数
	 * \endif
	 */
	public int                        		dwRetTimePeriodSceneNum;    
	
	/**
	 * \if ENGLISH_LANG
	 * Many  Scene Calibrate  Day and Night Configuration Domain  Unit,user malloc memory, size is sizeof(CFG_TIME_PERIOD_SCENE_UNIT)*dwMaxTimePeriodSceneNum
	 * \else
	 * 多场景标白天和黑夜配置域单元,由用户申请内存，大小为sizeof(CFG_TIME_PERIOD_SCENE_UNIT)*dwMaxTimePeriodSceneNum
	 * \endif
	 */
	public CFG_TIME_PERIOD_SCENE_UNIT[]     pstuTimePeriodScene; 		

	public CFG_TIME_PERIOD_SCENE_INFO(int dwMaxTimePeriodSceneNum) {
		this.dwMaxTimePeriodSceneNum = dwMaxTimePeriodSceneNum;
		pstuTimePeriodScene = new CFG_TIME_PERIOD_SCENE_UNIT[dwMaxTimePeriodSceneNum];
		for(int i=0; i<dwMaxTimePeriodSceneNum; ++i) {
			pstuTimePeriodScene[i] = new CFG_TIME_PERIOD_SCENE_UNIT();
		}	
	}
}
