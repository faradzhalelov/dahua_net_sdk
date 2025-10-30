package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Voice Call Linkage Information
 * \else
 * 语音呼叫联动信息
 * \endif
 */
public class CFG_TALKBACK_INFO implements Serializable{
	/**
	 *
	 */
	private static final long 	serialVersionUID = 1L;
	
	/**
	 * \if ENGLISH_LANG
	 * Voice Call Enable
	 * \else
	 * 语音呼叫使能
	 * \endif
	 */
	public boolean		bCallEnable;
	
	/**
	 * \if ENGLISH_LANG
	 * Voice Calls Originating, refer to  {@link EM_CALLER_TYPE}
	 * \else
	 * 语音呼叫发起方, 取值参考 {@link EM_CALLER_TYPE}
	 * \endif
	 */
	public int		emCallerType;
	
	/**
	 * \if ENGLISH_LANG
	 * Voice Call Protocol, refer to {@link EM_CALLER_PROTOCOL_TYPE}
	 * \else
	 * 语音呼叫协议, 取值参考 {@link EM_CALLER_PROTOCOL_TYPE}
	 * \endif
	 */
	public int		emCallerProtocol;
}
