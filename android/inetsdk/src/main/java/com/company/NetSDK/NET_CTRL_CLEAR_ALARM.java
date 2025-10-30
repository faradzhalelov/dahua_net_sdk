package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * {@link INetSDK#ControlDevice}'s param: {@link CtrlType#SDK_CTRL_CLEAR_ALARM}
 * \else
 * {@link INetSDK#ControlDevice} 接口的 {@link CtrlType#SDK_CTRL_CLEAR_ALARM} 命令参数
 * \endif
 */
public class NET_CTRL_CLEAR_ALARM implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Defence Area's ID， -1 means all ID
	 * \else
	 * 防区通道号, -1 表示所有通道
	 * \endif
	 */
	public int		nChannelID;
	
	/**
	 * \if ENGLISH_LANG
	 * Event Type, refer to {@link NET_ALARM_TYPE}
	 * \else
	 * 事件类型, 取值参考 {@link NET_ALARM_TYPE}
	 * \endif
	 */
	public int		emAlarmType;
	
	/**
	 * \if ENGLISH_LANG
	 * Landing Equipment Such As Password, Do not Use Encryption Disappear the Police, Direct Assignment of NULL
	 * \else
	 * 登陆设备的密码,如不使用加密消警,直接赋值为NULL
	 * \endif
	 */
	public String	szDevPwd;
	
	/**
	 * \if ENGLISH_LANG
	 * Means if enable nEventType field, TRUE:nEventType replaces emAlarmType field, FALSE: use emAlarmType field , ignore nEventType field 
	 * \else
	 * 表示是否启用nEventType字段, TRUE:nEventType代替emAlarmType字段, FALSE:沿用emAlarmType字段,忽略nEventType字段
	 * \endif
	 */
	public boolean                bEventType;
	
	/**
	 * \if ENGLISH_LANG
	 * Event type, corresponding fMessCallBack called lCommand field , as StartListenEx port got event type
     * Such as NET_ALARM_ALARM_EX2 means local alarm event
	 * \else
	 * 事件类型, 对应fMessCallBack回调来上的lCommand字段, 即 StartListenEx 接口获得事件类型
	 * 比如  NET_ALARM_ALARM_EX2  表示本地报警事件
	 * \endif
	 */
	public    int                 nEventType;
}
