package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Record Configuration, the corresponding interface {@link INetSDK#GetNewDevConfig} and {@link INetSDK#SetNewDevConfig},the corresponding command {@link FinalVar#CFG_CMD_RECORD}
 * \else
 * 定时录像配置信息, 对应接口 {@link INetSDK#GetNewDevConfig} 和 {@link INetSDK#SetNewDevConfig},对应命令 {@link FinalVar#CFG_CMD_RECORD}
 * \endif
 */
public class CFG_RECORD_INFO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Channel ID(from 0) 
	 * \else
	 * 通道号(0开始)
	 * \endif
	 */
	public int                 	nChannelID;					

	/**
	 * \if ENGLISH_LANG
	 * Time Section 
	 * \else
	 * 时间表
	 * \endif
	 */
	public CFG_TIME_SECTION		stuTimeSection[][] = new CFG_TIME_SECTION[FinalVar.WEEK_DAY_NUM][FinalVar.MAX_REC_TSECT]; 

	/**
	 * \if ENGLISH_LANG
	 * Prerecord Time，(0~300) 0 means closed
	 * \else
	 * 预录时间，为零时表示关闭(0~300)
	 * \endif
	 */
	public int					nPreRecTime;				

	/**
	 * \if ENGLISH_LANG
	 * Prerecord Time，(0~300) 0 means closed 
	 * \else
	 * 录像冗余开关
	 * \endif
	 */
	public boolean				bRedundancyEn;				

	/**
	 * \if ENGLISH_LANG
	 * Stream Types;
	 * <pre>
	 * Value Stream Type 
	 * 0 Main Stream 
	 * 1 Auxiliary Stream 1 
	 * 2 Auxiliary Stream 2 
	 * 3 Auxiliary Stream 3 
	 * </pre>
	 * \else
	 * 0－主码流，1－辅码流1，2－辅码流2，3－辅码流3
	 * \endif
	 */
	public int					nStreamType;				

	/**
	 * \if ENGLISH_LANG
	 * Protocol Version, Read-Only 
	 * \else
	 * 协议版本号, 只读
	 * \endif
	 */
	public int					nProtocolVer;				

	/**
	 * \if ENGLISH_LANG
	 * as true, holiday config info，bHolidayEn, only stuHolTimeSection valid;
	 * \else
	 * 为true时有假日配置信息，bHolidayEn、stuHolTimeSection才有效;
	 * \endif
	 */
	public boolean				abHolidaySchedule;          
	/**
	 * \if ENGLISH_LANG
	 * Holiday record enable TRUE: enable,FALSE:unable
	 * \else
	 * 假日录像使能TRUE:使能,FALSE:未使能
	 * \endif
	 */
	public boolean              bHolidayEn;                 

	/**
	 * \if ENGLISH_LANG
	 * Holiday record schedule
	 * \else
	 * 假日录像时间表
	 * \endif
	 */
	public CFG_TIME_SECTION    	stuHolTimeSection[] = new CFG_TIME_SECTION[FinalVar.MAX_REC_TSECT];

	/**
	 * \if ENGLISH_LANG
	 *  Real-time frame drawing config number
	 * \else
	 *  实时抽帧配置个数
	 * \endif
	 */
	public int					nBackupLiveNum;

	/**
	 * \if ENGLISH_LANG
	 *  Real-time c config, EVS customization
	 * \else
	 *  实时抽帧配置
	 * \endif
	 */
	public CFG_BACKUP_LIVE_INFO					stuBackupLiveInfo[] = new CFG_BACKUP_LIVE_INFO[8];

	/**
	 * \if ENGLISH_LANG
	 *  Record video frames
	 * \else
	 *  是否录制视频帧
	 * \endif
	 */
	public boolean					bSaveVideo;
	
	public CFG_RECORD_INFO() {
		for (int i = 0; i < FinalVar.WEEK_DAY_NUM; i++) {
			for (int j = 0; j < FinalVar.MAX_REC_TSECT; j++) {
				stuTimeSection[i][j] = new CFG_TIME_SECTION();
			}
		}
		
		for (int i = 0; i < FinalVar.MAX_REC_TSECT; i++) {
			stuHolTimeSection[i] = new CFG_TIME_SECTION();
		}

		for (int i = 0; i < 8; i++) {
			stuBackupLiveInfo[i] = new CFG_BACKUP_LIVE_INFO();
		}
	}
}
