package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * output params of delete CourseCompositeChannelMode 
 * \else
 * 录播主机删除模式出参
 * \endif
 */
public final class NET_OUT_COURSECOMPOSITE_CHANNEL_MODE_DELETE implements
		Serializable {
	
	private static final long serialVersionUID = 1L;
	
	/**
	 * \if ENGLISH_LANG
	 * number of delete mode
	 * \else
	 * 删除的模式个数
	 * \endif
	 */
	public int  nReturnNum;
	
	/**
	 * \if ENGLISH_LANG
	 *  return code: 1 success, 2 failure
	 * \else
	 * 返回码: 1 成功, 2 失败
	 * \endif
	 */
	public int[] nReturnCode = new int[FinalVar.NET_MAX_MODE_NUMBER];

}
