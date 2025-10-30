package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * car pass status
 * \else
 * 过车状态
 * \endif
 */
public class EM_CARPASS_STATUS implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     *  Unknown status     
     * \else
     *  未知状态     
     * \endif
     */
    public static final int					EM_CARPASS_STATUS_UNKNOWN = 0;

    /**
     * \if ENGLISH_LANG
     *  car pass status
     * \else
     *  过车状态
     * \endif
     */
    public static final int					EM_CARPASS_STATUS_CARPASS = 1;

    /**
     * \if ENGLISH_LANG
     *  no car status
     * \else
     *  无车状态
     * \endif
     */
    public static final int					EM_CARPASS_STATUS_NORMAL = 2;

}
