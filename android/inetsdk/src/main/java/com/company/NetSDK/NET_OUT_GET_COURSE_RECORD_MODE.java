package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * output parameter about getting mode of course record 
 * \else
 * 获取录像模式出参
 * \endif
 */
public class NET_OUT_GET_COURSE_RECORD_MODE implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * \if ENGLISH_LANG
	 * record mode, refer to {@link NET_EM_RECORD_MODE}
	 * \else
	 * 录像模式, 取值参考 {@link NET_EM_RECORD_MODE}
	 * \endif
	 */
	public int	emRecordMode;    
            
}
