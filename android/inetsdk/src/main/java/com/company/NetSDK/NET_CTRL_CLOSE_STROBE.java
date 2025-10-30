package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * close gateway parameter(corresponding to SDK_CTRL_CLOSE_STROBE command)
 * \else
 * 关闭道闸参数(对应SDK_CTRL_CLOSE_STROBE命令)
 * \endif
 */
public class NET_CTRL_CLOSE_STROBE implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     *  channel no.
     * \else
     *  通道号
     * \endif
     */
    public int					nChannelId;

}
