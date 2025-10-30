package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Network extended configuration structure, the corresponding interface {@link INetSDK#GetDevConfig}和{@link INetSDK#SetDevConfig},the corresponding command {@link FinalVar#SDK_DEV_NETCFG_EX}
 * \else
 * 扩展网络配置结构体, 对应接口 {@link INetSDK#GetDevConfig}和{@link INetSDK#SetDevConfig},对应命令 {@link FinalVar#SDK_DEV_NETCFG_EX}
 * \endif
 */
public class SDKDEV_NET_CFG_EX implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Device host name
	 * \else
	 * 设备主机名
	 * \endif
	 */
	public byte                sDevName[] = new byte[FinalVar.SDK_MAX_NAME_LEN];

	/**
	 * \if ENGLISH_LANG
	 * TCP max connection amount
	 * \else
	 * TCP最大连接数
	 * \endif
	 */
	public int                wTcpMaxConnectNum;

	/**
	 * \if ENGLISH_LANG
	 * TCP listening port
	 * \else
	 * TCP帧听端口
	 * \endif
	 */
	public int                wTcpPort;

	/**
	 * \if ENGLISH_LANG
	 * UDP listening port
	 * \else
	 * UDP侦听端口
	 * \endif
	 */
	public int                wUdpPort;

	/**
	 * \if ENGLISH_LANG
	 * HTTP port number
	 * \else
	 * HTTP端口号
	 * \endif
	 */
	public int                wHttpPort;

	/**
	 * \if ENGLISH_LANG
	 * HTTPS port number
	 * \else
	 * HTTPS端口号
	 * \endif
	 */
	public int                wHttpsPort;

	/**
	 * \if ENGLISH_LANG
	 * SSL port number
	 * \else
	 * SSL端口号
	 * \endif
	 */
	public int                wSslPort;
    
	/**
	 * \if ENGLISH_LANG
	 * Ethernet port number
	 * \else
	 * 以太网口数
	 * \endif
	 */
	public int                 nEtherNetNum;

	/**
	 * \if ENGLISH_LANG
	 * Ethernet info
	 * \else
	 * 以太网口
	 * \endif
	 */
	public SDK_ETHERNET_EX      stEtherNet[] = new SDK_ETHERNET_EX[FinalVar.SDK_MAX_ETHERNET_NUM_EX];

	/**
	 * \if ENGLISH_LANG
	 * Alarm server
	 * \else
	 * 报警服务器
	 * \endif
	 */
	public SDK_REMOTE_HOST      struAlarmHost = new SDK_REMOTE_HOST();

	/**
	 * \if ENGLISH_LANG
	 * Log server
	 * \else
	 * 日志服务器
	 * \endif
	 */
	public SDK_REMOTE_HOST      struLogHost = new SDK_REMOTE_HOST();

	/**
	 * \if ENGLISH_LANG
	 * SMTP server
	 * \else
	 * SMTP服务器
	 * \endif
	 */
	public SDK_REMOTE_HOST      struSmtpHost = new SDK_REMOTE_HOST();

	/**
	 * \if ENGLISH_LANG
	 * Multiple-cast group
	 * \else
	 * 多播组
	 * \endif
	 */
	public SDK_REMOTE_HOST      struMultiCast = new SDK_REMOTE_HOST();

	/**
	 * \if ENGLISH_LANG
	 * NFS server
	 * \else
	 * NFS服务器
	 * \endif
	 */
	public SDK_REMOTE_HOST      struNfs = new SDK_REMOTE_HOST();

	/**
	 * \if ENGLISH_LANG
	 * PPPoE server
	 * \else
	 * PPPoE服务器
	 * \endif
	 */
	public SDK_REMOTE_HOST      struPppoe = new SDK_REMOTE_HOST();
    
	/**
	 * \if ENGLISH_LANG
	 * returned IP after PPPoE registration
	 * \else
	 * PPPoE注册返回的IP
	 * \endif
	 */
	public byte                sPppoeIP[] = new byte[FinalVar.SDK_MAX_IPADDR_LEN];

	/**
	 * \if ENGLISH_LANG
	 * DDNS server
	 * \else
	 * DDNS服务器
	 * \endif
	 */
	public SDK_REMOTE_HOST      struDdns = new SDK_REMOTE_HOST();

	/**
	 * \if ENGLISH_LANG
	 * DDNS host name
	 * \else
	 * DDNS主机名
	 * \endif
	 */
	public byte                sDdnsHostName[] = new byte[FinalVar.SDK_MAX_HOST_NAMELEN];

	/**
	 * \if ENGLISH_LANG
	 * DNS server
	 * \else
	 * DNS服务器
	 * \endif
	 */
	public SDK_REMOTE_HOST      struDns = new SDK_REMOTE_HOST();

	/**
	 * \if ENGLISH_LANG
	 * Email setup
	 * \else
	 * 邮件配置
	 * \endif
	 */
	public SDK_MAIL_CFG         struMail = new SDK_MAIL_CFG();
    
    public SDKDEV_NET_CFG_EX() {
    	for (int i = 0; i < FinalVar.SDK_MAX_ETHERNET_NUM_EX; i++) {
    		stEtherNet[i] = new SDK_ETHERNET_EX();
    	}
    }
}
