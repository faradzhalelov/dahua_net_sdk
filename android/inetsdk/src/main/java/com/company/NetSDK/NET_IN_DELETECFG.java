package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * {@link INetSDK#DeleteDevConfig} input parameter
 * \else
 * {@link INetSDK#DeleteDevConfig} 入参
 * \endif
 */
public class NET_IN_DELETECFG implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Configuration command
	 * \else
	 * 配置命令
	 * \endif
	 */
	public String         szCommand;
}
