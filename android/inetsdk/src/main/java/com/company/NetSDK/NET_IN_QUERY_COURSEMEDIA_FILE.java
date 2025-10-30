package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * open find course media record in parameter
 * \else
 * 查询课程视频信息入参
 * \endif
 */
public class NET_IN_QUERY_COURSEMEDIA_FILE implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * find ID
	 * \else
	 * 查询ID号
	 * \endif 
	 */
	public int                     nfindID;
	
	/**
	 * \if ENGLISH_LANG
	 * start find offset
	 * \else
	 * 开始查询偏移
	 * \endif
	 */
    public int                     nOffset;
    
	/**
	 * \if ENGLISH_LANG
	 * find count
	 * \else
	 * 需要查询的个数
	 * \endif
	 */
    public int                     nCount; 
}
