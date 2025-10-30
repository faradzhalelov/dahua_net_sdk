package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Set video source return result
 * \else
 * 设置视频源的返回结果
 * \endif
 */
public class NET_SET_SPLIT_SOURCE_RESULT implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Push mode device listen port no.
	 * \else
	 * 推流模式的设备端监听端口号
	 * \endif
	 */
	public int						nPushPort;		
}
