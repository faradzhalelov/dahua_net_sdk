package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * interface {@link INetSDK#ResetSystemEx} input parameter
 * \else
 *  接口 {@link INetSDK#ResetSystemEx} 接口输入参数
 * \endif
 */
public class NET_IN_RESET_SYSTEM_EX implements Serializable {

    /**
     *
     */
    private static final long                   serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     * 0:hard reset; 1:soft reset
     * \else
     * 0: 硬恢复; 1:软恢复
     * \endif
     */
    public int                                  nType;
}
