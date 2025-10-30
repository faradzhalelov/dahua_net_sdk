package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * alarm of storage low space, the corresponding interface {@link INetSDK#StartListenEx},the corresponding command {@link FinalVar#SDK_ALARM_STORAGE_LOW_SPACE}
 * \else
 * 存储容量不足事件, 对应接口 {@link INetSDK#StartListenEx},对应命令 {@link FinalVar#SDK_ALARM_STORAGE_LOW_SPACE}
 * \endif
 */
public class ALARM_STORAGE_LOW_SPACE_INFO implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

 	/**
	 * \if ENGLISH_LANG
	 * 0:start 2:stop
	 * \else
	 * 0:开始 1:停止
	 * \endif
	 */
	public int                 nAction;
	
 	/**
	 * \if ENGLISH_LANG
	 * name
	 * \else
	 * 事件名称
	 * \endif
	 */
	public byte                szName[] = new byte[FinalVar.SDK_EVENT_NAME_LEN];
	
 	/**
	 * \if ENGLISH_LANG
	 * device name
	 * \else
	 * 存储设备名称
	 * \endif
	 */
	public byte                szDevice[] = new byte[FinalVar.SDK_STORAGE_NAME_LEN];
	
 	/**
	 * \if ENGLISH_LANG
	 * group name 
	 * \else
	 * 存储组名称
	 * \endif
	 */
	public byte                szGroup[] = new byte[FinalVar.SDK_STORAGE_NAME_LEN];
	
 	/**
	 * \if ENGLISH_LANG
	 * total space byte
	 * \else
	 * 总容量, byte
	 * \endif
	 */
	public long               nTotalSpace;
	
 	/**
	 * \if ENGLISH_LANG
	 * free space byte
	 * \else
	 * 剩余容量, byte
	 * \endif
	 */
	public long               nFreeSpace;
	
 	/**
	 * \if ENGLISH_LANG
	 * used percent
	 * \else
	 * 已经使用的百分比
	 * \endif
	 */
	public int                 nPercent;
}
