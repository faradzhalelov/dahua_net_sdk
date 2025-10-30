package com.company.NetSDK;

import java.io.Serializable;

/**
* \if ENGLISH_LANG
* set window Z order input parameter
* \else
* 设置窗口Z序输入参数
* \endif
*/
public class NET_IN_SPLIT_SET_ZORDER implements Serializable {

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
	 * window no.
	 * \else
	 * 窗口号
	 * \endif
	 */
    public int                 nWindow;                       
    
	 /**
	 * \if ENGLISH_LANG
	 * adjust Z order, refer to {@link NET_WINDOW_ZORDER}
	 * \else
	 * 调整的Z序 ,取值参考 {@link NET_WINDOW_ZORDER}
	 * \endif
	 */
    public int   			   emZOrder;                       
}
