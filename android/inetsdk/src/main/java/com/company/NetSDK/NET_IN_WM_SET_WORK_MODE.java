package com.company.NetSDK;

import java.io.Serializable;

/**
* \if ENGLISH_LANG
* Set window working mode input parameter, corresponding to command {@link NET_SPLIT_OPERATE_TYPE#NET_WM_OPERATE_SET_WORK_MODE}
* \else
* 设置窗口工作模式输入参数, 对应 命令 {@link NET_SPLIT_OPERATE_TYPE#NET_WM_OPERATE_SET_WORK_MODE}
* \endif
*/
public class NET_IN_WM_SET_WORK_MODE implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	 /**
	 * \if ENGLISH_LANG
	 * Output channel no. or cubeless video wall virtual channel no., when pszCompositeID is NULL. valid
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
    
	 /**
	 * \if ENGLISH_LANG
	 * Window working mode, refer to {@link NET_WM_WORK_MODE}
	 * \else
	 * 窗口工作模式 ,取值参考 {@link NET_WM_WORK_MODE}
	 * \endif
	 */
    public int                   emMode;                         
}
