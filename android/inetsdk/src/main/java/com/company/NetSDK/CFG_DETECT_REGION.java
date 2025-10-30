package com.company.NetSDK;

import java.io.Serializable;

public class CFG_DETECT_REGION implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Zone ID
	 * \else
	 * 区域ID
	 * \endif
	 */
	public int				     nRegionID;

	/**
	 * \if ENGLISH_LANG
	 * Motion window name
	 * \else
	 * 动态窗口名称
	 * \endif
	 */
	public byte                 szRegionName[] = new byte[FinalVar.CFG_COMMON_STRING_64];

	/**
	 * \if ENGLISH_LANG
	 * Area threshold￡?value[0, 100]
	 * \else
	 * 面积阀值，取值[0, 100]
	 * \endif
	 */
	public int                  nThreshold;

	/**
	 * \if ENGLISH_LANG
	 * Sensitivity 1??6
	 * \else
	 * 灵敏度1～6
	 * \endif
	 */
	public int					 nSenseLevel;

	/**
	 * \if ENGLISH_LANG
	 * Motion zone row
	 * \else
	 * 动态检测区域的行数
	 * \endif
	 */
	public int					 nMotionRow;

	/**
	 * \if ENGLISH_LANG
	 * Motion detection zone column
	 * \else
	 * 动态检测区域的列数
	 * \endif
	 */
	public int					 nMotionCol;

	/**
	 * \if ENGLISH_LANG
	 * Detection zone￡?max 32*32 blocks
	 * \else
	 * 检测区域，最多32*32块区域
	 * \endif
	 */
	public byte				 byRegion[][] = new byte[FinalVar.MAX_MOTION_ROW][FinalVar.MAX_MOTION_COL];
}
