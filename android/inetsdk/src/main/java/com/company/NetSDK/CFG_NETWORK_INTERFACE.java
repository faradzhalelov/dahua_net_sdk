package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Network interface
 * \else
 * 网络接口
 * \endif
 */
public class CFG_NETWORK_INTERFACE implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * \if ENGLISH_LANG
	 * Network address name
	 * \else
	 * 网络接口名称
	 * \endif
	 */
	public byte[]				szName = new byte[FinalVar.MAX_NAME_LEN];			
	
	/**
	 * \if ENGLISH_LANG
	 * IP address
	 * \else
	 * ip地址
	 * \endif
	 */
	public byte[]				szIP = new byte[FinalVar.MAX_ADDRESS_LEN];			
	
	/**
	 * \if ENGLISH_LANG
	 * Subnet mask
	 * \else
	 * 子网掩码
	 * \endif
	 */
	public byte[]				szSubnetMask = new byte[FinalVar.MAX_ADDRESS_LEN];	
	
	/**
	 * \if ENGLISH_LANG
	 * Default gateway
	 * \else
	 * 默认网关
	 * \endif
	 */
	public byte[]				szDefGateway = new byte[FinalVar.MAX_ADDRESS_LEN];	
	
	/**
	 * \if ENGLISH_LANG
	 * Enable DHCP or not. 
	 * \else
	 * 是否开启DHCP
	 * \endif
	 */
	public boolean				bDhcpEnable;					
	
	/**
	 * \if ENGLISH_LANG
	 * DNS get way.,It is true if the dhcp is enabled. Support DHCP.
	 * \else
	 * DNS获取方式，dhcp使能时可以设置为true，支持通过dhcp获取
	 * \endif
	 */
	public boolean				bDnsAutoGet;					
	
	/**
	 * \if ENGLISH_LANG
	 * DNS address
	 * \else
	 * DNS服务器地址
	 * \endif
	 */
	public byte[][]				szDnsServers = new byte[FinalVar.MAX_DNS_SERVER_NUM][FinalVar.MAX_ADDRESS_LEN];	
	
	/**
	 * \if ENGLISH_LANG
	 * Network max transmission unit.
	 * \else
	 * 网络最大传输单元
	 * \endif
	 */
	public int					nMTU;							
    
	/**
	 * \if ENGLISH_LANG
	 * Mac address
	 * \else
	 * mac地址
	 * \endif
	 */
	public byte[]				szMacAddress = new byte[FinalVar.MAX_ADDRESS_LEN];	
    
	/**
	 * \if ENGLISH_LANG
	 * Enable network interface,if false,ip address will not set for the config
	 * \else
	 * 网络接口使能开关，表示该网口配置是否生效。不生效时，IP地址不设置到网卡上。
	 * \endif
	 */
	public boolean              bInterfaceEnable;               
    
	/**
	 * \if ENGLISH_LANG
	 * Enable to reserved ip when DHCP failed,true:continue to send DHCP ask
	 * \else
	 * DHCP失败时是否使用保留IP，使用保留IP时还继续发DHCP请求
	 * \endif
	 */
	public boolean              bReservedIPEnable;          
    
	/**
	 * \if ENGLISH_LANG
	 * Net transmission mode，default:adapt, refer to {@link CFG_ENUM_NET_TRANSMISSION_MODE}
	 * \else
	 * 网络传输模式，默认adapt自适应模式, 取值参考 {@link CFG_ENUM_NET_TRANSMISSION_MODE}
	 * \endif
	 */
	public int  				emNetTranmissionMode;
    
	/**
	 * \if ENGLISH_LANG
	 * Network interface type, refer to {@link CFG_ENUM_NET_INTERFACE_TYPE}
	 * \else
	 * 网口类型, 取值参考 {@link CFG_ENUM_NET_INTERFACE_TYPE}
	 * \endif
	 */
	public int     				emInterfaceType;

	/**
	 * \if ENGLISH_LANG
	 * enable to bond Network interface , refer to {@link CFG_THREE_STATUS_BOOL}
	 * \else
	 * 是否绑定虚拟网口, 取值参考 {@link CFG_THREE_STATUS_BOOL}
	 * \endif
	 */
	public int     				bBond;
}
