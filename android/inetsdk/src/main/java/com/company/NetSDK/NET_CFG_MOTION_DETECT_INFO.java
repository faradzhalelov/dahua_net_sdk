package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * @brief Motion Detect configuration, corresponding to NET_EM_CFG_MOTION_DETECT
 * \else
 * @brief 动态检测报警配置配置, 对应枚举NET_EM_CFG_MOTION_DETECT
 * \endif
 */
public class NET_CFG_MOTION_DETECT_INFO implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     *  Dynamic detection enable enable
     * \else
     *  动态检测开启使能
     * \endif
     */
    public boolean					bEnable;

    /**
     * \if ENGLISH_LANG
     *  When manually controlling the gimbal, whether the motion detection is enabled
     * \else
     *  手动控制云台时，动检是否开启
     * \endif
     */
    public boolean					bPtzManualEnable;

    /**
     * \if ENGLISH_LANG
     *  Motion detection prompts OSD flashing enable
     * \else
     *  动检提示OSD闪烁使能
     * \endif
     */
    public boolean					bOsdTwinkleEnable;

    /**
     * \if ENGLISH_LANG
     *  Area occupation ratio, 1-100, 0 means this configuration is invalid
     * \else
     *  面积占用比, 1-100, 0 表示此配置无效
     * \endif
     */
    public int					nVolumeRatio;

    /**
     * \if ENGLISH_LANG
     *  Residual threshold for motion detection, 1-100, 0 means this configuration is invalid
     * \else
     *  动检的残差阈值, 1-100, 0 表示此配置无效
     * \endif
     */
    public int					nSubRatio;

    /**
     * \if ENGLISH_LANG
     *  Dynamic detection linkage
     * \else
     *  动态检测联动
     * \endif
     */
    public NET_ALARM_MSG_HANDLE					stuEventHandler = new NET_ALARM_MSG_HANDLE();

    /**
     * \if ENGLISH_LANG
     *  The number of video windows supported by the third-generation motion detection
     * \else
     *  三代动检支持的视频窗口个数
     * \endif
     */
    public int					nMotionDetectWindowCount;

    /**
     * \if ENGLISH_LANG
     *  Video windows supported by the third-generation motion detection
     * \else
     *  三代动检支持的视频窗口
     * \endif
     */
    public NET_MOTION_DETECT_WINDOW					stuMotionDetectWindow[] = new NET_MOTION_DETECT_WINDOW[4];

    public NET_CFG_MOTION_DETECT_INFO() {
        for(int i = 0; i < 4; i ++) {
            stuMotionDetectWindow[i] = new NET_MOTION_DETECT_WINDOW();
        }
    }
}