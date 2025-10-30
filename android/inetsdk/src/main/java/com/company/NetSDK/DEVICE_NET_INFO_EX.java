package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Corresponding to interface {@link INetSDK#StartSearchDevices}
 * \else
 * 对应接口 {@link INetSDK#StartSearchDevices}
 * \endif
 */
public class DEVICE_NET_INFO_EX implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * 4 for IPV4, 6 for IPV6
	 * \else
	 * 端口序号
	 * \endif
	 */
	public int                 iIPVersion;
	
	/**
	 * \if ENGLISH_LANG
	 * IP IPV4 like"192.168.0.1" IPV6 like "2008::1/64"
	 * \else
	 * IP IPV4形如"192.168.0.1" IPV6形如"2008::1/64"
	 * \endif
	 */
	public byte				szIP[] = new byte[64];
	
	/**
	 * \if ENGLISH_LANG
	 * Tcp port
	 * \else
	 * tcp端口
	 * \endif
	 */
	public int				    nPort;
	
	/**
	 * \if ENGLISH_LANG
	 * Subnet mask(IPV6 do not have subnet mask)
	 * \else
	 * 子网掩码 IPV6无子网掩码
	 * \endif
	 */
	public byte				szSubmask[] = new byte[64];
	
	/**
	 * \if ENGLISH_LANG
	 * Gateway
	 * \else
	 * 网关
	 * \endif
	 */
	public byte				szGateway[] = new byte[64];
	
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
	 * 设备类型
	 * \endif
	 */
	public byte				szDeviceType[] = new byte[FinalVar.SDK_DEV_TYPE_LEN];
	
	/**
	 * \if ENGLISH_LANG
	 * Device manufactory, see {@link EM_IPC_TYPE}
	 * \else
	 * 目标设备的生产厂商,具体参考 {@link EM_IPC_TYPE}
	 * \endif
	 */
	public byte                byManuFactory;
	
	/**
	 * \if ENGLISH_LANG
	 * 1-Standard definition 2-High definition
	 * \else
	 * 1-标清 2-高清
	 * \endif
	 */
	public byte                byDefinition;
	
	/**
	 * \if ENGLISH_LANG
	 * Dhcp, true-open, false-close
	 * \else
	 * Dhcp使能状态, true-开, false-关
	 * \endif
	 */
	public boolean                bDhcpEn;
	
	/**
	 * \if ENGLISH_LANG
	 * ECC data 
	 * \else
	 * 校验数据 通过异步搜索回调获取(在修改设备IP时会用此信息进行校验)
	 * \endif
	 */
	public byte                verifyData[] = new byte[88];
	
	/**
	 * \if ENGLISH_LANG
	 * Serial no
	 * \else
	 * 端序列号
	 * \endif
	 */
	public byte                szSerialNo[] = new byte[FinalVar.SDK_DEV_SERIALNO_LEN];
	
	/**
	 * \if ENGLISH_LANG
	 * Soft version  
	 * \else
	 * 设备软件版本号   
	 * \endif
	 */
	public byte                szDevSoftVersion[] = new byte[FinalVar.SDK_MAX_URL_LEN];
	
	/**
	 * \if ENGLISH_LANG
	 * Device detail type
	 * \else
	 * 设备型号
	 * \endif
	 */
	public byte                szDetailType[] = new byte[FinalVar.SDK_DEV_TYPE_LEN];
	
	/**
	 * \if ENGLISH_LANG
	 * OEM type
	 * \else
	 * OEM客户类型
	 * \endif
	 */
	public byte                szVendor[] = new byte[FinalVar.SDK_MAX_STRING_LEN];
	
	/**
	 * \if ENGLISH_LANG
	 * Device name
	 * \else
	 * 设备名称
	 * \endif
	 */
	public byte                szDevName[] = new byte[FinalVar.SDK_MACHINE_NAME_NUM];
	
	/**
	 * \if ENGLISH_LANG
	 * User name for log in device(it need be filled when modify device ip)
	 * \else
	 * 登陆设备用户名（在修改设备IP时需要填写）
	 * \endif
	 */
	public byte                szUserName[] = new byte[FinalVar.SDK_USER_NAME_LENGTH_EX];
	
	/**
	 * \if ENGLISH_LANG
	 * Pass word for log in device(it need be filled when modify device ip)
	 * \else
	 * 登陆设备密码（在修改设备IP时需要填写）
	 * \endif
	 */
	public byte                szPassWord[] = new byte[FinalVar.SDK_USER_NAME_LENGTH_EX];
	
	/**
	 * \if ENGLISH_LANG
	 * HTTP server port
	 * \else
	 * HTTP服务端口号
	 * \endif
	 */
	public int					nHttpPort;
	
	/**
	 * \if ENGLISH_LANG
	 * Count of video input channel
	 * \else
	 * 视频输入通道数
	 * \endif
	 */
	public int                	wVideoInputCh;
	
	/**
	 * \if ENGLISH_LANG
	 * Count of remote video input
	 * \else
	 * 远程视频输入通道数
	 * \endif
	 */
	public int                	wRemoteVideoInputCh;
	
	/**
	 * \if ENGLISH_LANG
	 * Count of video output channel 
	 * \else
	 * 视频输出通道数
	 * \endif
	 */
	public int                	wVideoOutputCh;
	
	/**
	 * \if ENGLISH_LANG
	 * Count of alarm input
	 * \else
	 * 报警输入通道数
	 * \endif
	 */
	public int                	wAlarmInputCh;
	
	/**
	 * \if ENGLISH_LANG
	 * Count of alarm output
	 * \else
	 * 报警输出通道数
	 * \endif
	 */
	public int                	wAlarmOutputCh;
	
	/**
	 * \if ENGLISH_LANG
	 * TRUE:szNewPassWord Enable
	 * \else
	 * TRUE使用新密码字段szNewPassWord
	 * \endif
	 */
    public boolean             bNewWordLen;                            
    
	/**
	 * \if ENGLISH_LANG
	 * pass word for log in device(it need be filled when modify device ip)
	 * \else
	 * 登陆设备密码（在修改设备IP时需要填写）
	 * \endif
	 */
    public byte[]              szNewPassWord = new byte[FinalVar.SDK_COMMON_STRING_64];     
    
	/**
	 * \if ENGLISH_LANG
	 *  init status,bit0~1：0-old device, can not be init; 1-not init; 2-already init
	 *  bit2~3：0-old device,reserved; 1-connect to public network unable; 2-connect to public network enable
	 *  bit4~5：0-old device,reserved; 1-connect to cellphone unable; 2-connect to cellphone enable
	 *  bit6~7: 0- unknown 1-unsupported reset password 2-support password
	 * \else
	 * 设备初始化状态，按位确定初始化状态。
	 * bit0~1：0-老设备，没有初始化功能 1-未初始化账号 2-已初始化账户;
	 * bit2~3：0-老设备，保留 1-公网接入未使能 2-公网接入已使能;
	 * bit4~5：0-老设备，保留 1-手机直连未使能 2-手机直连使能
	 * bit6~7: 0- 未知 1-不支持密码重置 2-支持密码重置
	 * \endif
	 */
    public byte				   byInitStatus;							

	/**
	 * \if ENGLISH_LANG
	 * the way supported for reset password:make sense when the device is init
	 * bit0-support reset password by cellphone;
	 * bit1-support reset password by mail;
	 * bit2-support reset password by XML file;
	 * bit3-support reset password by internal register cellphone
	 * \else
	 * 支持密码重置方式：按位确定密码重置方式，只在设备有初始化账号时有意义。
	 * bit0-支持预置手机号
	 * bit1-支持预置邮箱
	 * bit2-支持文件导出
	 * bit3-支持国内注册手机号
	 * \endif
	 */
    public byte				  byPwdResetWay;		

	/**
	 * \if ENGLISH_LANG
	 * special ability of device
	 * \else
	 * 设备初始化能力，按位确定初始化能力. bit0：是否支持2DCode  0-不支持 1-支持
	 * \endif
	 */
    public byte				  bySpecialAbility;

	/**
	 * \if ENGLISH_LANG
	 * device detail type
	 * \else
	 * 设备型号
	 * \endif
	 */
	public byte[]                szNewDetailType = new byte[FinalVar.SDK_COMMON_STRING_64];

	/**
	 * \if ENGLISH_LANG
	 * TRUE:szNewUserName enable
	 * \else
	 * TRUE表示使用新用户名(szNewUserName)字段
	 * \endif
	 */
	public boolean			   bNewUserName;

	/**
	 * \if ENGLISH_LANG
	 * new user name for login device(it need be filled when modify device ip)
	 * \else
	 * 登陆设备用户名（在修改设备IP时需要填写）
	 * \endif
	 */
	public byte[]				   szNewUserName = new byte[FinalVar.SDK_COMMON_STRING_64];


	/**
	 * \if ENGLISH_LANG
	 * password find version, effective when device supports reset password
	 * 0-device of old scheme reset password version;
	 * 1-support reset password by reserved contact;
	 * 2-support reset password by change contact;
	 * \else
	 * 密码找回的版本号,设备支持密码重置时有效
	 * 0-设备使用的是老方案的密码重置版本
	 * 1-支持预留联系方式进行密码重置操作
	 * 2-支持更换联系方式进行密码重置操作
	 * \endif
	 */
	public byte				  byPwdFindVersion;

	/**
	 * \if ENGLISH_LANG
	 * Unlogged function mask
	 * Bit0 Wifi list scan and WLan settings
	 * Bit1 supports the modification of expired password outside the session
	 * Bit2 Device supports debug info redirection
	 * \else
	 * 未登陆功能掩码
	 * Bit0 Wifi列表扫描及WLan设置
	 * Bit1支持会话外修改过期密码
	 * Bit2设备是否支持串口日志重定向（提前引导功能）
	 * \endif
	 */
	public int                	dwUnLoginFuncMask;

	/**
	 * \if ENGLISH_LANG
	 * Flir field
	 * \else
	 * Flir字段，不作为通用协议，不对接通用客户端
	 * \endif
	 */
	public byte[]				szDeviceID = new byte[FinalVar.SDK_DEV_CUSTOM_DEVICEID_LEN];

	/**
	 * \if ENGLISH_LANG
	 * Device WiFi country code, such as: "CN": China; "US": United States; "JP": Japan; "NA": NorthAmerica
	 * \else
	 * 设备wifi国家码
	 * \endif
	 */
	public byte[]				szCountryCode = new byte[3];

	/**
	 * \if ENGLISH_LANG
	 * Machine Group
	 * \else
	 * 设备分组
	 * \endif
	 */
	public byte[]				szMachineGroup = new byte[64];

	/**
	 * \if ENGLISH_LANG
	 * network search method to find the device;(0:form IPv4 Multicast 1:form IPv6 Multicast)
	 * \else
	 * 通过哪种网络搜索方式发现该设备;0:从IPv4组播地址发现设备 1:从IPv6组播地址发现设备
	 * \endif
	 */
	public int                	emIPVersionFrom;
}
