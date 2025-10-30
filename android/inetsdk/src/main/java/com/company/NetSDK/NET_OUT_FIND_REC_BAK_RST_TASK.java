package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * @brief CLIENT_FindRecordBackupRestoreTaskInfos out param
 * \else
 * @brief CLIENT_FindRecordBackupRestoreTaskInfos接口输出参数
 * \endif
 */
public class NET_OUT_FIND_REC_BAK_RST_TASK implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     *  task array, the user applies for memory, the size is sizeof(SDK_REC_BAK_RST_TASK)*nMaxCount
     * \else
     *  任务数组,由用户申请内存，大小为sizeof(SDK_REC_BAK_RST_TASK)*nMaxCount
     * \endif
     */
    public SDK_REC_BAK_RST_TASK[]					pTasks;

    /**
     * \if ENGLISH_LANG
     *  size of array
     * \else
     *  数组大小
     * \endif
     */
    public int					nMaxCount;

    /**
     * \if ENGLISH_LANG
     *  return count
     * \else
     *  返回的任务数量
     * \endif
     */
    public int					nRetCount;

    public NET_OUT_FIND_REC_BAK_RST_TASK(int nMaxCount) {
        this.nMaxCount = nMaxCount;
        this.pTasks = new SDK_REC_BAK_RST_TASK[nMaxCount];
        for(int i = 0; i < nMaxCount; i ++){
            this.pTasks[i] = new SDK_REC_BAK_RST_TASK();
        }
    }

}
