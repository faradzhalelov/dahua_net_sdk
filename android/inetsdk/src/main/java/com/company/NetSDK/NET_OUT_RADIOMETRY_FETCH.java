package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * @brief CLIENT_RadiometryFetch output parameter
 * \else
 * @brief CLIENT_RadiometryFetch 出参
 * \endif
 */
public class NET_OUT_RADIOMETRY_FETCH implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     *  0: unknown, 1: free, 2: acquiring heat map
     * \else
     *  0: 未知, 1: 空闲, 2: 获取热图中
     * \endif
     */
    public int					nStatus;

}