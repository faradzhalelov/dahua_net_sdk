package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Telescope configuration，Corresponding enumeration {@link NET_EM_CFG_OPERATE_TYPE#NET_EM_CFG_TELESCOPE_OPTIONS}
 * \else
 *  望远镜配置，对应的枚举 {@link NET_EM_CFG_OPERATE_TYPE#NET_EM_CFG_TELESCOPE_OPTIONS}
 * \endif
 */
public class NET_CFG_TELESCOPE_OPTIONS_INFO implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     * Laser indication control (true: on; false: off)
     * \else
     * 激光指示控制 TRUE:开; FALSE:关)
     * \endif
     */
    public boolean						bLaserCtrl;

    /**
     * \if ENGLISH_LANG
     * Range switch control (true: on; false: off)
     * \else
     * 测距开关控制 TRUE:开; FALSE:关)
     * \endif
     */
    public boolean						bRangeCtrl;

    /**
     * \if ENGLISH_LANG
     * Ranging mode,refer to {@link EM_RANGE_MODE}
     * \else
     * 测距模式,参考{@link EM_RANGE_MODE}
     * \endif
     */
    public int				emRangeMode;

    /**
     * \if ENGLISH_LANG
     * OSD settings. Show / hide (true: show; false: hide)
     * \else
     * OSD设置.显示/隐藏(TRUE:显示;FALSE:隐藏)
     * \endif
     */
    public boolean						bOsdSet;

    /**
     * \if ENGLISH_LANG
     * Object detection,refer to{@link EM_TARGET_DETECT_SENSITIVITY}
     * \else
     * 目标检测,参考{@link EM_TARGET_DETECT_SENSITIVITY}
     * \endif
     */
    public int emTargetChk;

    /**
     * \if ENGLISH_LANG
     * Fire detection,refer to{@link EM_TARGET_DETECT_SENSITIVITY}
     * \else
     * 火点检测,参考{@link EM_TARGET_DETECT_SENSITIVITY}
     * \endif
     */
    public int emFireChk;

    /**
     * \if ENGLISH_LANG
     * Image parameter setting,refer to {@link EM_SCENE_MODE}
     * \else
     * 图像参数设置,参考{@link EM_SCENE_MODE}
     * \endif
     */
    public int				 emSceneMode;

    /**
     * \if ENGLISH_LANG
     * Automatic shutdown time unit: minutes (0: turn off automatic shutdown function)
     * \else
     * 自动关机时间 单位:分钟(0:关闭自动关机功能)
     * \endif
     */
    public int							 nAutoShutdown;

    /**
     * \if ENGLISH_LANG
     * Automatic sleep time unit: minutes (0: turn off automatic sleep function)
     * \else
     * 自动休眠时间 单位:分钟(0:关闭自动休眠功能)
     * \endif
     */
    public int							 nAutoSleep;

    /**
     * \if ENGLISH_LANG
     * Screen switch,refer to {@link EM_SCREEN_SWITCH_TYPE}
     * \else
     * 屏幕切换开关,参考{@link EM_SCREEN_SWITCH_TYPE}
     * \endif
     */
    public int		 emScreenSwitch;

    /**
     * \if ENGLISH_LANG
     * WiFi switch: (true: on; false: off)
     * \else
     * WIFI开关:(TRUE:开;FALSE:关)
     * \endif
     */
    public boolean						 bWIFICtrl;

    /**
     * \if ENGLISH_LANG
     * Cold and hot spot display switch,refer to {@link EM_SWITCH_CONTROL_TYPE}
     * \else
     * 冷热点显示开关，参考{@link EM_SWITCH_CONTROL_TYPE}
     * \endif
     */
    public int		 emHotColdPoint;

    /**
     * \if ENGLISH_LANG
     * Distance unit,refer to{@link EM_RANGE_UNIT}
     * \else
     * 距离单位,参考{@link EM_RANGE_UNIT}
     * \endif
     */
    public int				 emRangeUnit;

    /**
     * \if ENGLISH_LANG
     * Buzzer switch,refer to {@link EM_SWITCH_CONTROL_TYPE}
     * \else
     * 蜂鸣器开关，参考{@link EM_SWITCH_CONTROL_TYPE}
     * \endif
     */
    public int		 emBuzzerCtrl;

    /**
     * \if ENGLISH_LANG
     * The height of the object to be measured (0.1~999.9 m/ft) is multiplied by 10 and issued (1~9999).
     * \else
     * 待测距物体自定义高度(0.1~999.9米/英尺),乘10下发(1~9999).
     * \endif
     */
    public int      nCustomHeight;

    /**
     * \if ENGLISH_LANG
     *  LOGO overlay switch: (true: ON; false:OFF)
     * \else
     *  LOGO叠加开关: (true: ON; false:OFF)
     * \endif
     */
    public boolean					bLogoShow;

    /**
     * \if ENGLISH_LANG
     *  Automatic recording switch (automatic recording when sound is detected or impact is detected):(true: ON; false:OFF)
     * \else
     *  自动录像开关(检测到声音或者检测到冲击后自动录像):(true: ON; false:OFF)
     * \endif
     */
    public boolean					bAutoRecord;

    /**
     * \if ENGLISH_LANG，{@link EM_SCENE_STYLE}
     *  Scene mode
     * \else
     *  场景模式，{@link EM_SCENE_STYLE}
     * \endif
     */
    public int					emSceneStyle;

    /**
     * \if ENGLISH_LANG
     *  The cursor type，{@link EM_CURSOR_TYPE}
     * \else
     *  光标类型，{@link EM_CURSOR_TYPE}
     * \endif
     */
    public int					emCursorStyle;

    /**
     * \if ENGLISH_LANG
     *  Cursor calibration scheme，{@link EM_CURSOR_SCHEME}
     * \else
     *  光标标定方案，{@link EM_CURSOR_SCHEME}
     * \endif
     */
    public int					emCursorScheme;

    /**
     * \if ENGLISH_LANG
     *  Cursor distance scheme，{@link EM_DISTANCE_SCHEME}
     * \else
     *  光标距离方案，{@link EM_DISTANCE_SCHEME}
     * \endif
     */
    public int					emDistanceScheme;

    /**
     * \if ENGLISH_LANG
     *  Cursor calibration distance: 100-99999cm Unit: cm
     * \else
     *  光标标定距离量: 100-99999cm 单位:厘米
     * \endif
     */
    public int					nCalibrateDistance;

    /**
     * \if ENGLISH_LANG
     *  Cursor calibration offset, two-dimensional space point type, the first element represents the point x coordinate; The second element represents the y coordinate of the point;
     * \else
     *  光标标定偏移量, 二维空间点类型, 第一个元素表示点的x坐标; 第二个元素表示点的y坐标;
     * \endif
     */
    public int					nCalibrateOffset[] = new int[2];

    /**
     * \if ENGLISH_LANG
     *  Connection password for telescope as a hotspot
     * \else
     *  望远镜作为热点的连接密码
     * \endif
     */
    public byte					szApPassword[] = new byte[128];

    /**
     * \if ENGLISH_LANG
     *  Cursor display switch
     * \else
     *  光标显示开关
     * \endif
     */
    public boolean					bCursorCtrl;

    /**
     * \if ENGLISH_LANG
     *  Picture in Picture Enable Switch
     * \else
     *  画中画使能开关
     * \endif
     */
    public boolean					bPicInPicCtrl;

    /**
     * \if ENGLISH_LANG
     *  Screen brightness (1-100 brightness)
     * \else
     *  屏幕亮度（1-100亮度）
     * \endif
     */
    public byte					byScreenBright;
	
    /**
     * \if ENGLISH_LANG
     *  infrared overexposure prevention: (true:ON; false:OFF)
     * \else
     *  防红外过爆：（true: ON; false: OFF）
     * \endif
     */
    public boolean				bIrOverexposure;
}
