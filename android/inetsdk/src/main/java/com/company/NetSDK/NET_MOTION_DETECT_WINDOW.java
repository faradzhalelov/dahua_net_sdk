package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * @brief Video windows supported by motion detection
 * \else
 * @brief 动检支持的视频窗口
 * \endif
 */
public class NET_MOTION_DETECT_WINDOW implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     *  Area threshold, value [0, 100]
     * \else
     *  面积阀值，取值[0, 100]
     * \endif
     */
    public int					nThreshold;

    /**
     * \if ENGLISH_LANG
     *  Sensitivity, value [0, 100]
     * \else
     *  灵敏度，取值[0, 100]
     * \endif
     */
    public int					nSensitive;

    /**
     * \if ENGLISH_LANG
     *  Number of rows in dynamic detection area
     * \else
     *  动态检测区域的行数
     * \endif
     */
    public int					nMotionRow;

    /**
     * \if ENGLISH_LANG
     *  Number of columns in the dynamic detection area
     * \else
     *  动态检测区域的列数
     * \endif
     */
    public int					nMotionCol;

    /**
     * \if ENGLISH_LANG
     *  Motion detection area block
     * \else
     *  动检检测区域块
     * \endif
     */
    public byte					nRegion[][] = new byte[32][32];

    /**
     * \if ENGLISH_LANG
     *  Dynamic window ID number
     * \else
     *  动态窗口ID号
     * \endif
     */
    public int					nId;

    /**
     * \if ENGLISH_LANG
     *  Dynamic window name
     * \else
     *  动态窗口名称
     * \endif
     */
    public byte					szName[] = new byte[256];

    /**
     * \if ENGLISH_LANG
     *  Reserved bytes
     * \else
     *  保留字节
     * \endif
     */
    public byte					szResvered[] = new byte[256];

}