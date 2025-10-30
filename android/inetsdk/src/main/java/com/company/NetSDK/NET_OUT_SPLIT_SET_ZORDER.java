package com.company.NetSDK;

import java.io.Serializable;

/**
* \if ENGLISH_LANG
* set window Z order output parameter, adjust one window Z order will affect all windows,  return adjusted all windows Z order
* \else
* 设置窗口Z序输出参数, 调整一个窗口的Z序会影响所有窗口, 返回调整后所有窗口的Z序
* \endif
*/
public class NET_OUT_SPLIT_SET_ZORDER implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	 /**
	 * \if ENGLISH_LANG
	 * window order group, user allocate memory, apply to sizeof(SDK_WND_ZORDER)*nMaxWndCount
	 * \else
	 * 窗口次序数组, 用户分配内存,大小为sizeof(SDK_WND_ZORDER)*nMaxWndCount
	 * \endif
	 */
	public SDK_WND_ZORDER[]    pZOders;                        
	
	 /**
	 * \if ENGLISH_LANG
	 * window order group size
	 * \else
	 * 窗口次序数组大小
	 * \endif
	 */
    public int                 nMaxWndCount;                   
    
	 /**
	 * \if ENGLISH_LANG
	 * return window quantity
	 * \else
	 * 返回的窗口数量
	 * \endif
	 */
    public int                 nWndCount;                      
    
    public NET_OUT_SPLIT_SET_ZORDER(int maxWindowCount) {
    	this.nMaxWndCount = maxWindowCount;
    	
    	pZOders = new SDK_WND_ZORDER[maxWindowCount];
    	for(int i = 0; i < maxWindowCount; ++i) {
    		pZOders[i] = new SDK_WND_ZORDER();
    	}
    }
}
