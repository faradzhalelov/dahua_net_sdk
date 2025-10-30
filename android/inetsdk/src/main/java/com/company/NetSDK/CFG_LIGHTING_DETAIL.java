package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Light setting details
 * \else
 * 灯光设置详情
 * \endif
 */
public class CFG_LIGHTING_DETAIL  implements Serializable {

    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     * Light compensation (0 ~ 4) effective ratio is preferred
     * \else
     * 灯光补偿 (0~4) 倍率优先时有效
     * \endif
     */
    public int                                 nCorrection;

    /**
     * \if ENGLISH_LANG
     * Light sensitivity (0 ~ 5) are effective ratio is preferred, the default value is 3    EM_CFG_LIGHTING_MODE                emMode;                          // Light pattern
     * \else
     * 灯光灵敏度(0~5)倍率优先时有效，默认为3
     * \endif
     */
    public int                                 nSensitive;

    /**
     * \if ENGLISH_LANG
     * Light mode，refer to {@link EM_CFG_LIGHTING_MODE}
     * \else
     * 灯光模式，refer to {@link EM_CFG_LIGHTING_MODE}
     * \endif
     */
    public int                emMode;

    /**
     * \if ENGLISH_LANG
     * Dipped headlights effective number
     * \else
     * 近光灯有效个数
     * \endif
     */
    public int                                 nNearLight;

    /**
     * \if ENGLISH_LANG
     * Dipped headlight list
     * \else
     * 近光灯列表
     * \endif
     */
    public CFG_NEARLIGHT_INFO[]                   stuNearLights = new CFG_NEARLIGHT_INFO[FinalVar.MAX_LIGHTING_NUM];

    /**
     * \if ENGLISH_LANG
     * High beam effective number
     * \else
     * 远光灯有效个数
     * \endif
     */
    public int                                 nFarLight;

    /**
     * \if ENGLISH_LANG
     * High beam list
     * \else
     * 远光灯列表
     * \endif
     */
    public CFG_FARLIGHT_INFO[]                   stuFarLights = new CFG_FARLIGHT_INFO[FinalVar.MAX_LIGHTING_NUM];

    public CFG_LIGHTING_DETAIL(){
        for (int i = 0; i < FinalVar.MAX_LIGHTING_NUM; i++){
            stuNearLights[i] = new CFG_NEARLIGHT_INFO();
            stuFarLights[i] = new CFG_FARLIGHT_INFO();
        }
    }
}
