package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * @brief Overseas cloud call information
 * \else
 * @brief 主叫信息
 * \endif
 */
public class NET_HANGUP_OVER_SEAS_CLOUD implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     *  Calling information
     * \else
     *  主叫信息
     * \endif
     */
    public NET_HANGUP_OVER_SEAS_CLOUD_FROM					stuFrom = new NET_HANGUP_OVER_SEAS_CLOUD_FROM();

    /**
     * \if ENGLISH_LANG
     *  Called information
     * \else
     *  被叫信息
     * \endif
     */
    public NET_HANGUP_OVER_SEAS_CLOUD_TO					stuTo = new NET_HANGUP_OVER_SEAS_CLOUD_TO();

    /**
     * \if ENGLISH_LANG
     *  Is the called information valid
     * \else
     *  被叫信息是否有效
     * \endif
     */
    public boolean					bToEnable;

    /**
     * \if ENGLISH_LANG
     *  Reason for hanging up, 0: unknown, 1: normal hanging up, if this field does not exist, it means normal hanging up, 2: busy line, 3: answered by the group, 4: does not support household calls, that is, indoor unit calls indoor unit
     * \else
     *  挂断原因, 0: 未知, 1:正常挂断,如果此字段不存在也表示正常挂断, 2:忙线中, 3:已被群组接听, 4:不支持户户通话,即室内机呼叫室内机, 5:未配置呼叫组和接听组, 6:呼叫失败
     * \endif
     */
    public int					nHangupReason;

}