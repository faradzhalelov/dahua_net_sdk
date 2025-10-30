package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * setup work mode input parameter, corresponding to {@link NET_SPLIT_OPERATE_TYPE#NET_SPLIT_OPERATE_SET_WORK_MODE}
 * \else
 * 设置工作模式输入参数, 对应 {@link NET_SPLIT_OPERATE_TYPE#NET_SPLIT_OPERATE_SET_WORK_MODE}
 * \endif
 */
public class NET_IN_SPLIT_SET_WORK_MODE implements Serializable {

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
    public int                 	nChannel;                       
    
    /**
     * \if ENGLISH_LANG
     * cubeless video wall ID
     * \else
     * 融合屏ID
     * \endif
     */
    public String         		pszCompositeID;                 
    
    /**
     * \if ENGLISH_LANG
     * work mode, refer to {@link NET_SPLIT_WORK_MODE}
     * \else
     * 工作模式 , 取值参考 {@link NET_SPLIT_WORK_MODE}
     * \endif
     */
    public int  				emMode;                        
	

}
