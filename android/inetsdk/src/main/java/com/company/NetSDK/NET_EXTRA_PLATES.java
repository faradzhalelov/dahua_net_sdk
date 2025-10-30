package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * @brief Auxiliary license plate information
 * \else
 * @brief 辅车牌信息
 * \endif
 */
public class NET_EXTRA_PLATES implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     *  The license plate picture is offset in binary data, in bytes
     * \else
     *  车牌图片在二进制数据内偏移，单位字节
     * \endif
     */
    public int					nOffset;

    /**
     * \if ENGLISH_LANG
     *  License plate picture length, in bytes
     * \else
     *  车牌图片长度，单位字节
     * \endif
     */
    public int					nLength;

    /**
     * \if ENGLISH_LANG
     *  Auxiliary license plate number,UTF8
     * \else
     *  辅车牌号码，UTF8格式
     * \endif
     */
    public byte					szText[] = new byte[64];

    /**
     * \if ENGLISH_LANG
     *  License plate type,{@link EM_NET_PLATE_TYPE}
     * \else
     *  车牌类型,{@link EM_NET_PLATE_TYPE}
     * \endif
     */
    public int					emCategory;

    /**
     * \if ENGLISH_LANG
     *  License plate color,{@link EM_NET_PLATE_COLOR_TYPE}
     * \else
     *  车牌颜色,{@link EM_NET_PLATE_COLOR_TYPE}
     * \endif
     */
    public int					emColor;

    /**
     * \if ENGLISH_LANG
     *  The coordinates of the bounding box of the auxiliary license plate have been calculated into the height of the black edge, the rectangular box of the license plate, and the absolute coordinates, that is, the real pixel coordinates
     * \else
     *  辅车牌的包围盒，坐标已算上黑边高度车牌矩形框，绝对坐标，即真正的像素点坐标
     * \endif
     */
    public NET_RECT					stuArea = new NET_RECT();

}