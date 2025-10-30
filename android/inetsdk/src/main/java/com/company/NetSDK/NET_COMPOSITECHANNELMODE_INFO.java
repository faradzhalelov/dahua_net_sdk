package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * CourseCompositeChannelMode info
 * \else
 * 录播主机模式信息
 * \endif
 */
public final class NET_COMPOSITECHANNELMODE_INFO implements Serializable {

	private static final long serialVersionUID = 1L;
	
	/**
	 * \if ENGLISH_LANG
	 * mode name
	 * \else
	 * 模式名称
	 * \endif
	 */
	public byte[] szName = new byte[FinalVar.SDK_COMMON_STRING_128];
	
	/**
	 * \if ENGLISH_LANG
	 * actual number of windows
	 * \else
	 * 实际窗口个数
	 * \endif
	 */
	public int nWindowNum = 0;
	
	/**
	 * \if ENGLISH_LANG
	 * windows info
	 * \else
	 * 窗口信息
	 * \endif
	 */
	public NET_COMPOSITECHANNELMODE_WINDOWS[] stWindows = 
			new NET_COMPOSITECHANNELMODE_WINDOWS[FinalVar.NET_MAX_WINDOWS_NUMBER];
	
	
	
	public NET_COMPOSITECHANNELMODE_INFO(){
		for(int i=0;i<FinalVar.SDK_COMMON_STRING_128;i++){
			if(i>=FinalVar.NET_MAX_WINDOWS_NUMBER){
				szName[i] = 0;
			}else{
				stWindows[i] = new NET_COMPOSITECHANNELMODE_WINDOWS();
			}
		}
	}
	
	

}
