package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * open find course media record output parameter
 * \else
 * 开始查询课程视频信息出参
 * \endif
 */
public class NET_OUT_QUERY_COURSEMEDIA_FILEOPEN implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * \if ENGLISH_LANG
	 * total number of result
	 * \else
	 *  查询到的总个数
	 * \endif
	 */
	public int                   ntotalNum; 
    
	/**
	 * \if ENGLISH_LANG
	 * find id
	 * \else
	 * 查询ID号
	 * \endif
	 */
	public int                   nfindID;

}
