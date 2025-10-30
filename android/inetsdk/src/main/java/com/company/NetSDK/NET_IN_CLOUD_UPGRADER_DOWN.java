package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * interface {@link INetSDK#CloudUpgraderDownLoad} cloud upgrade download input parameter
 * \else
 *  接口 {@link INetSDK#CloudUpgraderDownLoad} 云升级下载升级包入参
 * \endif
 */
public class NET_IN_CLOUD_UPGRADER_DOWN implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     * device upgrade package url
     * \else
     * 设备升级包的URL
     * \endif
     */
    public byte                                szPackageUrl[] = new byte[FinalVar.SDK_COMMON_STRING_1024];

    /**
     * \if ENGLISH_LANG
     * saved file path
     * \else
     * 保存文件名
     * \endif
     */
    public byte                                szSaveFile[] = new byte[FinalVar.SDK_COMMON_STRING_1024];

    /**
     * \if ENGLISH_LANG
     * process callback
     * \else
     * 进度回调
     * \endif
     */
    public CB_fCloudDownload_Process_callback  pfProcessCallback;
}
