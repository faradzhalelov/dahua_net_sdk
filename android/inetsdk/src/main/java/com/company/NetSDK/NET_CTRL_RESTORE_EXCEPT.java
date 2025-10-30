package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Restore except configuration input parameter.
 * \else
 * 恢复除某项外的其他项默认设置的入参
 * \endif
 */
public class NET_CTRL_RESTORE_EXCEPT implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Config name and'&&' as interval, config see {@link FinalVar}of  {@link INetSDK#GetNewDevConfig} and {@link INetSDK#SetNewDevConfig} port command
	 * \else
	 * 配置名称以'&&'为间隔,配置名参见 {@link FinalVar} 的{@link INetSDK#GetNewDevConfig}和 {@link INetSDK#SetNewDevConfig}接口的配置命令
	 * 填入不想恢复的配置名称
	 * \endif
	 */
	public byte[]          szCfgName = new byte[FinalVar.SDK_MAX_STRING_LEN];

}
