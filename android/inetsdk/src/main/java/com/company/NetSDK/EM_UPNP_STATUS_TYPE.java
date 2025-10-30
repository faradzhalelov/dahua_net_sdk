package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * @brief UPnP status type
 * \else
 * @brief UPnP状态类型
 * \endif
 */
public class EM_UPNP_STATUS_TYPE implements Serializable {
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
    public static final int					EM_UPNP_STATUS_UNKNOWN = 0;

    /**
     * \if ENGLISH_LANG
     *  get succeed
     * \else
     *  获取成功
     * \endif
     */
    public static final int					EM_UPNP_STATUS_SUCCESS = 1;

    /**
     * \if ENGLISH_LANG
     *  get failed
     * \else
     *  获取失败
     * \endif
     */
    public static final int					EM_UPNP_STATUS_ERROR = 2;

}
