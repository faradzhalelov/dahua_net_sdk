package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Subscription type
 * \else
 * 订阅类型
 * \endif
 */
public class NET_SUBSCRIBE_INFO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Event code
	 * \else
	 * 事件码
	 * \endif
	 */
	public int                             nCode;
	
	/**
	 * \if ENGLISH_LANG
	 * Event sub-types, refer to {@link EM_EVENT_SUB_CODE}, EM_EVENT_SUB_CODE_UNKNOWN as invalid
	 * Effective only VideoAbnormalDetection, alarmLocal and other alarm events include a variety of types 
	 * \else
	 * 事件子类型,取值参考 {@link EM_EVENT_SUB_CODE}, EM_EVENT_SUB_CODE_UNKNOWN为无效
	 * 仅对VideoAbnormalDetection,AlarmLocal等包含多种类型的报警事件有效
	 * \endif
	 */
	public int                             emSubCode;
	
	/**
	 * \if ENGLISH_LANG
	 * Subscribe to the number of channels, without channel concept is 0
	 * \else
	 * 订阅的通道数量, 若无通道概念则为0
	 * \endif
	 */
    public int                             nChnNum;
    
    /**
     * \if ENGLISH_LANG
     * Channel number collection
     * \else
     * 通道号集合
     * \endif
     */
    public int                             nIndexs[] = new int[FinalVar.MAX_MOBILE_CHANNEL_NUM];
    
    /**
     * \if ENGLISH_LANG
     * phone number for no answered
     * Event is effective when to subscribe to "CallNoAnswered" 
     * CFG_CMD_MOBILE_PUSH_NOFITY_CFG is valid
     * \else
     * 无应答号码（设备呼叫这些号码，无应答时，将向手机推送消息）
     * 订阅"CallNoAnswered "事件时有效
     * CFG_CMD_MOBILE_PUSH_NOFITY_CFG时有效
     * \endif
     */
    public byte                            szNumber[] = new byte[FinalVar.SDK_COMMON_STRING_16];
    
    public byte                            szSound[] = new byte[FinalVar.SDK_COMMON_STRING_64];

	/**
	 * \if ENGLISH_LANG
	 * channel aggregate extension
	 * \else
	 * 通道号集合扩展
	 * \endif
	 */
	public byte				szIndexsExt[][] = new byte[FinalVar.SDK_COMMON_STRING_32][FinalVar.SDK_COMMON_STRING_16];

}
