package com.company.NetSDK;

import java.io.Serializable;

/**
* \if ENGLISH_LANG
* The input for close batch windows,  corresponding to command {@link NET_SPLIT_OPERATE_TYPE#NET_SPLIT_OPERATE_CLOSE_WINDOWS}
* \else
* 批量关窗输入参数, 对应命令 {@link NET_SPLIT_OPERATE_TYPE#NET_SPLIT_OPERATE_CLOSE_WINDOWS}
* \endif
*/
public class NET_IN_SPLIT_CLOSE_WINDOWS implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	 /**
	 * \if ENGLISH_LANG
	 * Output channel index or the virtual channel index of multi-screen display, it is valid when pszCompositeID =NULL
	 * \else
	 * 输出通道号或融合屏虚拟通道号, pszCompositeID为NULL时有效
	 * \endif
	 */
    public int                 nChannel;                       
    
	 /**
	 * \if ENGLISH_LANG
	 * Multi-screen display ID
	 * \else
	 * 融合屏ID
	 * \endif
	 */
    public String         	   pszCompositeID;                 
    
	 /**
	 * \if ENGLISH_LANG
	 * The pointer of windows index array,the space application by the user,apply to sizeof(int)*nWindowCount
	 * \else
	 * 窗口号数组指针
	 * \endif
	 */
    public int[]               pnWindows;                      
    
	 /**
	 * \if ENGLISH_LANG
	 * The number of windows
	 * \else
	 * 窗口数量
	 * \endif
	 */
    public int                 nWindowCount;                   
    
    public NET_IN_SPLIT_CLOSE_WINDOWS( int windowCount) {
    	this.nWindowCount = windowCount;
    	pnWindows = new int[windowCount];
    }
}
