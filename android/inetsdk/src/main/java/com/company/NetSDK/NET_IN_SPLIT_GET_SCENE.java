package com.company.NetSDK;

import java.io.Serializable;

/**
* \if ENGLISH_LANG
* Get screen window info input parameter , corresponding to command {@link NET_SPLIT_OPERATE_TYPE#NET_SPLIT_OPERATE_GET_SCENE}
* \else
* 获取屏内窗口信息输入参数, 对应命令 {@link NET_SPLIT_OPERATE_TYPE#NET_SPLIT_OPERATE_GET_SCENE}
* \endif
*/
public class NET_IN_SPLIT_GET_SCENE implements Serializable {
	
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	 /**
	 * \if ENGLISH_LANG
	 * output channel no. or cubeless video wall virtual channel no., pszCompositeIDis NULL, it is valid 
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
}
