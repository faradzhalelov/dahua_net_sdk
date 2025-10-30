package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * {@link INetSDK#StartQueryRecordFile} output param
 * \else
 * {@link INetSDK#StartQueryRecordFile} 接口输出参数
 * \endif
 */
public class NET_OUT_START_QUERY_RECORDFILE implements Serializable{
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * return handle
	 * \else
	 * 返回句柄  
	 * \endif
	 */
    public long                lQueryHandle;                      
}
