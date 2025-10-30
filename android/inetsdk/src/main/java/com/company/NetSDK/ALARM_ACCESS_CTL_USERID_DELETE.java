package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * delate user alarm, the corresponding interface {@link INetSDK#StartListenEx},the corresponding command {@link FinalVar#SDK_ALARM_ACCESS_CTL_USERID_DELETE}
 * \else
 *  删除用户上报事件, 对应接口{@link INetSDK#StartListenEx},对应命令 {@link FinalVar#SDK_ALARM_ACCESS_CTL_USERID_DELETE}
 * \endif
 */
public class ALARM_ACCESS_CTL_USERID_DELETE implements Serializable {

	/**
	 * 
	 */
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
	 * register method  {@link NET_ACCESS_METHOD}
	 * \else
	 * 注册方式  {@link NET_ACCESS_METHOD}
	 * \endif
	 */
	public int emMethod;  
	
	/**
	 * \if ENGLISH_LANG
	 * Intelligence lock serial number
	 * \else
	 * 智能锁序列号
	 * \endif
	 */
	public byte[]  szSerialNum = new byte[FinalVar.MAX_COMMON_STRING_32];

}
