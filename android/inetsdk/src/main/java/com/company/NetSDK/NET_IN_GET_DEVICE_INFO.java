package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * the corresponding interface {@link INetSDK#QueryDevInfo},the corresponding command {@link FinalVar#NET_QUERY_DEV_REMOTE_DEVICE_INFO}, quire the input parameters of remote device information
 * \else
 * 对应接口 {@link INetSDK#QueryDevInfo}, 对应命令 {@link FinalVar#NET_QUERY_DEV_REMOTE_DEVICE_INFO}, 查询远程设备信息输入参数
 * \endif
 */
public class NET_IN_GET_DEVICE_INFO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Device ID
	 * \else
	 * 设备ID
	 * \endif
	 */
	public byte                        szDevice[] = new byte[FinalVar.SDK_DEV_ID_LEN_EX];

	/**
	 * \if ENGLISH_LANG
	 * device address
	 * \else
	 * 设备地址
	 * \endif
	 */
	public byte                        szAttributeIP[] = new byte[FinalVar.SDK_COMMON_STRING_32];

	/**
	 * \if ENGLISH_LANG
	 * device port
	 * \else
	 * 设备端口
	 * \endif
	 */
	public int                         nAttributePort;

	/**
	 * \if ENGLISH_LANG
	 * user name
	 * \else
	 * 用户名
	 * \endif
	 */
	public byte                        szAttributeUsername[] = new byte[FinalVar.SDK_COMMON_STRING_128];

	/**
	 * \if ENGLISH_LANG
	 * password
	 * \else
	 * 密码
	 * \endif
	 */
	public byte                        szAttributePassword[] = new byte[FinalVar.SDK_COMMON_STRING_128];

	/**
	 * \if ENGLISH_LANG
	 * manufacturer protocl
	 * \else
	 * 厂商协议
	 * \endif
	 */
	public byte                        szAttributeManufacturer[] = new byte[FinalVar.SDK_COMMON_STRING_128];
}
