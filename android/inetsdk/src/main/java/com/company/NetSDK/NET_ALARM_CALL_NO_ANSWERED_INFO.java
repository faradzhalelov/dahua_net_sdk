package com.company.NetSDK;
import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Call no answer event, under directly connected(Corresponding to event SDK_ALARM_CALL_NO_ANSWERED)
 * \else
 * 直连情况下，呼叫无答应事件(对应事件SDK_ALARM_CALL_NO_ANSWERED)
 * \endif
 */
public class NET_ALARM_CALL_NO_ANSWERED_INFO implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     * Event occurrence time
     * \else
     * 事件发生的时间
     * \endif
     */

    public NET_TIME_EX                  stuTime = new NET_TIME_EX();

    /**
     * \if ENGLISH_LANG
     * Call ID
     * \else
     * 呼叫ID
     * \endif
     */

    public byte[]                  szCallID = new byte[FinalVar.MAX_CALL_ID_LEN];

    /**
     * \if ENGLISH_LANG
     * Event operation. 1=start. 2=stop
     * \else
     * 事件动作, 1表示持续性事件开始,2表示持续性事件结束;
     * \endif
     */

    public int                      nAction;

    /**
     * \if ENGLISH_LANG
     * Channel ID
     * \else
     * 通道号
     * \endif
     */
    public int                      nChannelID;


}
