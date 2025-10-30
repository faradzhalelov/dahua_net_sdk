package com.company.NetSDK;

import java.io.Serializable;

/**
* \if ENGLISH_LANG
* Get window woking mode input parameter, corresponding to command {@link NET_SPLIT_OPERATE_TYPE#NET_WM_OPERATE_GET_WORK_MODE}
* \else
* 获取窗口工作模式输入参数, 对应命令 {@link NET_SPLIT_OPERATE_TYPE#NET_WM_OPERATE_GET_WORK_MODE}
* \endif
*/
public class NET_IN_WM_GET_WORK_MODE implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	 /**
	 * \if ENGLISH_LANG
	 * Output channel no. or cubeless virtual channel no., when pszCompositeID is NULL, valid
	 * \else
	 * 输出通道号或融合屏虚拟通道号, pszCompositeID为NULL时有效
	 * \endif
	 */	
    public int                   nChannel;                       
    
	 /**
	 * \if ENGLISH_LANG
	 * Cubeless video wall ID
	 * \else
	 * 融合屏ID
	 * \endif
	 */
    public String           	 pszCompositeID;                 
    
	 /**
	 * \if ENGLISH_LANG
	 * Window no.
	 * \else
	 * 窗口号
	 * \endif
	 */
    public int                   nWindow;                        

}
