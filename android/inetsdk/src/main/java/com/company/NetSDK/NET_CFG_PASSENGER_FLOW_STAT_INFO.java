package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * @brief Passenger Flow statistics Config, corresponding to NET_EM_CFG_PASSENGER_FLOW_STAT
 * \else
 * @brief 控制每路外部报警是否开启对应的客流统计功能, 对应 NET_EM_CFG_PASSENGER_FLOW_STAT
 * \endif
 */
public class NET_CFG_PASSENGER_FLOW_STAT_INFO implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     * Enable of Passenger flow statistics
     * \else
     * 客流统计开启
     * \endif
     */
    public boolean					bEnable;

    /**
     * \if ENGLISH_LANG
     * How many seconds before the car door opens to calculate validity.Unit seconds
     * \else
     * 车门开门前多少秒开始计算有效，单位秒
     * \endif
     */
    public int					nBeforeOpenDoor;

    /**
     * \if ENGLISH_LANG
     * How many seconds to stop counting after the car door is closed.Unit seconds
     * \else
     * 车门关闭后多少秒停止计算，单位秒
     * \endif
     */
    public int					nAfterCloseDoor;

    /**
     * \if ENGLISH_LANG
     *	Number of passenger flow statistics configurations
     * \else
     *	客流统计配置的实际数量
     * \endif
     */
    public int					nFlowNum;

    /**
     * \if ENGLISH_LANG
     *	Passenger flow statistics configuration
     * \else
     *	客流统计配置
     * \endif
     */
    public NET_PASSENGER_FLOW_STAT_PASSENGER_FLOW					stuPassengerFlow[] = new NET_PASSENGER_FLOW_STAT_PASSENGER_FLOW[16];

    /**
     * \if ENGLISH_LANG
     *	Whether to bind the route Enable. if enable, report it along with the bus route.if not enable,report is with opening and closing of the door
     * \else
     *	是否绑定线路，使能后 随公交线路站点上报，不使能 开关门后直接上报
     * \endif
     */
    public boolean					bBindLine;

    /**
     * \if ENGLISH_LANG
     *	Enable the superposition of personnel statistics results
     * \else
     *	人数统计结果叠加使能
     * \endif
     */
    public boolean					bOSDEnable;

    public NET_CFG_PASSENGER_FLOW_STAT_INFO() {
        for(int i = 0; i < 16; i ++) {
            this.stuPassengerFlow[i] = new NET_PASSENGER_FLOW_STAT_PASSENGER_FLOW();
        }
    }
}