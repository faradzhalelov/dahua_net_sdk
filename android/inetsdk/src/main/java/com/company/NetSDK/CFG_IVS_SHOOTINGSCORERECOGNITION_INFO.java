package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * event type  {@link FinalVar#EVENT_IVS_SHOOTINGSCORERECOGNITION} (shooting score recognition), corresponding to rule config
 * \else
 *  事件类型 {@link FinalVar#EVENT_IVS_SHOOTINGSCORERECOGNITION} 打靶像机事件, 对应规则配置
 * \endif
 */
public class CFG_IVS_SHOOTINGSCORERECOGNITION_INFO implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * \if ENGLISH_LANG
	 * Rule name, different rules cannot have same name
	 * \else
	 * 规则名称,不同规则不能重名
	 * \endif
	 */
	public byte[]					szRuleName = new byte[FinalVar.MAX_NAME_LEN];								
	
	/**
	 * \if ENGLISH_LANG
	 * rule enable
	 * \else
	 * 规则使能
	 * \endif
	 */
	public boolean					bRuleEnable;											

	/**
	 * \if ENGLISH_LANG
	 * corresponding object type number
	 * \else
	 * 相应物体类型个数
	 * \endif
	 */
	public int						nObjectTypeNum;											
	
	/**
	 * \if ENGLISH_LANG
	 * corresponding object type list
	 * \else
	 * 相应物体类型列表
	 * \endif
	 */
	public byte[][]					szObjectTypes = new byte[FinalVar.MAX_OBJECT_LIST_SIZE][FinalVar.MAX_NAME_LEN];		
	
	/**
	 * \if ENGLISH_LANG
	 * PTZ preset no. 0~65535
	 * \else
	 * 云台预置点编号:0~65535
	 * \endif
	 */
	public int                  	nPtzPresetId;											
	
	/**
	 * \if ENGLISH_LANG
	 * alarm link
	 * \else
	 * 报警联动
	 * \endif
	 */
	public CFG_ALARM_MSG_HANDLE 	stuEventHandler = new CFG_ALARM_MSG_HANDLE();										
	
	/**
	 * \if ENGLISH_LANG
	 * event response period
	 * \else
	 * 事件响应时间段
	 * \endif
	 */
	public CFG_TIME_SECTION[][]		stuTimeSection = new CFG_TIME_SECTION[FinalVar.WEEK_DAY_NUM][FinalVar.MAX_REC_TSECT_EX];			

	/**
	 * \if ENGLISH_LANG
	 * detect region
	 * \else
	 * 检测区域	参见警戒区配置DetectRegion,警戒区事件{@link FinalVar#EVENT_IVS_CROSSREGIONDETECTION}
	 * \endif
	 */
	public CFG_REGION				stuDetectRegion = new CFG_REGION();										
	
	/**
	 * \if ENGLISH_LANG
	 * the begin sequence of bullet holes.
	 * \else
	 * 计数周期加1后弹孔序号重新从1开始计数
	 * \endif
	 */
	public int						nRound;													
	
	/**
	 * \if ENGLISH_LANG
	 * Sensitivity value
	 * \else
	 * 灵敏度
	 * \endif
	 */
	public int						nSensitivity;		
	
	/**
	 * \if ENGLISH_LANG
	 * bullet caliber，0:5mm caliber, 1:7~8mm caliber, 2:9mm caliber
	 * \else
	 * 弹孔口径，0:5mm口径, 1:7~8mm口径, 2:9mm口径
	 * \endif
	 */
	public int 					    nCaliber;	
	
	public CFG_IVS_SHOOTINGSCORERECOGNITION_INFO() {
		for(int i = 0; i < FinalVar.WEEK_DAY_NUM; i++) {
			for(int j = 0; j < FinalVar.MAX_REC_TSECT_EX; j++) {
				stuTimeSection[i][j] = new CFG_TIME_SECTION();
			}
		}
	}
}
