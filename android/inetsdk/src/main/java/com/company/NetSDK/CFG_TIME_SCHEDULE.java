package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Schedule Information
 * \else
 * 时间表信息
 * \endif
 */
public class CFG_TIME_SCHEDULE implements Serializable{
	private static final long serialVersionUID = 1L;
	
	/**
	 * \if ENGLISH_LANG
	 * whether holiday config is enabled, default value is FALSE, DO NOT enable it unless you get TRUE after get config
	 * \else
	 * 是否支持节假日配置，默认为不支持，除非获取配置后返回为TRUE，不要使能假日配置
	 * \endif
	 */
    public boolean                bEnableHoliday;
    
    /**
     * \if ENGLISH_LANG
     * The First Dimension Before the 7 Elements Corresponding 7 Days a week?ê?Eighth Elements Corresponding Holiday Up to Six Time Periods Per Day
     * \else
     * 第一维前7个元素对应每周7天，第8个元素对应节假日，每天最多6个时间段
     * \endif
     */
	public CFG_TIME_SECTION[][]	  stuTimeSection = new CFG_TIME_SECTION[FinalVar.MAX_TIME_SCHEDULE_NUM][FinalVar.MAX_REC_TSECT]; 

	public CFG_TIME_SCHEDULE() {
		for(int i = 0 ; i < FinalVar.MAX_TIME_SCHEDULE_NUM; i ++) {
			for(int j = 0; j < FinalVar.MAX_REC_TSECT; j ++) {
				stuTimeSection[i][j] = new CFG_TIME_SECTION();
			}
		}
	}
}
