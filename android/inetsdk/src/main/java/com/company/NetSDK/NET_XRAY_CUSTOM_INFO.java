package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * @brief Customer-defined information. It is used for X-ray.
 * \else
 * @brief 客户自定义信息
 * \endif
 */
public class NET_XRAY_CUSTOM_INFO implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG,{@link EM_XRAY_VIEW_TYPE}
     *  View type
     * \else
     * 视角类型,{@link EM_XRAY_VIEW_TYPE}
     * \endif
     */
    public int					emViewType;

    /**
     * \if ENGLISH_LANG
     *  Serial number
     * \else
     * 流水号
     * \endif
     */
    public byte					szSerialNumber[] = new byte[128];

}