package com.company.NetSDK;

import java.io.Serializable;

/**
* \if ENGLISH_LANG
* {@link INetSDK#FindRecord} Interface Output Parameters
* \else
* {@link INetSDK#FindRecord} 接口输出参数
* \endif
*/
public class NET_OUT_FIND_RECORD_PARAM implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	 /**
	 * \if ENGLISH_LANG
	 * Query Log Handle, Uniquely identifies a certain query
	 * \else
	 * 查询记录句柄, 唯一标识某次查询
	 * \endif
	 */
    public long                     lFindeHandle;    
}
