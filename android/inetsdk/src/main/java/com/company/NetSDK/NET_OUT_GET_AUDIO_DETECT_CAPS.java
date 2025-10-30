package com.company.NetSDK;

/**
 * Created by 29875 on 2019/8/8.
 */
public class NET_OUT_GET_AUDIO_DETECT_CAPS {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     * Whether support volume detect or not
     * \else
     * 是否支持音量检测
     * \endif
     */
    public boolean                bVolumeDetect;

    /**
     * \if ENGLISH_LANG
     * Whether support anomaly detect or not
     * \else
     * 是否支持声音异常检测
     * \endif
     */
    public boolean                bAnomalyDetect;

    /**
     * \if ENGLISH_LANG
     * Anomaly sensitive range arr, first element is min, second element is max
     * \else
     * 声音异常检测灵敏度范围数组,第一个元素为最小值,第二个元素为最大值
     * \endif
     */
    public int  nAnomalySensitiveRange[] = new int[2];

    /**
     * \if ENGLISH_LANG
     * Whether support mutation detect or not
     * \else
     * 是否支持声强突变检测
     * \endif
     */
    public boolean                bMutationDetect;

    /**
     * \if ENGLISH_LANG
     * Mutation detect threshold range arr, first element is min, second element is max
     * \else
     * 声强突变检测门限范围数组,第一个元素为最小值,第二个元素为最大值
     * \endif
     */
    public int                      nMutationThresholdRange[] = new int[2];

    /**
     * \if ENGLISH_LANG
     * Whether support infant cry detect
     * \else
     * 是否支持婴儿啼哭检测
     * \endif
     */
    public boolean                bInfantCryDetect;

    /**
     * \if ENGLISH_LANG
     * Whether support intensity detect
     * \else
     * 是否支持音频强度检测
     * \endif
     */
    public boolean                bIntensityDetect;


    /**
     * \if ENGLISH_LANG
     * Intensity decibel gate range arr, dB; first element is min, second element is max
     * \else
     * 音频强度检测分贝阈值数组, 单位分贝;第一个元素为最小值,第二个元素为最大值
     * \endif
     */
    public int                    nIntensityDecibelGateRange[] = new int[2];
}
