package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * alarm of CGI triggered manual video recording, Corresponding to interface {@link INetSDK#StartListenEx}, Corresponding to command {@link FinalVar#SDK_ALARM_CGIRECORD}
 * \else
 * CGI触发手动录像，对应接口{@link INetSDK#StartListenEx}, 对应命令  {@link FinalVar#SDK_ALARM_CGIRECORD}
 * \endif
 */
public class ALARM_CGIRECORD implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     *  Event operation.  1=start. 2=stop
     * \else
     * 事件动作,1表示事件开始,2表示事件结束;
     * \endif
     */
    public int                     nAction;

    /**
     * \if ENGLISH_LANG
     *  Record channel
     * \else
     * 录像通道号
     * \endif
     */
    public int                     nChannelID;

    /**
     * \if ENGLISH_LANG
     * Time stamp (Unit is ms)
     * \else
     * 时间戳(单位是毫秒)
     * \endif
     */
    public double                 dbPTS;

    /**
     * \if ENGLISH_LANG
     * Event occurrence time
     * \else
     * 事件发生的时间
     * \endif
     */
    public NET_TIME_EX             stuTime = new NET_TIME_EX();

    /**
     * \if ENGLISH_LANG
     * Event ID
     * \else
     * 事件ID
     * \endif
     */
    public int                    nEventID;

    /**
     * \if ENGLISH_LANG
     * Record start time
     * \else
     * 录像开始时间
     * \endif
     */
    public  NET_TIME_EX           stuStartTime = new NET_TIME_EX();

    /**
     * \if ENGLISH_LANG
     * Record end time
     * \else
     * 录像结束时间
     * \endif
     */
    public NET_TIME_EX            stuStopTime = new NET_TIME_EX();
}
