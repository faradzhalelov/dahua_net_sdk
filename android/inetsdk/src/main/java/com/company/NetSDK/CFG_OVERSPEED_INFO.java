package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Over speed proportion code
 * \else
 * 超速比例代码
 * \endif
 */
public class CFG_OVERSPEED_INFO implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Percentage, these percentages not allow cross, >=0 and -1, -1 means infinite
	 * \else
	 * 超速百分比区间要求区间不能重叠。有效值为0,正数,-1，-1表示无穷大值;如果是欠速：要求区间不能重叠。有效值为0,正数,-1，-1表示无穷大值，欠速百分比的计算方式：限低速-实际车速/限低速
	 * \endif
	 */
	public int[]                      nSpeedingPercentage = new int[2];                       

	/**
	 * \if ENGLISH_LANG
	 * Violation code
	 * \else
	 * 代码
	 * \endif
	 */
	public byte[]                     szCode = new byte[FinalVar.MAX_VIOLATIONCODE];                    
	
	/**
	 * \if ENGLISH_LANG
	 * Violation description
	 * \else
	 * 描述
	 * \endif
	 */
	public byte[]                     szDescription = new byte[FinalVar.MAX_VIOLATIONCODE_DESCRIPT];    
}
