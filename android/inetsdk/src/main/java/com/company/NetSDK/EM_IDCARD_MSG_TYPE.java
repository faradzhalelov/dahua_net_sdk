package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * @brief IDCard message type
 * \else
 * @brief 证件消息类型
 * \endif
 */
public class EM_IDCARD_MSG_TYPE implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     *  unknonwn
     * \else
     *  未知
     * \endif
     */
    public static final int					EM_IDCARD_MSG_TYP_UNKNOWN = 0;

    /**
     * \if ENGLISH_LANG
     *  query
     * \else
     *  证件查询信息
     * \endif
     */
    public static final int					EM_IDCARD_MSG_TYP_QUERY = 1;

    /**
     * \if ENGLISH_LANG
     *  issue permission
     * \else
     *  证件权限下发
     * \endif
     */
    public static final int					EM_IDCARD_MSG_TYPE_ISSUE_PERMISSION = 2;

}
