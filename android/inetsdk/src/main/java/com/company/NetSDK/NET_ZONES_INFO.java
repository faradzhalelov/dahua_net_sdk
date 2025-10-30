package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 *
 * @brief Sector information
 * \else
 * @brief 防区信息
 * \endif
 */
public class NET_ZONES_INFO implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     * Zone code
     * \else
     * 防区号
     * \endif
     */
    public int nIndex;

    /**
     * \if ENGLISH_LANG
     * Zone Name
     * \else
     * 防区名称
     * \endif
     */
    public byte szName[] = new byte[128];

    /**
     * \if ENGLISH_LANG
     * Bit 0 is 1, which means partial1 is supported, and bit 1 is 1, which means partial2 is supported
     * \else
     * 第0位为1，表示支持Partial1 第1位为1，表示支持Partial2
     * \endif
     */
    public int nSupPartial;

}