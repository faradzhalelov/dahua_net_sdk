package com.company.NetSDK;

/**
 * \if ENGLISH_LANG
 * Log buffer callback
 * \else
 * 日志回调函数
 * \endif
 */
public interface CB_fSDKLogCallBack {


    /**
     * \if ENGLISH_LANG
     * @param szLogBuffer log buffer
     * @param nLogSize log size
     * \else
     * @param szLogBuffer 日志数据
     * @param nLogSize 日志大小
     * \endif
     */
    public int invoke(byte[] szLogBuffer, int nLogSize);
}

