package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * input param, the corresponding interface {@link INetSDK#GetDevCaps},the corresponding command {@link FinalVar#NET_VIDEOIN_CAPS}
 * \else
 * 入参, 对应接口 {@link INetSDK#GetDevCaps},对应命令 {@link FinalVar#NET_VIDEOIN_CAPS}
 * \endif
 */
public class NET_IN_VIDEOIN_CAPS implements Serializable{
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Channel ID
	 * \else
	 * 通道号
	 * \endif
	 */
    public int                           nChannel;       
    
	/**
	 * \if ENGLISH_LANG
	 *  type of videoin caps, refer to {@link NET_ENUM_VIDEOIN_CAP_TYPE}
	 * \else
	 * 设备视频输出能力类型,取值参考 {@link NET_ENUM_VIDEOIN_CAP_TYPE}
	 * \endif
	 */
    public int          				emCapType;                  
}
