package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Upload process status
 * \else
 * 上传进度状态
 * \endif
 */
public class NET_UPLOAD_PROCESS_STATUS implements Serializable {

    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     * Uploading
     * \else
     * 上传中
     * \endif
     */
    public static final int NET_UPLOAD_PROCESS_STATUS_UPLOADING = 0;

    /**
     * \if ENGLISH_LANG
     * Complete
     * \else
     * 完成
     * \endif
     */
    public static final int NET_UPLOAD_PROCESS_STATUS_COMPLETE = 1;

    /**
     * \if ENGLISH_LANG
     * Failed
     * \else
     * 失败
     * \endif
     */
    public static final int NET_UPLOAD_PROCESS_STATUS_FAILED = 2;

    /**
     * \if ENGLISH_LANG
     * Cancel
     * \else
     * 取消
     * \endif
     */
    public static final int NET_UPLOAD_PROCESS_STATUS_CANCEL = 3;
}
