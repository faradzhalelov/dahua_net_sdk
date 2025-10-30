package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * CLIENT_GetAppendToken Interface output parameters
 * \else
 * @brief CLIENT_GetFaceRecognitionAppendToken 接口输出参数
 * \endif
 */
public class NET_OUT_GET_FACE_RECOGNITION_APPEND_TOKEN implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     *  imported token
     * \else
     *  导入的令牌
     * \endif
     */
    public int					nToken;

}
