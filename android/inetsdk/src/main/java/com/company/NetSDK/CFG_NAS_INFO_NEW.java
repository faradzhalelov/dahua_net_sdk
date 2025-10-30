package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Network storage config
 * \else
 * 网络存储配置
 * \endif
 */
public class CFG_NAS_INFO_NEW implements Serializable {
 	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * \if ENGLISH_LANG
	 * Enable
	 * \else
	 * 使能
	 * \endif
	 */
	public boolean    			bEnable;
	
 	/**
	 * \if ENGLISH_LANG
	 * Name
	 * \else
	 * 名称
	 * \endif
	 */
	public byte[]				szName = new byte[FinalVar.MAX_NAME_LEN];
	
 	/**
	 * \if ENGLISH_LANG
	 * Protocol type, 0-FTP, 1-SMB, 2-ISCSI
	 * \else
	 * 协议类型, 0-FTP, 1-SMB, 2-ISCSI
	 * \endif
	 */
	public int					nPortocol;
	
 	/**
	 * \if ENGLISH_LANG
	 * IP address or wed address
	 * \else
	 * IP地址或网址
	 * \endif
	 */
	public byte[]				szAddress = new byte[FinalVar.MAX_ADDRESS_LEN];
	
 	/**
	 * \if ENGLISH_LANG
	 * Port
	 * \else
	 * 端口
	 * \endif
	 */
	public int					nPort;
	
 	/**
	 * \if ENGLISH_LANG
	 * Username
	 * \else
	 * 用户名
	 * \endif
	 */
	public byte[]				szUser = new byte[FinalVar.MAX_USERNAME_LEN];
	
 	/**
	 * \if ENGLISH_LANG
	 * Password
	 * \else
	 * 密码
	 * \endif
	 */
	public byte[]				szPassword = new byte[FinalVar.MAX_NAME_LEN];
	
 	/**
	 * \if ENGLISH_LANG
	 * Shared directory name
	 * \else
	 * 共享的目录名
	 * \endif
	 */
	public byte[]				szDirectory = new byte[FinalVar.MAX_NAME_LEN];
	
 	/**
	 * \if ENGLISH_LANG
	 * Character encode mode, 0-UTF8, 1-GB2312
	 * \else
	 * 字符编码格式, 0-UTF8, 1-GB2312
	 * \endif
	 */
	public int					nCharEncoding;
	
 	/**
	 * \if ENGLISH_LANG
	 * overtime, unit is ms
	 * \else
	 * 超时时间, 单位毫秒
	 * \endif
	 */
	public int					nTimeOut;
	
 	/**
	 * \if ENGLISH_LANG
	 * Data string ID
	 * \else
	 * 数据流ID
	 * \endif
	 */
	public int					nStreamID;
	
 	/**
	 * \if ENGLISH_LANG
	 * Update time, the field changed, need to initialize iSCSI function
	 * \else
	 * 更新时间, 该字段值变化后，需要重新初始化iSCSI功能
	 * \endif
	 */
	public CFG_NET_TIME_EX		stuUpdateTime = new CFG_NET_TIME_EX();
}
