package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Bypass Status Change Event Info, the corresponding interface {@link INetSDK#StartListenEx},the corresponding command {@link FinalVar#SDK_ALARM_BYPASSMODE_CHANGE_EVENT}
 * \else
 * 旁路状态变化事件的信息, 对应接口 {@link INetSDK#StartListenEx},对应命令 {@link FinalVar#SDK_ALARM_BYPASSMODE_CHANGE_EVENT}
 * \endif
 */
public class ALARM_BYPASSMODE_CHANGE_INFO implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Channel No.
	 * \else
	 * 通道号
	 * \endif
	 */
	public int                     nChannelID;
	
	/**
	 * \if ENGLISH_LANG
	 * Alarm Event Time
	 * \else
	 * 报警事件发生的时间
	 * \endif
	 */
	public NET_TIME                stuTime = new NET_TIME();
	
	/**
	 * \if ENGLISH_LANG
	 * AD Zone Type, refer to {@link NET_DEFENCEAREA_TYPE}
	 * \else
	 * 防区类型,取值参考 {@link NET_DEFENCEAREA_TYPE}
	 * \endif
	 */
	public int                     emDefenceType;
	
	/**
	 * \if ENGLISH_LANG
	 * Whether as extension (channel) armed zone or not, 1: extension channel, 0: non-extension channel
	 * \else
	 * 是否为扩展(通道)防区, 1:扩展通道, 0: 非扩展通道
	 * \endif
	 */
	public int                     nIsExtend;
	
	/**
	 * \if ENGLISH_LANG
	 * Mode After Change, refer to {@link NET_BYPASS_MODE}
	 * \else
	 * 变化后的模式 ,取值参考 {@link NET_BYPASS_MODE}
	 * \endif
	 */
	public int                    emMode;
	
	/**
	 * \if ENGLISH_LANG
	 * ID number, remote control number or keypad address, emTriggerMode=0 when belong to {@link NET_EM_TRIGGER_MODE#NET_EM_TRIGGER_MODE_NET}
	 * \else
	 * ID号, 遥控器编号或键盘地址, emTriggerMode为 {@link NET_EM_TRIGGER_MODE#NET_EM_TRIGGER_MODE_NET} 类型时为0
	 * \endif
	 */
	public int                     dwID; 
	
	/**
	 * \if ENGLISH_LANG
	 * trigger mode, refer to {@link NET_EM_TRIGGER_MODE}
	 * \else
	 * 触发方式,取值参考 {@link NET_EM_TRIGGER_MODE}
	 * \endif
	 */
	public int                     emTriggerMode; 
}
