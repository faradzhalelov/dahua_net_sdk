package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * @brief Body matting
 * \else
 * @brief 车身抠图
 * \endif
 */
public class NET_TRAFFICCAR_ORIGINAL_VEHICLE implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     *  Offset in binary data block
     * \else
     *  在二进制数据块中的偏移
     * \endif
     */
    public int					nOffset;

    /**
     * \if ENGLISH_LANG
     *  Data size in bytes
     * \else
     *  数据大小,单位：字节
     * \endif
     */
    public int					nLength;

    /**
     * \if ENGLISH_LANG
     *  Picture serial number in uploaded picture data
     * \else
     *  在上传图片数据中的图片序号
     * \endif
     */
    public int					nIndexInData;

}
