package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * information of flicker light
 * \else
 * 灯光闪烁相关信息
 * \endif
 */
public class NET_FILCKER_LIGHTING implements Serializable{
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     * Is supported
     * \else
     * 是否支持灯光闪烁
     * \endif
     */
    public boolean				bSupported;

    /**
     * \if ENGLISH_LANG
     * Ability
     * \else
     * 支持灯光联动能力集
     * \endif
     */
    public NET_LINKING_ABILITY	stuAbility = new NET_LINKING_ABILITY();

    /**
     * \if ENGLISH_LANG
     * light type
     * \else
     * 闪烁灯光类型
     * \endif
     */
    public int	anLightType[] = new int[FinalVar.LC_LIGHT_TYPE_NUM];

    /**
     * \if ENGLISH_LANG
     * number of light
     * \else
     * 闪烁灯光数量
     * \endif
     */
    public int					nLightTypeLen;

    /**
     * \if ENGLISH_LANG
     * inteval time
     * \else
     * 闪烁间隔时间范围
     * \endif
     */
    public int					anFilckerIntevalTime[] = new int[2];

    /**
     * \if ENGLISH_LANG
     * range of config times.[0]:min,[1] max.
     * \else
     * 闪烁可配置次数
     * \endif
     */
    public int					anFilckerTimes[] = new int[2];


}
