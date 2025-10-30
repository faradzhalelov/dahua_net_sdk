package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Personnel type
 * \else
 * 人员类型
 * \endif
 */
public class EM_PERSON_TYPE implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     * unknow
     * \else
     * 未知
     * \endif
     */
    public static final int PERSON_TYPE_UNKNOWN = 0;

    /**
     * \if ENGLISH_LANG
     * common person
     * \else
     * 普通人员
     * \endif
     */
    public static final int PERSON_TYPE_NORMAL = 1;

    /**
     * \if ENGLISH_LANG
     * ARGXYRY
     * \else
     * 嫌疑人员
     * \endif
     */
    public static final int PERSON_TYPE_SUSPICION = 2;

    /**
     * \if ENGLISH_LANG
     * ARGXT
     * \else
     * ARGXT
     * \endif
     */
    public static final int PERSON_TYPE_ARGXT = 3;

    /**
     * \if ENGLISH_LANG
     * VIP
     * \else
     * 重要人员
     * \endif
     */
    public static final int PERSON_TYPE_VIP = 4;

    /**
     * \if ENGLISH_LANG
     * FateCheck
     * \else
     * 打假人员
     * \endif
     */
    public static final int PERSON_TYPE_FATECHECK = 5;

    /**
     * \if ENGLISH_LANG
     * Staff
     * \else
     * 工作人员
     * \endif
     */
    public static final int PERSON_TYPE_STAFF = 6;
}
