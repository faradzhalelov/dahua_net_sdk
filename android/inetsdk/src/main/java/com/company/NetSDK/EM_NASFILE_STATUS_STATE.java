package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * NAS file task state
 * \else
 * NAS文件任务状态
 * \endif
 */
public class EM_NASFILE_STATUS_STATE implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     * unknown
     * \else
     * 未知
     * \endif
     */
    public static final int EM_NASFILE_STATUS_STATE_UNKNOW = 0;

    /**
     * \if ENGLISH_LANG
     * failed
     * \else
     * 失败
     * \endif
     */
    public static final int EM_NASFILE_STATUS_STATE_FAILED = 1;

    /**
     * \if ENGLISH_LANG
     * success
     * \else
     * 成功
     * \endif
     */
    public static final int EM_NASFILE_STATUS_STATE_SUCCESSED = 2;

}
