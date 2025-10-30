package com.company.NetSDK;

/**
 * \if ENGLISH_LANG
 * Attach sniffer callback function, lAttachHandle is {@link INetSDK#AttachSniffer} return value
 * \else
 * 抓包信息回调函数原形，lAttachHandle 是 {@link INetSDK#AttachSniffer} 返回值
 * \endif
 */
public interface CB_fAttachSniffer {

    /**
     * \if ENGLISH_LANG
     * @param lAttchHandle 订阅抓包句柄,return from{@link INetSDK#AttachSniffer}
     * @param pBuffer,buffer
     * @param dwBufSize, buffer size
     * \else
     * @param lAttchHandle, Attach sniffer handle,{@link INetSDK#AttachSniffer}返回值
     * @param pBuffer,抓包数据
     * @param dwBufSize,抓包数据长度
     * \endif
     */
    public void invoke(long lAttchHandle, byte[] pBuffer, int dwBufSize);
}
