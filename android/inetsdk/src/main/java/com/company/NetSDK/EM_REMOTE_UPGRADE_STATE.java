package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Remote Upgrade state
 * \else
 * 远程设备升级状态
 * \endif
 */
public class EM_REMOTE_UPGRADE_STATE implements Serializable {

    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     * Unknown
     * \else
     * 未知
     * \endif
     */
    public static final int    EM_REMOTE_UPGRADE_STATE_UNKNOWN = 0;

    /**
     * \if ENGLISH_LANG
     * Init
     * \else
     * 初始状态(未升级)
     * \endif
     */
    public static final int    EM_REMOTE_UPGRADE_STATE_INIT = 1;

    /**
     * \if ENGLISH_LANG
     * Downloading
     * \else
     * 正在下载数据
     * \endif
     */
    public static final int    EM_REMOTE_UPGRADE_STATE_DOWNLOADING = 2;

    /**
     * \if ENGLISH_LANG
     * Upgradeing
     * \else
     * 正在升级
     * \endif
     */
    public static final int    EM_REMOTE_UPGRADE_STATE_UPGRADING = 3;

    /**
     * \if ENGLISH_LANG
     * Failed
     * \else
     * 升级失败
     * \endif
     */
    public static final int    EM_REMOTE_UPGRADE_STATE_FAILED = 4;

    /**
     * \if ENGLISH_LANG
     * Successed
     * \else
     * 升级成功
     * \endif
     */
    public static final int    EM_REMOTE_UPGRADE_STATE_SUCCEEDED = 5;

    /**
     * \if ENGLISH_LANG
     * Cancelled
     * \else
     * 取消升级
     * \endif
     */
    public static final int    EM_REMOTE_UPGRADE_STATE_CANCELLED = 6;

    /**
     * \if ENGLISH_LANG
     * Preparing
     * \else
     * 准备升级
     * \endif
     */
    public static final int    EM_REMOTE_UPGRADE_STATE_PREPARING = 7;



}
