package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Plate info of nomotor
 * \else
 * 非机动车配牌信息
 * \endif
 */
public class NET_NONMOTOR_PLATE_INFO implements Serializable {

    private static final long serialVersionUID = 1L;


    /**
     * \if ENGLISH_LANG
     * plate number
     * \else
     * 非机动车车牌号
     * \endif
     */
    public byte                        szPlateNumber[] = new byte[128];

    /**
     * \if ENGLISH_LANG
     * BoundingBox Rect, 0~8192
     * \else
     * 包围盒， 非机动车矩形框，0~8191相对坐标
     * \endif
     */
    public NET_RECT					stuBoundingBox = new NET_RECT();

    /**
     * \if ENGLISH_LANG
     * BoundingBox Rect, absolute coordinates
     * \else
     * 包围盒， 非机动车矩形框，绝对坐标
     * \endif
     */
    public NET_RECT					stuOriginalBoundingBox = new NET_RECT();

    /**
     * \if ENGLISH_LANG
     * plate image info
     * \else
     * 非机动车车牌抠图
     * \endif
     */
    public NET_NONMOTOR_PLATE_IMAGE    stuPlateImage = new NET_NONMOTOR_PLATE_IMAGE();

    /**
     * \if ENGLISH_LANG
     * Plate color,{@link EM_PLATE_COLOR_TYPE}
     * \else
     * 车牌颜色,{@link EM_PLATE_COLOR_TYPE}
     * \endif
     */
    public int         emPlateColor;

}
