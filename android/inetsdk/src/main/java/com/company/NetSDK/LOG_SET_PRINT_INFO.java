package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * SDK global log print
 * \else
 * SDK全局日志打印信息
 * \endif
 */
public class LOG_SET_PRINT_INFO implements Serializable {
	
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * \if ENGLISH_LANG
	 * reset log path
	 * \else
	 * 是否重设日志路径
	 * \endif
	 */
	public boolean            bSetFilePath;

	/**
	 * \if ENGLISH_LANG
	 * log path(default"./sdk_log/sdk_log.log")
	 * \else
	 * 日志路径(默认"./sdk_log/sdk_log.log")
	 * \endif
	 */
	public byte            szLogFilePath[] = new byte[FinalVar.MAX_LOG_PATH_LEN];

	/**
	 * \if ENGLISH_LANG
	 * reset log size
	 * \else
	 * 是否重设日志文件大小
	 * \endif
	 */
	public boolean            bSetFileSize;

	/**
	 * \if ENGLISH_LANG
	 * each log file size(default size 10240), unit:bit
	 * \else
	 * 每个日志文件的大小(默认大小10240), 单位:比特
	 * \endif
	 */
	public int    nFileSize;

	/**
	 * \if ENGLISH_LANG
	 * reset log file number
	 * \else
	 * 是否重设日志文件个数
	 * \endif
	 */
	public boolean            bSetFileNum;

	/**
	 * \if ENGLISH_LANG
	 * log file quantity(default size 10)
	 * \else
	 * 绕接日志文件个数(默认大小10)
	 * \endif
	 */
	public int    nFileNum;

	/**
	 * \if ENGLISH_LANG
	 * reset log print strategy
	 * \else
	 * 是否重设日志打印输出策略
	 * \endif
	 */
	public boolean            bSetPrintStrategy;

	/**
	 * \if ENGLISH_LANG
	 * log out strategy, 0: output to file(defualt); 1:output to window
	 * \else
	 * 日志输出策略, 0:输出到文件(默认); 1:输出到窗口
	 * \endif
	 */
	public int    nPrintStrategy;

	public CB_fSDKLogCallBack          cbSDKLogCallBack;
}
