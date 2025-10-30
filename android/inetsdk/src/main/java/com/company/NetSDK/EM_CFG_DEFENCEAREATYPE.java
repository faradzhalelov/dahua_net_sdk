package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * DefenceArea Type
 * \else
 * 防区类型
 * \endif
 */
public class EM_CFG_DEFENCEAREATYPE implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Unkown
	 * \else
	 * 未知
	 * \endif
	 */
	public final static int EM_CFG_DefenceAreaType_Unknown = 0;
	
	/**
	 * \if ENGLISH_LANG
	 * instant zone
	 * \else
	 * 即时防区 
	 * \endif
	 */
	public final static int EM_CFG_DefenceAreaType_InTime = 1;
	
	/**
	 * \if ENGLISH_LANG
	 * delay zone
	 * \else
	 * 延时防区
	 * \endif
	 */
	public final static int EM_CFG_DefenceAreaType_Delay = 2;
	
	/**
	 * \if ENGLISH_LANG
	 * 24-hour zone
	 * \else
	 * 24小时防区
	 * \endif
	 */
	public final static int EM_CFG_DefenceAreaType_FullDay = 3;
	
	/**
	 * \if ENGLISH_LANG
	 * Fllow zone
	 * \else
	 * 跟随防区
	 * \endif
	 */
	public final static int EM_CFG_DefenceAreaType_Follow = 4;
	
	/**
	 * \if ENGLISH_LANG
	 * medical zone
	 * \else
	 * 医疗防区
	 * \endif
	 */
	public final static int EM_CFG_DefenceAreaType_Medical = 5;
	
	/**
	 * \if ENGLISH_LANG
	 * panic zone
	 * \else
	 * 恐慌防区
	 * \endif
	 */
	public final static int EM_CFG_DefenceAreaType_Panic = 6;

	/**
	 * \if ENGLISH_LANG
	 * Fire zone
	 * \else
	 * 火警防区
	 * \endif
	 */
	public final static int EM_CFG_DefenceAreaType_Fire = 7;
	
	/**
	 * \if ENGLISH_LANG
	 * 24-hour sound zone
	 * \else
	 * 24小时有声防区
	 * \endif
	 */
	public final static int EM_CFG_DefenceAreaType_FullDaySound = 8;
	
	/**
	 * \if ENGLISH_LANG
	 * 24-hour mute zone
	 * \else
	 * 24小时无声防区
	 * \endif
	 */
	public final static int EM_CFG_DefenceAreaType_FullDaySlient = 9;
	
	/**
	 * \if ENGLISH_LANG
	 * enter zone 1
	 * \else
	 * 出入防区1
	 * \endif
	 */
	public final static int EM_CFG_DefenceAreaType_Entrance1 = 10;
	
	/**
	 * \if ENGLISH_LANG
	 * enter zone 2
	 * \else
	 * 出入防区2
	 * \endif
	 */
	public final static int EM_CFG_DefenceAreaType_Entrance2 = 11;
	
	/**
	 * \if ENGLISH_LANG
	 * internal zone
	 * \else
	 * 内部防区
	 * \endif
	 */
	public final static int EM_CFG_DefenceAreaType_InSide = 12;
	
	/**
	 * \if ENGLISH_LANG
	 * external zone
	 * \else
	 * 外部防区
	 * \endif
	 */
	public final static int EM_CFG_DefenceAreaType_OutSide = 13;
	
	/**
	 * \if ENGLISH_LANG
	 * people detect zone
	 * \else
	 * 人员检测防区
	 * \endif
	 */
	public final static int EM_CFG_DefenceAreaType_PeopleDetect = 14;

	/**
	 * \if ENGLISH_LANG
	 * 枚举类型总数
	 * \else
	 * 人员检测防区
	 * \endif
	 */
	public final static int EM_CFG_DefenceAreaType_Num = 15;
}
