package com.company.NetSDK;

import java.io.Serializable;
public class NET_CODEID_ERROR_TYPE  implements Serializable{
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     * Code correct
     * \else
     * 对码正确
     * \endif
     */
    public static final int NET_CODEID_ERROR_TYPE_RIGHT = 0;

    /**
     * \if ENGLISH_LANG
     * Exists
     * \else
     * 已经存在
     * \endif
     */
    public static final int NET_CODEID_ERROR_TYPE_ALREADYEXIST = 1;

    /**
     * \if ENGLISH_LANG
     * Other error
     * \else
     * 其他错误
     * \endif
     */
    public static final int NET_CODEID_ERROR_TYPE_OTHER = 2;
}
