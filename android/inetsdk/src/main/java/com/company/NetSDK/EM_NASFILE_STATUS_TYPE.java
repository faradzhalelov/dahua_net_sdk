package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * NAS file task type
 * \else
 * NAS文件任务类型
 * \endif
 */
public class EM_NASFILE_STATUS_TYPE implements Serializable {
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
    public static final int EM_NASFILE_STATUS_TYPE_UNKNOW = 0;

    /**
     * \if ENGLISH_LANG
     * copy
     * \else
     * 拷贝
     * \endif
     */
    public static final int EM_NASFILE_STATUS_TYPE_COPY = 1;

    /**
     * \if ENGLISH_LANG
     * move
     * \else
     * 移动
     * \endif
     */
    public static final int EM_NASFILE_STATUS_TYPE_MOVE = 2;

}
