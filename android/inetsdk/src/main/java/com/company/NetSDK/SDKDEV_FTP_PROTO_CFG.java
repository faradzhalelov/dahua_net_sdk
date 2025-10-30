package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * ftp configuration
 * \else
 * ftp配置
 * \endif
 */
public class SDKDEV_FTP_PROTO_CFG implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Whether to enable
	 * \else
	 * 是否启用
	 * \endif
	 */
	public boolean                bEnable;
	
	/**
	 * \if ENGLISH_LANG
	 * Host IP
	 * \else
	 * 主机IP
	 * \endif
	 */
	public byte                szHostIp[] = new byte[FinalVar.SDK_MAX_IPADDR_LEN];
	
	/**
	 * \if ENGLISH_LANG
	 * Host port
	 * \else
	 * 主机端口
	 * \endif
	 */
	public short                wHostPort;
	
	/**
	 * \if ENGLISH_LANG
	 * FTP directory path
	 * \else
	 * FTP目录路径
	 * \endif
	 */
    public byte                szDirName[] = new byte[FinalVar.SDK_FTP_MAX_PATH];
    
    /**
	 * \if ENGLISH_LANG
	 * User name
	 * \else
	 * 用户名
	 * \endif
	 */
    public byte                szUserName[] = new byte[FinalVar.SDK_FTP_USERNAME_LEN];
    
    /**
	 * \if ENGLISH_LANG
	 * Password
	 * \else
	 * 密码
	 * \endif
	 */
    public byte                szPassword[] = new byte[FinalVar.SDK_FTP_PASSWORD_LEN];
    
    /**
	 * \if ENGLISH_LANG
	 * Length of the file
	 * \else
	 * 文件长度
	 * \endif
	 */
    public int                 iFileLen;
    
    /**
	 * \if ENGLISH_LANG
	 * Adjacent the file time intervals (1 to 600), in seconds
	 * \else
	 * 相邻文件时间间隔(1~600),单位秒
	 * \endif
	 */
    public int                 iInterval;
    
    /**
	 * \if ENGLISH_LANG
	 * FTP upload configuration
	 * \else
	 * FTP上传配置
	 * \endif
	 */
    public SDK_FTP_UPLOAD_CFG   struUploadCfg[][] = new SDK_FTP_UPLOAD_CFG[FinalVar.SDK_MAX_CHANNUM][FinalVar.SDK_N_WEEKS];
    
    /**
	 * \if ENGLISH_LANG
	 * 0-FTP, 1-SMB 2-NFS,3-ISCSI
	 * \else
	 * 0-FTP， 1-SMB 2-NFS，3-ISCSI
	 * \endif
	 */
    public byte                protocol;
    
    /**
	 * \if ENGLISH_LANG
	 * Network storage server version 0 = old FTP (time period) interface (shielded interface 1 = NAS storage period). 
	 * \else
	 * 网络存储服务器版本0=老的FTP(界面上显示时间段)，1=NAS存储(界面上屏蔽时间段)。
	 * \endif
	 */
    public byte                NASVer;
    
    /**
	 * \if ENGLISH_LANG
	 * The functional capabilities mask, bitwise, low 16 (network storage) followed by FTP, SMB, NFS, high 16 (local storage) order DISK, U. 
	 * \else
	 * 功能能力掩码，按位表示，低16位(网络存储)依次表示FTP，SMB，NFS，高16位(本地存储)依次为DISK，U。
	 * \endif
	 */
    public int               dwFunctionMask;
    
    /**
	 * \if ENGLISH_LANG
	 * Data type 0 - type 1 - Video 2 - Pictures 
	 * \else
	 * 数据类型, 0-所有类型, 1-视频, 2-图片
	 * \endif
	 */
    public byte                bDataType;
    
    public SDKDEV_FTP_PROTO_CFG() {
    	for (int i = 0; i < FinalVar.SDK_MAX_CHANNUM; i++) {
    		for (int j = 0; j < FinalVar.SDK_N_WEEKS; j++) {
    			struUploadCfg[i][j] = new SDK_FTP_UPLOAD_CFG();
    		}
    	}
    }
}
