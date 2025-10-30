package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * iscsi Direct Deposit，Source Data Server Configuration Port Structure, the corresponding interface {@link INetSDK#GetNewDevConfig} and {@link INetSDK#SetNewDevConfig},the corresponding command {@link FinalVar#CFG_CMD_MD_SERVER}
 * \else
 * iscsi直存，元数据服务器配置接口, 对应接口 {@link INetSDK#GetNewDevConfig} 和 {@link INetSDK#SetNewDevConfig},对应命令 {@link FinalVar#CFG_CMD_MD_SERVER}
 * \endif
 */
public class CFG_METADATA_SERVER implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
 	/**
	 * \if ENGLISH_LANG
	 * Enable Swch 
	 * \else
	 * 使能开关
	 * \endif
	 */
	public boolean			bEnable;
	
 	/**
	 * \if ENGLISH_LANG
	 * IP Adrress Or Nerwork Domian Name 
	 * \else
	 * IP地址或网络名
	 * \endif
	 */
	public byte[]			szAddress = new byte[FinalVar.MAX_ADDRESS_LEN];
	
 	/**
	 * \if ENGLISH_LANG
	 * Port No.	
	 * \else
	 * 端口号
	 * \endif
	 */
	public int				dwPort;
	
 	/**
	 * \if ENGLISH_LANG
	 * Username 
	 * \else
	 * 帐户名  
	 * \endif
	 */
	public byte[]			szUserName = new byte[FinalVar.MAX_USERNAME_LEN];
	
 	/**
	 * \if ENGLISH_LANG
	 * Password 
	 * \else
	 * 密码
	 * \endif
	 */
	public byte[]			szPassword = new byte[FinalVar.MAX_PASSWORD_LEN];
	
 	/**
	 * \if ENGLISH_LANG
	 * distributed ID in a unified way For the Device Using Source Data Server，Device Marked By the ID  
	 * \else
	 * 为使用元数据服务器的设备统一分配的ID，设备以此ID标识自己
	 * \endif
	 */
	public byte[]			szDeviceID = new byte[FinalVar.MAX_REMOTEDEVICENAME_LEN];
}

