package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * {@link CB_fAttachDeviceDiscoveryCB} callback parameter
 * \else
 * {@link CB_fAttachDeviceDiscoveryCB} 回调函数参数
 * \endif
 */
public class NET_DEVICE_DISCOVERY_INFO implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * \if ENGLISH_LANG
	 * MachineName
	 * \else
	 * 设备名称
	 * \endif
	 */
	public byte[]				szMachineName = new byte[FinalVar.SDK_COMMON_STRING_32];					
	
	/**
	 * \if ENGLISH_LANG
	 * DeviceClass
	 * \else
	 * 设备类型
	 * \endif
	 */
	public byte[]				szDeviceClass = new byte[FinalVar.SDK_COMMON_STRING_32];					
	
	/**
	 * \if ENGLISH_LANG
	 * DeviceType
	 * \else
	 * 设备型号
	 * \endif
	 */
	public byte[]				szDeviceType = new byte[FinalVar.SDK_COMMON_STRING_32];					
	
	/**
	 * \if ENGLISH_LANG
	 * SerialNo
	 * \else
	 * 设备序列号
	 * \endif
	 */
	public byte[]				szSerialNo = new byte[FinalVar.SDK_COMMON_STRING_32];					
	
	/**
	 * \if ENGLISH_LANG
	 * Version
	 * \else
	 * 设备软件版本号
	 * \endif
	 */
	public byte[]				szVersion = new byte[FinalVar.SDK_COMMON_STRING_32];						
	
	/**
	 * \if ENGLISH_LANG
	 * Mac Address
	 * \else
	 * 设备MAC地址
	 * \endif
	 */
	public byte[]				szMac = new byte[FinalVar.SDK_COMMON_STRING_32];							
	
	/**
	 * \if ENGLISH_LANG
	 * VideoInputChannels
	 * \else
	 * 设备视频输入通道号
	 * \endif
	 */
	public int					nVideoInputChannels;								
	
	/**
	 * \if ENGLISH_LANG
	 * RemoteVideoInputChannels
	 * \else
	 * 远程视频输入通道数
	 * \endif
	 */
	public int					nRemoteVideoInputChannels;							
	
	/**
	 * \if ENGLISH_LANG
	 * VideoOutputChannels
	 * \else
	 * 视频输出通道数
	 * \endif
	 */
	public int					nVideoOutputChannels;								
	
	/**
	 * \if ENGLISH_LANG
	 * AlarmInputChannels
	 * \else
	 * 报警输入通道数
	 * \endif
	 */
	public int					nAlarmInputChannels;								
	
	/**
	 * \if ENGLISH_LANG
	 * AlarmOutputChannels
	 * \else
	 * 报警输出通道数
	 * \endif
	 */
	public int					nAlarmOutputChannels;								
	
	/**
	 * \if ENGLISH_LANG
	 * AudioInputChannels
	 * \else
	 * 设备音频输入通道数
	 * \endif
	 */
	public int					nAudioInputChannels;								
	
	/**
	 * \if ENGLISH_LANG
	 * Port
	 * \else
	 * 登陆端口
	 * \endif
	 */
	public int					nPort;												
	
	/**
	 * \if ENGLISH_LANG
	 * Vendor
	 * \else
	 * 客户名称
	 * \endif
	 */
	public byte[]				szVendor = new byte[FinalVar.SDK_COMMON_STRING_32];						
	
	/**
	 * \if ENGLISH_LANG
	 * Init:   0:donot have an initialization feature, 1:uninitialized, 2:initialized
	 * \else
	 * 设备是否已初始化:  0:不具备初始化功能的设备,可以等同于已初始化; 1:未初始化; 2:已初始化
	 * \endif
	 */
	public int					nInit;												
	
	/**
	 * \if ENGLISH_LANG
	 * IPv4 Address
	 * \else
	 * IPv4地址
	 * \endif
	 */
	public byte[]				szIPv4Address = new byte[FinalVar.SDK_COMMON_STRING_32];					
	
	/**
	 * \if ENGLISH_LANG
	 * IPv4 SubnetMask
	 * \else
	 * IPv4子网掩码
	 * \endif
	 */
	public byte[]				szIPv4SubnetMask = new byte[FinalVar.SDK_COMMON_STRING_32];				
	
	/**
	 * \if ENGLISH_LANG
	 * IPv4 DefaultGateway
	 * \else
	 * IPv4默认网关
	 * \endif
	 */
	public byte[]				szIPv4DefaultGateway = new byte[FinalVar.SDK_COMMON_STRING_32];			
	
	/**
	 * \if ENGLISH_LANG
	 * IPv4 DhcpEnable
	 * \else
	 * IPv4是否使能DHCP
	 * \endif
	 */
	public boolean 				bIPv4DhcpEnable;									
	
	/**
	 * \if ENGLISH_LANG
	 * IPv6 Address
	 * \else
	 * IPv6地址
	 * \endif
	 */
	public byte[]				szIPv6Address = new byte[FinalVar.SDK_COMMON_STRING_32];					
	
	/**
	 * \if ENGLISH_LANG
	 * IPv6 DefaultGateway
	 * \else
	 * IPv6默认网关
	 * \endif
	 */
	public byte[]				szIPv6DefaultGateway = new byte[FinalVar.SDK_COMMON_STRING_32];			
	
	/**
	 * \if ENGLISH_LANG
	 * IPv6 LinkLocalAddress
	 * \else
	 * IPv6本地链路地址,该地址只能直连,不需要Gateway
	 * \endif
	 */
	public byte[]				szIPv6LinkLocalAddress = new byte[FinalVar.SDK_COMMON_STRING_32];		
	
	/**
	 * \if ENGLISH_LANG
	 * IPv6 DhcpEnable
	 * \else
	 * IPv6是否使能Dhcp
	 * \endif
	 */
	public boolean				bIPv6DhcpEnable;									
	
	/**
	 * \if ENGLISH_LANG
	 * Protocol
	 * \else
	 * 设备搜索标准
	 * \endif
	 */
	public byte[]				szProtocol = new byte[FinalVar.SDK_COMMON_STRING_32];					
}
