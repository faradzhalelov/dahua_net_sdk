package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Video Tampering Configuration, the corresponding interface {@link INetSDK#GetNewDevConfig} and {@link INetSDK#SetNewDevConfig},the corresponding command {@link FinalVar#CFG_CMD_VIDEOBLIND}
 * \else
 * 视频遮挡报警配置, 对应接口 {@link INetSDK#GetNewDevConfig} 和 {@link INetSDK#SetNewDevConfig},对应命令 {@link FinalVar#CFG_CMD_VIDEOBLIND}
 * \endif
 */
public class CFG_SHELTER_INFO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Channel ID1~Maximum Number of Channels	
	 * \else
	 * 报警通道号(0开始)
	 * \endif
	 */
	public int					nChannelID;									

	/**
	 * \if ENGLISH_LANG
	 * Occlusion Detection Enable 
	 * \else
	 * 使能开关
	 * \endif
	 */
	public boolean				bEnable;									

	/**
	 * \if ENGLISH_LANG
	 * level of sensitivity 1~6，Min 1，Max 6
	 * \else
	 * 灵敏度
	 * \endif
	 */
	public int					nSenseLevel;								

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
	 * Event Respond Period
	 * \else
	 * 事件响应时间段
	 * \endif
	 */
	public CFG_TIME_SECTION		stuTimeSection[][] = new CFG_TIME_SECTION[FinalVar.WEEK_DAY_NUM][FinalVar.MAX_REC_TSECT];
	
	public CFG_SHELTER_INFO() {
		for (int i = 0; i < FinalVar.WEEK_DAY_NUM; i++) {
			for (int j = 0; j < FinalVar.MAX_REC_TSECT; j++) {
				stuTimeSection[i][j] = new CFG_TIME_SECTION();
			}
		}
	}
}
