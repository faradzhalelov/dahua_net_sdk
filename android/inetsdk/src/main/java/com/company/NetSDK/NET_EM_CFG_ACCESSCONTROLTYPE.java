package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * @brief Access Control type
 * \else
 * @brief 门禁操作类型
 * \endif
 */
public class NET_EM_CFG_ACCESSCONTROLTYPE implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     *  Not for operation
     * \else
     *  不做操作
     * \endif
     */
    public static final int					NET_EM_CFG_ACCESSCONTROLTYPE_NULL = 0;

    /**
     * \if ENGLISH_LANG
     *  Automaitc
     * \else
     *  自动
     * \endif
     */
    public static final int					NET_EM_CFG_ACCESSCONTROLTYPE_AUTO = 1;

    /**
     * \if ENGLISH_LANG
     *  Open the door
     * \else
     *  开门
     * \endif
     */
    public static final int					NET_EM_CFG_ACCESSCONTROLTYPE_OPEN = 2;

    /**
     * \if ENGLISH_LANG
     *  Close the door
     * \else
     *  关门
     * \endif
     */
    public static final int					NET_EM_CFG_ACCESSCONTROLTYPE_CLOSE = 3;

    /**
     * \if ENGLISH_LANG
     *  Always open
     * \else
     *  永远开启
     * \endif
     */
    public static final int					NET_EM_CFG_ACCESSCONTROLTYPE_OPENALWAYS = 4;

    /**
     * \if ENGLISH_LANG
     *  Always close
     * \else
     *  永远关闭
     * \endif
     */
    public static final int					NET_EM_CFG_ACCESSCONTROLTYPE_CLOSEALWAYS = 5;

}