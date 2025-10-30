package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Network interface config, the corresponding interface {@link INetSDK#GetNewDevConfig} and {@link INetSDK#SetNewDevConfig},the correspoding command {@link FinalVar#CFG_CMD_NETWORK}
 * \else
 * 网络接口配置, 对应接口 {@link INetSDK#GetNewDevConfig} 和 {@link INetSDK#SetNewDevConfig},对应命令 {@link FinalVar#CFG_CMD_NETWORK}
 * \endif
 */
public class CFG_NETWORK_INFO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * \if ENGLISH_LANG
	 * Host name
	 * \else
	 * 主机名称
	 * \endif
	 */
	public byte[]				szHostName = new byte[FinalVar.MAX_NAME_LEN];		
	
	/**
	 * \if ENGLISH_LANG
	 * Belonging domain
	 * \else
	 * 所属域
	 * \endif
	 */
	public byte[]				szDomain = new byte[FinalVar.MAX_NAME_LEN];		
	
	/**
	 * \if ENGLISH_LANG
	 * Default network card 
	 * \else
	 * 默认使用的网卡
	 * \endif
	 */
	public byte[]				szDefInterface = new byte[FinalVar.MAX_NAME_LEN];
	
	/**
	 * \if ENGLISH_LANG
	 * Network card amount
	 * \else
	 * 网卡数量
	 * \endif
	 */
	public int					nInterfaceNum;					
	
	/**
	 * \if ENGLISH_LANG
	 * Network card list 
	 * \else
	 * 网卡列表
	 * \endif
	 */
	public CFG_NETWORK_INTERFACE[]	stuInterfaces = new CFG_NETWORK_INTERFACE[FinalVar.MAX_NETWORK_INTERFACE_NUM];	

	public CFG_NETWORK_INFO() {
		for (int i = 0; i < stuInterfaces.length; i++) {
			stuInterfaces[i] = new CFG_NETWORK_INTERFACE();
		}
	}
}
