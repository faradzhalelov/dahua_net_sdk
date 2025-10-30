package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * @brief Input parameters for CLIENT_PaasDownsidePassthrough
 * \else
 * @brief CLIENT_PaasDownsidePassthrough 入参
 * \endif
 */
public class NET_IN_PAAS_DOWNSIDE_PASSTHROUGH implements Serializable {
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
     *  Data content transmitted by the platform through the downstream interface
     * \else
     *  平台通过下行接口传输的数据内容
     * \endif
     */
    public String					pszDataInfo = new String();

    /*Need Constructed Function!*/
    public NET_IN_PAAS_DOWNSIDE_PASSTHROUGH() {

    }
}