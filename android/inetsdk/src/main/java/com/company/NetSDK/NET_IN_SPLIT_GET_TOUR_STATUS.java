package com.company.NetSDK;

import java.io.Serializable;

/**
* \if ENGLISH_LANG
* Get window tour status input parameter, corresponding to command {@link NET_SPLIT_OPERATE_TYPE#NET_SPLIT_OPERATE_GET_TOUR_STATUS}
* \else
* 获取窗口轮巡状态输入参数, 对应命令 {@link NET_SPLIT_OPERATE_TYPE#NET_SPLIT_OPERATE_GET_TOUR_STATUS}
* \endif
*/
public class NET_IN_SPLIT_GET_TOUR_STATUS implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	 /**
	 * \if ENGLISH_LANG
	 * output channel no. or cubeless video wall virtual channel no., pszCompositeID is NULL is valid 
	 * \else
	 * 输出通道号或融合屏虚拟通道号, pszCompositeID为NULL时有效
	 * \endif
	 */
    public int                 nChannel;                       
    
	 /**
	 * \if ENGLISH_LANG
	 * cubeless video wall ID
	 * \else
	 * 融合屏ID
	 * \endif
	 */
    public String         pszCompositeID;                 
    
	 /**
	 * \if ENGLISH_LANG
	 * window no., -1 means all window
	 * \else
	 * 窗口号, -1表示所有窗口
	 * \endif
	 */
    public int                 nWindow;                        
}
