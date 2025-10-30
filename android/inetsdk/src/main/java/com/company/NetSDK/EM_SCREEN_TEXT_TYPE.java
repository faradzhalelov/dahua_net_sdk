package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * Screen text type
 * \else
 * 屏幕文本类型
 * \endif
 */
public class EM_SCREEN_TEXT_TYPE implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     *  Unknown
     * \else
     *  未知
     * \endif
     */
    public static final int					EM_SCREEN_TEXT_TYPE_UNKNOWN = -1;

    /**
     * \if ENGLISH_LANG
     *  Ordinary
     * \else
     *  普通
     * \endif
     */
    public static final int					EM_SCREEN_TEXT_TYPE_ORDINARY = 0;

    /**
     * \if ENGLISH_LANG
     *  Local time
     * \else
     *  本地时间
     * \endif
     */
    public static final int					EM_SCREEN_TEXT_TYPE_LOCAL_TIME = 1;

    /**
     * \if ENGLISH_LANG
     *  Qr code
     * \else
     *  二维码 
     * \endif
     */
    public static final int					EM_SCREEN_TEXT_TYPE_QR_CODE = 2;

    /**
     * \if ENGLISH_LANG
     *  RESOURCE
     * \else
     *  资源文件
     * \endif
     */
    public static final int					EM_SCREEN_TEXT_TYPE_RESOURCE = 3;

}
