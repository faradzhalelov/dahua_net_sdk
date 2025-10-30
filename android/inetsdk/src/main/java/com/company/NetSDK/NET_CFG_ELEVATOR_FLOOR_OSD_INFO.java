package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * @brief Elevator floor osd related configuration, corresponding to NET_EM_CFG_ELEVATOR_FLOOR_OSD
 * \else
 * @brief 电梯楼层计数器相关配置, 对应枚举 NET_EM_CFG_ELEVATOR_FLOOR_OSD
 * \endif
 */
public class NET_CFG_ELEVATOR_FLOOR_OSD_INFO implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     *  Actual return channel Number of items
     * \else
     *  实际返回的通道个数
     * \endif
     */
    public int					nRetChannelNum;

    /**
     * \if ENGLISH_LANG
     *  Configure the number of memory spaces requested for pointer configuration
     * \else
     *  为配置指针申请的内存空间通道个数
     * \endif
     */
    public int					nMaxChannelNum;

    /**
     * \if ENGLISH_LANG
     *  Elevator floor osd related configuration
     * \else
     *  电梯当前楼层OSD配置
     * \endif
     */
    public NET_CFG_ELEVATOR_FLOOR_OSD[]					pstElevatorFloorOSD;


    public NET_CFG_ELEVATOR_FLOOR_OSD_INFO(int nMaxChannelNum) {
        this.nMaxChannelNum = nMaxChannelNum;
        this.pstElevatorFloorOSD = new NET_CFG_ELEVATOR_FLOOR_OSD[nMaxChannelNum];
        for(int i = 0; i < nMaxChannelNum; i ++){
            this.pstElevatorFloorOSD[i] = new NET_CFG_ELEVATOR_FLOOR_OSD();
        }
    }
}