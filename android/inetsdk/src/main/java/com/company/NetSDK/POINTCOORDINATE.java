package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * @brief scenery position
 * \else
 * @brief 景物点位置
 * \endif
 */
public class POINTCOORDINATE implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     *  X coordinate range: [0,8191]
     * \else
     *  第一个元素表示景物点的x坐标(0~8191) 
     * \endif
     */
    public int					nX;

    /**
     * \if ENGLISH_LANG
     *  Y coordinate range: [0,8191]
     * \else
     *  第二个元素表示景物点的y坐标(0~8191)
     * \endif
     */
    public int					nY;

}