package com.company.NetSDK;

import java.io.Serializable;



/**
 * \if ENGLISH_LANG
 * VTO push message to platform type
 * \else
 * VTO推送信息到达平台类型
 * \endif
 */
public class EM_VTO_PUSH_TO_SERVER_TYPE implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     * Unknown
     * \else
     * 未知
     * \endif
     */
    public static final int EM_VTO_PUSH_TO_SERVER_TYPE_UNKNOWN = 0;

    /**
     * \if ENGLISH_LANG
     * IOS
     * \else
     * IOS
     * \endif
     */
    public static final int EM_VTO_PUSH_TO_SERVER_TYPE_IOS = 1;

    /**
     * \if ENGLISH_LANG
     * Android
     * \else
     * Android
     * \endif
     */
    public static final int EM_VTO_PUSH_TO_SERVER_TYPE_ANDROID = 2;

    /**
     * \if ENGLISH_LANG
     * Private cloud
     * \else
     * 私有云
     * \endif
     */
    public static final int EM_VTO_PUSH_TO_SERVER_TYPE_DAHUA_CLOUD = 3;

}
