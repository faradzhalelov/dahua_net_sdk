package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Debug info redir info
 * \else
 * 串口日志重定向配置
 * \endif
 */
public class NET_CFG_DEBUGINFO_REDIR_INFO implements Serializable {

    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     * If enable the redirect
     * \else
     * 是否使能重定向
     * \endif
     */
    public boolean						   bEnable;
}
