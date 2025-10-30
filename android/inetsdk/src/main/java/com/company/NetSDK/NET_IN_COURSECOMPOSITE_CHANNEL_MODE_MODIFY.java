package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * input params of modify CourseCompositeChannelMode
 * \else
 * 录播主机修改模式入参
 * \endif
 */
public final class NET_IN_COURSECOMPOSITE_CHANNEL_MODE_MODIFY implements
		Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * \if ENGLISH_LANG
	 * number of modify mode
	 * \else
	 * 修改的模式个数
	 * \endif
	 */
	public int  nModeNum = 0;
	/**
	 * \if ENGLISH_LANG
	 * sequence number of mode 
	 * \else
	 * 模式编号
	 * \endif
	 */
	public int[] nMode = new int[FinalVar.NET_MAX_MODE_NUMBER];
	
	/**
	 * \if ENGLISH_LANG
	 * mode info
	 * \else
	 * 模式信息
	 * \endif
	 */
	public NET_COMPOSITECHANNELMODE_INFO[] stModeInfo = new NET_COMPOSITECHANNELMODE_INFO[FinalVar.NET_MAX_MODE_NUMBER];
	
	public NET_IN_COURSECOMPOSITE_CHANNEL_MODE_MODIFY(){
		for(int i=0;i<FinalVar.NET_MAX_MODE_NUMBER;i++){
			nMode[i] = 0;
			stModeInfo[i] = new NET_COMPOSITECHANNELMODE_INFO();
		}
	}

}
