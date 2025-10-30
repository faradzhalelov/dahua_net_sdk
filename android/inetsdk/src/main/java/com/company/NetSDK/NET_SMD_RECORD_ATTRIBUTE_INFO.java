package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * SMD video attribute information
 * \else
 * SMD录像属性信息
 * \endif
 */
public class NET_SMD_RECORD_ATTRIBUTE_INFO implements Serializable{

    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     * SMD video type,refer to {@link EM_SMD_RECORD_TYPE}
     * \else
     * smd录像类型,参考{@link EM_SMD_RECORD_TYPE}
     * \endif
     */
    public int                 emSmdRecordType;
}
