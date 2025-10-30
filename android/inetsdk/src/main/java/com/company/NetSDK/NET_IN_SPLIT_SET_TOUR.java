package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * window tour control input parameter, corresponding to {@link NET_SPLIT_OPERATE_TYPE#NET_SPLIT_OPERATE_SET_TOUR}
 * \else
 * 窗口轮巡控制输入参数, 对应 {@link NET_SPLIT_OPERATE_TYPE#NET_SPLIT_OPERATE_SET_TOUR}
 * \endif
 */
public class NET_IN_SPLIT_SET_TOUR implements Serializable {

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
    public String         	   pszCompositeID;                 
    
    /**
     * \if ENGLISH_LANG
     * window no
     * \else
     * 窗口号
     * \endif
     */
    public int                 nWindow;                        
    
    /**
     * \if ENGLISH_LANG
     * tour motion, refer to {@link EM_NET_WINDOW_TOUR_ACTION}
     * \else
     * 轮巡动作 , 取值参考 {@link EM_NET_WINDOW_TOUR_ACTION}
     * \endif
     */
    public int 				   emAction;                 
}
