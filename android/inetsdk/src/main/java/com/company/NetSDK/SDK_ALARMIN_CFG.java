package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * External Alarm
 * \else
 * 外部报警
 * \endif
 */
public class SDK_ALARMIN_CFG implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Alarm Type：
	 * <table>
	 * <tr><td>0</td><td>Normal Close</td></tr>
	 * <tr><td>1</td><td>Normal Open</td></tr>
	 * </table>
	 * \else
	 * 报警器类型：
	 * <table>
	 * <tr><td>0</td><td>常闭</td></tr>
	 * <tr><td>1</td><td>常开</td></tr>
	 * </table>
	 * \endif
	 */
	public byte                byAlarmType;
	
	/**
	 * \if ENGLISH_LANG
	 * Enable
	 * \else
	 * 报警使能
	 * \endif
	 */
	public byte                byAlarmEn;
	
	/**
	 * \if ENGLISH_LANG
	 * NSP
	 * \else
	 * NSP
	 * \endif
	 */
	public SDK_TSECT            stSect[][] = new SDK_TSECT[FinalVar.SDK_N_WEEKS][FinalVar.SDK_N_REC_TSECT];
	
	/**
	 * \if ENGLISH_LANG
	 * Process Mode
	 * \else
	 * 处理方式
	 * \endif
	 */
	public SDK_MSG_HANDLE       struHandle = new SDK_MSG_HANDLE();
	
	public SDK_ALARMIN_CFG() {
		for (int i = 0; i < FinalVar.SDK_N_WEEKS; i++) {
			for (int j = 0; j < FinalVar.SDK_N_REC_TSECT; j++) {
				stSect[i][j] = new SDK_TSECT();
			}
		}
	}
}
