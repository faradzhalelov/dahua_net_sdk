package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * @brief Input parameters for CLIENT_AttachClassBrand
 * \else
 * @brief CLIENT_AttachClassBrand 入参
 * \endif
 */
public class NET_IN_ATTACH_CLASS_BRAND implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     *  Data transmission direction: 0 for downstream, 1 for upstream
     * \else
     *  数据传输方向：0表示下行，1表示上行
     * \endif
     */
    public int					nDirection;

    /**
     * \if ENGLISH_LANG
     *  Callback function
     * \else
     *  回调函数
     * \endif
     */
    public CB_fNotifyClassBrandCallBack					cbNotifyClassBrand;

}