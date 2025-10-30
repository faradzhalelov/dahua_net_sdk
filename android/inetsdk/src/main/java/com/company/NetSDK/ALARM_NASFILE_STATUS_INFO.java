package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * alarm of NAS file status, the corresponding interface {@link INetSDK#StartListenEx},the corresponding command {@link FinalVar#SDK_ALARM_NASFILE_STATUS}
 * \else
 * NAS文件状态事件, 对应接口 {@link INetSDK#StartListenEx},对应命令 {@link FinalVar#SDK_ALARM_NASFILE_STATUS}
 * \endif
 */
public class ALARM_NASFILE_STATUS_INFO implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     * time stamp (Unit is ms)
     * \else
     * 时间戳(单位是毫秒)
     * \endif
     */
    public double               dbPTS;

    /**
     * \if ENGLISH_LANG
     * event happen time
     * \else
     * 事件发生时间
     * \endif
     */
    public NET_TIME_EX            stuTime = new NET_TIME_EX();

    /**
     * \if ENGLISH_LANG
     * task status. refer to {@link EM_NASFILE_STATUS_STATE}
     * \else
     * 任务状态,取值参考 {@link EM_NASFILE_STATUS_STATE}
     * \endif
     */
    public int                         emTaskState;

    /**
     * \if ENGLISH_LANG
     * task id
     * \else
     * 任务ID
     * \endif
     */
    public byte                szTaskID[] = new byte[FinalVar.CFG_COMMON_STRING_128];

    /**
     * \if ENGLISH_LANG
     * file task type. refer to {@link EM_NASFILE_STATUS_TYPE}
     * \else
     * 文件任务类型,取值参考 {@link EM_NASFILE_STATUS_TYPE}
     * \endif
     */
    public int               emTaskType;

    /**
     * \if ENGLISH_LANG
     * src file number
     * \else
     * 源文件(夹)数量
     * \endif
     */
    public int               nSrcNum;

    /**
     * \if ENGLISH_LANG
     * src file list
     * \else
     * 源文件(夹)名列表
     * \endif
     */
    public byte[][]		szSrcList = new byte[FinalVar.MAX_NASFILE_NUM][FinalVar.CFG_COMMON_STRING_128];

    /**
     * \if ENGLISH_LANG
     * dst path
     * \else
     * 目的路径
     * \endif
     */
    public byte                szDstPath[] = new byte[FinalVar.CFG_COMMON_STRING_128];

    /**
     * \if ENGLISH_LANG
     * task progress
     * \else
     * 任务进度
     * \endif
     */
    public int               nProgress;

}
