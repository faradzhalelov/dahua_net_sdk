package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * input params of add CourseCompositeChannelMode
 * \else
 * 录播主机增加模式入参
 * \endif
 */
public final class NET_IN_COURSECOMPOSITE_CHANNEL_MODE_ADD implements
		Serializable {
	/**
	 * \if ENGLISH_LANG
	 *  input params of add CourseCompositeChannelMode
	 * \else
	 * 录播主机添加模式入参
	 * \endif
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 *  number of add mode
	 * \else
	 * 要添加的模式数目
	 * \endif
	 */
	public int  nCount = 0;
	
	/**
	 * \if ENGLISH_LANG
	 *  mode info
	 * \else
	 * 模式信息
	 * \endif
	 */
	public NET_COMPOSITECHANNELMODE_INFO[] stModeInfo = new NET_COMPOSITECHANNELMODE_INFO[FinalVar.NET_MAX_MODE_NUMBER];
	
	public NET_IN_COURSECOMPOSITE_CHANNEL_MODE_ADD(){
		for(int i=0;i<stModeInfo.length;i++){
			stModeInfo[i] = new NET_COMPOSITECHANNELMODE_INFO();
		}
	}
	

}
