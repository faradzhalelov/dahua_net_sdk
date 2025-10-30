package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * wireless routing config, the corresponding interface {@link INetSDK#GetDevConfig}和{@link INetSDK#SetDevConfig},the corresponding command {@link FinalVar#SDK_DEV_WIRELESS_ROUTING_CFG}
 * \else
 * 无线路由配置, 对应接口 {@link INetSDK#GetDevConfig}和{@link INetSDK#SetDevConfig},对应命令 {@link FinalVar#SDK_DEV_WIRELESS_ROUTING_CFG}
 * \endif
 */
public class SDKDEV_WIRELESS_ROUTING_CFG implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * enable
	 * \else
	 * 使能
	 * \endif
	 */
	public boolean                bEnable;

	/**
	 * \if ENGLISH_LANG
	 * SSID
	 * \else
	 * SSID名称
	 * \endif
	 */
	public byte                szSSID[] = new byte[36];

	/**
	 * \if ENGLISH_LANG
	 * hide SSID
	 * \else
	 * 是否隐藏SSID
	 * \endif
	 */
	public boolean                bHideSSID;

	/**
	 * \if ENGLISH_LANG
	 * IP
	 * \else
	 * IP
	 * \endif
	 */
	public byte                szIP[] = new byte[FinalVar.SDK_MAX_IPADDR_LEN];

	/**
	 * \if ENGLISH_LANG
	 * sub mark
	 * \else
	 * 子网掩码
	 * \endif
	 */
	public byte                szSubMark[] = new byte[FinalVar.SDK_MAX_IPADDR_LEN];

	/**
	 * \if ENGLISH_LANG
	 * gateway
	 * \else
	 * 网关
	 * \endif
	 */
	public byte                szGateWay[] = new byte[FinalVar.SDK_MAX_IPADDR_LEN];

	/**
	 * \if ENGLISH_LANG
	 * country
	 * \else
	 * 国家, Default默认不指定。国家名称列表参考无线路由能力信息
	 * \endif
	 */
	public byte                szCountry[] = new byte[32];

	/**
	 * \if ENGLISH_LANG
	 * safe type: 1-no encryption; 2-WEP; 2-WPA-PSK; 3-WPA2-PSK
	 * \else
	 * 鉴权模式: 1-不加密; 2-WEP模式; 2-WPA-PSK模式; 3-WPA2-PSK模式
	 * \endif
	 */
	public int                 nSafeType;

	/**
	 * \if ENGLISH_LANG
	 * encryption: WEP(1-auto 2-open 3-shareable); WPA-PSK/WPA2-PSK(4-TKIP 5-AES)
	 * \else
	 * 加密方式: WEP模式(1-自动 2-开放 3-共享); WPA-PSK模式/WPA2-PSK模式(4-TKIP 5-AES)
	 * \endif
	 */
	public int                 nEncryption;

	/**
	 * \if ENGLISH_LANG
	 * key
	 * \else
	 * 连接密钥
	 * \endif
	 */
	public byte                szKey[] = new byte[32];

	/**
	 * \if ENGLISH_LANG
	 * channel
	 * \else
	 * 信道, 有效信道列表参考无线路由能力信息
	 * \endif
	 */
	public int                 nChannel;

	/**
	 * \if ENGLISH_LANG
	 * auto channel select
	 * \else
	 * 自动选择信道
	 * \endif
	 */
	public boolean                bAutoChannelSelect;
}
