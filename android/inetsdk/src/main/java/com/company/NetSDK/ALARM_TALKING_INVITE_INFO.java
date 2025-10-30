package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Alarm Event Type, the corresponding interface {@link INetSDK#StartListenEx},the corresponding command {@link FinalVar#SDK_ALARM_TALKING_INVITE} (Device request talk event), Corresponding Data Description Info
 * \else
 * 报警事件类型, 对应接口 {@link INetSDK#StartListenEx},对应命令 {@link FinalVar#SDK_ALARM_TALKING_INVITE} (设备请求对方发起对讲事件), 对应的数据描述信息
 * \endif
 */
public class ALARM_TALKING_INVITE_INFO implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Device Expected Talk Start Party， refer to {@link EM_TALKING_CALLER}
	 * \else
	 * 设备希望的对讲发起方,取值参考 {@link EM_TALKING_CALLER}
	 * \endif
	 */
	public int                  emCaller;
	
	/**
	 * \if ENGLISH_LANG
	 * Event Trigger Time
	 * \else
	 * 事件触发时间
	 * \endif
	 */
	public NET_TIME             stuTime = new NET_TIME();
}
