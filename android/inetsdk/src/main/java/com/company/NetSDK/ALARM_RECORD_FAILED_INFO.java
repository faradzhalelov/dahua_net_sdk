package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Abnormal record alarm, the corresponding interface {@link INetSDK#StartListenEx},the corresponding command {@link FinalVar#SDK_ALARM_RECORD_FAILED}
 * \else
 * 录像异常报警, 对应接口 {@link INetSDK#StartListenEx},对应命令 {@link FinalVar#SDK_ALARM_RECORD_FAILED}
 * \endif
 */
public class ALARM_RECORD_FAILED_INFO implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * 0:start 1:stop
	 * \else
	 * 0:开始 1:停止
	 * \endif
	 */
	public int                  nAction;
	
	/**
	 * \if ENGLISH_LANG
	 * Channel no
	 * \else
	 * 通道号
	 * \endif
	 */
	public int                  nIndex;
}
