package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Ethernet Settings
 * \else
 * 以太网配置
 * \endif
 */
public class SDK_ETHERNET implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * DVR IP Address
	 * \else
	 * DVR IP 地址
	 * \endif
	 */
	public byte                sDevIPAddr[] = new byte[FinalVar.SDK_MAX_IPADDR_LEN];
	
	/**
	 * \if ENGLISH_LANG
	 * IP Mask
	 * \else
	 * 网关地址
	 * \endif
	 */
	public byte                sDevIPMask[] = new byte[FinalVar.SDK_MAX_IPADDR_LEN];
	
	/**
	 * \if ENGLISH_LANG
	 * 10M/100M self-adaption,Index:
	 * <table>
	 * <tr><td>1</td><td>10Mbps full duplex</td></tr>
	 * <tr><td>2</td><td>10Mbps self-adaption</td></tr>
	 * <tr><td>3</td><td>10Mbps half-duplex</td></tr>
	 * <tr><td>4</td><td>100Mbps full duplex</td></tr>
	 * <tr><td>5</td><td>100Mbps self-adaption</td></tr>
	 * <tr><td>6</td><td>100Mbps half-duplex</td></tr>
	 * <tr><td>7</td><td>Self-adaption</td></tr>
	 * </table>
	 * \else
	 * 10M/100M 自适应,索引:
	 * <table>
	 * <tr><td>1</td><td>10Mbps 全双工</td></tr>
	 * <tr><td>2</td><td>10Mbps 自适应</td></tr>
	 * <tr><td>3</td><td>10Mbps 半双工</td></tr>
	 * <tr><td>4</td><td>100Mbps 全双工</td></tr>
	 * <tr><td>5</td><td>100Mbps 自适应</td></tr>
	 * <tr><td>6</td><td>100Mbps 半双工</td></tr>
	 * <tr><td>7</td><td>自适应</td></tr>
	 * </table>
	 * \endif
	 */
	public byte                sGatewayIP[] = new byte[FinalVar.SDK_MAX_IPADDR_LEN];
	
	/**
	 * \if ENGLISH_LANG
	 * NSP
	 * \else
	 * NSP
	 * \endif
	 */
	public byte                dwNetInterface;
	
	/**
	 * \if ENGLISH_LANG
	 * 0：Wired,1：Wireless
	 * \else
	 * 0：有线，1：无线
	 * \endif
	 */
	public byte                bTranMedia;
	
	/**
	 * \if ENGLISH_LANG
	 * Bit 1, 1：Valid 0：Invalid；Bit 2：0：DHCP unable 1：DHCP enable；Bit 3：0：Not support DHCP 1：Support DHCP
	 * \else
	 * 按位表示，第一位：1：有效 0：无效；第二位：0：DHCP关闭 1：DHCP使能；第三位：0：不支持DHCP 1：支持DHCP
	 * \endif
	 */
	public byte                bValid;
	
	/**
	 * \if ENGLISH_LANG
	 * Default NIC, 1：Default 0：Non default
	 * \else
	 * 是否作为默认的网卡, 1：默认 0：非默认
	 * \endif
	 */
	public byte                bDefaultEth;
	
	/**
	 * \if ENGLISH_LANG
	 * MAC address,read only
	 * \else
	 * MAC地址，只读
	 * \endif
	 */
	public byte                byMACAddr[] = new byte[FinalVar.SDK_MACADDR_LEN];
}
