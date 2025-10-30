package com.company.NetSDK;

import java.io.Serializable;

/**
* \if ENGLISH_LANG
* batch window output parameter, corresponding to {@link NET_SPLIT_OPERATE_TYPE#NET_SPLIT_OPERATE_OPEN_WINDOWS}
* \else
* 批量开窗输出参数, 对应 {@link NET_SPLIT_OPERATE_TYPE#NET_SPLIT_OPERATE_OPEN_WINDOWS}
* \endif
*/
public class NET_OUT_SPLIT_OPEN_WINDOWS implements Serializable {
	private static final long serialVersionUID = 1L;
	
	 /**
	 * \if ENGLISH_LANG
	 * window info , user allocation memory, apply to sizeof(NET_SPLIT_WINDOW_INFO)*nMaxWindowCount
	 * \else
	 * 窗口信息, 用户分配内存,大小为sizeof(NET_SPLIT_WINDOW_INFO)*nMaxWindowCount
	 * \endif
	 */
    public NET_SPLIT_WINDOW_INFO[]  pstuWindows;                

	 /**
	 * \if ENGLISH_LANG
	 * window info max quantity, user input
	 * \else
	 * 窗口信息最大数量, 用户输入
	 * \endif
	 */
	public int                 nMaxWindowCount;                
	
	 /**
	 * \if ENGLISH_LANG
	 * window quantity
	 * \else
	 * 开窗数量
	 * \endif
	 */
    public int                 nRetWindowCount;                
    
    public NET_OUT_SPLIT_OPEN_WINDOWS(int maxWindowCount) {
    	this.nMaxWindowCount = maxWindowCount;
    	pstuWindows = new  NET_SPLIT_WINDOW_INFO[maxWindowCount];
    	for (int i = 0; i < maxWindowCount; ++i ) {
    		pstuWindows[i] = new  NET_SPLIT_WINDOW_INFO();
    	}
    }
}
