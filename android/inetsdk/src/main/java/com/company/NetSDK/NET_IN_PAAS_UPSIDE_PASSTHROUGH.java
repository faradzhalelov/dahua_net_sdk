package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * @brief CLIENT_PaasUpsidePassthrough Input parameters
 * \else
 * @brief CLIENT_PaasUpsidePassthrough 入参
 * \endif
 */
public class NET_IN_PAAS_UPSIDE_PASSTHROUGH implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     *  Data length
     * \else
     *  数据长度
     * \endif
     */
    public int					nDataLen;

    /**
     * \if ENGLISH_LANG
     *  Data content transmitted by the platform through the Upstream interface
     * \else
     *  平台通过下行接口传输的数据内容
     * \endif
     */
    public String					pszDataInfo;

    /*Need Constructed Function!*/
    public NET_IN_PAAS_UPSIDE_PASSTHROUGH() {

    }
}