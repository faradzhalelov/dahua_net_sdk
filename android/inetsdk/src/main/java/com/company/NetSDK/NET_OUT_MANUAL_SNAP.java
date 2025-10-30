package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * {@link INetSDK#ManualSnap} The input parameters
 * \else
 * {@link INetSDK#ManualSnap} 输入参数
 * \endif
 */
public class NET_OUT_MANUAL_SNAP implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     * Struct size
     * \else
     * 结构体大小
     * \endif
     */
    public int			nMaxBufLen;
    /**
     * \if ENGLISH_LANG
     * Struct size
     * \else
     * 结构体大小
     * \endif
     */
    public String			pRcvBuf;
    /**
     * \if ENGLISH_LANG
     * Struct size
     * \else
     * 结构体大小
     * \endif
     */
    public int			nRetBufLen;
    /**
     * \if ENGLISH_LANG
     * Struct size
     * \else
     * 结构体大小
     * \endif
     */
    public EM_SNAP_ENCODE_TYPE			emEncodeType;
    /**
     * \if ENGLISH_LANG
     * Struct size
     * \else
     * 结构体大小
     * \endif
     */
    public int			nCmdSerial;
}
