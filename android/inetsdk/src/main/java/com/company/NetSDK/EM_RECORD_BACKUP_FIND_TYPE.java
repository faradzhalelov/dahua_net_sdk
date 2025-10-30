package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * @brief find type of find task by condition
 * \else
 * @brief 根据条件查询备份任务的查询方式
 * \endif
 */
public class EM_RECORD_BACKUP_FIND_TYPE implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     *  unknown
     * \else
     *  未知
     * \endif
     */
    public static final int					EM_RECORD_BACKUP_FIND_TYPE_UNKNOWN = 0;

    /**
     * \if ENGLISH_LANG
     *  find task infos by taskID
     * \else
     *  按照任务号查询
     * \endif
     */
    public static final int					EM_RECORD_BACKUP_FIND_TYPE_BY_TASKID = 1;

    /**
     * \if ENGLISH_LANG
     *  find task infos by local channel and record time 
     * \else
     *  按照通道和录制时间段查询
     * \endif
     */
    public static final int					EM_RECORD_BACKUP_FIND_TYPE_BY_CHN_AND_TIME = 2;

    /**
     * \if ENGLISH_LANG
     *  Check according to the actively registered device ID
     * \else
     *  按照主动注册的设备ID查
     * \endif
     */
    public static final int					EM_RECORD_BACKUP_FIND_TYPE_BY_DEVICE_ID = 3;

}
