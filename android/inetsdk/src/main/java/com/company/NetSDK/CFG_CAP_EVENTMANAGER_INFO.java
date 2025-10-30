package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * The ability to obtain equipment alarm linkage
 * \else
 * 获取设备报警联动能力
 * \endif
 */
public class CFG_CAP_EVENTMANAGER_INFO implements Serializable {

	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Whether to support incident response time
	 * \else
	 * 是否支持时间事件响应
	 * \endif
	 */
	public boolean				bTimeSectionEnable;

	/**
	 * \if ENGLISH_LANG
	 * Whether to support video
	 * \else
	 * 是否支持录像
	 * \endif
	 */
	public boolean				bRecordEnable;

	/**
	 * \if ENGLISH_LANG
	 * Whether to support alarm output
	 * \else
	 * 是否支持报警输出
	 * \endif
	 */
	public boolean				bAlarmOutEnable;

	/**
	 * \if ENGLISH_LANG
	 * Whether to support PTZ linkage
	 * \else
	 * 是否支持云台联动
	 * \endif
	 */
	public boolean				bPtzLinkEnable;

	/**
	 * \if ENGLISH_LANG
	 * Whether to support snapshot
	 * \else
	 * 是否支持快照
	 * \endif
	 */
	public boolean				bSnapshotEnable;

	/**
	 * \if ENGLISH_LANG
	 * Whether to support send e-mail
	 * \else
	 * 是否支持发送邮件
	 * \endif
	 */
	public boolean				bMailEnable;

	/**
	 * \if ENGLISH_LANG
	 * Whether to support the buzzer
	 * \else
	 * 是否支持蜂鸣
	 * \endif
	 */
	public boolean				bBeepEnable;

	/**
	 * \if ENGLISH_LANG
	 * Whether to support the de-jitter
	 * \else
	 * 是否支持去抖动
	 * \endif
	 */
	public boolean				bDejitterEnable;

	/**
	 * \if ENGLISH_LANG
	 * Whether to support the local message box prompts
	 * \else
	 * 是否支持本地消息框提示
	 * \endif
	 */
	public boolean				bTipEnable;

	/**
	 * \if ENGLISH_LANG
	 * Whether to polling linkage configuration
	 * \else
	 * 是否支持轮询联动配置
	 * \endif
	 */
	public boolean				bMonitorTourEnable;

	/**
	 * \if ENGLISH_LANG
	 * Whether to support the short message
	 * \else
	 * 是否支持短消息
	 * \endif
	 */
	public boolean				bMMSEnable;

	/**
	 * \if ENGLISH_LANG
	 * Whether to support alarm bell output
	 * \else
	 * 是否支持警号输出
	 * \endif
	 */
	public boolean				bSupportAlarmBell;

	/**
	 * \if ENGLISH_LANG
	 * Whether to support access control
	 * \else
	 * 是否支持门禁控制
	 * \endif
	 */
	public boolean				bSupportAccessControl;

	/**
	 * \if ENGLISH_LANG
	 * Whether to uploaded to the alarm server
	 * \else
	 * 是否支持上传至报警服务器
	 * \endif
	 */
	public boolean				bSupportAlarmServer;

	/**
	 * \if ENGLISH_LANG
	 * Whether to support PTZ linkage delay
	 * \else
	 * 是否支持云台联动延迟
	 * \endif
	 */
	public boolean				bSupportPtzLinkDelay;

	/**
	 * \if ENGLISH_LANG
	 * Whether to support telephone is uploaded to the alarm center
	 * \else
	 * 是否支持上传至电话报警中心
	 * \endif
	 */
	public boolean				bSupportPSTNAlarmServer;

	/**
	 * \if ENGLISH_LANG
	 * Whether to support voice prompt
	 * \else
	 * 是否支持语音播报提示
	 * \endif
	 */
	public boolean                bVoiceEnable;

	/**
	 * \if ENGLISH_LANG
	 * Whether to support log
	 * \else
	 * 是否支持联动日志
	 * \endif
	 */
	public boolean				bLogEnable;

	/**
	 * \if ENGLISH_LANG
	 * record latch info
	 * \else
	 * 录像延时信息
	 * \endif
	 */
	public CFG_RECORD_LATCH	stuRecordLatch = new CFG_RECORD_LATCH();

	/**
	 * \if ENGLISH_LANG
	 * alarm out latch info
	 * \else
	 * 报警输出延时信息
	 * \endif
	 */
	public CFG_ALARMOUT_LATCH	stuAlarmOutLatch = new CFG_ALARMOUT_LATCH();

	/**
	 * \if ENGLISH_LANG
	 * dejitter range
	 * \else
	 * 去抖动信息
	 * \endif
	 */
	public CFG_DEJITTER_RANGE	stuDejitterRange = new CFG_DEJITTER_RANGE();

	/**
	 * \if ENGLISH_LANG
	 * Support unable linkage
	 * bit0 means support disarming beep;bit1 means support disarming local tip;bit2 means support disarming alarm out;bit3 means disarming mail;bit4 means disarming alarm upload
	 * \else
	 * 支持哪些联动项一键撤防 
	 * bit0表示支持撤防蜂鸣;bit1表示支持撤防本地提示;bit2表示支持撤防报警输出;bit3表示支持撤防邮件;bit4表示支持撤防报警上传
	 * \endif
	 */
	public int				nSupportDisableLinkage;

	/**
	 * \if ENGLISH_LANG
	 * support unable linkage time section;bit0 means support unable linkage time section
	 * \else
	 * 支持周期撤防,bit0表示支持周期撤防
	 * \endif
	 */
	public int 			nSupportDisableLinkageTimeSection;
}
