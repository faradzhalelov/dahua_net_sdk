package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * {@link INetSDK#FaceRecognitionDelDisposition} input parameter
 * \else
 * {@link INetSDK#FaceRecognitionDelDisposition} 接口输入参数
 * \endif
 */
public class NET_IN_FACE_RECOGNITION_DEL_DISPOSITION_INFO implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     * group ID
     * \else
     * 人员组ID
     * \endif
     */
    public byte[]                			szGroupId = new byte[FinalVar.SDK_COMMON_STRING_64];

    /**
     * \if ENGLISH_LANG
     * the count of disposition channels
     * \else
     * 撤控视频通道个数
     * \endif
     */
    public int								nDispositionChnNum;

    /**
     * \if ENGLISH_LANG
     * the list of disposition channels
     * \else
     * 撤控视频通道列表
     * \endif
     */
    public int[]							nDispositionChn = new int[FinalVar.SDK_MAX_CAMERA_CHANNEL_NUM];
}
