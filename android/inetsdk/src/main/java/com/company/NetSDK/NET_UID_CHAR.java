package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Person unique mark
 * \else
 * 人员唯一标识符
 * \endif
 */
public class NET_UID_CHAR implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     * UID contents
     * \else
     * UID内容
     * \endif
     */
    public byte[]          szUID = new byte[FinalVar.SDK_MAX_PERSON_ID_LEN];
}
