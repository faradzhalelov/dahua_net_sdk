package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * Device download speed configuration
 * \else
 * 设备下载速度配置
 * \endif
 */
public class NET_CFG_RECORD_DOWNLOAD_SPEED_ALL_INFO implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     *  Downlaod Speed
     * \else
     *  设备下载速度
     * \endif
     */
    public int					emSpeed;

}
