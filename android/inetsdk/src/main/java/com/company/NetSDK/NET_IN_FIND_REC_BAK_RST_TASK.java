package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * @brief CLIENT_FindRecordBackupRestoreTaskInfos in param
 * \else
 * @brief CLIENT_FindRecordBackupRestoreTaskInfos接口输入参数
 * \endif
 */
public class NET_IN_FIND_REC_BAK_RST_TASK implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     *  find type of find task by condition, {@link EM_RECORD_BACKUP_FIND_TYPE}
     * \else
     *  根据条件查询备份任务的查询方式, {@link EM_RECORD_BACKUP_FIND_TYPE}
     * \endif
     */
    public int					emFindType;

    /**
     * \if ENGLISH_LANG
     *  task ID,valid when emFindType equal EM_RECORD_BACKUP_FIND_TYPE_BY_TASKID
     * \else
     *  任务ID,emFindType为 EM_RECORD_BACKUP_FIND_TYPE_BY_TASKID 时有效,否则无效
     * \endif
     */
    public int					dwTaskID;

    /**
     * \if ENGLISH_LANG
     *  local channel of device,valid when emFindType equal EM_RECORD_BACKUP_FIND_TYPE_BY_CHN_AND_TIME 
     * \else
     *  设备端本地通道号,emFindType为 EM_RECORD_BACKUP_FIND_TYPE_BY_CHN_AND_TIME 时有效,否则无效
     * \endif
     */
    public int					nLocalChannelID;

    /**
     * \if ENGLISH_LANG
     *  start time of record,valid when emFindType equal EM_RECORD_BACKUP_FIND_TYPE_BY_CHN_AND_TIME 
     * \else
     *  备份录像的开始时间,emFindType为 EM_RECORD_BACKUP_FIND_TYPE_BY_CHN_AND_TIME 时有效,否则无效
     * \endif
     */
    public NET_TIME					stuStartTime = new NET_TIME();

    /**
     * \if ENGLISH_LANG
     *  end time of record,valid when emFindType equal EM_RECORD_BACKUP_FIND_TYPE_BY_CHN_AND_TIME 
     * \else
     *  备份录像的结束时间,emFindType为 EM_RECORD_BACKUP_FIND_TYPE_BY_CHN_AND_TIME 时有效,否则无效
     * \endif
     */
    public NET_TIME					stuEndTime = new NET_TIME();

    /**
     * \if ENGLISH_LANG
     *  Actively registered device ID, Required when emFindType is EM_RECORD_BACKUP_FIND_TYPE_BY_DEVICE_ID, otherwise invalid
     * \else
     *  主动注册的设备ID, emFindType为EM_RECORD_BACKUP_FIND_TYPE_BY_DEVICE_ID时必选有效，否则无效
     * \endif
     */
    public byte					szDeviceID[] = new byte[128];

}
