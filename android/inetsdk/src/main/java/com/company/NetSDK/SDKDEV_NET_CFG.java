package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * The structure of the network configuration
 * \else
 * 网络配置结构体
 * \endif
 */
public class SDKDEV_NET_CFG implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Device hostname
	 * \else
	 * 设备主机名
	 * \endif
	 */
	public byte                sDevName[] = new byte[FinalVar.SDK_MAX_NAME_LEN];
	
	/**
	 * \if ENGLISH_LANG
	 * TCP maximum number of connections
	 * \else
	 * TCP最大连接数
	 * \endif
	 */
	public short                wTcpMaxConnectNum;
	
	/**
	 * \if ENGLISH_LANG
	 * TCP frame listen port
	 * \else
	 * TCP帧听端口
	 * \endif
	 */
	public short                wTcpPort;
	
	/**
	 * \if ENGLISH_LANG
	 * UDP listening port
	 * \else
	 * UDP侦听端口
	 * \endif
	 */
	public short                wUdpPort;
	
	/**
	 * \if ENGLISH_LANG
	 * HTTP port
	 * \else
	 * HTTP端口号
	 * \endif
	 */
	public short                wHttpPort;
	
	/**
	 * \if ENGLISH_LANG
	 * HTTPS port
	 * \else
	 * HTTPS端口号
	 * \endif
	 */
	public short                wHttpsPort;
	
	/**
	 * \if ENGLISH_LANG
	 * SSL port
	 * \else
	 * SSL端口号
	 * \endif
	 */
	public short                wSslPort;
	
	/**
	 * \if ENGLISH_LANG
	 * Ethernet port
	 * \else
	 * 以太网口
	 * \endif
	 */
	public SDK_ETHERNET         stEtherNet[] = new SDK_ETHERNET[FinalVar.SDK_MAX_ETHERNET_NUM];
	
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
	 * Multicast group
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
	 * PPPoE Registered returns IP
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
	 * DDNS Host name
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
	 * Mail configuration
	 * \else
	 * 邮件配置
	 * \endif
	 */
	public SDK_MAIL_CFG         struMail = new SDK_MAIL_CFG();
	
	public SDKDEV_NET_CFG() {
		for (int i = 0; i < FinalVar.SDK_MAX_ETHERNET_NUM; i++) {
			stEtherNet[i] = new SDK_ETHERNET();
		}
	}
}
