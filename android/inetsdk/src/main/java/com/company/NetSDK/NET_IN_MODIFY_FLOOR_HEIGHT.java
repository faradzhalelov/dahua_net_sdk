package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * @brief CLIENT_ModifyFloorHeight Interface input parameters
 * \else
 * @brief CLIENT_ModifyFloorHeight 接口输入参数
 * \endif
 */
public class NET_IN_MODIFY_FLOOR_HEIGHT implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     *  Video channel ID
     * \else
     *  视频通道号
     * \endif
     */
    public int					nChannel;

    /**
     * \if ENGLISH_LANG
     *  Number of floor numbers that need to be modified.
     * \else
     *  需要修改层高的楼层号个数
     * \endif
     */
    public int					nFloorsNum;

    /**
     * \if ENGLISH_LANG
     *  Number of floor numbers and corresponding floor heights that need to be modified.
     * \else
     *  需要修改的楼层号层高个数
     * \endif
     */
    public int					nHeightNum;

    /**
     * \if ENGLISH_LANG
     *  Array of floor numbers that need to have their heights modified.
     * \else
     *  需要修改层高的楼层号数组
     * \endif
     */
    public int					nFloors[] = new int[32];

    /**
     * \if ENGLISH_LANG
     *  The corresponding floor heights, in meters, of the floor numbers that need to be modified.
     * \else
     *  需要修改的楼层号的对应层高，单位m
     * \endif
     */
    public double					dbHeight[] = new double[32];

}