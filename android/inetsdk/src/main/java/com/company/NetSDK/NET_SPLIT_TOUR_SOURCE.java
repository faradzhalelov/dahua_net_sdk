package com.company.NetSDK;

import java.io.Serializable;

/**
* \if ENGLISH_LANG
* window tour display source info 
* \else
* 窗口轮巡显示源信息
* \endif
*/
public class NET_SPLIT_TOUR_SOURCE implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	 /**
	 * \if ENGLISH_LANG
	 * display source group, user allocation memory,apply to sizeof(SDK_SPLIT_SOURCE)*nMaxSrcCount
	 * \else
	 * 显示源数组, 用户分配内存,大小为sizeof(SDK_SPLIT_SOURCE)*nMaxSrcCount
	 * \endif
	 */
    public SDK_SPLIT_SOURCE[]        pstuSrcs;               
    
	 /**
	 * \if ENGLISH_LANG
	 * display source max quantity
	 * \else
	 * 显示源最大数量
	 * \endif
	 */
    public int                       nMaxSrcCount;           
    
	 /**
	 * \if ENGLISH_LANG
	 * return display source quantity
	 * \else
	 * 返回的显示源数量
	 * \endif
	 */
    public int                       nRetSrcCount;           
	
    public NET_SPLIT_TOUR_SOURCE(int nMaxSrcCount) {
		this.nMaxSrcCount = nMaxSrcCount;
		
		pstuSrcs = new SDK_SPLIT_SOURCE[nMaxSrcCount];
		
		for(int i = 0; i < nMaxSrcCount; ++i) {
			pstuSrcs[i] = new SDK_SPLIT_SOURCE();
		}
	}  
}
