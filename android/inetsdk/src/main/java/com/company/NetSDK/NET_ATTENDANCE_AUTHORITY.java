package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 *  authority
 * \else
 *  用户权限
 * \endif
 */
public class NET_ATTENDANCE_AUTHORITY implements Serializable {

    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     *  Unknown
     * \else
     * 未知
     * \endif
     */
    public static final int NET_ATTENDANCE_AUTHORITY_UNKNOWN = -1;

    /**
     * \if ENGLISH_LANG
     *  customer
     * \else
     * 普通用户
     * \endif
     */
    public static final int NET_ATTENDANCE_AUTHORITY_CUSTOMER = 0;

    /**
     * \if ENGLISH_LANG
     *  administrators
     * \else
     * 管理员
     * \endif
     */
    public static final int NET_ATTENDANCE_AUTHORITY_ADMINISTRATORS = 1;

}
