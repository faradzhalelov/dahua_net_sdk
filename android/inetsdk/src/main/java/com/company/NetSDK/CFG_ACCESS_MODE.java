package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * Access mode
 * \else
 * 门禁模式
 * \endif
 */
public class CFG_ACCESS_MODE implements Serializable {

    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     * Fangga mode
     * \else
     * 防夹模式
     * \endif
     */
    public final static int ACCESS_MODE_HANDPROTECTED = 0;

    /**
     * \if ENGLISH_LANG
     * Protective room mode
     * \else
     * 防护房间模式
     * \endif
     */
    public final static int ACCESS_MODE_SAFEROOM = 1;


    /**
     * \if ENGLISH_LANG
     * others
     * \else
     * 其他
     * \endif
     */
    public final static int ACCESS_MODE_OTHER = 2;

}
