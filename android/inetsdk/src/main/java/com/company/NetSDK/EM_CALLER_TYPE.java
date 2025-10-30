package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Voice Calls Originating
 * \else
 * 语音呼叫发起方
 * \endif
 */
public class EM_CALLER_TYPE implements Serializable{
	private static final long 	serialVersionUID = 1L;
	
	/**
	 * \if ENGLISH_LANG
	 * Device Originating
	 * \else
	 *  设备发起
	 * \endif
	 */
	public final static int EM_CALLER_DEVICE = 0;
}
