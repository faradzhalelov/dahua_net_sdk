package com.company.NetSDK;

import java.io.Serializable;

/**
 * Created by 32200 on 2018-11-28.
 */
public class EM_CLOUD_UPGRADER_CHECK_STATE implements Serializable {

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
    public static final int EM_CLOUD_UPGRADER_CHECK_STATE_UNKNOWN                	= 0;

    /**
     * \if ENGLISH_LANG
     * Video Synopsis
     * \else
     * 没有检测到更新
     * \endif
     */
    public static final int EM_CLOUD_UPGRADER_CHECK_STATE_NONE            	= 1;

    /**
     * \if ENGLISH_LANG
     * Traffic Gate
     * \else
     * 一般升级 (需要用户确认, 只能向高版本)
     * \endif
     */
    public static final int EM_CLOUD_UPGRADER_CHECK_STATE_REGULAR            	= 2;

    /**
     * \if ENGLISH_LANG
     *  Electronic Police
     * \else
     * 强制升级 (设备自动检测执行, 可以向低版本)
     * \endif
     */
    public static final int EM_CLOUD_UPGRADER_CHECK_STATE_EMERGENCY        	= 3;

    /**
     * \if ENGLISH_LANG
     * Single Ptz Parking
     * \else
     * 自动升级 (有新升级包, 自动升级, 需使能页面自动升级选项)
     * \endif
     */
    public static final int EM_CLOUD_UPGRADER_CHECK_STATE_AUTOMATIC        	= 4;

}
