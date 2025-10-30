package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Media encrypt info
 * \else
 * 媒体数据加密配置
 * \endif
 */
public class NET_MEDIA_ENCRYPT_INFO implements Serializable {

    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     * whether Key frame encrypt is enable
     * \else
     * 是否开启关键帧数据加密
     * \endif
     */
    public boolean                      bKeyFrameEncryptEnable;

    /**
     * \if ENGLISH_LANG
     * VK update time,Unit:minute, if this value is 0, it means not change the VK update time
     * \else
     * 密钥更新周期,单位:分钟,若为0,则表示密钥不更新
     * \endif
     */
    public int         				nVKUpdateTime;

    /**
     * \if ENGLISH_LANG
     * whether RTSP and TLS server is enable
     * \else
     * 是否开启RTSP TLS服务
     * \endif
     */
    public boolean                      bRTSPOverTlsEnable;

    /**
     * \if ENGLISH_LANG
     * encryption algorithm {@link EM_ALGORITHM_TYPE}
     * \else
     * 加密算法
     * \endif
     */
    public int                      emAlgorithm;
}
