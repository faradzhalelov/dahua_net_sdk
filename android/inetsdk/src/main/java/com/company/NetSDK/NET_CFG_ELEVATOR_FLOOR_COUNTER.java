package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * @brief Elevator floor counter related configuration, corresponding to NET_EM_CFG_ELEVATOR_FLOOR_COUNTER
 * \else
 * @brief 电梯楼层计数器相关配置, 对应枚举 NET_EM_CFG_ELEVATOR_FLOOR_COUNTER
 * \endif
 */
public class NET_CFG_ELEVATOR_FLOOR_COUNTER implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     *  The floor configuration function enabled
     * \else
     *  是否开启楼层配置功能
     * \endif
     */
    public boolean					bEnable;

    /**
     * \if ENGLISH_LANG
     *  The maximum number of floors above ground is 255
     * \else
     *  地上楼层数，最大支持255
     * \endif
     */
    public int					nUpElevatorFloorNum;

    /**
     * \if ENGLISH_LANG
     *  Number of underground floors, maximum support of 255
     * \else
     *  地下楼层数，最大支持255
     * \endif
     */
    public int					nDownElevatorFloorNum;

    /**
     * \if ENGLISH_LANG
     *  Number of Above ground floor alias
     * \else
     *  地上楼层别名数量
     * \endif
     */
    public int					nUpElevatorFloorNameNum;

    /**
     * \if ENGLISH_LANG
     *  Above ground floor alias,
     * \else
     *  地上楼层别名，可填写数字和字母
     * \endif
     */
    public byte					szUpElevatorFloorName[][] = new byte[256][32];

    /**
     * \if ENGLISH_LANG
     * 	Number of Underground floor alias
     * \else
     * 	地下楼层别名数量
     * \endif
     */
    public int					nDownElevatorFloorNameNum;

    /**
     * \if ENGLISH_LANG
     *  Underground floor alias
     * \else
     *  地下楼层别名，可填写数字和字母
     * \endif
     */
    public byte					szDownElevatorFloorName[][] = new byte[256][32];

    /**
     * \if ENGLISH_LANG
     *  Number of Electric scooter entry inspection floor
     * \else
     *  电瓶车入梯检测楼层数量
     * \endif
     */
    public int					nMotorEntryingCheckFloorNum;

    /**
     * \if ENGLISH_LANG
     *  Electric scooter entry inspection floor
     * \else
     *  电瓶车入梯检测楼层
     * \endif
     */
    public byte					szMotorEntryingCheckFloor[][] = new byte[256][32];

    /**
     * \if ENGLISH_LANG
     *  Number of Ground floor air pressure
     * \else
     *  地上楼层气压数量
     * \endif
     */
    public int					nUpFloorPressureNum;

    /**
     * \if ENGLISH_LANG
     *  Ground floor air pressure
     * \else
     *  地上楼层气压，单位帕斯卡
     * \endif
     */
    public int					nUpFloorPressure[] = new int[256];

    /**
     * \if ENGLISH_LANG
     *  Number of Underground floor pressure
     * \else
     *  地下楼层气压数量
     * \endif
     */
    public int					nDownFloorPressureNum;

    /**
     * \if ENGLISH_LANG
     *  Underground floor pressure
     * \else
     *  地下楼层气压，单位帕斯卡
     * \endif
     */
    public int					nDownFloorPressure[] = new int[256];

    /**
     * \if ENGLISH_LANG
     *  Number of Above ground floor height
     * \else
     *  地上楼层高度数量
     * \endif
     */
    public int					nUpFloorHeightNum;

    /**
     * \if ENGLISH_LANG
     *  Above ground floor height
     * \else
     *  地上楼层高度，单位m
     * \endif
     */
    public double					dbUpFloorHeight[] = new double[256];

    /**
     * \if ENGLISH_LANG
     *  Number of Underground floor height
     * \else
     *  地下楼层高度数量
     * \endif
     */
    public int					nDownFloorHeightNum;

    /**
     * \if ENGLISH_LANG
     *  Underground floor height
     * \else
     *  地下楼层高度
     * \endif
     */
    public double					dbDownFloorHeight[] = new double[256];

    /**
     * \if ENGLISH_LANG
     *  Automatic calibration mode   1:From bottom to top  2:From top to bottom   3:First up and then down
     * \else
     *  自动校准模式  1:从下到上         2:从上到下      3:先上后下	
     * \endif
     */
    public int					nAutoCalibrateMode;

}