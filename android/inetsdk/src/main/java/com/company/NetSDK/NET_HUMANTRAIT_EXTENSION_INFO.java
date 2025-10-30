package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * @brief Extension event code
 * \else
 * @brief 当前人体特征是由什么事件产生的
 * \endif
 */
public class NET_HUMANTRAIT_EXTENSION_INFO implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     *  Extension event code which produce human trait
     * \else
     *  当前人体特征是由什么事件产生的,设备刚好返回32个字节数据，多加4个字节用于字节对齐和添加字符结束符
     * \endif
     */
    public byte					szAdditionalCode[] = new byte[FinalVar.MAX_HUMANTRAIT_EVENT_LEN];

}