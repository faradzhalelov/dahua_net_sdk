package com.company.NetSDK;

import java.io.Serializable;

public final class NET_OUT_COURSECOMPOSITE_CHANNEL_MODE_ADD implements
		Serializable {

	/**
	 * \if ENGLISH_LANG
	 * output params of add CourseCompositeChannelMode
	 * \else
	 * 录播主机添加模式出参
	 * \endif
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * \if ENGLISH_LANG
	 * actual number of result
	 * \else
	 * 实际返回个数
	 * \endif
	 */
	public int   nCount = 0;
	
	/**
	 * \if ENGLISH_LANG
	 * return results
	 * \else
	 * 返回数组
	 * \endif
	 */
	public NET_COURSECOMPOSITE_CHANNEL_MODE_ADD_RESULT[] stResult =
			new NET_COURSECOMPOSITE_CHANNEL_MODE_ADD_RESULT[FinalVar.NET_MAX_MODE_NUMBER];
	
	
	public NET_OUT_COURSECOMPOSITE_CHANNEL_MODE_ADD(){
		for(int i=0;i<FinalVar.NET_MAX_MODE_NUMBER;i++){
			stResult[i] = new NET_COURSECOMPOSITE_CHANNEL_MODE_ADD_RESULT();
		}
	}
	
}
