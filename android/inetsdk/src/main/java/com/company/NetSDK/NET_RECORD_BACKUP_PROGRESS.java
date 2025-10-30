package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * @brief Recording backup progress
 * \else
 * @brief 录像备份进度
 * \endif
 */
public class NET_RECORD_BACKUP_PROGRESS implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     *  current backup file name
     * \else
     *  当前备份文件名
     * \endif
     */
    public byte					szFilePath[] = new byte[256];

    /**
     * \if ENGLISH_LANG
     *  The type of the last successful packet, {@link ENUM_RECORDBACKUP_FILE_PROGRESS_TYPE}
     * \else
     *  最后传递成功的数据包类型, {@link ENUM_RECORDBACKUP_FILE_PROGRESS_TYPE}
     * \endif
     */
    public int					emType;

    /**
     * \if ENGLISH_LANG
     *  The position of the last successful data packet
     * \else
     *  最后传递成功的数据包位置
     * \endif
     */
    public int					nPosition;

    /**
     * \if ENGLISH_LANG
     *  Task progress percentage, 0-100
     * \else
     *  任务进度百分比,0-100
     * \endif
     */
    public int					nPercent;

    /**
     * \if ENGLISH_LANG
     *  The estimated remaining time of the task, in seconds. -1-unknown; 0-completed
     * \else
     *  任务预计剩余时长,单位秒。-1  – 未知； 0  – 完成；
     * \endif
     */
    public int					nRemainingTime;

}
