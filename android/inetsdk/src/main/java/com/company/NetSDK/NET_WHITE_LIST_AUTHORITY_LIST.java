package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * @brief authority list of allow list
 * \else
 * @brief 允许名单权限列表
 * \endif
 */
public class NET_WHITE_LIST_AUTHORITY_LIST implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     *  true:having open gate authority,false:no having open gate authority
     * \else
     *  是否有开闸权限
     * \endif
     */
    public boolean					bOpenGate;

}
