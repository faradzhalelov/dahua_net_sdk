package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * the order of result order
 * \else
 * 查询结果排序方式
 * \endif
 */
public class EM_RESULT_ORDER_TYPE implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * \if ENGLISH_LANG
	 * unknow
	 * \else
	 * 未知
	 * \endif
	 */
	public static final int    EM_RESULT_ORDER_UNKNOWN = 0; 
	
	/**
	 * \if ENGLISH_LANG
	 * ascent by time
	 * \else
	 * 按时间升序排序
	 * \endif
	 */
	public static final int    EM_RESULT_ORDER_ASCENT_BYTIME = 1; 
	
	/**
	 * \if ENGLISH_LANG
	 * descent by time
	 * \else
	 * 按时间降序排序   
	 * \endif
	 */
	public static final int    EM_RESULT_ORDER_DESCENT_BYTIME = 2;
}
