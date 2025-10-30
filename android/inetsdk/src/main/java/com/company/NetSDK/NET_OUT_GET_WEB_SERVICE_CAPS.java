package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * @brief CLIENT_GetWebServiceCaps output parameters
 * \else
 * @brief CLIENT_GetWebServiceCaps 出参
 * \endif
 */
public class NET_OUT_GET_WEB_SERVICE_CAPS implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     *  Does it support webService services
     * \else
     *  是否支持webService服务
     * \endif
     */
    public boolean					bSupportWebService;

    /**
     * \if ENGLISH_LANG
     *  Does it support local web resource bundles
     * \else
     *  是否支持本地Web资源包
     * \endif
     */
    public boolean					bSupportLocalWebSource;

    /**
     * \if ENGLISH_LANG
     *  Is the bSupportWebService field valid
     * \else
     *  bSupportWebService字段是否有效
     * \endif
     */
    public boolean					bSupportWebServiceVaild;

    /**
     * \if ENGLISH_LANG
     *  Is the bSupportLocalWebSource field valid
     * \else
     *  bSupportLocalWebSource字段是否有效
     * \endif
     */
    public boolean					bSupportLocalWebSourceVaild;

}