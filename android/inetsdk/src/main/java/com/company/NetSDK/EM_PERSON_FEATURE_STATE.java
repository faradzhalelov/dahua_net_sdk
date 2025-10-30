package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * person feature state
 * \else
 * 人员建模状态
 * \endif
 */
public class EM_PERSON_FEATURE_STATE implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     * unknown
     * \else
     * 未知
     * \endif
     */
    public static final int EM_PERSON_FEATURE_UNKNOWN = 0;

    /**
     * \if ENGLISH_LANG
     * failed to model, need to change the picture
     * \else
     * 建模失败,可能是图片不符合要求,需要换图片
     * \endif
     */
    public static final int EM_PERSON_FEATURE_FAIL = 1;

    /**
     * \if ENGLISH_LANG
     * success to model, the data can be used for target recognition
     * \else
     * 有可用的特征值
     * \endif
     */
    public static final int EM_PERSON_FEATURE_USEFUL = 2;

    /**
     * \if ENGLISH_LANG
     * under calculating
     * \else
     * 正在计算特征值
     * \endif
     */
    public static final int EM_PERSON_FEATURE_CALCULATING = 3;

    /**
     * \if ENGLISH_LANG
     * once modeling was successful, but became unusable after upgrading, need to abstract
     * \else
     * 已建模，但算法升级导致数据不可用，需要重新建模
     * \endif
     */
    public static final int EM_PERSON_FEATURE_UNUSEFUL = 4;
}
