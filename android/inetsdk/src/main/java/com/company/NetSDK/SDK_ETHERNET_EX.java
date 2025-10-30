package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Ethernet extended Configuration
 * \else
 * 以太网扩展配置
 * \endif
 */
public class SDK_ETHERNET_EX implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * DVR IP  address
	 * \else
	 * DVR IP 地址
	 * \endif
	 */
	public byte                sDevIPAddr[] = new byte[FinalVar.SDK_MAX_IPADDR_LEN];

	/**
	 * \if ENGLISH_LANG
	 * DVR IP subnet mask
	 * \else
	 * DVR IP 地址掩码
	 * \endif
	 */
	public byte                sDevIPMask[] = new byte[FinalVar.SDK_MAX_IPADDR_LEN];

	/**
	 * \if ENGLISH_LANG
	 * Gateway address
	 * \else
	 * 网关地址
	 * \endif
	 */
	public byte                sGatewayIP[] = new byte[FinalVar.SDK_MAX_IPADDR_LEN];
	
	/**
	 * \if ENGLISH_LANG
	 * NSP
	 * 1:10Mbps full-duplex
	 * 2:10Mbps auto-duplex
	 * 3:10Mbps half-duplex
	 * 4:100Mbps full-duplex
	 * 5:100Mbps auto-duplex
	 * 6:100Mbps half-duplex
	 * 7:auto
	 * \else
	 * NSP
	 * 1：10Mbps 全双工
	 * 2：10Mbps 自适应
	 * 3：10Mbps 半双工
	 * 4：100Mbps 全双工
	 * 5：100Mbps 自适应
	 * 6：100Mbps 半双工
	 * 7：自适应
	 * \endif
	 */
	public byte                dwNetInterface;

	/**
	 * \if ENGLISH_LANG
	 * 0:cable,1:wireless
	 * \else
	 * 0：有线，1：无线
	 * \endif
	 */
	public byte                bTranMedia;

	/**
	 * \if ENGLISH_LANG
	 * Use bit to represent, The first bit:1:valid 0:invalid;The second bit:0:Unable DHCP 1:Enable DHCP;The third bit:0:Do not support DHCP 1:Support DHCP
	 * \else
	 * 按位表示，第一位：1：有效 0：无效；第二位：0：DHCP关闭 1：DHCP使能；第三位：0：不支持DHCP 1：支持DHCP
	 * \endif
	 */
	public byte                bValid;

	/**
	 * \if ENGLISH_LANG
	 * To be the default network card or not.  1: default 0:non-default
	 * \else
	 * 是否作为默认的网卡 1：默认 0：非默认
	 * \endif
	 */
	public byte                bDefaultEth;

	/**
	 * \if ENGLISH_LANG
	 * MAC address , read-only.
	 * \else
	 * MAC地址，只读
	 * \endif
	 */
	public byte                byMACAddr[] = new byte[FinalVar.SDK_MACADDR_LEN];

	/**
	 * \if ENGLISH_LANG
	 * mode, 1:balance, 2:multi, 3:fault-toerant
	 * \else
	 * 网卡所处模式, 0:绑定模式, 1:负载均衡模式, 2:多址模式, 3:容错模式
	 * \endif
	 */
	public byte                bMode;

	/**
	 * \if ENGLISH_LANG
	 * Card name, read only
	 * \else
	 * 网卡名，只读
	 * \endif
	 */
	public byte                szEthernetName[] = new byte[FinalVar.SDK_MAX_NAME_LEN];
}
