package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Corresponding to interface {@link INetSDK#SearchDevices}
 * \else
 * 对应接口 {@link INetSDK#SearchDevices}
 * \endif
 */
public class DEVICE_NET_INFO implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * IP
	 * \else
	 * IP
	 * \endif
	 */
	public byte				szIP[] = new byte[FinalVar.SDK_MAX_IPADDR_LEN];
	
	/**
	 * \if ENGLISH_LANG
	 * Port
	 * \else
	 * tcp端口
	 * \endif
	 */
	public int					nPort;
	
	/**
	 * \if ENGLISH_LANG
	 * Subnet mask
	 * \else
	 * 子网掩码
	 * \endif
	 */
	public byte				szSubmask[] = new byte[FinalVar.SDK_MAX_IPADDR_LEN];
	
	/**
	 * \if ENGLISH_LANG
	 * Gateway
	 * \else
	 * 网关
	 * \endif
	 */
	public byte				szGateway[] = new byte[FinalVar.SDK_MAX_IPADDR_LEN];
	
	/**
	 * \if ENGLISH_LANG
	 * MAC address
	 * \else
	 * MAC地址
	 * \endif
	 */
	public byte				szMac[] = new byte[FinalVar.SDK_MACADDR_LEN];
	
	/**
	 * \if ENGLISH_LANG
	 * Device type
	 * \else
	 * 端设备类型
	 * \endif
	 */
	public byte				szDeviceType[] = new byte[FinalVar.SDK_DEV_TYPE_LEN];
	
	/**
	 * \if ENGLISH_LANG
	 * Manufactory, refer to {@link EM_IPC_TYPE}
	 * \else
	 * 目标设备的生产厂商,具体参考  {@link EM_IPC_TYPE}
	 * \endif
	 */
	public byte                byManuFactory;
	
	/**
	 * \if ENGLISH_LANG
	 * 4: IPv4, szXXX is in format with dot; 6:IPv6, szXXX is 128-bit *16 bytes) numerical format
	 * \else
	 * 4: IPv4, szXXX为点分字符串形式;  6:IPv6, szXXX为128位(16字节)数值形式
	 * \endif
	 */
	public byte                byIPVersion;
	
	/**
	 * \if ENGLISH_LANG
	 * 
	 * \else
	 * 设备初始化状态，按位确定初始化状态。bit0~1：0-老设备，没有初始化功能 1-未初始化账号 2-已初始化账户; bit2~3：0-老设备，保留 1-公网接入未使能 2-公网接入已使能; bit4~5：0-老设备，保留 1-手机直连未使能 2-手机直连使能
	 * \endif
	 */
    public byte				   byInitStatus;							

	/**
	 * \if ENGLISH_LANG
	 * 
	 * \else
	 * 支持密码重置方式：按位确定密码重置方式，只在设备有初始化账号时有意义。bit0-支持预置手机号 bit1-支持预置邮箱 bit2-支持文件导出
	 * \endif
	 */
    public byte				  byPwdResetWay;	
}
