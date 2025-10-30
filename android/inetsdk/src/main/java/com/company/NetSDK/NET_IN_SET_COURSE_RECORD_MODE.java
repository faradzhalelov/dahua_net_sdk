package com.company.NetSDK;

import java.io.Serializable;
/**
 * \if ENGLISH_LANG
 * input parameter about setting mode of course record 
 * \else
 * 设置录像模式入参
 * \endif
 */
public class NET_IN_SET_COURSE_RECORD_MODE implements Serializable {
	private static final long serialVersionUID = 1L;
	
	/**
	 * \if ENGLISH_LANG
	 * record mode, refer to {@link NET_EM_RECORD_MODE}
	 * \else
	 * 录像模式, 取值参考 {@link NET_EM_RECORD_MODE}
	 * \endif
	 */
	public int	emRecordMode;     
	
	/**
	 * \if ENGLISH_LANG
	 * class room ID
	 * \else
	 * 教室id号
	 * \endif
	 */
	public int                         nClassRoomID;       
}
