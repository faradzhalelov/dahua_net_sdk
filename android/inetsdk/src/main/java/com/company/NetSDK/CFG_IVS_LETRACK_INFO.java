package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * the common of the tule
 * \else
 * 规则通用信息
 * \endif
 */
public class CFG_IVS_LETRACK_INFO implements Serializable {
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
	public byte[]				szRuleName = new byte[FinalVar.MAX_NAME_LEN];							
	
	/**
	 * \if ENGLISH_LANG
	 * rule enable
	 * \else
	 * 规则使能
	 * \endif
	 */	
	public boolean				bRuleEnable;											
	
	/**
	 * \if ENGLISH_LANG
	 * corresponding object type number
	 * \else
	 * 相应物体类型个数
	 * \endif
	 */	
	public int					nObjectTypeNum;										
	
	/**
	 * \if ENGLISH_LANG
	 * corresponding object type list
	 * \else
	 * 相应物体类型列表
	 * \endif
	 */	
	public byte[][]				szObjectTypes = new byte[FinalVar.MAX_OBJECT_LIST_SIZE][FinalVar.MAX_NAME_LEN];		
	
	/**
	 * \if ENGLISH_LANG
	 * PTZ preset no. 0~65535
	 * \else
	 * 云台预置点编号,0~65535
	 * \endif
	 */	
	public int                 nPtzPresetId;										
	
	/**
	 * \if ENGLISH_LANG
	 * alarm link
	 * \else
	 * 报警联动
	 * \endif
	 */	
	public CFG_ALARM_MSG_HANDLE stuEventHandler = new CFG_ALARM_MSG_HANDLE();										
	
	/**
	 * \if ENGLISH_LANG
	 * event response period
	 * \else
	 * 事件响应时间段
	 * \endif
	 */	
	public CFG_TIME_SECTION[][]	stuTimeSection = new CFG_TIME_SECTION[FinalVar.WEEK_DAY_NUM][FinalVar.MAX_REC_TSECT_EX];	
	
	public CFG_IVS_LETRACK_INFO() {
		for(int i = 0; i < FinalVar.WEEK_DAY_NUM; i++) {		
			for(int j = 0; j < FinalVar.MAX_REC_TSECT_EX; j++) {
				stuTimeSection[i][j] = new CFG_TIME_SECTION();
			}
		}
	}
	
}
