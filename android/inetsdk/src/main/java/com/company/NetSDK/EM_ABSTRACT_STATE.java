package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * the state of reabstract
 * \else
 * 计算特征向量结果
 * \endif
 */
public class EM_ABSTRACT_STATE implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     *  unknown
     * \else
     *  未知
     * \endif
     */
    public static final int					EM_ABSTRACT_UNKNOWN = 0;

    /**
     * \if ENGLISH_LANG
     *  success
     * \else
     *  重建成功
     * \endif
     */
    public static final int					EM_ABSTRACT_SUCCESS = 1;

    /**
     * \if ENGLISH_LANG
     *  false
     * \else
     *  重建失败
     * \endif
     */
    public static final int					EM_ABSTRACT_FALSE = 2;

    /**
     * \if ENGLISH_LANG
     *  process(only GroupID)
     * \else
     *  重建过程中(仅针对GroupID)
     * \endif
     */
    public static final int					EM_ABSTRACT_PROCESS = 3;

}
