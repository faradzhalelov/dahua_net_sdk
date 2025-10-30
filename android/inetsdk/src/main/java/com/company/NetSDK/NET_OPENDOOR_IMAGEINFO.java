package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * @brief image information
 * \else
 * @brief 图片信息
 * \endif
 */
public class NET_OPENDOOR_IMAGEINFO implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     * target library image length, limit is 150k
     * \else
     *  目标库照片长度，限制为150k
     * \endif
     */
    public int					nLibImageLen;

    /**
     * \if ENGLISH_LANG
     * snap image length, limit is 150k
     * \else
     *  抓拍照片长度，限制为150k
     * \endif
     */
    public int					nSnapImageLen;

    /**
     * \if ENGLISH_LANG
     * 
     * \else
     *  目标库照片，内存由用户申请
     * \endif
     */
    public byte[]					pLibImage;

    /**
     * \if ENGLISH_LANG
     * 
     * \else
     *  抓拍照片，内存由用户申请
     * \endif
     */
    public byte[]					pSnapImage;

    /*Need Constructed Function!*/
    public NET_OPENDOOR_IMAGEINFO() {

    }
}
