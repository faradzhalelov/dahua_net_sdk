package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * init device account input param
 * \else
 * 初始化设备账户输入结构体
 * \endif
 */
public class NET_IN_INIT_DEVICE_ACCOUNT implements Serializable{
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * \if ENGLISH_LANG
	 * device mac adress
	 * \else
	 * 设备mac地址
	 * \endif
	 */
	public byte[]					szMac = new byte[FinalVar.SDK_MACADDR_LEN];
	
	/**
	 * \if ENGLISH_LANG
	 * username
	 * \else
	 * 用户名
	 * \endif
	 */
	public byte[]					szUserName = new byte[FinalVar.MAX_USER_NAME_LEN];
	
	/**
	 * \if ENGLISH_LANG
	 * device password
	 * \else
	 * 设备密码
	 * \endif
	 */
	public byte[]					szPwd = new byte[FinalVar.MAX_PWD_LEN];
	
	/**
	 * \if ENGLISH_LANG
	 * cellphone
	 * \else
	 * 预留手机号
	 * \endif
	 */
	public byte[]					szCellPhone = new byte[FinalVar.MAX_CELL_PHONE_NUMBER_LEN];
	
	/**
	 * \if ENGLISH_LANG
	 * mail
	 * \else
	 * 预留邮箱
	 * \endif
	 */
	public byte[]					szMail = new byte[FinalVar.MAX_MAIL_LEN];
	
	/**
	 * \if ENGLISH_LANG
	 * init status:byInitStatus value of INetSDK.StartSearchDevices's , INetSDK.SearchDevicesByIPs's callback function and INetSDK.SearchDevices
	 * the meaning of this parameter refers to DEVICE_NET_INFO_EX ，if not need to change connecting to public network status or connecting to cellphone status, not change this value
	 * if you want to change connecting to public network status, set bit2~3 value. bit2~3 : 1-connect to public network unable; 2-connect to public network enable
	 * if you want to change connecting to cellphone status, set bit4~5 value. bit4~5 : 1-connect to cellphone unable; 2-connect to public cellphone enable
	 * this field already abandoned
	 * \else
	 * 设备初始化状态：搜索设备接口( INetSDK.SearchDevices 、 INetSDK.StartSearchDevices 的回调函数、 INetSDK.SearchDevicesByIPs )返回字段 byInitStatus 的值
	 * 该值的具体含义见 DEVICE_NET_INFO_EX 结构体，如果不要修改设备接入公网使能、手机直连使能状态，保持该值与设备搜索接口返回值相同；否则，按照如下方式修改该值
	 * 如果需要在初始化设备时修改设备接入公网使能状态，设置bit2~bit3的值：bit2~3 : 1-公网接入非使能    2-公网接入使能
	 * 如果需要在初始化设备时修改设备直连手机使能状态，设置bit4~bit5的值：bit4~5 : 1-手机直连非使能    2-手机直连使能
	 * 此字段已经废弃
	 * \endif
	 * @deprecated
	 */
	public byte 					byInitStatus;                             
	
	/**
	 * \if ENGLISH_LANG
	 * the way supported for reset password:byPwdResetWay value of {@link INetSDK#StartSearchDevices}'s , {@link INetSDK#SearchDevicesByIPs}'s callback function and {@link INetSDK#SearchDevices}
	 * the meaning of this parameter refers to DEVICE_NET_INFO_EX, the value must be same as byPwdResetWay returned by Search Devices Interface
	 * bit0 : 1-support reset password by cellphone, you should set cellphone in szCellPhone if you need to set cellphone
	 * bit1 : 1-support reset password by mail, you should set mail address in szMail if you need to set mail address
	 * \else
	 * 设备支持的密码重置方式：搜索设备接口({@link INetSDK#SearchDevices}、{@link INetSDK#StartSearchDevices}的回调函数、{@link INetSDK#SearchDevicesByIPs})返回字段byPwdResetWay的值	
	 * 该值的具体含义见 DEVICE_NET_INFO_EX 结构体，需要与设备搜索接口返回的 byPwdResetWay 值保持一致
	 * bit0 : 1-支持预留手机号，此时需要在szCellPhone数组中填入预留手机号(如果需要设置预留手机) ; 
	 * bit1 : 1-支持预留邮箱，此时需要在szMail数组中填入预留邮箱(如果需要设置预留邮箱)
	 * \endif
	 */
	public byte						byPwdResetWay;

	/**
	 * \if ENGLISH_LANG
	 *  初始化协议类型,{@link EM_ACCOUNT_PROTOCOL}
	 * \else
	 *  初始化协议类型,{@link EM_ACCOUNT_PROTOCOL}
	 * \endif
	 */
	public int					emAccountProtocol;
}
