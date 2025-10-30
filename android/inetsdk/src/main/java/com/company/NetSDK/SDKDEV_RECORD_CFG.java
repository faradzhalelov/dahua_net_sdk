package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Schedule record
 * \else
 * 定时录象
 * \endif
 */
public class SDKDEV_RECORD_CFG implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Schedule
	 * \else
	 * 时间表
	 * \endif
	 */
	public SDK_TSECT            stSect[][] = new SDK_TSECT[FinalVar.SDK_N_WEEKS][FinalVar.SDK_N_REC_TSECT];
	
	/**
	 * \if ENGLISH_LANG
	 * Pre-record time. Unit is second. 0=Unable pre-record
	 * \else
	 * 预录时间，单位是s，0表示不预录
	 * \endif
	 */
	public byte                byPreRecordLen;
	
	/**
	 * \if ENGLISH_LANG
	 * Record redundancy enable/unable
	 * \else
	 * 录像冗余开关
	 * \endif
	 */
	public byte                byRedundancyEn;
	
	/**
	 * \if ENGLISH_LANG
	 * Video bit-stream type:0:Main Stream 1:Assist Stream1 2:Assist Stream2 3:Assist Stream3
	 * <table>
	 * <tr><td>Number</td><td>Record bit stream type</td></tr>
	 * <tr><td>0</td><td>Main bit stream</td></tr>
	 * <tr><td>1</td><td>Extra stream1</td></tr>
	 * <tr><td>2</td><td>Extra stream2</td></tr>
	 * <tr><td>3</td><td>Extra stream3</td></tr>
	 * </table>
	 * \else
	 * 录像码流类型：0-主码流 1-辅码流1 2-辅码流2 3-辅码流3
	 * <table>
	 * <tr><td>数值</td><td>录像码流类型</td></tr>
	 * <tr><td>0</td><td>主码流 </td></tr>
	 * <tr><td>1</td><td>辅码流1</td></tr>
	 * <tr><td>2</td><td>辅码流2</td></tr>
	 * <tr><td>3</td><td>辅码流3</td></tr>
	 * </table>
	 * \endif
	 */
	public byte                byRecordType;                      
	
	public SDKDEV_RECORD_CFG() {
		for (int i = 0; i < FinalVar.SDK_N_WEEKS; i++) {
			for (int j = 0; j < FinalVar.SDK_N_REC_TSECT; j++) {
				stSect[i][j] = new SDK_TSECT();
			}
		}
	}
}
