package com.company.NetSDK;

import java.io.Serializable;

/**
* \if ENGLISH_LANG
* Get window corridor mode input parameter, corresponding to command {@link NET_SPLIT_OPERATE_TYPE#NET_WM_OPERATE_GET_CORRIDOR_MODE}
* \else
* 获取窗口走廊模式输入参数，对应命令 {@link NET_SPLIT_OPERATE_TYPE#NET_WM_OPERATE_GET_CORRIDOR_MODE}
* \endif
*/
public class NET_IN_WM_GET_CORRIDOR_MODE implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	 /**
	 * \if ENGLISH_LANG
	 * Output channel index or the virtual channel index of multi-screen display, it is valid when pszCompositeID =NULL
	 * \else
	 * 输出通道号或融合屏虚拟通道号, pszCompositeID为NULL时有效
	 * \endif
	 */
	public int 				  nChannel;			
	
	 /**
	 * \if ENGLISH_LANG
	 * Multi-screen display ID
	 * \else
	 * 融合屏ID
	 * \endif
	 */
	public String 		  	  pszCompositeID;	
	
	 /**
	 * \if ENGLISH_LANG
	 * window ID
	 * \else
	 * 窗口号
	 * \endif
	 */
	public int 				  nWindow;		
}
