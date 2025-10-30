package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Channel config of light, the corresponding interface {@link INetSDK#GetNewDevConfig} and {@link INetSDK#SetNewDevConfig},the corresponding command {@link FinalVar#CFG_CMD_LIGHTING_V2}
 * \else
 * 补光灯灵敏度配置, 对应接口 {@link INetSDK#GetNewDevConfig} 和 {@link INetSDK#SetNewDevConfig},对应命令 {@link FinalVar#CFG_CMD_LIGHTING_V2}
 * \endif
 */
public class CFG_LIGHTING_V2_INFO implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     * Channel
     * \else
     * 通道
     * \endif
     */
    public int				nChannel;

    /**
     * \if ENGLISH_LANG
     * Array number of day and night light config
     * \else
     * 白天黑夜对应灯光配置数量
     * \endif
     */
    public int				nDNLightInfoNum;


    /**
     * \if ENGLISH_LANG
     * Config of day and night
     * \else
     * 白天黑夜对应灯光配置
     * 从元素0开始分别表示 白天、夜晚、普通、顺光、一般逆光、强逆光、低照度、自定义
     * \endif
     */
    public CFG_LIGHTING_V2_DAYNIGHT[]			anDNLightInfo = new CFG_LIGHTING_V2_DAYNIGHT[FinalVar.CFG_LC_LIGHT_CONFIG];

    public CFG_LIGHTING_V2_INFO()
    {
        for(int i = 0; i < FinalVar.CFG_LC_LIGHT_CONFIG; i++ )
        {
            anDNLightInfo[i] = new CFG_LIGHTING_V2_DAYNIGHT();
        }

    }
}
