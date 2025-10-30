package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * @brief Elevator floor osd related configuration, corresponding to  NET_EM_CFG_ELEVATOR_FLOOR_COUNTER
 * \else
 * @brief 电梯楼层计数器相关配置, 对应枚举 NET_EM_CFG_ELEVATOR_FLOOR_COUNTER
 * \endif
 */
public class NET_CFG_ELEVATOR_FLOOR_OSD implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     *  Overlay to main stream video encoding
     * \else
     *  叠加到主码流视频编码
     * \endif
     */
    public boolean					bEncodeBlend;

    /**
     * \if ENGLISH_LANG
     *  Foreground Color
     * \else
     *  前景颜色
     * \endif
     */
    public byte					nFrontColor[] = new byte[4];

    /**
     * \if ENGLISH_LANG
     *  Background color 
     * \else
     *  背景颜色
     * \endif
     */
    public byte					nBackColor[] = new byte[4];

    /**
     * \if ENGLISH_LANG
     *  Text alignment 0-Left aligned 2-Right aligned
     * \else
     *  文本对齐方式 0-左对齐 2-右对齐
     * \endif
     */
    public byte					nTextAlign;

    /**
     * \if ENGLISH_LANG
     *  Overlay area
     * \else
     *  叠加区域
     * \endif
     */
    public int					nRect[] = new int[4];

    /**
     * \if ENGLISH_LANG
     * 	Stacking temperatures support enable
     * \else
     * 	是否支持叠加温度
     * \endif
     */
    public boolean					bTemperature;

    /**
     * \if ENGLISH_LANG
     *  Number of people inside the stacked ladder support enable
     * \else
     *  是否支持叠加梯内人数
     * \endif
     */
    public boolean					bCurrentNumber;

    /**
     * \if ENGLISH_LANG
     *  Stacking floors support enable
     * \else
     *  是否支持叠加楼层数
     * \endif
     */
    public boolean					bFloorNumber;

    /**
     * \if ENGLISH_LANG
     *  Stacked door status support enable
     * \else
     *  是否支持叠加门状态
     * \endif
     */
    public boolean					bDoorState;

    /**
     * \if ENGLISH_LANG
     *  Stacking elevator speeds support enable
     * \else
     *  是否支持叠加电梯速度
     * \endif
     */
    public boolean					bSpeed;

    /**
     * \if ENGLISH_LANG
     *  Overlay brightness support enable
     * \else
     *  是否支持叠加亮度
     * \endif
     */
    public boolean					bBrightness;

}