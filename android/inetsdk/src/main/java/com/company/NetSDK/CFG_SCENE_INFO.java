package com.company.NetSDK;

import java.io.Serializable;

public class CFG_SCENE_INFO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Mode Name
	 * \else
	 * 模式名
	 * \endif
	 */
	public int               emName;							
	
	/**
	 * \if ENGLISH_LANG
	 * Number of alarm channel
	 * \else
	 * 报警通道个数
	 * \endif
	 */
	public int				 nAlarmInChannelsCount;				
	
	/**
	 * \if ENGLISH_LANG
	 * The number of alarm channel in the actual return
	 * \else
	 * 实际返回的报警通道个数
	 * \endif
	 */
	public int				 nRetAlarmInChannelsCount;			
	
	/**
	 * \if ENGLISH_LANG
	 * Enable the alarm input channel number list, need to user memory , size is nAlarmInChannelsCount
	 * \else
	 * 启用的报警输入通道号列表，需用户分配内存,大小为nAlarmInChannelsCount
	 * \endif
	 */
	public int   			 pnAlarmInChannels[];					
	
	public CFG_SCENE_INFO(int alarmInChnNum) {
		nAlarmInChannelsCount = alarmInChnNum;
		pnAlarmInChannels = new int[alarmInChnNum];
	}
}
