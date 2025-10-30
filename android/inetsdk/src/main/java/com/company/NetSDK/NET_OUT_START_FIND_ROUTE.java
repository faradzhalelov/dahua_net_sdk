package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * @brief CLIENT_StartFindRoute Output parameters
 * \else
 * @brief CLIENT_StartFindRoute 接口输出参数
 * \endif
 */
public class NET_OUT_START_FIND_ROUTE implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     *  Number of records found
     * \else
     *  查询到记录数
     * \endif
     */
    public int					nCount;

}