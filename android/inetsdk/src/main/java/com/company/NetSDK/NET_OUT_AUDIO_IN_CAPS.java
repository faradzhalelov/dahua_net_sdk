package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * query audio input channel caps output parameter, the corresponding interface {@link INetSDK#QueryDevInfo},the corresponding command {@link FinalVar#NET_QUERY_AUDIO_IN_CAPS}
 * \else
 *  获取音频输入通道能力集出参, 对应接口{@link INetSDK#QueryDevInfo},对应命令 {@link FinalVar#NET_QUERY_AUDIO_IN_CAPS}
 * \endif
 */
public class NET_OUT_AUDIO_IN_CAPS implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * \if ENGLISH_LANG
	 * input mic number,>0 means supports talk input
	 * \else
	 *  麦克风输入个数，大于0表示支持对讲输入
	 * \endif
	 */
	public int                nMicNum;
	
	/**
	 * \if ENGLISH_LANG
	 * input line number, >0 means backing track input
	 * \else
	 *  线性输入个数，大于0表示支持伴音输入
	 * \endif
	 */
	public int                nLineInNum;

}
