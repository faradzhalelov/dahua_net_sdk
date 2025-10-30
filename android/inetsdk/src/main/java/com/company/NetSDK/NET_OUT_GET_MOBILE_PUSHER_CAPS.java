package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * {@link INetSDK#GetMobilePusherCaps} output Parameter
 * \else
 * {@link INetSDK#GetMobilePusherCaps} 出参
 * \endif
 */
public class NET_OUT_GET_MOBILE_PUSHER_CAPS implements Serializable {

	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * whether devide support enable push subscripitions
	 * \else
	 * 设备是否支持设置手机报警推送使能
	 * \endif
	 */
	public boolean						bEnablePush;

	/**
	 * \if ENGLISH_LANG
	 * whether device support adding push subscripitions
	 * \else
	 * 设备是否支持添加推送订阅
	 * \endif
	 */
	public boolean						bAddNotification;

	/**
	 * \if ENGLISH_LANG
	 * whether device support delete push subscripitions
	 * \else
	 * 设备是否支持取消推送订阅
	 * \endif
	 */
	public boolean						bDelNotification;

	/**
	 * \if ENGLISH_LANG
	 * DMSS mobile pusher, whether device support priority, MobileAPP needs to determine the configuration of the primary server
	 * \else
	 * DMSS手机推送,是否支持优先级,手机APP需要根据此字段来判断下发的主服务器配置
	 * \endif
	 */
	public boolean						bSupportPriority;

	/**
	 * \if ENGLISH_LANG
	 * Support push in customized time period
	 * \else
	 * 是否支持订制时间段内推送
	 * \endif
	 */
	public boolean						bPushEventSchedule;

	/**
	 * \if ENGLISH_LANG
	 * Whether VTO push error code reporting is supported
	 * \else
	 * 是否支持VTO推送错误码上报
	 * \endif
	 */
	public boolean						bVTOPushErrorCode;
	
	/**
	 * \if ENGLISH_LANG
	 * Whether device subscription configuration is supported
	 * \else
	 * 是否支持获取设备订阅配置
	 * \endif
	 */
	public boolean						bSupportGetPushConfig;

	/**
	 * \if ENGLISH_LANG
	 * Device added support channel subscription event collection
	 * \else
	 * 设备新增支持按通道订阅的事件集合
	 * \endif
	 */
	public NET_SUPPORT_CHANNEL_SUBSCRIBE_EVENT	 stuChannelSubscribeEvent = new NET_SUPPORT_CHANNEL_SUBSCRIBE_EVENT();
}
