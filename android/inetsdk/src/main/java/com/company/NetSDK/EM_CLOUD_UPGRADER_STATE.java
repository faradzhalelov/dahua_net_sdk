package com.company.NetSDK;

import java.io.Serializable;

/**
 * Created by 32200 on 2018-11-28.
 */
public class EM_CLOUD_UPGRADER_STATE implements Serializable {

    /**
     *
     */
    private static final long serialVersionUID = 1L;


    /**
     * \if ENGLISH_LANG
     * Unknow
     * \else
     * 未知
     * \endif
     */
    public static final int EM_CLOUD_UPGRADER_STATE_UNKNOWN         	= 0;

    /**
     * \if ENGLISH_LANG
     * Noupgrade
     * \else
     * 未进行升级
     * \endif
     */
    public static final int EM_CLOUD_UPGRADER_STATE_NOUPGRADE            	= 1;

    /**
     * \if ENGLISH_LANG
     * Preparing
     * \else
     * 准备升级
     * \endif
     */
    public static final int EM_CLOUD_UPGRADER_STATE_PREPARING            	= 2;

    /**
     * \if ENGLISH_LANG
     *  Downloading
     * \else
     * 正在下载数据
     * \endif
     */
    public static final int EM_CLOUD_UPGRADER_STATE_DOWNLOADING        	= 3;

    /**
     * \if ENGLISH_LANG
     * DownloadFailed
     * \else
     * 下载失败
     * \endif
     */
    public static final int EM_CLOUD_UPGRADER_STATE_DOWNLOADFAILED        	= 4;

    /**
     * \if ENGLISH_LANG
     * Upgrading
     * \else
     * 正在升级
     * \endif
     */
    public static final int EM_CLOUD_UPGRADER_STATE_UPGRADING        	= 5;

    /**
     * \if ENGLISH_LANG
     * Invalid
     * \else
     * 升级包不正确
     * \endif
     */
    public static final int EM_CLOUD_UPGRADER_STATE_INVALID        	= 6;

    /**
     * \if ENGLISH_LANG
     * Failed
     * \else
     * 升级包写入Flash失败
     * \endif
     */
    public static final int EM_CLOUD_UPGRADER_STATE_FAILED        	= 7;

    /**
     * \if ENGLISH_LANG
     * Succeeded
     * \else
     * 升级包写入Flash成功
     * \endif
     */
    public static final int EM_CLOUD_UPGRADER_STATE_SUCCEEDED        	= 8;

}
