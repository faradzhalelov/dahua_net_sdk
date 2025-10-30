package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * {@link INetSDK#StartUploadFileBurned} output parameter
 * \else
 * {@link INetSDK#StartUploadFileBurned} 输出参数
 * \endif
 */
public class NET_OUT_FILEBURNED_START implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * "start"：system is ready, may start to upload; "busy"：system is busy, please try again later. "error"：system is not writing, return error request failed
	 * \else
	 * "start"：系统准备就绪,可以开始上传; "busy"：系统忙,稍后在试。"error"：系统未在刻录中,返回出错,请求失败
	 * \endif
	 */
	public char                szState[] = new char[FinalVar.SDK_MAX_NAME_LEN];          
}
