package com.company.NetSDK;

import java.io.Serializable;

/**
* \if ENGLISH_LANG
* The output parameters of Close batch windows, corresponding to {@link NET_SPLIT_OPERATE_TYPE#NET_SPLIT_OPERATE_CLOSE_WINDOWS}
* \else
* 批量关窗输出参数, 对应 {@link NET_SPLIT_OPERATE_TYPE#NET_SPLIT_OPERATE_CLOSE_WINDOWS}
* \endif
*/
public class NET_OUT_SPLIT_CLOSE_WINDOWS implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	 /**
	 * \if ENGLISH_LANG
	 * Result array, memory assigned by users, apply to sizeof(NET_SPLIT_CLOSE_WINDOW_RESULT)*nMaxResultCount. Set to Null if no need the return
	 * \else
	 * 结果数组, 用户分配内存,大小为sizeof(NET_SPLIT_CLOSE_WINDOW_RESULT)*nMaxResultCount. 如果不需要返回结果, 可以为NULL
	 * \endif
	 */
    public NET_SPLIT_CLOSE_WINDOW_RESULT[] pstuResults;         
    
	 /**
	 * \if ENGLISH_LANG
	 * The maximum of result array, filled in by user.
	 * \else
	 * 结果数组最大数量, 用户填写.
	 * \endif
	 */
    public int                 nMaxResultCount;                
    
	 /**
	 * \if ENGLISH_LANG
	 * The number of return result
	 * \else
	 * 返回的结果数量
	 * \endif
	 */
    public int                 nRetResultCount;                
    
    public NET_OUT_SPLIT_CLOSE_WINDOWS(int maxResultCount) {
    	this.nMaxResultCount = maxResultCount;
    	
    	pstuResults = new NET_SPLIT_CLOSE_WINDOW_RESULT[maxResultCount];
    	for (int i = 0; i < maxResultCount; ++i ) {
    		pstuResults[i] = new NET_SPLIT_CLOSE_WINDOW_RESULT();
    	}
    }
}
