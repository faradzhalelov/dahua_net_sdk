package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Device extension info 
 * \else
 * 设备信息扩展
 * \endif
 */
public class NET_DEVICEINFO_Ex implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Serial number
	 * \else
	 * 序列号
	 * \endif
	 */
	public byte				sSerialNumber[] = new byte[FinalVar.SDK_SERIALNO_LEN];

	/**
	 * \if ENGLISH_LANG
	 * Count of DVR alarm input
	 * \else
	 * DVR报警输入个数
	 * \endif
	 */
	public int					nAlarmInPortNum;

	/**
	 * \if ENGLISH_LANG
	 * Count of DVR alarm output
	 * \else
	 * DVR报警输出个数
	 * \endif
	 */
	public int					nAlarmOutPortNum;

	/**
	 * \if ENGLISH_LANG
	 * Number of DVR disk
	 * \else
	 * DVR硬盘个数
	 * \endif
	 */
	public int					nDiskNum;

	/**
	 * \if ENGLISH_LANG
	 * DVR type, refer to {@link NET_DEVICE_TYPE}
	 * \else
	 * DVR类型, 见枚举 {@link NET_DEVICE_TYPE}
	 * \endif
	 */
	public int					nDVRType;
	
	/**
	 * \if ENGLISH_LANG
	 * Number of DVR channel
	 * \else
	 * DVR通道个数
	 * \endif
	 */
	public int					nChanNum;
	
	/**
	 * \if ENGLISH_LANG
	 * When online time out, it is 0 means no limit on login, non-o- means 0 limit
	 * \else
	 * 在线超时时间,为0表示不限制登陆,非0表示限制的分钟数
	 * \endif
	 */
	public byte                byLimitLoginTime;
	
	/**
	 * \if ENGLISH_LANG
	 * When login failed due to wrong password, it notify user via this parameter, remaining login times, as 0 means parameter invalid
	 * \else
	 * 当登陆失败原因为密码错误时，通过此参数通知用户，剩余登陆次数，为0时表示此参数无效
	 * \endif
	 */
	public byte                byLeftLogTimes;
	
	/**
	 * \if ENGLISH_LANG
	 * when log in failed，the left time for users to unlock (seconds), -1 indicate the device haven’t set the parameter 
	 * \else
	 * 当登陆失败，用户解锁剩余时间（秒数）, -1表示设备未设置该参数
	 * \endif
	 */
	public int                 nLockLeftTime; 
}
