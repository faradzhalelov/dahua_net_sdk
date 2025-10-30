package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * array, the corresponding interface {@link INetSDK#GetNewDevConfig} and {@link INetSDK#SetNewDevConfig},the corresponding command {@link FinalVar#CFG_CMD_SPLICESCREEN}
 * \else
 * 数组, 对应接口 {@link INetSDK#GetNewDevConfig} 和 {@link INetSDK#SetNewDevConfig},对应命令 {@link FinalVar#CFG_CMD_SPLICESCREEN}
 * \endif
 */
public class AV_CFG_SpliceScreen implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	
	/**
	 * \if ENGLISH_LANG
	 * Splice screen name
	 * \else
	 * 拼接屏名称
	 * \endif
	 */
	public byte[]  	    szName = new byte[FinalVar.AV_CFG_Channel_Name_Len];	
	
	/**
	 * \if ENGLISH_LANG
	 * Monitor wall name
	 * \else
	 * 所属电视墙名称
	 * \endif
	 */
	public byte[]       szWallName = new byte[FinalVar.AV_CFG_Monitor_Name_Len];
	
	/**
	 * \if ENGLISH_LANG
	 * Zone number
	 * \else
	 * 所属区域序号
	 * \endif
	 */
	public int			nBlockID;			
	
	/**
	 * \if ENGLISH_LANG
	 * Zone axis
	 * \else
	 * 区域坐标(0~8191)
	 * \endif
	 */
	public AV_CFG_Rect	stuRect = new AV_CFG_Rect();							// 区域坐标(0~8191)
}
