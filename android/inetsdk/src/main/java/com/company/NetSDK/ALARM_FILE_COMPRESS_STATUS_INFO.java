package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * alarm of File Compress Status, the corresponding interface {@link INetSDK#StartListenEx},the corresponding command {@link FinalVar#SDK_ALARM_FILE_COMPRESS_STATUS}
 * \else
 * 文件压缩解压结果反馈事件, 对应接口 {@link INetSDK#StartListenEx},对应命令 {@link FinalVar#SDK_ALARM_FILE_COMPRESS_STATUS}
 * \endif
 */
public class ALARM_FILE_COMPRESS_STATUS_INFO implements Serializable {
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
     * ID
     * \else
     * 任务ID
     * \endif
     */
    public byte[]					szID = new byte[FinalVar.SDK_COMMON_STRING_128];

    /**
     * \if ENGLISH_LANG
     * Type, refer to {@link EM_FILE_COMPRESS_TYPE}
     * \else
     * 任务类型, 取值参考 {@link EM_FILE_COMPRESS_TYPE}
     * \endif
     */
    public int	emType;

    /**
     * \if ENGLISH_LANG
     * Src File number
     * \else
     * 源文件(夹)名数量
     * \endif
     */
    public int						nSrcNum;

    /**
     * \if ENGLISH_LANG
     * Src File list
     * \else
     * 源文件(夹)名列表
     * \endif
     */
    public byte[][]		szSrcList = new byte[FinalVar.MAX_NASFILE_NUM][FinalVar.CFG_COMMON_STRING_128];

    /**
     * \if ENGLISH_LANG
     * Dst Path
     * \else
     * 目的路径
     * \endif
     */
    public byte[]			szDstPath = new byte[FinalVar.SDK_COMMON_STRING_128];

    /**
     * \if ENGLISH_LANG
     * status, refer to {@link EM_FILE_COMPRESS_STATUS}
     * \else
     * 任务状态, 取值参考 {@link EM_FILE_COMPRESS_STATUS}
     * \endif
     */
    public int	emStatus;

    /**
     * \if ENGLISH_LANG
     * progress
     * \else
     * 任务进度
     * \endif
     */
    public int						nProgress;
}
