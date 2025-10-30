package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * @brief task of record backup to restore
 * \else
 * @brief 录像备份恢复任务信息
 * \endif
 */
public class SDK_REC_BAK_RST_TASK implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     *  task ID
     * \else
     *  任务ID
     * \endif
     */
    public int					nTaskID;

    /**
     * \if ENGLISH_LANG
     *  device ID
     * \else
     *  设备ID
     * \endif
     */
    public byte					szDeviceID[] = new byte[FinalVar.SDK_DEV_ID_LEN_EX];

    /**
     * \if ENGLISH_LANG
     *  channek ID
     * \else
     *  通道号
     * \endif
     */
    public int					nChannelID;

    /**
     * \if ENGLISH_LANG
     *  record start time
     * \else
     *  录像开始时间
     * \endif
     */
    public NET_TIME					stuStartTime = new NET_TIME();

    /**
     * \if ENGLISH_LANG
     *  record end time
     * \else
     *  录像结束时间
     * \endif
     */
    public NET_TIME					stuEndTime = new NET_TIME();

    /**
     * \if ENGLISH_LANG
     *  state of backup, 0-wait, 1-working, 2-finish, 3-failed, 4-pause
     * \else
     *  当前备份状态, 0-等待, 1-进行中, 2-完成, 3-失败, 4-暂停
     * \endif
     */
    public int					nState;

    /**
     * \if ENGLISH_LANG
     *  current backup progress
     * \else
     *  当前备份进度
     * \endif
     */
    public NET_RECORD_BACKUP_PROGRESS					stuProgress = new NET_RECORD_BACKUP_PROGRESS();

    /**
     * \if ENGLISH_LANG
     *  The reason for the failure, valid when the emState field is 3, {@link EM_RECORD_BACKUP_FAIL_REASON}
     * \else
     *  失败的原因, 当nState字段为3的情况下有效, {@link EM_RECORD_BACKUP_FAIL_REASON}
     * \endif
     */
    public int					emFailReason;

    /**
     * \if ENGLISH_LANG
     *  execute task start time, valid when nState equal 1(working) or 2(finish) or 3(failed)
     * \else
     *  任务开始时间, nState为"进行中"、"已完成"、"失败"的情况下该时间点有效;
     * \endif
     */
    public NET_TIME					stuTaskStartTime = new NET_TIME();

    /**
     * \if ENGLISH_LANG
     *  execute task end time, valid when nState equal 2(finish) or 3(failed)
     * \else
     *  任务结束时间, nState为"已完成"、"失败"的情况下该时间点有效;
     * \endif
     */
    public NET_TIME					stuTaskEndTime = new NET_TIME();

    /**
     * \if ENGLISH_LANG
     *  backup channel
     * \else
     *  备份源通道
     * \endif
     */
    public int					nRemoteChannel;

}
