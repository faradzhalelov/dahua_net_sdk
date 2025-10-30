package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 *  alarm of NAS File Remove Status, the corresponding interface {@link INetSDK#StartListenEx},the corresponding command {@link FinalVar#SDK_ALARM_NAS_FILE_REMOVE_STATUS}
 * \else
 * NAS文件删除状态事件, 对应接口 {@link INetSDK#StartListenEx},对应命令 {@link FinalVar#SDK_ALARM_NAS_FILE_REMOVE_STATUS}
 * \endif
 */
public class ALARM_NAS_FILE_REMOVE_STATUS_INFO implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     * Event ID
     * \else
     * 事件ID
     * \endif
     */
    public int						nEventID;

    /**
     * \if ENGLISH_LANG
     * Event operation. 0=pulse event.1=continues event begin. 2=continuous event stop
     * \else
     * 事件动作,0表示脉冲事件,1表示持续性事件开始,2表示持续性事件结束;
     * \endif
     */
    public int						nAction;

    /**
     * \if ENGLISH_LANG
     * Time stamp (Unit:ms)
     * \else
     * 时间戳(单位是毫秒)
     * \endif
     */
    public double					dbPTS;

    /**
     * \if ENGLISH_LANG
     * Event occurrence time
     * \else
     * 事件发生的时间
     * \endif
     */
    public NET_TIME_EX				stuTime = new NET_TIME_EX();

    /**
     * \if ENGLISH_LANG
     * Task status, refer to {@link EM_NASFILE_STATUS_STATE}
     * \else
     * 任务状态, 取值参考 {@link EM_NASFILE_STATUS_STATE}
     * \endif
     */
    public int      	         emStatus;

    /**
     * \if ENGLISH_LANG
     * ID
     * \else
     * 任务ID
     * \endif
     */
    public byte[]					szID = new byte[FinalVar.SDK_COMMON_STRING_128];

    /**
     * \if ENGLISH_LANG
     * progress
     * \else
     * 任务进度
     * \endif
     */
    public int						nProgress;
}
