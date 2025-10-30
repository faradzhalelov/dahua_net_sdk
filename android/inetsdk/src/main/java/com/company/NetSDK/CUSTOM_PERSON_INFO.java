package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * extension of registered personnel information
 * \else
 * 注册人员信息扩展
 * \endif
 */
public class CUSTOM_PERSON_INFO implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     * personnel extension information
     * \else
     * 人员扩展信息
     * \endif
     */
    public byte[]         szPersonInfo = new byte[FinalVar.SDK_MAX_PERSON_INFO_LEN];
}
