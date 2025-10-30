package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Config of day and night
 * \else
 * 白天黑夜补光灯灵敏度配置
 * \endif
 */
public class CFG_LIGHTING_V2_DAYNIGHT implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;


    /**
     * \if ENGLISH_LANG
     * Light information
     * \else
     * 各类型灯光信息
     * \endif
     */
    public CFG_LIGHTING_V2_UNIT[]     anLightInfo = new CFG_LIGHTING_V2_UNIT[FinalVar.LC_LIGHT_TYPE_NUM];

    /**
     * \if ENGLISH_LANG
     * number of light
     * \else
     * 灯光类型数量
     * \endif
     */
    public int                      nLightInfoLen;

    public CFG_LIGHTING_V2_DAYNIGHT()
    {
        for(int i = 0; i < FinalVar.LC_LIGHT_TYPE_NUM; i++)
        {
            anLightInfo[i] = new CFG_LIGHTING_V2_UNIT();
        }

    }

}
