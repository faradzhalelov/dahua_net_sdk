package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * data describe info, the corresponding interface {@link INetSDK#StartListenEx}, the corresponding command {@link FinalVar#SDK_ALARM_TALKING_HANGUP}
 * \else
 * 报警事件类型, 对应接口 {@link INetSDK#StartListenEx},对应命令 {@link FinalVar#SDK_ALARM_TALKING_HANGUP}
 * \endif
 */
public class ALARM_TALKING_HANGUP_INFO implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Event trigger time
	 * \else
	 * 事件触发时间
	 * \endif
	 */
    public NET_TIME            stuTime = new NET_TIME();                
}
