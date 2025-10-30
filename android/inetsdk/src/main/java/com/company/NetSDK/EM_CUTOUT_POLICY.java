package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * cutout policy
 * \else
 * IPC智能目标抓拍上报图策略
 * \endif
 */
public class EM_CUTOUT_POLICY implements Serializable{

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
    public static final int EM_CUTOUT_POLICY_UNKNOWN = -1;

    /**
     * \if ENGLISH_LANG
     * unsupport
     * \else
     * 不支持抠图
     * \endif
     */
    public static final int EM_CUTOUT_POLICY_UNSUPPORT = 0;

    /**
     * \if ENGLISH_LANG
     * original
     * \else
     * 上报照片原始大小
     * \endif
     */
    public static final int EM_CUTOUT_POLICY_ORIGINAL = 1;

    /**
     * \if ENGLISH_LANG
     * half
     * \else
     * 半身照
     * \endif
     */
    public static final int EM_CUTOUT_POLICY_HALF = 2;

    /**
     * \if ENGLISH_LANG
     * whole
     * \else
     * 全身照
     * \endif
     */
    public static final int EM_CUTOUT_POLICY_WHOLE = 3;

    /**
     * \if ENGLISH_LANG
     * cephalothorax
     * \else
     * 头肩照
     * \endif
     */
    public static final int EM_CUTOUT_POLICY_CEPHALOTHORAX = 4;
}
