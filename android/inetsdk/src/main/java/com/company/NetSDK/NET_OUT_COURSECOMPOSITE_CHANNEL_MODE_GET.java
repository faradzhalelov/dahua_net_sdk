package com.company.NetSDK;
import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * output params of get CourseCompositeChannelMode 
 * \else
 * 录播主机获取模式出参
 * \endif
 */
public final class NET_OUT_COURSECOMPOSITE_CHANNEL_MODE_GET implements
		Serializable {
	private static final long serialVersionUID = 1L;
	
	/**
	 * \if ENGLISH_LANG
	 * actual number of get mode
	 * \else
	 * 实际获取的模式个数
	 * \endif
	 */
	public int   nReturnNum = 0;
	
	/**
	 * \if ENGLISH_LANG
	 *  sequence number of mode 
	 * \else
	 * 模式编号
	 * \endif
	 */
	public int[] nMode = new int[FinalVar.NET_MAX_MODE_NUMBER];
	
	/**
	 * \if ENGLISH_LANG
	 * mode information
	 * \else
	 * 模式信息
	 * \endif
	 */
	public NET_COMPOSITECHANNELMODE_INFO[] stModeInfo = new NET_COMPOSITECHANNELMODE_INFO[FinalVar.NET_MAX_MODE_NUMBER];
	
	
	
	public NET_OUT_COURSECOMPOSITE_CHANNEL_MODE_GET(){
		for(int i=0;i<FinalVar.NET_MAX_MODE_NUMBER;i++){
			stModeInfo[i] = new NET_COMPOSITECHANNELMODE_INFO();
		}
	}
	
}
