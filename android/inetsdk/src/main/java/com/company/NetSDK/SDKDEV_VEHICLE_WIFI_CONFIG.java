package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * corresponding to interface {@link INetSDK#ControlDevice}, corresponding to command {@link CtrlType#SDK_VIHICLE_WIFI_ADD}
 * \else
 * 对应接口 {@link INetSDK#ControlDevice}, 对应命令{@link CtrlType#SDK_VIHICLE_WIFI_ADD}
 * \endif
 */
public class SDKDEV_VEHICLE_WIFI_CONFIG implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * SSID
	 * \else
	 * SSID
	 * \endif
	 */
	public byte	szSSID[] = new byte[128];
	
	/**
	 * \if ENGLISH_LANG
	 * Priority,(1-32)
	 * \else
	 * 优先级,(1-32)
	 * \endif
	 */
	public int	nPriority;
	
	/**
	 * \if ENGLISH_LANG
	 * Verify type
	 * 0:OPEN 
	 * 1:RESTRICTE
	 * 2:WEP
	 * 3:WPA
	 * 4:WPA2
	 * 5:WPA-PSK
	 * 6:WPA2-PSK
	 * \else
	 * 校验类型
	 * 0:OPEN 
	 * 1:RESTRICTE
	 * 2:WEP
	 * 3:WPA
	 * 4:WPA2
	 * 5:WPA-PSK
	 * 6:WPA2-PSK
	 * \endif
	 */
	public int	nSafeType;
	
	/**
	 * \if ENGLISH_LANG
	 * Encryption method
	 * 0:OPEN
	 * 1:TKIP
	 * 2:WEP
	 * 3:AES
	 * 4:NONE(No verify)
	 * 5:AUTO
	 * 6:SHARED
	 * \else
	 * 加密方式
	 * 0:OPEN
	 * 1:TKIP
	 * 2:WEP
	 * 3:AES
	 * 4:NONE(不校验)
	 * 5:AUTO
	 * 6:SHARED
	 * \endif
	 */
	public int	nEncryprion;
	
	/**
	 * \if ENGLISH_LANG
	 * Connection key
	 * \else
	 * 连接密钥
	 * \endif
	 */
	public byte	szKey[] = new byte[128];
	
	/**
	 * \if ENGLISH_LANG
	 * Host address
	 * \else
	 * 主机地址
	 * \endif
	 */
	public byte	szHostIP[] = new byte[128];
	
	/**
	 * \if ENGLISH_LANG
	 * Host mask
	 * \else
	 * 主机掩码
	 * \endif
	 */
	public byte	szHostNetmask[] = new byte[128];
	
	/**
	 * \if ENGLISH_LANG
	 * Host gateway
	 * \else
	 * 主机网关
	 * \endif
	 */
	public byte	szHostGateway[] = new byte[128];
	
	/**
	 * \if ENGLISH_LANG
	 * 0:unable 1:enable(default value is 1)
	 * \else
	 * 0：不使能	1：使能(扫描到的dhcp默认使能打开)
	 * \endif
	 */
	public int  nEnDHCP;
	
	/**
	 * \if ENGLISH_LANG
	 * Verify index of WEP,0:no support,1-4 is index
	 * \else
	 * WEP校验类型下的密钥索引,0：不支持密钥索引 >0:密钥索引值，范围1-4
	 * \endif
	 */
	public byte byKeyIndex;
}
