package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * @brief Port mapping status type
 * \else
 * @brief 端口映射状态类型
 * \endif
 */
public class EM_PORTMAP_STATUS_TYPE implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     *  status unknown
     * \else
     *  状态未知
     * \endif
     */
    public static final int					EM_PORTMAP_STATUS_UNKNOWN = 0;

    /**
     * \if ENGLISH_LANG
     *  mapping succeed
     * \else
     *  映射成功
     * \endif
     */
    public static final int					EM_PORTMAP_STATUS_SUCCESS = 1;

    /**
     * \if ENGLISH_LANG
     *  mapping failed
     * \else
     *  映射失败
     * \endif
     */
    public static final int					EM_PORTMAP_STATUS_FAILED = 2;

}
