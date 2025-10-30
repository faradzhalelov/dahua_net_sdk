package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * @brief CLIENT_DoFindRoute Input parameters
 * \else
 * @brief CLIENT_DoFindRoute 接口输入参数
 * \endif
 */
public class NET_IN_DO_FIND_ROUTE implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     *  Number of offset entries in the query
     * \else
     *  查询的偏移条数
     * \endif
     */
    public int					nOffset;

    /**
     * \if ENGLISH_LANG
     *  The number of entries required for this query cannot exceed the nCaps query capability returned by startFind
     * \else
     *  本次查询需要获取的条数, 不能超过startFind返回的nCaps查询能力
     * \endif
     */
    public int					nCount;

}