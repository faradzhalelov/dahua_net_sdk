package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * operate of coursemedia record info
 * \else
 * 录播主机录像信息操作
 * \endif
 */

public class EM_COURSERECORD_OPERATE_TYPE implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * get classroom  record info, pInParam refer to {@link NET_IN_COURSERECORD_GETINFO}, pOutParam refer to {@link NET_OUT_COURSERECORD_GETINFO} 
	 * \else
	 * 获取教室录像信息,对应结构体pInParam 取值参考 {@link NET_IN_COURSERECORD_GETINFO}, pOutParam 取值参考 {@link NET_OUT_COURSERECORD_GETINFO} 
	 * \endif
	 */
	public static final int EM_COURSERECORDE_TYPE_GET_INFO = 0;                     
    
	/**
	 * \if ENGLISH_LANG
	 * set classroom  record info, pInParam refer to {@link NET_IN_COURSERECORD_SETINFO}, pOutParam refer to {@link NET_OUT_COURSERECORD_SETINFO}
	 * \else
	 * 设置教室录像信息,对应结构体pInParam 取值参考 {@link NET_IN_COURSERECORD_SETINFO},pOutParam 取值参考 {@link NET_OUT_COURSERECORD_SETINFO} 
	 * \endif
	 */
	public static final int EM_COURSERECORDE_TYPE_SET_INFO = 1;                      
    
	/**
	 * \if ENGLISH_LANG
	 * update record info to time, pInParam refer to {@link NET_IN_COURSERECORD_UPDATE_INFO}, pOutParam refer to {@link NET_OUT_COURSERECORD_UPDATE_INFO} 
	 * \else
	 * 将录像信息更新到time时的信息,对应结构体 pInParam 取值参考 {@link NET_IN_COURSERECORD_UPDATE_INFO}, pOutParam 取值参考 {@link NET_OUT_COURSERECORD_UPDATE_INFO} 
	 * \endif
	 */
	public static final int EM_COURSERECORDE_TYPE_UPDATE_INFO = 2;                    
    
	/**
	 * \if ENGLISH_LANG
	 * get course recorded time, pInParam refer to {@link NET_IN_COURSERECORD_GET_TIME}, pOutParam refer to {@link NET_OUT_COURSERECORD_GET_TIME}
	 * \else
	 * 获取当前课程教室已录制时间,对应结构体 pInParam 取值参考 {@link NET_IN_COURSERECORD_GET_TIME}, pOutParam 取值参考 {@link NET_OUT_COURSERECORD_GET_TIME}
	 * \endif
	 */
	public static final int EM_COURSERECORDE_TYPE_GET_TIME = 3;                      
}
