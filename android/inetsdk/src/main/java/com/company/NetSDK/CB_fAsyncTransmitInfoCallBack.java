package com.company.NetSDK;

/**
 * \if ENGLISH_LANG
 * AttachTransmitInfo callback function, lAttachHandle is the return value of AttachTransmitInfo
 * \else
 * AttachTransmitInfo回调函数原型，lAttachHandle是AttachTransmitInfo返回值
 * \endif
 */
public interface CB_fAsyncTransmitInfoCallBack {

    /**
     * \if ENGLISH_LANG
     * @param lAttachHandle attach handle
     * @param pTransmitInfo info
     *  \else
     * @param lAttachHandle 订阅句柄
     * @param pTransmitInfo 回调信息
     * \endif
     */
    public int invoke(long lAttachHandle, NET_CB_TRANSMIT_INFO pTransmitInfo);
}
