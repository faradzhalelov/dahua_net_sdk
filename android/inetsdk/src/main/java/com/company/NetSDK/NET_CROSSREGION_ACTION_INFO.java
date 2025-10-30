package com.company.NetSDK;

import java.io.Serializable;

/**W
 * \if ENGLISH_LANG
 * Warning zone detected operation type
 * \else
 * 区域检测事件动作
 * \endif
 */
public class NET_CROSSREGION_ACTION_INFO implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     * unknown
     * \else
     * unknown
     * \endif
     */
    public static final int EM_CROSSREGION_ACTION_UNKNOW = 0;

    /**
     * \if ENGLISH_LANG
     * In the area
     * \else
     * 在区域内
     * \endif
     */
    public static final int EM_CROSSREGION_ACTION_INSIDE = 1;

    /**
     * \if ENGLISH_LANG
     * Cross area
     * \else
     * 穿越区域
     * \endif
     */
    public static final int EM_CROSSREGION_ACTION_CROSS = 2;

    /**
     * \if ENGLISH_LANG
     * Appear
     * \else
     * 出现
     * \endif
     */
    public static final int EM_CROSSREGION_ACTION_APPEAR  = 3;

    /**
     * \if ENGLISH_LANG
     * Disappear
     * \else
     * 消失
     * \endif
     */
    public static final int EM_CROSSREGION_ACTION_DISAPPEAR = 4;

}
