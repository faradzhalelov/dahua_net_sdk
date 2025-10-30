package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * @brief View type of X Ray machine
 * \else
 * @brief X光机视角类型
 * \endif
 */
public class EM_XRAY_VIEW_TYPE implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     *  unknown type
     * \else
     * 未知
     * \endif
     */
    public static final int					EM_XRAY_VIEW_TYPE_UNKNOWN = -1;

    /**
     * \if ENGLISH_LANG
     *  main view
     * \else
     * 主视角
     * \endif
     */
    public static final int					EM_XRAY_VIEW_TYPE_MASTER = 0;

    /**
     * \if ENGLISH_LANG
     *  sub view
     * \else
     * 从视角
     * \endif
     */
    public static final int					EM_XRAY_VIEW_TYPE_SLAVE = 1;

}