package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Output Network Alarm Configuration, the corresponding interface {@link INetSDK#GetNewDevConfig} and {@link INetSDK#SetNewDevConfig},the corresponding command {@link FinalVar#CFG_CMD_NETALARMINPUT}
 * \else
 * 网络报警配置, 对应接口 {@link INetSDK#GetNewDevConfig} 和 {@link INetSDK#SetNewDevConfig},对应命令 {@link FinalVar#CFG_CMD_NETALARMINPUT}
 * \endif
 */
public class CFG_NETALARMIN_INFO implements Serializable {
 	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * \if ENGLISH_LANG
	 * Alarm Channel Id(from 0) 
	 * \else
	 * 报警通道号(0开始)
	 * \endif
	 */
	public int					nChannelID;
	
 	/**
	 * \if ENGLISH_LANG
	 * Enable 
	 * \else
	 * 使能开关
	 * \endif
	 */
	public boolean				bEnable;
	
 	/**
	 * \if ENGLISH_LANG
	 * Alarm Channel Name 
	 * \else
	 * 报警通道名称
	 * \endif
	 */
	public byte[]				szChnName = new byte[FinalVar.MAX_CHANNELNAME_LEN];
	
 	/**
	 * \if ENGLISH_LANG
	 * Alarm Type,1:"NO",0: "NC" 
	 * \else
	 * 报警器类型，0：常闭，1：常开
	 * \endif
	 */
	public int					nAlarmType;
	
 	/**
	 * \if ENGLISH_LANG
	 * Event Handler
	 * \else
	 * 报警联动
	 * \endif
	 */
	public CFG_ALARM_MSG_HANDLE stuEventHandler = new CFG_ALARM_MSG_HANDLE();
	
 	/**
	 * \if ENGLISH_LANG
	 * Event Respind Time
	 * \else
	 * 事件响应时间段
	 * \endif
	 */
	public CFG_TIME_SECTION[][]		stuTimeSection = new CFG_TIME_SECTION[FinalVar.WEEK_DAY_NUM][FinalVar.MAX_REC_TSECT];
	
	public CFG_NETALARMIN_INFO() {
		for (int i = 0; i < FinalVar.WEEK_DAY_NUM; i++) {
			for (int j = 0; j < FinalVar.MAX_REC_TSECT; j++) {
				stuTimeSection[i][j] = new CFG_TIME_SECTION();
			}
		}
	}
}
