package com.company.NetSDK;
import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * interface output param, corresponding to interface {@link INetSDK#GetIFrameDataFromStorageVideo}
 * \else
 * 接口输出参数 ，对应接口 {@link INetSDK#GetIFrameDataFromStorageVideo}
 * \endif
 */
public class NET_OUT_GET_I_FRAME_DATA_FROM_STORAGE_VIDEO implements Serializable {

    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     * buffer length of the obtained I-frame data, unit: byte
     * \else
     * 获取到的I帧数据内存大小, 单位字节
     * \endif
     */
    public int                             nBufferLen;

    /**
     * \if ENGLISH_LANG
     * buffer of the obtained I-frame data, the user applies for memory
     * \else
     * 获取到的I帧数据
     * \endif
     */
    public byte                             szBuffer[];
    /**
     * \if ENGLISH_LANG
     * The actual return length of the obtained I frame data, unit: bytes
     * \else
     * 获取到的I帧数据实际返回长度, 单位字节
     * \endif
     */
    public int                              nRetBufferLen;

    public NET_OUT_GET_I_FRAME_DATA_FROM_STORAGE_VIDEO(int nBufLen) {
        nBufferLen = nBufLen;
        szBuffer = new byte[nBufferLen];
    }



}
