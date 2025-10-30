package com.company.NetSDK;

import java.io.Serializable;

/**
* \if ENGLISH_LANG
* Set pre stream source return result
* \else
* 设置预拉流源的返回结果
* \endif
*/
public class NET_SPLIT_SET_PREPULLSRC_RESULT implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	 /**
	 * \if ENGLISH_LANG
	 * set result, TRUE-successful, FALSE-failed
	 * \else
	 * 设置结果, TRUE-成功, FALSE-失败
	 * \endif
	 */
    public boolean            bResult;                    
    
	 /**
	 * \if ENGLISH_LANG
	 * Error code
	 * \else
	 * 失败错误码
	 * \endif
	 */
    public int                dwErrorCode;                
}
