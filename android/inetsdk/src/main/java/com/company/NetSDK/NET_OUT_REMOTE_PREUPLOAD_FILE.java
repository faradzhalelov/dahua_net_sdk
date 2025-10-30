package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * {@link INetSDK#RemotePreUploadFile}output param
 * \else
 * {@link INetSDK#RemotePreUploadFile}出参
 * \endif
 */
public class NET_OUT_REMOTE_PREUPLOAD_FILE implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     * The flag to be continue to upload
     * \else
     * 标志是否继续上传该文件。因如文件过大，设备可拒绝接收上传
     * \endif
     */
    public boolean          bContinue2Upload;

    /**
     * \if ENGLISH_LANG
     * Reason of refused to upload, valid when bContinue2Upload is false,refer to {@link EM_REASON_TYPE}
     * \else
     *  错误原因, 当bContinue2Upload为false时emType有效,refer to {@link EM_REASON_TYPE}
     * \endif
     */
    public int          emType;
}
