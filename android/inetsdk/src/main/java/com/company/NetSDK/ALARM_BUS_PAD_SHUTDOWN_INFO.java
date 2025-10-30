package com.company.NetSDK;

import java.io.Serializable;

/**
* \if ENGLISH_LANG
* event type, the corresponding interface {@link INetSDK#AttachBusState},the corresponging command {@link FinalVar#SDK_ALARM_BUS_PAD_SHUTDOWN}, (PAD shut down event) data description
* \else
* 报警事件类型, 对应接口{@link INetSDK#AttachBusState},对应命令 {@link FinalVar#SDK_ALARM_BUS_PAD_SHUTDOWN}, (PAD关机事件)对应的数据描述信息
* \endif
*/
public class ALARM_BUS_PAD_SHUTDOWN_INFO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	 /**
	 * \if ENGLISH_LANG
	 * delay time for shut down, unit: sec
	 * \else
	 * 关机延时时间，单位：秒
	 * \endif
	 */
	public int                nDelayTime;                      
	
	 /**
	 * \if ENGLISH_LANG
	 * need confirme to shut down, TRUE: yes, FALSE: no
	 * \else
	 * 是否需要确认
	 * \endif
	 */
	public boolean               bConfirm;                        
	
	 /**
	 * \if ENGLISH_LANG
	 * event time
	 * \else
	 * 事件发生的时间
	 * \endif
	 */
	public NET_TIME_EX        stuUtcTime = new NET_TIME_EX();                      
	
	 /**
	 * \if ENGLISH_LANG
	 * event time, for confirm
	 * \else
	 * 事件发生的时间, 用于确认
	 * \endif
	 */
    public int              dwUtc;                           
}
