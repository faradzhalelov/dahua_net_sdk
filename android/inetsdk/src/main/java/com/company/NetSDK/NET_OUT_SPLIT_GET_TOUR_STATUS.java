package com.company.NetSDK;

import java.io.Serializable;

/**
* \if ENGLISH_LANG
* Get window tour status output parameter, corresponding to {@link NET_SPLIT_OPERATE_TYPE#NET_SPLIT_OPERATE_GET_TOUR_STATUS}
* \else
* 获取窗口轮巡状态输出参数, 对应 {@link NET_SPLIT_OPERATE_TYPE#NET_SPLIT_OPERATE_GET_TOUR_STATUS}
* \endif
*/
public class NET_OUT_SPLIT_GET_TOUR_STATUS implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	 /**
	 * \if ENGLISH_LANG
	 * status info indicator, user allocation memory. search window no. is -1 means multi-window info group.
	 * \else
	 * 状态信息指针,用户分配内存. 查询窗口号为-1时表示多个窗口的信息数组.
	 * \endif
	 */
    public NET_WINDOW_TOUR_STATUS_INFO[] pstuStatus;            
    
	 /**
	 * \if ENGLISH_LANG
	 * status info max quantity, user input
	 * \else
	 * 状态信息最大数量, 用户输入
	 * \endif
	 */
    public int                 nMaxStatusCount;                
    
	 /**
	 * \if ENGLISH_LANG
	 * status info actual quantity, search to get
	 * \else
	 * 状态信息实际数量, 查询得到
	 * \endif
	 */
    public int                 nRetStatusCount;					
    
	public NET_OUT_SPLIT_GET_TOUR_STATUS(int nMaxStatusCount) {
		this.nMaxStatusCount = nMaxStatusCount;
		
		pstuStatus = new NET_WINDOW_TOUR_STATUS_INFO[nMaxStatusCount];
		for(int i = 0; i < nMaxStatusCount; ++i) {
			pstuStatus[i] =  new NET_WINDOW_TOUR_STATUS_INFO();
		}
	}                
}
