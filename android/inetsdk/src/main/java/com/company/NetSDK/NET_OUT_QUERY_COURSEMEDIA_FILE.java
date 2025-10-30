package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * open find course media record output parameter
 * \else
 * 查询课程视频信息出参
 * \endif
 */
public class NET_OUT_QUERY_COURSEMEDIA_FILE implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * \if ENGLISH_LANG
	 * result number
	 * \else
	 * 查询到的个数
	 * \endif
	 */
    public int                         nCountResult;                                   
    
	/**
	 * \if ENGLISH_LANG
	 *  record file info
	 * \else
	 * 视频信息
	 * \endif
	 */
    public NET_COURSEMEDIA_FILE_INFO[]   stuCourseMediaFile = new NET_COURSEMEDIA_FILE_INFO[64];
    
    public NET_OUT_QUERY_COURSEMEDIA_FILE() {
    	for(int i = 0; i < 64; ++i) {
    		stuCourseMediaFile[i] = new NET_COURSEMEDIA_FILE_INFO();
    	}
    }
}
