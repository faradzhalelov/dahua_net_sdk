package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Video in backlight configuration, the corresponding interface {@link INetSDK#GetNewDevConfig} and {@link INetSDK#SetNewDevConfig},the corresponding command {@link FinalVar#CFG_CMD_VIDEOIN_BACKLIGHT}
 * \else
 * 环境光线配置, 对应接口 {@link INetSDK#GetNewDevConfig} 和 {@link INetSDK#SetNewDevConfig},对应命令 {@link FinalVar#CFG_CMD_VIDEOIN_BACKLIGHT}
 * \endif
 */
public class CFG_VIDEOIN_BACKLIGHT_INFO implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     * the basic configuration information of video in backlight, 0-day  1-night  2-normal
     * \else
     * 环境光线配置信息,0-白天, 1-夜晚, 2-普通
     * \endif
     */
    public CFG_VIDEOIN_BACKLIGHT_BASE[]		stuVideoInBackLight = new CFG_VIDEOIN_BACKLIGHT_BASE[FinalVar.BACKLIGHT_CONFIG_COUNT];

    public CFG_VIDEOIN_BACKLIGHT_INFO() {
        for(int i = 0; i < FinalVar.BACKLIGHT_CONFIG_COUNT; i++) {
            stuVideoInBackLight[i] = new CFG_VIDEOIN_BACKLIGHT_BASE();
        }
    }
}
