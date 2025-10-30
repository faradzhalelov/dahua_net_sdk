package com.company.NetSDK;

import com.company.NetSDK.NET_ALARM_MSG_HANDLE;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * @brief Gateway config info(corresponding NET_EM_CFG_TRAFFICSTROBE command)
 * \else
 * @brief 道闸配置信息(对应 NET_EM_CFG_TRAFFICSTROBE 命令)
 * \endif
 */
public class NET_CFG_TRAFFICSTROBE_INFO implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     *  enable
     * \else
     *  使能
     * \endif
     */
    public boolean					bEnable;

    /**
     * \if ENGLISH_LANG
     *  gateway control method number
     * \else
     *  道闸控制方式个数
     * \endif
     */
    public int					nCtrlTypeCount;

    /**
     * \if ENGLISH_LANG
     *  gateway control method,{@link NET_EM_CFG_TRAFFICSTROBE_CTRTYPE}
     * \else
     *  道闸控制方式,{@link NET_EM_CFG_TRAFFICSTROBE_CTRTYPE}
     * \endif
     */
    public int					emCtrlType[] = new int[FinalVar.NET_CFG_MAX_CTRLTYPE_NUM];

    /**
     * \if ENGLISH_LANG
     *  All Snap Car class number
     * \else
     *  所有车开闸种类个数
     * \endif
     */
    public int					nAllSnapCarCount;

    /**
     * \if ENGLISH_LANG
     *  All Snap Car class	,{@link NET_EM_CFG_ALL_SNAP_CAR}
     * \else
     *  所有车开闸种类,{@link NET_EM_CFG_ALL_SNAP_CAR}
     * \endif
     */
    public int					emAllSnapCar[] = new int[FinalVar.NET_MAX_ALL_SNAP_CAR_COUNT];

    /**
     * \if ENGLISH_LANG
     *  enable gateway link parameter
     * \else
     *  开启道闸联动参数
     * \endif
     */
    public NET_ALARM_MSG_HANDLE stuEventHandler = new NET_ALARM_MSG_HANDLE();

    /**
     * \if ENGLISH_LANG
     *  unable gateway link parameter
     * \else
     *  关闭道闸联动参数
     * \endif
     */
    public NET_ALARM_MSG_HANDLE					stuEventHandlerClose = new NET_ALARM_MSG_HANDLE();

    /**
     * \if ENGLISH_LANG
     *  platform ip of order open gateway
     * \else
     *  负责命令开闸的平台IP
     * \endif
     */
    public byte					szOrderIP[] = new byte[FinalVar.SDK_MAX_IPADDR_EX_LEN];

    /**
     * \if ENGLISH_LANG
     *  gateway control method when platform ip disconnect with device,{@link NET_EM_CFG_TRAFFICSTROBE_CTRTYPE}
     * \else
     *  平台IP与设备断开连接后，设备采用的开闸方式,{@link NET_EM_CFG_TRAFFICSTROBE_CTRTYPE}
     * \endif
     */
    public int					emCtrlTypeOnDisconnect;

    /**
     * \if ENGLISH_LANG
     *  Gateway stationary open config
     * \else
     *  道闸常开配置
     * \endif
     */
    public NET_CFG_STATIONARY_OPEN					stuStationaryOpen = new NET_CFG_STATIONARY_OPEN();

}