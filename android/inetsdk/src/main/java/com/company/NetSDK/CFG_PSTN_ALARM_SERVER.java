package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Telephone Alarm Center Linkage Information
 * \else
 * 电话报警中心联动信息
 * \endif
 */
public class CFG_PSTN_ALARM_SERVER implements Serializable {
	private static final long serialVersionUID = 1L;
	
	/**
	 * \if ENGLISH_LANG
	 *  Whether to Report to the Call Center
	 * \else
	 * 是否上报至电话报警中心	
	 * \endif
	 */
	public boolean				bNeedReport; 
	
	/**
	 * \if ENGLISH_LANG
	 *  The Number of Telephone Alarm Server
	 * \else
	 * 电话报警服务器个数	
	 * \endif
	 */
	public int					nServerCount;				
	
	/**
	 * \if ENGLISH_LANG
	 * Report to the Alarm Center Subscript, refer to {@link CFG_PSTN_ALARM_CENTER_INFO}
	 * \else
	 * 上报的报警中心下标, 取值参考 {@link CFG_PSTN_ALARM_CENTER_INFO}
	 * \endif
	 */
	public byte[] 				byDestination = new byte[FinalVar.MAX_PSTN_SERVER_NUM]; 
}
