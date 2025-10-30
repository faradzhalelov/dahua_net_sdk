package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Ability of linking
 * \else
 * 支持灯光联动的能力集
 * \endif
 */
public class NET_LINKING_ABILITY  implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;


    /**
     * \if ENGLISH_LANG
     * Supported normal event，参考{@link EM_LC_SUPPORT_EVENTS}
     * \else
     * 支持的非智能事件，参考{@link EM_LC_SUPPORT_EVENTS}
     * \endif
     */
    public int		anSupportEvents[] = new int[FinalVar.MAX_SUPPORT_EVENT_NUM];

    /**
     * \if ENGLISH_LANG
     * Number of supported normal event
     * \else
     * 支持的非智能事件数量
     * \endif
     */
    public int							nSupportEventsLen;

    /**
     * \if ENGLISH_LANG
     * Supported intelligent scene，参考{@link EM_SCENE_CLASS_TYPE}
     * \else
     * 支持的智能规则，参考{@link EM_SCENE_CLASS_TYPE}
     * \endif
     */
    public int			anSupportIntelliScence[] = new int[FinalVar.MAX_SUPPORT_INTELLISCENE_NUM];

    /**
     * \if ENGLISH_LANG
     * Number of intelligent scene
     * \else
     * 支持的智能规则数量
     * \endif
     */
    public int							nSupportIntelliScenceLen;


}
