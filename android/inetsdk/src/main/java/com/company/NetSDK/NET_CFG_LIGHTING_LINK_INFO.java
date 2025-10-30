package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * @brief PTZ supplementary light linkage item
 * \else
 * @brief 云台补光灯联动项
 * \endif
 */
public class NET_CFG_LIGHTING_LINK_INFO implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     *  Enzble
     * \else
     * 使能
     * \endif
     */
    public boolean					bEnable;

    /**
     * \if ENGLISH_LANG
     *  Flashing light type				
     * \else
     * 闪烁灯光类型				
     * \endif
     */
    public int					emFilckerLightType;

    /**
     * \if ENGLISH_LANG
     *  Lighting linkage mode
     * \else
     * 灯光联动方式
     * \endif
     */
    public int					emLightlinkType;

    /**
     * \if ENGLISH_LANG
     *  Filcker inteval time
     * \else
     * 闪烁间隔时间
     * \endif
     */
    public float					fFilckerIntevalTime;

    /**
     * \if ENGLISH_LANG
     *  Filcker times
     * \else
     * 闪烁可配置的次数
     * \endif
     */
    public int					nFilckerTimes;

    /**
     * \if ENGLISH_LANG
     *  light duration
     * \else
     * 灯光闪烁或常亮持续时间,单位秒
     * \endif
     */
    public int					nLightDuration;

    /**
     * \if ENGLISH_LANG
     *  Brightness of linkage light
     * \else
     * 联动灯光的亮度
     * \endif
     */
    public int					nLightBright;

    /**
     * \if ENGLISH_LANG
     *  White light time section
     * \else
     * 白光灯联动时间段
     * \endif
     */
    public NET_CFG_TIME_SECTION					stuWhiteLightTimeSection[][] = new NET_CFG_TIME_SECTION[7][6];

    public NET_CFG_LIGHTING_LINK_INFO() {
        for(int i = 0; i < 7; i ++){
            for(int j = 0; j < 6; j ++){
                stuWhiteLightTimeSection[i][j] = new NET_CFG_TIME_SECTION();
            }
        }
    }
}