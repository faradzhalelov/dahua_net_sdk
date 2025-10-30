package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * @brief CLIENT_InitDevGetLocalityConfig utput parameters
 * \else
 * @brief CLIENT_InitDevGetLocalityConfig 输出参数
 * \endif
 */
public class NET_OUT_INIT_DEVICE_GET_LOCALITY_CONFIG_INFO implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

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
     *  ideo format，{@link EM_VIDEO_STANDARD}
     * \else
     *  视频制式，{@link EM_VIDEO_STANDARD}
     * \endif
     */
    public int					emVideoStandard;

}