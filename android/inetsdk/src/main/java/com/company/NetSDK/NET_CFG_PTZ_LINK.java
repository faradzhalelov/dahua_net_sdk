package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Link PTZ information
 * \else
 * 联动云台信息
 * \endif
 */
public class NET_CFG_PTZ_LINK implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     * Link type, refer to {@link EM_PTZ_LINK_TYPE}
     * \else
     * 联动类型, 参考 {@link EM_PTZ_LINK_TYPE}
     * \endif
     */
    public int		                emType;

    /**
     * \if ENGLISH_LANG
     * The linkage value corresponds to the preset number,cruise number,and so on.
     * \else
     * 联动取值分别对应预置点号，巡航号等等
     * \endif
     */
    public int						nValue;
}
