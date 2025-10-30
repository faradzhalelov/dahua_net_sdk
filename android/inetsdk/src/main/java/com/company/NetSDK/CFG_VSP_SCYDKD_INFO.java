package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * configuration of Sichuan Mobile keep an eye on shop, the corresponding interface {@link INetSDK#GetNewDevConfig} and {@link INetSDK#SetNewDevConfig},the corresponding command {@link FinalVar#CFG_CMD_VSP_SCYDKD}
 * \else
 * 平台配置, 对应接口 {@link INetSDK#GetNewDevConfig} 和 {@link INetSDK#SetNewDevConfig},对应命令 {@link FinalVar#CFG_CMD_VSP_SCYDKD}
 * \endif
 */
public class CFG_VSP_SCYDKD_INFO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * is configuration enable or not
	 * \else
	 * 使能
	 * \endif
	 */
	public boolean                    bEnable;                            
	
	/**
	 * \if ENGLISH_LANG
	 * Server IP
	 * \else
	 * 注册请求的服务器IP地址
	 * \endif
	 */
	public byte                    szServerIP[] = new byte[128];                    
	
	/**
	 * \if ENGLISH_LANG
	 * Server Port
	 * \else
	 * 注册请求的服务器端口号
	 * \endif
	 */
	public int                     nServerPort;                        
	
	/**
	 * \if ENGLISH_LANG
	 * ID of video input device
	 * \else
	 * 视频输入设备ID
	 * \endif
	 */
	public byte                    szDeviceID[] = new byte[32];                     
	
	/**
	 * \if ENGLISH_LANG
	 * UserName of Qidi Platform
	 * \else
	 * 启迪平台用户名
	 * \endif
	 */
	public byte                    szUserName[] = new byte[32];         
}
