package com.company.NetSDK;

import java.io.Serializable;

/**
* \if ENGLISH_LANG
* {@link INetSDK#GetTourSource} port input parameter
* \else
* {@link INetSDK#GetTourSource} 接口输入参数
* \endif
*/
public class NET_IN_GET_TOUR_SOURCE implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	 /**
	 * \if ENGLISH_LANG
	 * output channel no., pszCompsiteIDis NULL, it is valid 
	 * \else
	 * 输出通道号, pszCompsiteID为NULL时有效
	 * \endif
	 */
    public int                     nChannel;               
    
	 /**
	 * \if ENGLISH_LANG
	 * splicing video wall ID
	 * \else
	 * 拼接屏ID
	 * \endif
	 */
    public String             	   pszCompositeID;        
    
	 /**
	 * \if ENGLISH_LANG
	 * window no., -1 means all window
	 * \else
	 * 窗口号, -1表示所有窗口
	 * \endif
	 */
    public int                     nWindow;                
}
