package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * interface {@link INetSDK#GetMemberNames} Input and output parameter
 * \else
 * 接口 {@link INetSDK#GetMemberNames} 输入输出参数
 * \endif
 */
public class NET_IN_MEMBERNAME implements Serializable {
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
