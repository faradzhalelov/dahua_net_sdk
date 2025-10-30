package com.company.NetSDK;
import java.io.Serializable;
/**
 * \if ENGLISH_LANG
 * lighting config of video input
 * \else
 * 补光灯配置
 * \endif
 */
public class NET_VIDEOIN_LIGHTING_INFO implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     * lighting mode, refer to {@link NET_EM_LIGHTING_MODE}
     * \else
     * 灯光模式,取值参考 {@link NET_EM_LIGHTING_MODE}
     * \endif
     */
    public int                  emLightMode;

    /**
     * \if ENGLISH_LANG
     * correction of lighting
     * \else
     * 灯光补偿值，倍率优先时有效0-4
     * \endif
     */
    public int	                 nCorrection;

    /**
    * \if ENGLISH_LANG
    * Sensitive of lighting
    * \else
     * 灯光灵敏度，倍率优先时有效，0-5，默认为3
    * \endif
    */
    public int	                 nSensitive;

    /**
     * \if ENGLISH_LANG
     * near light 0-100
     * \else
     * 近光灯亮度0-100
     * \endif
     */
    public int	                 nNearLight;

    /**
     * \if ENGLISH_LANG
     * far light 0-100
     * \else
     * 远光灯亮度0-100
     * \endif
     */
    public int	                 nFarLight;
}
