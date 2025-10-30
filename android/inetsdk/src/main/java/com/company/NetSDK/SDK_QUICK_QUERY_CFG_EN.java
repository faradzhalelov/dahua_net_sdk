package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Quick query structure configuration capability
 * \else
 * 快速查询配置能力结构体
 * \endif
 */
public class SDK_QUICK_QUERY_CFG_EN implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * <pre>
	 * 1 indicates that the device supports configuration commands to quickly return, 
	 * and that the device does not support a configuration command will return immediately 
	 * does not support, rather than in response to this command.
	 * (SetDevConfig, SetDevConfig interface is called, set waittime wait for the timeout 
	 * period is long enough to ensure that the configuration under normal narrowband read. 
	 * Recommended setting 60S)
	 * </pre>
	 * \else
	 * 1是设备支持配置命令快速返回，请设置配置时间足够长以保证窄带下配置的正常读取。建议设置60S
	 * \endif
	 */
	public char		IsQuickQueryEnable;		
}
