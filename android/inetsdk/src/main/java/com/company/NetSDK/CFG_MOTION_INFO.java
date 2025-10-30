package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Dynamic Monitoring alarm linkage configuration, the corresponding interface {@link INetSDK#GetNewDevConfig} and {@link INetSDK#SetNewDevConfig},the corresponding command {@link FinalVar#CFG_CMD_MOTIONDETECT}
 * \else
 * 动态检测报警配置, 对应接口 {@link INetSDK#GetNewDevConfig} 和 {@link INetSDK#SetNewDevConfig},对应命令 {@link FinalVar#CFG_CMD_MOTIONDETECT}
 * \endif
 */
public class CFG_MOTION_INFO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Alarm channel number(from 0) 
	 * \else
	 * 报警通道号(0开始), nVersion=1时，此字段无效
	 * \endif
	 */
	public int					 nChannelID;									

	/**
	 * \if ENGLISH_LANG
	 * Enable 
	 * \else
	 * 使能开关
	 * \endif
	 */
	public boolean				 bEnable;									    

	/**
	 * \if ENGLISH_LANG
	 * SenseLevel1~6，min:1 max:6
	 * \else
	 * 灵敏度1～6
	 * \endif
	 */
	public int					 nSenseLevel;								    

	/**
	 * \if ENGLISH_LANG
	 * The number of rows of the dynamic detection area 
	 * \else
	 * 动态检测区域的行数
	 * \endif
	 */
	public int					 nMotionRow;									

	/**
	 * \if ENGLISH_LANG
	 * The number of lines of the dynamic detection area 
	 * \else
	 * 动态检测区域的列数
	 * \endif
	 */
	public int					 nMotionCol;									

	/**
	 * \if ENGLISH_LANG
	 * Detection area，max: 32*32 areas 
	 * \else
	 * 检测区域，最多32*32块区域
	 * \endif
	 */
	public byte				 	byRegion[][] = new byte[FinalVar.MAX_MOTION_ROW][FinalVar.MAX_MOTION_COL];	    

	/**
	 * \if ENGLISH_LANG
	 * Alarm linkage 
	 * \else
	 * 报警联动
	 * \endif
	 */
	public CFG_ALARM_MSG_HANDLE stuEventHandler = new CFG_ALARM_MSG_HANDLE();							    

	/**
	 * \if ENGLISH_LANG
	 * Incident response period 
	 * \else
	 * 事件响应时间段
	 * \endif
	 */
	public CFG_TIME_SECTION	 	stuTimeSection[][] = new CFG_TIME_SECTION[FinalVar.WEEK_DAY_NUM][FinalVar.MAX_REC_TSECT];   

	/**
	 * \if ENGLISH_LANG
	 * 0, 1, depends on capacity set, read only, when equat to 1 and lower to be valid 
	 * \else
	 * 0, 1, 由能力集确定, 只读, 等于1时以下字段有效
	 * \endif
	 */
	public int			         nVersion;                                      

	/**
	 * \if ENGLISH_LANG
	 * real only，depends on nSenseLevel valid or not 
	 * \else
	 * 只读，决定nSenseLevel是否有效
	 * \endif
	 */
	public boolean                 bSenseLevelEn;                                 

	/**
	 * \if ENGLISH_LANG
	 * real only，area occupy enable， depends on nVolumeRatio valid or not 
	 * \else
	 * 只读，面积占用比使能， 决定nVolumeRatio是否有效
	 * \endif
	 */
	public boolean                 bVRatioEn;                                     

	/**
	 * \if ENGLISH_LANG
	 * area occupy ratio,1-100
	 * \else
	 * 面积占用比,1-100
	 * \endif
	 */
	public int                  nVolumeRatio;                                  

	/**
	 * \if ENGLISH_LANG
	 * real only，sensitivity enable，depends on nSubRatio valid or not 
	 * \else
	 * 只读，灵敏度使能，决定nSubRatio值是否有效
	 * \endif
	 */
	public boolean                 bSRatioEn;                                     

	/**
	 * \if ENGLISH_LANG
	 * motion detect difference threshold, 1-100 
	 * \else
	 * 动检的残差阈值, 1-100
	 * \endif
	 */
	public int                  nSubRatio;                                     

	/**
	 * \if ENGLISH_LANG
	 * real only，0: nMotionRow, nMotionCol and byRegion text valid, 1: window text
	 * \else
	 * 只读，0: nMotionRow, nMotionCol和byRegion字段有效, 1: 下面视频窗口字段 
	 * \endif
	 */
	public boolean                 abWindow;                                      

	/**
	 * \if ENGLISH_LANG
	 * video window 
	 * \else
	 * 视频窗口个数
	 * \endif
	 */
	public int                  nWindowCount;                                  

	/**
	 * \if ENGLISH_LANG
	 * video window group 
	 * \else
	 * 视频窗口数组
	 * \endif
	 */
	public CFG_MOTION_WINDOW    stuWindows[] = new CFG_MOTION_WINDOW[FinalVar.MAX_MOTION_WINDOW];
	
	/**
	 * \if ENGLISH_LANG
	 * Read only: 1, onRegionCount, stuRegion valid
	 * 0, onMotionRow, nMotionCol, byRegion valid
	 * \else
	 * 只读，1：nRegionCount，stuRegion有效
	 * 0：nMotionRow，nMotionCol，byRegion有效
	 * \endif
	 */
	public boolean                 abDetectRegion;
	
	/**
	 * \if ENGLISH_LANG
	 * 3rd generation motion detection zone quantity
	 * \else
	 * 三代动态检测区域个数
	 * \endif
	 */
	public int                  nRegionCount; 
	
	/**
	 * \if ENGLISH_LANG
	 * 3rd generation motion detection zone
	 * \else
	 * 三代动态检测区域
	 * \endif
	 */
	public CFG_DETECT_REGION    stuRegion[] = new CFG_DETECT_REGION[FinalVar.MAX_MOTION_WINDOW];

	/**
	 * \if ENGLISH_LANG
	 *  Remote alarm activation
	 * \else
	 *  前端动态检测联动
	 * \endif
	 */
	public CFG_ALARM_MSG_HANDLE					stuRemoteEventHandler = new CFG_ALARM_MSG_HANDLE();

	/**
	 * \if ENGLISH_LANG
	 *  Remote event responding period, if you want set and get time, take this as the standard; ignore the "stuTimeSection" filed in stuRemoteEventHandler
	 * \else
	 *  前端动态检测联动, 事件响应时间段，时间段获取和设置以此成员为准，忽略 stuRemoteEventHandler 中的 stuTimeSection
	 * \endif
	 */
	public CFG_TIME_SECTION					stuRemoteTimeSection[][] = new CFG_TIME_SECTION[FinalVar.WEEK_DAY_NUM][FinalVar.MAX_REC_TSECT];

	public CFG_MOTION_INFO() {
		for (int i = 0; i < FinalVar.WEEK_DAY_NUM; i++) {
			for (int j = 0; j < FinalVar.MAX_REC_TSECT; j++) {
				stuTimeSection[i][j] = new CFG_TIME_SECTION();
			}
		}
		
		for (int i = 0; i < FinalVar.MAX_MOTION_WINDOW; i++) {
			stuWindows[i] = new CFG_MOTION_WINDOW();
			stuRegion[i] = new CFG_DETECT_REGION();
		}
		for(int i = 0; i < FinalVar.WEEK_DAY_NUM; i ++){
			for(int j = 0; j < FinalVar.MAX_REC_TSECT; j ++){
				this.stuRemoteTimeSection[i][j] = new CFG_TIME_SECTION();
			}
		}
	}
}
