package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * @brief CLIENT_GetBindMode Interface outbound parameter
 * \else
 * @brief CLIENT_GetBindMode 接口出参
 * \endif
 */
public class NET_OUT_GET_BIND_MODE_INFO implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     *  Binding mode,{@link EM_BIND_MODE}
     * \else
     * 绑定模式,{@link EM_BIND_MODE}
     * \endif
     */
    public int					emBindMode;

}