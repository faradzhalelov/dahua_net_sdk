package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * information of normally on
 * \else
 * 灯光常亮信息
 * \endif
 */
public class NET_KEEP_LIGHTING  implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     * Is supported
     * \else
     * 是否支持灯光常亮
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
     * 常亮灯光类型
     * \endif
     */
    public int	anLightType[] = new int[FinalVar.LC_LIGHT_TYPE_NUM];

    /**
     * \if ENGLISH_LANG
     * number of light
     * \else
     * 常亮灯光数量
     * \endif
     */
    public int					nLightTypeLen;

}
