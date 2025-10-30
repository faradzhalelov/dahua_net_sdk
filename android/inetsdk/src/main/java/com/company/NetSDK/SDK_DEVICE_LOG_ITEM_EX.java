package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * new Log information. Corresponding to interface  {@link INetSDK#QueryDeviceLog}
 * \else
 * 新日志信息结构，对应接口 {@link INetSDK#QueryDeviceLog}
 * \endif
 */
public class SDK_DEVICE_LOG_ITEM_EX implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Log type。enumeration value as {@link SDK_NEWLOG_TYPE}
	 * \else
	 * 日志类型, 对应枚举 {@link SDK_NEWLOG_TYPE}
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
	 * Old log structure 
	 * \else
	 * 旧的日志结构体
	 * \endif
	 */
	public SDK_LOG_ITEM_OLD stuOldLog;
	
	//};
	/**
	 * \if ENGLISH_LANG
	 * Detail operation
	 * \else
	 * 具体的操作内容
	 * \endif
	 */
	public byte                szOperation[] = new byte[32];
	
	/**
	 * \if ENGLISH_LANG
	 * DetailContext
	 * \else
	 * 详细日志信息描述
	 * \endif
	 */
	public byte				szDetailContext[] = new byte[4 * 1024];
	
	public SDK_DEVICE_LOG_ITEM_EX()	{
		stuOperateTime = new SDKDEVTIME();
		stuOldLog = new SDK_LOG_ITEM_OLD();
	}
}
