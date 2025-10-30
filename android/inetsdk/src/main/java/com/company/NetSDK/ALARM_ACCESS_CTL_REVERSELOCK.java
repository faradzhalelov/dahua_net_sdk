package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * reverer lock alarm, , the corresponding interface {@link INetSDK#StartListenEx},the corresponding command {@link FinalVar#SDK_ALARM_ACCESS_CTL_REVERSELOCK}
 * \else
 *  锁体信息上报事件, , 对应接口{@link INetSDK#StartListenEx},对应命令 {@link FinalVar#SDK_ALARM_ACCESS_CTL_REVERSELOCK}
 * \endif
 */
public class ALARM_ACCESS_CTL_REVERSELOCK implements Serializable {

	/**
	 * 
	 **/
	private static final long serialVersionUID = 1L;
	
	/**
	 * \if ENGLISH_LANG
	 * -1:unknown, 0:pulse, 1:start, 2:stop     
	 * \else
	 * 事件动作,0表示脉冲事件,1表示报警开始,2表示报警结束;   
	 * \endif
	 */
	public int nAction;
	
	/**
	 * \if ENGLISH_LANG
	 * event occurrence time
	 * \else
	 * 事件发生的时间
	 * \endif
	 */
	public NET_TIME_EX  stuTime = new NET_TIME_EX();
	
	/**
	 * \if ENGLISH_LANG
	 * lock status
	 * \else
	 * 上锁结果
	 * \endif
	 */
	public boolean  bStatus;
	
	/**
	 * \if ENGLISH_LANG
	 * lock type {@link NET_ACCESS_CTL_LOCKTYPE}
	 * \else
	 * 上锁方式  {@link NET_ACCESS_CTL_LOCKTYPE}
	 * \endif
	 */
	public int  emMethod;  
	
	/**
	 * \if ENGLISH_LANG
	 * intelligence lock serial number
	 * \else
	 * 智能锁序列号
	 * \endif
	 */
	public byte[]  szSerialNum = new byte[FinalVar.MAX_COMMON_STRING_32];
	
}
