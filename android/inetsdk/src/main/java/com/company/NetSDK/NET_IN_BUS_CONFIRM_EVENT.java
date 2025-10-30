package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * vehicle emergency alarm confirm input parameter
 * \else
 * 车辆紧急报警确认 输入参数
 * \endif
 */
public class NET_IN_BUS_CONFIRM_EVENT implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * to confirm event valid quantity
	 * \else
	 * 待确认事件的有效数目
	 * \endif
	 */
	public int                         nEvent;         
	
	/**
	 * \if ENGLISH_LANG
	 * to confirm event info
	 * \else
	 * 待确认事件的信息
	 * \endif
	 */
	public NET_EVENT_INFO_TO_CONFIRM   stuEventInfo[] = new NET_EVENT_INFO_TO_CONFIRM[FinalVar.MAX_EVENT_TO_CONFIRM_NUM];
	
	public NET_IN_BUS_CONFIRM_EVENT() {
		for (int i = 0; i < FinalVar.MAX_EVENT_TO_CONFIRM_NUM; i++) {
			stuEventInfo[i] = new NET_EVENT_INFO_TO_CONFIRM();
		}
	}
}
