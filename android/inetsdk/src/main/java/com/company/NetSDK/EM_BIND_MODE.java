package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * @brief binding mode
 * \else
 * @brief 绑定模式
 * \endif
 */
public class EM_BIND_MODE implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     *  unknown
     * \else
     * 未知
     * \endif
     */
    public static final int					EM_BIND_MODE_UNKNOWN = 0;

    /**
     * \if ENGLISH_LANG
     *  Automatic
     * \else
     * 自动
     * \endif
     */
    public static final int					EM_BIND_MODE_AUTOMATIC = 1;

    /**
     * \if ENGLISH_LANG
     *  Semiautomatic
     * \else
     * 半自动
     * \endif
     */
    public static final int					EM_BIND_MODE_SEMIAUTOMATIC = 2;

    /**
     * \if ENGLISH_LANG
     *  Manual
     * \else
     * 手动
     * \endif
     */
    public static final int					EM_BIND_MODE_MANUAL = 3;

}