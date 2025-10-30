package com.company.NetSDK;

import java.io.Serializable;

/**
* \if ENGLISH_LANG
* {@link INetSDK#SetTourSource} Interface input parameters (Settings window round tour shows source)
* \else
* {@link INetSDK#SetTourSource} 接口输入参数(设置窗口轮巡显示源)
* \endif
*/
public class NET_IN_SET_TOUR_SOURCE implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	 /**
	 * \if ENGLISH_LANG
	 * Output Channel Number 
	 * \else
	 * 输出通道号
	 * \endif
	 */
    public int                     nChannel;               
    
	 /**
	 * \if ENGLISH_LANG
	 * Window Number
	 * \else
	 * 窗口号
	 * \endif
	 */
    public int                     nWindow;                
    
	 /**
	 * \if ENGLISH_LANG
	 * Display Origin Array,can be round tour in the window,the space application by the user,apply to sizeof(SDK_SPLIT_SOURCE)*nSrcCount  
	 * \else
	 * 显示源数组, 可进行窗口轮巡,由用户申请内存，大小为sizeof(SDK_SPLIT_SOURCE)*nSrcCount
	 * \endif
	 */
    public SDK_SPLIT_SOURCE[]      pstuSrcs;              
    
	 /**
	 * \if ENGLISH_LANG
	 * Display Origin Number
	 * \else
	 * 显示源数量
	 * \endif
	 */
    public int                     nSrcCount;              
    
	public NET_IN_SET_TOUR_SOURCE(int nSrcCount) {
		this.nSrcCount = nSrcCount;
		
		pstuSrcs = new SDK_SPLIT_SOURCE[nSrcCount];
		for (int i = 0; i < pstuSrcs.length; i++) {
			pstuSrcs[i] = new SDK_SPLIT_SOURCE(); 
		}
	}
}
