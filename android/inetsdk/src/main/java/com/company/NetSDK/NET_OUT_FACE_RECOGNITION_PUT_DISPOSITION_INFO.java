package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * {@link INetSDK#FaceRecognitionPutDisposition} output parameter
 * \else
 * {@link INetSDK#FaceRecognitionPutDisposition} 接口输出参数
 * \endif
 */
public class NET_OUT_FACE_RECOGNITION_PUT_DISPOSITION_INFO implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     * the result count
     * \else
     * 通道布控结果个数
     * \endif
     */
    public int					    nReportCnt;

    /**
     * \if ENGLISH_LANG
     * the result, TRUE-success, FALSE-failed
     * \else
     * 通道布控结果, TRUE追加成功, FALSE追加失败
     * \endif
     */
    public boolean[]				bReport = new boolean[FinalVar.SDK_MAX_CAMERA_CHANNEL_NUM];
}
