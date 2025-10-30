package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * @brief Information for transmitting and receiving data on the electronic signboard subscription platform
 * \else
 * @brief 电子班牌订阅平台上下行透传数据信息
 * \endif
 */
public class NET_CB_CLASS_BRAND_INFO implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     *  Data content transmitted and received by the electronic signboard through the interface
     * \else
     *  电子班牌通过上下行接口传输的数据内容
     * \endif
     */
    public byte[]					pszDataInfo;

    /**
     * \if ENGLISH_LANG
     *  Data length
     * \else
     *  数据长度
     * \endif
     */
    public int					nDataLen;

    /*Need Constructed Function!*/
    public NET_CB_CLASS_BRAND_INFO(int nDataLen) {
        pszDataInfo = new byte[nDataLen];
    }
}