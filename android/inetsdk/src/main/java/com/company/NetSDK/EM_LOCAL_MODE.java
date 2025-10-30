package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 *
 * \else
 * 本地优化模式
 * \endif
 */
public class EM_LOCAL_MODE implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     * Set whether gdpr queries configuration: 0-default process; 1-gdpr1. X device, bitstream encryption is enabled, do not get configuration;
     * 2-gdpr1. X device, bitstream encryption is not enabled, and configuration is not obtained; 3-Non gdpr device, configuration is not obtained, attachvk and getvk are filtered
     * \else
     * 设置GDPR 是否查询配置 ：0-默认流程；1-GDPR1.X设备，码流加密已开启,不获取配置；
     * 2-GDPR1.X设备，码流加密未开启，不获取配置；3-非GDPR设备，不获取配置,过滤AttachVK,GetVK
     * \endif
     */
    public final static int EM_LOCAL_GDPR_SET_MODE = 100;
    /**
     * \if ENGLISH_LANG
     *
     * \else
     * 实时预览策略标志位  bit0 == 1 不支持画中画  bit1 == 1 不支持通道信息校验
     * \endif
     */
    public final static int EM_LOCAL_PLAY_FLAG_MODE = 101;

    /**
     * \if ENGLISH_LANG
     *
     * \else
     * 录像回放和录像查询策略标志位  bit0 == 1 不支持画中画
     * \endif
     */
    public final static int EM_LOCAL_PLAYBACK_FLAG_MODE = 102;
}
