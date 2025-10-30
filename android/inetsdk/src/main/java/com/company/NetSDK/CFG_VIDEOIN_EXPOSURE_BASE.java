package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Device exposure the basic configuration information
 * \else
 * 设备曝光配置基本信息
 * \endif
 */
public class CFG_VIDEOIN_EXPOSURE_BASE implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     * Slow shutter enabled
     * \else
     * 慢快门使能
     * \endif
     */
    public boolean        bSlowShutter;

    /**
     * \if ENGLISH_LANG
     * Exposure mode adjustment
     * \else
     * 曝光模式调节, 0- 默认自动,1- 低噪声,2- 防拖影,3- 50Hz防闪烁, 4- 60Hz防闪烁, 5- 光圈优先, 6- 手动, 7- 增益优先, 8- 快门优先
     * \endif
     */
    public byte           byExposureMode;

    /**
     * \if ENGLISH_LANG
     * Anti-flicker mode 0-Outdoor 1-50Hz A.FLK 2-60Hz flicker prevention
     * \else
     * 防闪烁模式 0-Outdoor 1-50Hz防闪烁 2-60Hz防闪烁
     * \endif
     */
    public byte          byAntiFlicker;

    /**
     * \if ENGLISH_LANG
     * Exposure compensation, [0-14]
     * \else
     * 曝光补偿, [0~14]
     * \endif
     */
    public byte          byCompensation;

    /**
     * \if ENGLISH_LANG
     * Automatic gain limit, [0, 2)
     * \else
     * 自动增益上限, [0, 2]
     * \endif
     */
    public byte          byAutoGainMax;

    /**
     * \if ENGLISH_LANG
     * Gain gear, [0, 15]
     * \else
     * 增益档位, [0, 15]
     * \endif
     */
    public byte         byGain;

    /**
     * \if ENGLISH_LANG
     * Slow exposure, [0, 15]
     * \else
     * 慢曝光, [0, 15]
     * \endif
     */
    public byte         bySlowAutoExposure;

    /**
     * \if ENGLISH_LANG
     * Exposure level of speed: 0 - Auto Exposure 1 - Exposure Level 1,2 - Exposure Level 2 ... n-1 the maximum exposure level, n the time limit with automatic exposure, n +1 time manual exposure (n means support the exposure level)
     * \else
     * 曝光速度等级：0-自动曝光，1-曝光等级1，2-曝光等级2…n-1最大曝光等级数 n带时间上下限的自动曝光 n+1自定义时间手动曝光 (n为支持的曝光等级)
     * \endif
     */
    public int         byExposureSpeed;

    /**
     * \if ENGLISH_LANG
     * Slow exposure level
     * \else
     * 慢曝光等级
     * \endif
     */
    public byte        bySlowSpeed;

    /**
     * \if ENGLISH_LANG
     * Aperture Settings, [0 ~ 100]
     * \else
     * 光圈设置, [0~100]
     * \endif
     */
    public byte         byIris;

    /**
     * \if ENGLISH_LANG
     * BLC: The range depends on the device capability set: 0 - off 1 - Enable 2 - designated areas BLC
     * \else
     * 背光补偿: 取值范围取决于设备能力集: 0-关闭 1-启用 2-指定区域背光补偿
     * \endif
     */
    public byte         byBacklight;

    /**
     * \if ENGLISH_LANG
     * Wide dynamic value 0 - closed, range 1-100 - for real value
     * \else
     * 宽动态值 0-关闭，1~100-为真实范围值
     * \endif
     */
    public byte         byWideDynamicRange;

    /**
     * \if ENGLISH_LANG
     * Wide dynamic mode 0: off; 1: manual adjustment; 2: automatic adjustment
     * \else
     * 宽动态模式, 0:关闭; 1:手动调节; 2:自动调节
     * \endif
     */
    public byte         byWideDynamicRangeMode;

    /**
     * \if ENGLISH_LANG
     * Light inhibition 0: Off; 1: weak; 2: Medium; 3: Strong
     * \else
     * 强光抑制, 0:关闭; 1:弱; 2:中; 3:强
     * \endif
     */
    public byte         byGlareInhibition;

    /**
     * \if ENGLISH_LANG
     * Dual shutter support, 0: not supported; 1: Support Dual Shutter full frame rate; 2: supports dual shutter half frame rate; 3: supports dual shutter half full frame rate and frame rate
     * \else
     * 双快门支持, 0:不支持; 1:支持双快门全帧率; 2:支持双快门半帧率; 3:支持双快门全帧率和半帧率
     * \endif
     */
    public byte         byDoubleExposure;

    /**
     * \if ENGLISH_LANG
     * Automatic exposure recovery, 0 - said they did not recover, others said recovery time, in seconds
     * \else
     * 自动曝光恢复, 0-表示不恢复, 其他表示恢复的时间, 单位为秒
     * \endif
     */
    public int          nRecoveryTime;

    /**
     * \if ENGLISH_LANG
     * Automatic exposure time limit or manual time, [0.1 ~ 80 ms]
     * \else
     * 自动曝光时间下限或者手动曝光自定义时间, [0.1~80ms]
     * \endif
     */
    public float        fValue1;

    /**
     * \if ENGLISH_LANG
     * Automatic exposure time limit, to be not less than the lower limit, [0.1 ~ 80ms]
     * \else
     * 自动曝光时间上限, 需不小于下限, [0.1~80ms]
     * \endif
     */
    public float        fValue2;

    /**
     * \if ENGLISH_LANG
     * BLC area
     * \else
     * 背光补偿区域
     * \endif
     */
    public CFG_RECT     stuBacklightRegion = new CFG_RECT();

    /**
     * \if ENGLISH_LANG
     * the min value of iris[0~100]
     * \else
     * 光圈区间下限[0~100]
     * \endif
     */
    public byte		 byIrisMin;

    /**
     * \if ENGLISH_LANG
     * the max value of iris[0~100]
     * \else
     * 光圈区间上限,取值不小于byIrisMin[0~100]
     * \endif
     */
    public byte		 byIrisMax;

    /**
     * \if ENGLISH_LANG
     * the min value of gain
     * \else
     * 手动(区间)登陆下限
     * \endif
     */
    public byte		 byGainMin;

    /**
     * \if ENGLISH_LANG
     * the max value of gain
     * \else
     * 手动(区间)登陆下限
     * \endif
     */
    public byte		byGainMax;
}
