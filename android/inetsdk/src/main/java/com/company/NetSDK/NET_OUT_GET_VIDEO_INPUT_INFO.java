package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * @brief CLIENT_GetVideoInputInfo out param
 * \else
 * @brief CLIENT_GetVideoInputInfo 接口输出参数
 * \endif
 */
public class NET_OUT_GET_VIDEO_INPUT_INFO implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     *  information pointer,need user alloc memory,refer to the enum type of EM_GET_VIDEO_INPUT_TYPE
     * \else
     *  获取到的信息，需要调用者分配内存，对应的指针类型参考EM_GET_VIDEO_INPUT_TYPE枚举中的说明
     * \endif
     */
    public Object					pInfo;

}
