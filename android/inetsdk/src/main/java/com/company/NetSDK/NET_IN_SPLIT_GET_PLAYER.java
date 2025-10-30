package com.company.NetSDK;

import java.io.Serializable;

/**
* \if ENGLISH_LANG
* Get player actual input parameter, corresponding to command {@link NET_SPLIT_OPERATE_TYPE#NET_SPLIT_OPERATE_GET_PLAYER}
* \else
* 获取播放器实例输入参数, 对应命令 {@link NET_SPLIT_OPERATE_TYPE#NET_SPLIT_OPERATE_GET_PLAYER}
* \endif
*/
public class NET_IN_SPLIT_GET_PLAYER implements Serializable {

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
    public int                   	nChannel;                       
    
	 /**
	 * \if ENGLISH_LANG
	 * cubeless video wall ID
	 * \else
	 * 融合屏ID
	 * \endif
	 */
    public String           		pszCompositeID;                 
    
	 /**
	 * \if ENGLISH_LANG
	 * player type, refer to {@link NET_SPLIT_PLAYER_TYPE}
	 * \else
	 * 播放器类型 , 取值参考 {@link NET_SPLIT_PLAYER_TYPE}
	 * \endif
	 */
    public int  					emType;                         
    
	 /**
	 * \if ENGLISH_LANG
	 * player window no.
	 * \else
	 * 播放器所在的窗口号
	 * \endif
	 */
    public int                   	nWindow;                        
}
