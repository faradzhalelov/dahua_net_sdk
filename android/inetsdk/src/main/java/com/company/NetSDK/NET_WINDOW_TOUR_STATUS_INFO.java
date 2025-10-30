package com.company.NetSDK;

import java.io.Serializable;

/**
* \if ENGLISH_LANG
* window tour status info 
* \else
* 窗口轮巡状态信息
* \endif
*/
public class NET_WINDOW_TOUR_STATUS_INFO implements Serializable {
	
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	 /**
	 * \if ENGLISH_LANG
	 * window no.
	 * \else
	 * 窗口号
	 * \endif
	 */
	public int                 nWindow;                        
	
	 /**
	 * \if ENGLISH_LANG
	 * status, refer to {@link NET_TOUR_STATUS}
	 * \else
	 * 状态 ,取值参考 {@link NET_TOUR_STATUS}
	 * \endif
	 */
	public int			       emStatus;                       
}
