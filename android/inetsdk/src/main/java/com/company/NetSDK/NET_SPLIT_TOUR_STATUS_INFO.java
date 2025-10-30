package com.company.NetSDK;

import java.io.Serializable;
/**
 * \if ENGLISH_LANG
 * split tour status info
 * \else
 * 分割轮巡状态信息
 * \endif
 */
public class NET_SPLIT_TOUR_STATUS_INFO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	/**
	 * \if ENGLISH_LANG
	 * window no
	 * \else
	 *  窗口号
	 * \endif
	 */
    public int                 nWindow;                   
    
    /**
     * \if ENGLISH_LANG
     * status, refer to {@link NET_TOUR_STATUS}
     * \else
     * 状态,取值参考 {@link NET_TOUR_STATUS}
     * \endif
     */
    public int    emStatus;                  
    
    /**
     * \if ENGLISH_LANG
     * split tour status info
     * \else
     * 当前显示源信息
     * \endif
     */
    public SDK_SPLIT_WND_SOURCE stuSource;
    
    public NET_SPLIT_TOUR_STATUS_INFO() {
    	this(0);
    }

	public NET_SPLIT_TOUR_STATUS_INFO(int videoInputCount) {
		stuSource = new SDK_SPLIT_WND_SOURCE(videoInputCount);
	}
}
