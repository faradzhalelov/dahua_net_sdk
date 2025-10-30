package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * @brief Plate info, Record the plate number and color of the front and back of the car
 * \else
 * @brief 车辆信息，记录了车头、车尾车牌号和车牌颜色
 * \endif
 */
public class EVENT_PLATE_INFO implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     *  front plate number
     * \else
     *  车头车牌号码
     * \endif
     */
    public byte					szFrontPlateNumber[] = new byte[64];

    /**
     * \if ENGLISH_LANG
     *  front plate color
     * \else
     *  车头车牌颜色
     * \endif
     */
    public int					emFrontPlateColor;

    /**
     * \if ENGLISH_LANG
     *  back plate number
     * \else
     *  车尾车牌号码
     * \endif
     */
    public byte					szBackPlateNumber[] = new byte[64];

    /**
     * \if ENGLISH_LANG
     *  back plate color 
     * \else
     *  车尾车牌颜色
     * \endif
     */
    public int					emBackPlateColor;

    /**
     * \if ENGLISH_LANG
     *  reserved
     * \else
     *  保留
     * \endif
     */
    public byte					reversed[] = new byte[128];

}
