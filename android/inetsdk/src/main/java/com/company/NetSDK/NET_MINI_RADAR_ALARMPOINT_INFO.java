package com.company.NetSDK;

import java.io.Serializable;
import java.util.Arrays;


/**
 * \if ENGLISH_LANG
 * @brief Mini radar alarm point information
 * \else
 * @brief mini雷达报警点信息
 * \endif
 */
public class NET_MINI_RADAR_ALARMPOINT_INFO implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     *  Heart rate value (used by vital signs radar)
     * \else
     *  心率值(生命体征雷达使用)
     * \endif
     */
    public int					nHeartRate;

    /**
     * \if ENGLISH_LANG
     *  Respiratory value (used by vital signs radar)
     * \else
     *  呼吸值(生命体征雷达使用)
     * \endif
     */
    public int					nBreathe;

    /**
     * \if ENGLISH_LANG
     *  Standing up state (vital signs radar use)
     * \else
     *  起身状态(生命体征雷达使用)
     * \endif
     */
    public boolean					bGetUpStatus;

    /**
     * \if ENGLISH_LANG
     *  Out of bed status (vital signs radar use)
     * \else
     *  离床状态(生命体征雷达使用)
     * \endif
     */
    public boolean					bAFBStatus;

    /**
     * \if ENGLISH_LANG
     *  Roll over state (vital signs radar use)
     * \else
     *  翻身状态(生命体征雷达使用)
     * \endif
     */
    public boolean					bTurnOverStatus;

    /**
     * \if ENGLISH_LANG
     *  Sleep quality (vital signs radar use)
     * \else
     *  睡眠质量(生命体征雷达使用)
     * \endif
     */
    public int					nSleepQuality;

    /**
     * \if ENGLISH_LANG
     *  Fall state (indoor radar)
     * \else
     *  摔倒状态(室内雷达)
     * \endif
     */
    public boolean					bPosture;

    /**
     * \if ENGLISH_LANG
     *  Number of people (indoor radar)
     * \else
     *  人数(室内雷达)
     * \endif
     */
    public int					nNum;

    /**
     * \if ENGLISH_LANG
     *  Target ID, 0-31, indoor radar use
     * \else
     *  目标ID，0-31，室内雷达使用
     * \endif
     */
    public int					nId;

    /**
     * \if ENGLISH_LANG
     *  Location information x number
     * \else
     *  位置信息x个数
     * \endif
     */
    public int					nXPosNum;

    /**
     * \if ENGLISH_LANG
     *  Location information x  The unit meter is expanded by 100 times, with a maximum of 32 people
     * \else
     *  位置信息x，单位米。扩大100倍，最多32人
     * \endif
     */
    public int					nXPos[] = new int[32];

    /**
     * \if ENGLISH_LANG
     *  Location information y number
     * \else
     *  位置信息y个数
     * \endif
     */
    public int					nYPosNum;

    /**
     * \if ENGLISH_LANG
     *  Location information y  The unit meter is expanded by 100 times, with a maximum of 32 people
     * \else
     *  位置信息y，单位米。扩大100倍，最多32人
     * \endif
     */
    public int					nYPos[] = new int[32];

    /**
     * \if ENGLISH_LANG
     *  Number of speeds
     * \else
     *  速度个数
     * \endif
     */
    public int					nSpeedNum;

    /**
     * \if ENGLISH_LANG
     *  Speed M/s, 100 times, up to 32 people
     * \else
     *  速度 m/s，100倍，最多32人
     * \endif
     */
    public int					nSpeed[] = new int[32];

    /**
     * \if ENGLISH_LANG
     *  Number of personnel types
     * \else
     *  人员类型个数
     * \endif
     */
    public int					nTypeNum;

    /**
     * \if ENGLISH_LANG
     *  Personnel type: adults and children
     * \else
     *  人员类型：大人、小孩
     * \endif
     */
    public int					nType[] = new int[32];

    /**
     * \if ENGLISH_LANG
     *  Special for advertising machine; 1-5, supporting up to 5 levels
     * \else
     *  广告机专用；1-5，最多支持5个等级
     * \endif
     */
    public int					nHeartRateLevel;

    /**
     * \if ENGLISH_LANG
     *  Special for advertising machine; The distance between people and advertising machines, in meters, is expanded by 100 times
     * \else
     *  广告机专用；人与广告机的距离，单位米，扩大100倍
     * \endif
     */
    public int					nDistance;

    @Override
    public String toString() {
        return "NET_MINI_RADAR_ALARMPOINT_INFO{" +
                "nHeartRate=" + nHeartRate +
                ", nBreathe=" + nBreathe +
                ", bGetUpStatus=" + bGetUpStatus +
                ", bAFBStatus=" + bAFBStatus +
                ", bTurnOverStatus=" + bTurnOverStatus +
                ", nSleepQuality=" + nSleepQuality +
                ", bPosture=" + bPosture +
                ", nNum=" + nNum +
                ", nId=" + nId +
                ", nXPosNum=" + nXPosNum +
                ", nXPos=" + Arrays.toString(nXPos) +
                ", nYPosNum=" + nYPosNum +
                ", nYPos=" + Arrays.toString(nYPos) +
                ", nSpeedNum=" + nSpeedNum +
                ", nSpeed=" + Arrays.toString(nSpeed) +
                ", nTypeNum=" + nTypeNum +
                ", nType=" + Arrays.toString(nType) +
                ", nHeartRateLevel=" + nHeartRateLevel +
                ", nDistance=" + nDistance +
                '}';
    }
}
