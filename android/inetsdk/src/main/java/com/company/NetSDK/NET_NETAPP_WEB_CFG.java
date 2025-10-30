package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * @brief 	Web Server config
 * \else
 * @brief 	Web服务器设置
 * \endif
 */
public class NET_NETAPP_WEB_CFG implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     *  Enable
     * \else
     *  使能开关
     * \endif
     */
    public boolean					bEnable;

    /**
     * \if ENGLISH_LANG
     *  Port
     * \else
     *  端口号
     * \endif
     */
    public int					nPort;

}