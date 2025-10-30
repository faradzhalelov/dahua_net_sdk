package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * stream data type
 * \else
 * 实时预览的实时数据标志, 对应 CLIENT_SetRealDataCallBackEx(Ex2) 中的 dwFlag 参数
 * 支持 '|' 运算符, 如 dwFlag = REALDATA_FLAG_RAW_DATA | REALDATA_FLAG_YUV_DATA
 * \endif
 */
public class EM_REALDATA_FLAG implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     * private stream
     * \else
     * 原始数据标志,对应fRealDataCallBack(Ex/Ex2)回调函数中 dwDataType 为0, 0x01 = 0x01 << 0
     * \endif
     */
    public static final int REALDATA_FLAG_RAW_DATA = 0x01;

    /**
     * \if ENGLISH_LANG
     * Chinese standard ps stream
     * \else
     * 带有帧信息的数据标志,对应fRealDataCallBack(Ex/Ex2)回调函数中 dwDataType 为1, 0x02 = 0x01 << 1
     * \endif
     */
    public static final int REALDATA_FLAG_DATA_WITH_FRAME_INFO = 0x02;

    /**
     * \if ENGLISH_LANG
     * TS stream
     * \else
     * YUV 数据标志,对应fRealDataCallBack(Ex/Ex2)回调函数中 dwDataType 为2, 0x04 = 0x01 << 2
     * \endif
     */
    public static final int REALDATA_FLAG_YUV_DATA = 0x04;

    /**
     * \if ENGLISH_LANG
     * MP4 file(the callback function supply the private stream data, the parama dwDataType is 0 )
     * \else
     * PCM 音频数据标志,对应fRealDataCallBack(Ex/Ex2)回调函数中 dwDataType 为3, 0x08 = 0x01 << 3
     * \endif
     */
    public static final int REALDATA_FLAG_PCM_AUDIO_DATA = 0x08;

}
