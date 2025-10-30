package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Query VTO push record information type
 * \else
 * 查询VTO推送记录信息类型
 * \endif
 */
public class EM_FIND_VTO_PUSH_RESULT_TYPE  implements Serializable {
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
    public static final int EM_FIND_VTO_PUSH_RESULT_TYPE_UNKNOWN = 0;

    /**
     * \if ENGLISH_LANG
     * All
     * \else
     * 全部
     * \endif
     */
    public static final int EM_FIND_VTO_PUSH_RESULT_TYPE_ALL = 1;

    /**
     * \if ENGLISH_LANG
     * success
     * \else
     * 成功
     * \endif
     */
    public static final int EM_FIND_VTO_PUSH_RESULT_TYPE_SUCCESS = 2;

    /**
     * \if ENGLISH_LANG
     * failed
     * \else
     * 失败
     * \endif
     */
    public static final int EM_FIND_VTO_PUSH_RESULT_TYPE_FAILD = 3;

}
