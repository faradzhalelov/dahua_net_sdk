package com.company.NetSDK;

import java.io.Serializable;

/**
* \if ENGLISH_LANG
* {@link INetSDK#GetTourSource} port  output parameter
* \else
* {@link INetSDK#GetTourSource} 接口输出参数
* \endif
*/
public class NET_OUT_GET_TOUR_SOURCE implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	 /**
	 * \if ENGLISH_LANG
	 * window tour info group, user allocation memory,the space application by the user,apply to sizeof(NET_SPLIT_TOUR_SOURCE)*nMaxWndCount
	 * \else
	 * 窗口轮巡信息数组, 用户分配内存,大小为sizeof(NET_SPLIT_TOUR_SOURCE)*nMaxWndCount
	 * \endif
	 */
    public NET_SPLIT_TOUR_SOURCE[]  pstuWndSrcs;            
    
	 /**
	 * \if ENGLISH_LANG
	 * window max group, user fill in
	 * \else
	 * 窗口最大数组, 用户填写
	 * \endif
	 */
    public int                     nMaxWndCount;           	
    
	 /**
	 * \if ENGLISH_LANG
	 * return window  quantity
	 * \else
	 * 返回的窗口数量
	 * \endif
	 */
    public int                     nRetWndCount;			
	
    public NET_OUT_GET_TOUR_SOURCE(int maxWndCount, int maxSrcCount) {
    	this.nMaxWndCount = maxWndCount;
    	pstuWndSrcs = new NET_SPLIT_TOUR_SOURCE[maxWndCount];
    	
    	for(int i = 0; i < nMaxWndCount; ++i) {
    		pstuWndSrcs[i] = new NET_SPLIT_TOUR_SOURCE(maxSrcCount);
    	}
	}           
}
