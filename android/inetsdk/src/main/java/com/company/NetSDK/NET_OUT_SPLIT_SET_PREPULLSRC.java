package com.company.NetSDK;

import java.io.Serializable;

/**
* \if ENGLISH_LANG
* Set pre source output parameter
* \else
* 设置预拉流源输出参数
* \endif
*/
public class NET_OUT_SPLIT_SET_PREPULLSRC implements Serializable{
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	 /**
	 * \if ENGLISH_LANG
	 * result quantity, same with pre source    
	 * \else
	 * 结果数量, 与预拉流源数量相同
	 * \endif
	 */
	public int             nResultCount;               
	
	 /**
	 * \if ENGLISH_LANG
	 * result
	 * \else
	 * 结果
	 * \endif
	 */
    public NET_SPLIT_SET_PREPULLSRC_RESULT[] pResults;  
    
    public NET_OUT_SPLIT_SET_PREPULLSRC(int preResultCount) {
    	pResults = new NET_SPLIT_SET_PREPULLSRC_RESULT[preResultCount];
    	
    	for(int i = 0; i < preResultCount; ++i) {
    		pResults[i] = new NET_SPLIT_SET_PREPULLSRC_RESULT();
    	}
    }
}
