package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Access state
 * \else
 * 门禁状态
 * \endif
 */
public class CFG_ACCESS_STATE implements Serializable{

    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     * General
     * \else
     * 普通
     * \endif
     */
    public final static int ACCESS_STATE_NORMAL = 0;

    /**
     * \if ENGLISH_LANG
     * Normally Off, open door is invalid
     * \else
     * 常关
     * \endif
     */
    public final static int ACCESS_STATE_CLOSEALWAYS = 1;


    /**
     * \if ENGLISH_LANG
     * Normally On, open door is invalid
     * \else
     * 常开
     * 常开常闭状态下,Opendoor开门无效.
     * \endif
     */
    public final static int ACCESS_STATE_OPENALWAYS = 2;

    /**
     * \if ENGLISH_LANG
     * Normally Off if in NO PERSON state
     * \else
     * 无人状态常闭
     * \endif
     */
    public final static int ACCESS_STATE_NOPERSONNC = 3;

    /**
     * \if ENGLISH_LANG
     * Normally On if in NO PERSON state
     * \else
     * 无人状态常开
     * \endif
     */
    public final static int ACCESS_STATE_NOPERSONNO = 4;
}
