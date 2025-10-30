package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Network Area Server Configuration, the corresponding interface {@link INetSDK#GetNewDevConfig} and {@link INetSDK#SetNewDevConfig},the corresponding command {@link FinalVar#CFG_CMD_NAS}
 * \else
 * 网络存储服务器配置, 对应接口 {@link INetSDK#GetNewDevConfig} 和 {@link INetSDK#SetNewDevConfig},对应命令 {@link FinalVar#CFG_CMD_NAS}
 * \endif
 */
public class CFG_NAS_INFO implements Serializable {
 	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * \if ENGLISH_LANG
	 * Enable
	 * \else
	 * 使能开关
	 * \endif
	 */
	public boolean				bEnable;
	
 	/**
	 * \if ENGLISH_LANG
	 * Version of Network Area Server 0=FTP,1=NAS 
	 * \else
	 * 网络存储服务器版本0=老的FTP，1=NAS存储
	 * \endif
	 */
	public int					nVersion;
	
 	/**
	 * \if ENGLISH_LANG
	 * Protocol Type0=FTP 1=SMB 
	 * \else
	 * 协议类型0=FTP 1=SMB
	 * \endif
	 */
	public int					nProtocol;
	
 	/**
	 * \if ENGLISH_LANG
	 * IP or Domain Name 
	 * \else
	 * IP地址或网络名
	 * \endif
	 */
	public byte[]				szAddress = new byte[FinalVar.MAX_ADDRESS_LEN];
	
 	/**
	 * \if ENGLISH_LANG
	 * Port Number 
	 * \else
	 * 端口号
	 * \endif
	 */
	public int					nPort;
	
 	/**
	 * \if ENGLISH_LANG
	 * User Name 
	 * \else
	 * 帐户名
	 * \endif
	 */
	public byte[]				szUserName = new byte[FinalVar.MAX_USERNAME_LEN];
	
 	/**
	 * \if ENGLISH_LANG
	 * Password
	 * \else
	 * 密码
	 * \endif
	 */
	public byte[]				szPassword = new byte[FinalVar.MAX_PASSWORD_LEN];
	
 	/**
	 * \if ENGLISH_LANG
	 * Shared Directory 
	 * \else
	 * 共享的目录名
	 * \endif
	 */
	public byte[]				szDirectory = new byte[FinalVar.MAX_DIRECTORY_LEN];
	
 	/**
	 * \if ENGLISH_LANG
	 * Lenth of file 
	 * \else
	 * 文件长度
	 * \endif
	 */
	public int					nFileLen;
	
 	/**
	 * \if ENGLISH_LANG
	 * Interval 
	 * \else
	 * 相邻文件时间间隔
	 * \endif
	 */
	public int					nInterval;
	
 	/**
	 * \if ENGLISH_LANG
	 * Period of Storage 
	 * \else
	 * 存储时间段
	 * \endif
	 */
	public CFG_CHANNEL_TIME_SECTION[] stuChnTime = new CFG_CHANNEL_TIME_SECTION[FinalVar.MAX_VIDEO_CHANNEL_NUM];
	
 	/**
	 * \if ENGLISH_LANG
	 * Valid Number of Storage 
	 * \else
	 * 有效的存储时间段数
	 * \endif
	 */
	public int					nChnTimeCount;
	
	public CFG_NAS_INFO() {
		for (int i = 0; i < FinalVar.MAX_VIDEO_CHANNEL_NUM; ++i) {
			this.stuChnTime[i] = new CFG_CHANNEL_TIME_SECTION();
		}
	}
}
