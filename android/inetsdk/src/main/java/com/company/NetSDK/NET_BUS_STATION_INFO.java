package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * @brief bus station info
 * \else
 * @brief 公交站信息
 * \endif
 */
public class NET_BUS_STATION_INFO implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     *  bus no
     * \else
     *  车号
     * \endif
     */
    public byte					szBusNo[] = new byte[64];

    /**
     * \if ENGLISH_LANG
     *  park position
     * \else
     *  泊位
     * \endif
     */
    public byte					szParkPosition[] = new byte[64];

    /**
     * \if ENGLISH_LANG
     *  alcohol state,{@link EM_ALCOHOL_STATE}
     * \else
     *  酒精状态,{@link EM_ALCOHOL_STATE}
     * \endif
     */
    public int					emAlcoholState;

    /**
     * \if ENGLISH_LANG
     *  repair state,{@link EM_BUS_REPAIR_STATE}
     * \else
     *  修理状态,{@link EM_BUS_REPAIR_STATE}
     * \endif
     */
    public int					emRepairState;

    /**
     * \if ENGLISH_LANG
     *  oil state,{@link EM_BUS_OIL_STATE}
     * \else
     *  加油状态,{@link EM_BUS_OIL_STATE}
     * \endif
     */
    public int					emOilState;

    /**
     * \if ENGLISH_LANG
     *  wash state,{@link EM_BUS_WASH_STATE}
     * \else
     *  洗车状态,{@link EM_BUS_WASH_STATE}
     * \endif
     */
    public int					emWashState;

    /**
     * \if ENGLISH_LANG
     *  cash state,{@link EM_BUS_CASH_STATE}
     * \else
     *  收银状态,{@link EM_BUS_CASH_STATE}
     * \endif
     */
    public int					emCashState;

    /**
     * \if ENGLISH_LANG
     *  schedule state,{@link EM_SCHEDULE_STATE}
     * \else
     *  排班状态,{@link EM_SCHEDULE_STATE}
     * \endif
     */
    public int					emScheduleState;

}
