package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * {@link INetSDK#FaceRecognitionPutDisposition} input parameter
 * \else
 * {@link INetSDK#FaceRecognitionPutDisposition} 接口输入参数
 * \endif
 */
public class NET_IN_FACE_RECOGNITION_PUT_DISPOSITION_INFO implements Serializable {
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
     * count of disposition channels
     * \else
     * 布控视频通道个数
     * \endif
     */
    public int								nDispositionChnNum;

    /**
     * \if ENGLISH_LANG
     * info of disposition channels
     * \else
     * 布控视频通道信息
     * \endif
     */
    public NET_DISPOSITION_CHANNEL_INFO[] 	stuDispositionChnInfo = new NET_DISPOSITION_CHANNEL_INFO[FinalVar.SDK_MAX_CAMERA_CHANNEL_NUM];

    public NET_IN_FACE_RECOGNITION_PUT_DISPOSITION_INFO() {
        for(int i = 0; i < FinalVar.SDK_MAX_CAMERA_CHANNEL_NUM; i++) {
            stuDispositionChnInfo[i] = new NET_DISPOSITION_CHANNEL_INFO();
        }
    }
}
