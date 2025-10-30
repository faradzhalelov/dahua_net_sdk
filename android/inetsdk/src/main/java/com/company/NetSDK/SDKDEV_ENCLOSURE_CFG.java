package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * enclosure config, the corresponding interface {@link INetSDK#GetDevConfig}和{@link INetSDK#SetDevConfig},the corresponding command {@link FinalVar#SDK_DEV_ENCLOSURE_CFG}
 * \else
 * 电子围栏配置, 对应接口 {@link INetSDK#GetDevConfig}和{@link INetSDK#SetDevConfig},对应命令 {@link FinalVar#SDK_DEV_ENCLOSURE_CFG}
 * \endif
 */
public class SDKDEV_ENCLOSURE_CFG implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * mask
	 * \else
	 * 电子围栏类型掩码，见 ENCLOSURE_TYPE
	 * \endif
	 */
	public int          unType;

	/**
	 * \if ENGLISH_LANG
	 * front 4 bit means country, province, city, town
	 * \else
	 * 前四位分别代表国家、省、市或区、县(0-255)，后4bytes保留
	 * \endif
	 */
	public byte          bRegion[] = new byte[8];

	/**
	 * \if ENGLISH_LANG
	 * rect id
	 * \else
	 * 一个区域以一个ID标识
	 * \endif
	 */
	public int          unId;

	/**
	 * \if ENGLISH_LANG
	 * speed limit(km/h)
	 * \else
	 * 限速，单位km/h
	 * \endif
	 */
	public int          unSpeedLimit;

	/**
	 * \if ENGLISH_LANG
	 * rect point number
	 * \else
	 * 电子围栏区域顶点数
	 * \endif
	 */
	public int          unPointNum;

	/**
	 * \if ENGLISH_LANG
	 * rect point info
	 * \else
	 * 电子围栏区域信息
	 * \endif
	 */
	public GPS_POINT     stPoints[] = new GPS_POINT[128];

	/**
	 * \if ENGLISH_LANG
	 * station name
	 * \else
	 * 电子围栏包围的车站站点名称
	 * \endif
	 */
	public byte          szStationName[] = new byte[FinalVar.SDK_STATION_NAME_LEN];
	
	public SDKDEV_ENCLOSURE_CFG() {
		for (int i = 0; i < 128; i++) {
			stPoints[i] = new GPS_POINT();
		}
	}
}
