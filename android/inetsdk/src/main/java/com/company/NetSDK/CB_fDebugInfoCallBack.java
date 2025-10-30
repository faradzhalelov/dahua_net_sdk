package com.company.NetSDK;


/**
 * \if ENGLISH_LANG
 * Debug info log callback function,lAttchHandle is return by AttachDebugInfo
 * \else
 * 调试日志回调函数,lAttchHandle 为AttachDebugInfo接口返回值
 * \endif
 */
public interface CB_fDebugInfoCallBack {
    /**
     * \if ENGLISH_LANG
     * Debug info log callback function
     * @param lAttchHandle handle, return from {@link INetSDK#AttachDebugInfo}
     * @param pBuffer data buffering
     * @param dwBufSize buffering length(unit byte)
     * \else
     * 调试日志回调函数
     * @param lAttchHandle 句柄, {@link INetSDK#AttachDebugInfo}的返回值
     * @param pBuffer 数据缓冲
     * @param dwBufSize 缓冲长度(单位字节)
     * \endif
     */
    public void invoke(long lAttchHandle, byte pBuffer[], int dwBufSize);
}
