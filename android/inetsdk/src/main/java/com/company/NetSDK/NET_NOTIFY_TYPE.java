package com.company.NetSDK;

import java.io.Serializable;
public class NET_NOTIFY_TYPE implements Serializable{
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     * unknown
     * \else
     * 未知
     * \endif
     */
    public static final int NET_NOTIFY_TYPE_UNKNOWN   = 0;

    /**
     * \if ENGLISH_LANG
     * message, SMS
     * \else
     * 短信
     * \endif
     */
    public static final int NET_NOTIFY_TYPE_SMS   = 1;

    /**
     * \if ENGLISH_LANG
     * phone call
     * \else
     * 电话
     * \endif
     */
    public static final int NET_NOTIFY_TYPE_CALL   = 2;

    /**
     * \if ENGLISH_LANG
     * SMS&CALL
     * \else
     * 短信&电话
     * \endif
     */
    public static final int NET_NOTIFY_TYPE_ALL   = 3;
}
