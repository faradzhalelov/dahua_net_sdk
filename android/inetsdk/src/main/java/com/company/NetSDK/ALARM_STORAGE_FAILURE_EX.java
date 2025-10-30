package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * alarm of storage failure, the corresponding interface {@link INetSDK#StartListenEx},the corresponding command {@link FinalVar#SDK_ALARM_STORAGE_FAILURE_EX}
 * \else
 * 存储错误报警, 对应接口 {@link INetSDK#StartListenEx},对应命令 {@link FinalVar#SDK_ALARM_STORAGE_FAILURE_EX}
 * \endif
 */
public class ALARM_STORAGE_FAILURE_EX implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

 	/**
	 * \if ENGLISH_LANG
	 * 0:start 1:stop
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
	 * path
	 * \else
	 * 路径
	 * \endif
	 */
	public byte                szPath[] = new byte[FinalVar.MAX_PATH];
	
 	/**
	 * \if ENGLISH_LANG
	 * error type
	 * \else
	 * 错误类型
	 * \endif
	 */
	public int                 emError;
}
