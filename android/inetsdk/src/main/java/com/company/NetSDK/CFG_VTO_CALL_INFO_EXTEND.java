package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * VTO call info extend, the corresponding interface {@link INetSDK#GetNewDevConfig} and {@link INetSDK#SetNewDevConfig},the corresponding command {@link FinalVar#CFD_CMD_VTO_CALL_INFO_EXTEND}
 * \else
 * VTO呼叫配置扩展信息, 对应接口 {@link INetSDK#GetNewDevConfig} 和 {@link INetSDK#SetNewDevConfig},对应命令 {@link FinalVar#CFD_CMD_VTO_CALL_INFO_EXTEND}
 * \endif
 */
public class CFG_VTO_CALL_INFO_EXTEND implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * \if ENGLISH_LANG
	 * Main VTO IP
	 * \else
	 * 主门口机IP
	 * \endif
	 */
	public byte[]                            szMainVTOIP = new byte[FinalVar.MAX_ADDRESS_LEN];              
	
	/**
	 * \if ENGLISH_LANG
	 * Group call enable
	 * \else
	 * 群呼开关
	 * \endif
	 */
	public boolean                           bGroupCallEnable;                          
	
	/**
	 * \if ENGLISH_LANG
	 * Manager number
	 * \else
	 * 管理机号码
	 * \endif
	 */
	public byte[]                            szManagerNumber = new byte[FinalVar.MAX_PHONE_NUMBER_LEN];     
	
	/**
	 * \if ENGLISH_LANG
	 * Urgent number
	 * \else
	 * 紧急呼叫号码
	 * \endif
	 */
	public byte[]                            szUrgentNumber = new byte[FinalVar.MAX_PHONE_NUMBER_LEN];      
	
	/**
	 * \if ENGLISH_LANG
	 * VTS call Time Section 
	 * \else
	 * 呼叫VTS时间段 
	 * \endif
	 */
	public CFG_TIME_SECTION                  stuTimeSection = new CFG_TIME_SECTION();                            
	
	/**
	 * \if ENGLISH_LANG
	 * Max extension index number
	 * \else
	 * 门口机上可以设置的最大室内机分机序号 序号从1开始
	 * \endif
	 */
	public int                    			 nMaxExtensionIndex;                        
    
	/**
	 * \if ENGLISH_LANG
	 * Room rule, refer to {@link EM_CFG_ROOM_RULE}
	 * \else
	 * 门口机支持连续房间号呼叫和非连续房间号呼叫2套规则, 取值参考 {@link EM_CFG_ROOM_RULE}
	 * \endif
	 */
	public int				                 emRoomRule;                                
}
