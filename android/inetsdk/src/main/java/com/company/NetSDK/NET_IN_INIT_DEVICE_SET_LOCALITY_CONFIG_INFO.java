package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * @brief CLIENT_InitDevSetLocalityConfig input parameters
 * \else
 * @brief CLIENT_InitDevSetLocalityConfig 输入参数
 * \endif
 */
public class NET_IN_INIT_DEVICE_SET_LOCALITY_CONFIG_INFO implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     *  Device MAC address	
     * \else
     *  设备mac地址	
     * \endif
     */
    public byte					szMac[] = new byte[40];

    /**
     * \if ENGLISH_LANG
     *  Country / Region
     * \else
     *  国家/地区
     * \endif
     */
    public byte					szCountry[] = new byte[3];

    /**
     * \if ENGLISH_LANG
     *  Video format
     * \else
     *  视频制式,{@link EM_VIDEO_STANDARD}
     * \endif
     */
    public int					emVideoStandard;

}
