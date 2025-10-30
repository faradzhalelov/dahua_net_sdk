package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Zone Status Info Input Parameter
 * \else
 * 防区状态信息的输入参数
 * \endif
 */
public class NET_IN_DEFENCE_STATE_INFO implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Zone valid number, -1means search all zones
	 * \else
	 * 防区有效个数, -1表示查询所有防区
	 * \endif
	 */
	public int             nDefenceNum;
	
	/**
	 * \if ENGLISH_LANG
	 * Zone number to search
	 * \else
	 * 待查询的防区号
	 * \endif
	 */
	public int             anDefence[] = new int[FinalVar.SDK_MAX_ALARMIN]; 
}
