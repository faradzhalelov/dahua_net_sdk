package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * NVS config, the corresponding interface {@link INetSDK#GetNewDevConfig} and {@link INetSDK#SetNewDevConfig},the corresponding command {@link FinalVar#CFG_CMD_NASEX}
 * \else
 * 网络存储服务器配置, 对应接口 {@link INetSDK#GetNewDevConfig} 和 {@link INetSDK#SetNewDevConfig},对应命令 {@link FinalVar#CFG_CMD_NASEX}
 * \endif
 */
public class CFG_NAS_INFO_EX implements Serializable {
 	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * \if ENGLISH_LANG
	 * 0, 1, based on capacity, read-only
	 * \else
	 * 0, 1, 由能力集确定, 只读
	 * \endif
	 */
	public int				nVersion;
	
 	/**
	 * \if ENGLISH_LANG
	 * nVersion == 0 valid, for single server only
	 * \else
	 * nVersion == 0时有效, 仅支持单服务器
	 * \endif
	 */
	public CFG_NAS_INFO		stuNasOld = new CFG_NAS_INFO();
	
 	/**
	 * \if ENGLISH_LANG
	 * nVersion == 1 valid, for multiple servers
	 * \else
	 * nVersion == 1时有效, 支持多个服务器
	 * \endif
	 */
	public CFG_NAS_GROUP_INFO stuNasGroup = new CFG_NAS_GROUP_INFO();
}
