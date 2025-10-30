package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * @brief Scene image info for Target detection record
 * \else
 * @brief 目标检测记录大图信息
 * \endif
 */
public class NET_FACEDETECT_IMAGE_INFO implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     *  File length
     * \else
     *  文件大小
     * \endif
     */
    public int					nLength;

    /**
     * \if ENGLISH_LANG
     *  File path
     * \else
     *  文件路径
     * \endif
     */
    public byte					szFilePath[] = new byte[260];

}