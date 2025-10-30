package com.company.NetSDK;

import java.io.Serializable;
/**
 * \if ENGLISH_LANG
 * ability
 * \else
 * 能力信息
 * \endif
 */
public class RANGE implements Serializable {

    /**
     * \if ENGLISH_LANG
     * Max value
     * \else
     * 最大值
     * \endif
     */
    public float  fMax;

    /**
     * \if ENGLISH_LANG
     * Min value
     * \else
     * 最小值
     * \endif
     */
    public float  fMin;

    /**
     * \if ENGLISH_LANG
     * Enable step or not
     * \else
     * 是否启用步长
     * \endif
     */
    public boolean  abStep;

    /**
     * \if ENGLISH_LANG
     * Step
     * \else
     * 步长
     * \endif
     */
    public float  fStep;

    /**
     * \if ENGLISH_LANG
     * Enable default value or not
     * \else
     * 是否启用默认值
     * \endif
     */
    public boolean  abDefault;

    /**
     * \if ENGLISH_LANG
     * Default value
     * \else
     * 默认值
     * \endif
     */
    public float  fDefault;
}
