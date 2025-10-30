package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * image options config of video input
 * \else
 * 图像属性配置
 * \endif
 */
public class NET_VIDEOIN_IMAGE_INFO implements  Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     * config type, you need set the value wether set or get config, refer to  {@link NET_EM_CONFIG_TYPE}
     * \else
     * 配置类型，获取和设置时都要制定, 取值参考 {@link NET_EM_CONFIG_TYPE}
     * \endif
     */
    public int                  	emCfgType;

    /**
     * \if ENGLISH_LANG
     * mirror
     * \else
     * 是否开启画面镜像功能
     * \endif
     */
    public boolean				bMirror;

    /**
     * \if ENGLISH_LANG
     * flip
     * \else
     * 是否开启画面翻转功能
     * \endif
     */
    public boolean				bFlip;

    /**
     * \if ENGLISH_LANG
     * 0-not rotate, 1-clockwise 90 degrees, 2-anti-clockwise 90 degrees
     * \else
     * 0-不旋转，1-顺时针90°，2-逆时针90°
     * \endif
     */
    public int					    nRotate90;
}
