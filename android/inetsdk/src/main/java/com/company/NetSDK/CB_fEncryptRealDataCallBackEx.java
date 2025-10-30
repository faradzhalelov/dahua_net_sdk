package com.company.NetSDK;

/**
 * \if ENGLISH_LANG
 * Real-time monitor encrypt data callback function original shape
 * \else
 * 实时预览加密数据回调
 * \endif
 */
public interface CB_fEncryptRealDataCallBackEx {
    /**
     * \if ENGLISH_LANG
     * Real-time monitor encrypt data callback function original shape
     * @param lRealHandle handle, return from {@link INetSDK#RealPlay}
     * @param pBuffer recal data，According to the data of different types each callback different length data, in addition to type 0, other data types are in the frame, each callback data of a frame
     * @param dwBufSize recall data length(unit byte)
     * \else
     * 实时预览加密数据回调函数
     * @param lRealHandle 登录句柄, {@link INetSDK#RealPlay}的返回值
     * @param pBuffer 回调数据，根据数据类型的不同每次回调不同的长度的数据，除类型0，其他数据类型都是按帧，每次回调一帧数据
     * @param dwBufSize 回调数据的长度(单位字节)
     * \endif
     */
    public void invoke(long lRealHandle, byte[] pBuffer, int dwBufSize);
}
