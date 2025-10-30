package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * scene compair info
 * \else
 * 场景组合
 * \endif
 */
public class CFG_SUPPORTED_COMP implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     * the counts of scenes
     * \else
     * 场景组合项下支持的场景个数
     * \endif
     */
    public int 	nSupportedData;

    /**
     * \if ENGLISH_LANG
     * the list of scenes
     * \else
     * 场景组合项下支持的场景列表
     * \endif
     */
    public byte[][]	szSupportedData = new byte[FinalVar.MAX_SUPPORTED_COMP_DATA][FinalVar.CFG_COMMON_STRING_16];
}
