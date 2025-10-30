package com.company.NetSDK;

import java.io.Serializable;

/**
 * Created by 29875 on 2019/8/8.
 */
public class CFG_AUDIO_DETECT_INFO implements Serializable {

    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     *
     * \else
     * 是否使能，TRUE使能，FALSE不使能
     * \endif
     */
    public boolean             bEnable;

    /**
     * \if ENGLISH_LANG
     *
     * \else
     * 音量下限
     * \endif
     */
    public int             nMinVolume;

    /**
     * \if ENGLISH_LANG
     *
     * \else
     * 音量上限
     * \endif
     */
    public int             nMaxVolume;

    /**
     * \if ENGLISH_LANG
     *
     * \else
     * 声音异常检测使能
     * \endif
     */
    public boolean          bAnomalyDetect;

    /**
     * \if ENGLISH_LANG
     *
     * \else
     * 声音异常检测灵敏度值	取值范围1~100
     * \endif
     */
    public int             nAnomalySensitive;

    /**
     * \if ENGLISH_LANG
     *
     * \else
     * 声强突变检测使能
     * \endif
     */
    public boolean          bMutationDetect;

    /**
     * \if ENGLISH_LANG
     *
     * \else
     * 声强突变检测阈值	取值范围1~100
     * \endif
     */
    public int             nMutationThreold;

    /**
     * \if ENGLISH_LANG
     *
     * \else
     * 联动配置
     * \endif
     */
    public CFG_ALARM_MSG_HANDLE            stuEventHandler = new CFG_ALARM_MSG_HANDLE();

    /**
     * \if ENGLISH_LANG
     *
     * \else
     * 音频强度检测使能
     * \endif
     */
    public boolean                         bIntensityDetect;

    /**
     * \if ENGLISH_LANG
     *
     * \else
     * 音频强度检测分贝阈值, 单位分贝, 取值范围0~90
     * \endif
     */
    public int                    nIntensityDecibelGate;                  //
}
