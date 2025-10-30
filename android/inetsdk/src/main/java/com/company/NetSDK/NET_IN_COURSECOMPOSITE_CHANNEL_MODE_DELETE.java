package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * input params of delete CourseCompositeChannelMode
 * \else
 * 录播主机删除模式入参
 * \endif
 */
public final class NET_IN_COURSECOMPOSITE_CHANNEL_MODE_DELETE implements
		Serializable {
	private static final long serialVersionUID = 1L;
	
	/**
	 * \if ENGLISH_LANG
	 *  number of delete mode
	 * \else
	 * 删除的模式个数
	 * \endif
	 */
	public int    nModeNum = 0;
	/**
	 * \if ENGLISH_LANG
	 * sequence number of mode
	 * \else
	 * 删除的模式编号
	 * \endif
	 */
	public int[]    nMode = new int[FinalVar.NET_MAX_MODE_NUMBER];

}
