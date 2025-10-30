package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * @brief 2 dimension point
 * \else
 * @brief 二维空间点
 * \endif
 */
public class NET_POINT_EX implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     * x-coordinate
     * \else
     * x坐标
     * \endif
     */
    public short					nx;

    /**
     * \if ENGLISH_LANG
     * y-coordinate
     * \else
     * y坐标
     * \endif
     */
    public short					ny;

}