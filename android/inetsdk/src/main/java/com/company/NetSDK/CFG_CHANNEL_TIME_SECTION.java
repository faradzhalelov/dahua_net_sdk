package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Network Storage Server Configuration
 * \else
 * 网络存储服务器配置
 * \endif
 */
public class CFG_CHANNEL_TIME_SECTION implements Serializable {
 	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * \if ENGLISH_LANG
	 * Storage Time Section 
	 * \else
	 * 存储时间段
	 * \endif
	 */
	public CFG_TIME_SECTION[][]			stuTimeSection = new CFG_TIME_SECTION[FinalVar.WEEK_DAY_NUM][FinalVar.MAX_NAS_TIME_SECTION];
	
	public CFG_CHANNEL_TIME_SECTION() {
		for (int i = 0; i < FinalVar.WEEK_DAY_NUM; ++i) {
			for (int j = 0; j < FinalVar.MAX_NAS_TIME_SECTION; ++j) {
				this.stuTimeSection[i][j] = new CFG_TIME_SECTION();
			}
		}
	}
}
