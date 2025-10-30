package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * output params of modify CourseCompositeChannelMode 
 * \else
 * 录播主机修改模式出参
 * \endif
 */
public final class NET_OUT_COURSECOMPOSITE_CHANNEL_MODE_MODIFY implements
		Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * \if ENGLISH_LANG
	 * number of modify mode
	 * \else
	 * 修改的模式个数, 和修改的模式个数相同
	 * \endif
	 */
	public int   nReturnNum = 0;
	
	/**
	 * \if ENGLISH_LANG
	 * return code: 1 success, 2 failure, 3 full, 4 resource lack
	 * \else
	 * 返回码: 1 成功, 2 失败, 3, 已满, 4 资源不足
	 * \endif
	 */
	public int[] nReturnCode = new int[FinalVar.NET_MAX_MODE_NUMBER];
	
	

}
