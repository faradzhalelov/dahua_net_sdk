package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Log information. Corresponding to interface {@link INetSDK#QueryDeviceLog}
 * \else
 * 日志信息，对应接口 {@link INetSDK#QueryDeviceLog}
 * \endif
 */
public class SDK_DEVICE_LOG_ITEM implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Log type  enumeration value as {@link SDK_NEWLOG_TYPE}
	 * \else
	 * 日志类型  对应枚举类型   {@link SDK_NEWLOG_TYPE}
	 * \endif
	 */
	public int					nLogType; 
	
	/**
	 * \if ENGLISH_LANG
	 * Date
	 * \else
	 * 日期
	 * \endif
	 */
	public SDKDEVTIME			stuOperateTime;
	
	/**
	 * \if ENGLISH_LANG
	 * Operator
	 * \else
	 * 操作者
	 * \endif
	 */
	public byte				szOperator[] = new byte[16];
	
	/**
	 * \if ENGLISH_LANG
	 * union structure type,0:szLogContext;1:stuOldLog
	 * \else
	 * union结构类型,0:szLogContext；1:stuOldLog。
	 * \endif
	 */
	public byte				bUnionType;
	
	//union
	//{
	/**
	 * \if ENGLISH_LANG
	 * Log content
	 * \else
	 * 日志备注信息
	 * \endif
	 */
	public byte			szLogContext[] = new byte[64];
	
	/**
	 * \if ENGLISH_LANG
	 * 旧的日志结构体
	 * \else
	 * 端口序号
	 * \endif
	 */
	public SDK_LOG_ITEM_OLD stuOldLog;
	
	//};
	
	public SDK_DEVICE_LOG_ITEM() {
		stuOperateTime = new SDKDEVTIME();
		stuOldLog = new SDK_LOG_ITEM_OLD();
	}
}
