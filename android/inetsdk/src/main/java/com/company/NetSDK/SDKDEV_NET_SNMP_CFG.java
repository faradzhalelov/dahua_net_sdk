package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * struct SNMP config struct, the corresponding interface {@link INetSDK#GetDevConfig}和{@link INetSDK#SetDevConfig},the corresponding command {@link FinalVar#SDK_DEV_SNMP_CFG}
 * \else
 * SNMP配置结构, 对应接口 {@link INetSDK#GetDevConfig}和{@link INetSDK#SetDevConfig},对应命令 {@link FinalVar#SDK_DEV_SNMP_CFG}
 * \endif
 */
public class SDKDEV_NET_SNMP_CFG implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * SNMP enable
	 * \else
	 * SNMP使能
	 * \endif
	 */
	public boolean                bEnable;

	/**
	 * \if ENGLISH_LANG
	 * SNMP port
	 * \else
	 * SNMP端口
	 * \endif
	 */
	public int                 iSNMPPort;

	/**
	 * \if ENGLISH_LANG
	 * read common
	 * \else
	 * 读共同体
	 * \endif
	 */
	public byte                szReadCommon[] = new byte[FinalVar.SDK_MAX_SNMP_COMMON_LEN];

	/**
	 * \if ENGLISH_LANG
	 * write common
	 * \else
	 * 写共同体
	 * \endif
	 */
	public byte                szWriteCommon[] = new byte[FinalVar.SDK_MAX_SNMP_COMMON_LEN];

	/**
	 * \if ENGLISH_LANG
	 * trap address
	 * \else
	 * trap地址
	 * \endif
	 */
	public byte                szTrapServer[] = new byte[64];

	/**
	 * \if ENGLISH_LANG
	 * trap port
	 * \else
	 * trap端口
	 * \endif
	 */
	public int                 iTrapPort;

	/**
	 * \if ENGLISH_LANG
	 * SNMP V1 enable
	 * \else
	 * 设备是否开启支持版本1格式，0不使能；1使能
	 * \endif
	 */
	public byte                bSNMPV1;

	/**
	 * \if ENGLISH_LANG
	 * SNMP V2 enable
	 * \else
	 * 设备是否开启支持版本2格式，0不使能；1使能
	 * \endif
	 */
	public byte                bSNMPV2;

	/**
	 * \if ENGLISH_LANG
	 * SNMP V3 enable
	 * \else
	 * 设备是否开启支持版本3格式，0不使能；1使能
	 * \endif
	 */
	public byte                bSNMPV3;
}
