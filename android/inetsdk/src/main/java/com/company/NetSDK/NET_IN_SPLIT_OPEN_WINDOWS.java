package com.company.NetSDK;

import java.io.Serializable;

/**
* \if ENGLISH_LANG
* batch window input parameter, corresponding to command {@link NET_SPLIT_OPERATE_TYPE#NET_SPLIT_OPERATE_OPEN_WINDOWS}
* \else
* 批量开窗输入参数, 对应命令 {@link NET_SPLIT_OPERATE_TYPE#NET_SPLIT_OPERATE_OPEN_WINDOWS}
* \endif
*/
public class NET_IN_SPLIT_OPEN_WINDOWS implements Serializable {

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
	 * cubeless video wall id
	 * \else
	 * 融合屏id
	 * \endif
	 */
    public String         		pszCompositeID;                 
    
	 /**
	 * \if ENGLISH_LANG
	 * cubeless video wall id
	 * \else
	 * 窗口数量
	 * \endif
	 */
    public int                	nWindowNum;                     
    
	 /**
	 * \if ENGLISH_LANG
	 * window zone group,the space application by the user,apply to sizeof(NET_RECT)*nWindowNum
	 * \else
	 * 窗口区域数组,由用户申请内存，大小为sizeof(NET_RECT)*nWindowNum
	 * \endif
	 */
    public NET_RECT[]           pstuWindowRects;                
    
	 /**
	 * \if ENGLISH_LANG
	 * meet direct criteria 
	 * \else
	 * 满足直通条件
	 * \endif
	 */
    public boolean              bDirectable;                   
	
    public NET_IN_SPLIT_OPEN_WINDOWS(int windowNumber) {
    	this.nWindowNum = windowNumber;
    	
    	pstuWindowRects = new NET_RECT[windowNumber];
    	
    	for(int i = 0; i < windowNumber; ++i ) {
    		pstuWindowRects[i] = new NET_RECT();
    	}
    }
}
