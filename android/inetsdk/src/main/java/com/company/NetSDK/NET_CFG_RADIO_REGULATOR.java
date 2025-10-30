package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Standard blackbody configuration of human body ARGtemp_meas
 * \else
 * 人体测温标准黑体配置
 * \endif
 */
public class NET_CFG_RADIO_REGULATOR implements Serializable{

    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     * Standard bold configuration enable
     * \else
     * 标准黑体配置使能
     * \endif
     */
    public boolean 						bEnable;

    /**
     * \if ENGLISH_LANG
     * Preset point number, 0 for equipment without preset point
     * \else
     * 预置点编号, 对于无预置点设备为0
     * \endif
     */
    public int 						nPresetId;

    /**
     * \if ENGLISH_LANG
     * Installation height of thermal imaging camera, CM
     * \else
     * 热成像相机安装高度, 单位cm
     * \endif
     */
    public int 						nCamerHeight;

    /**
     * \if ENGLISH_LANG
     * Camera installation angle, accuracy 0.1, magnification 10 times
     * \else
     * 相机安装角度, 精度0.1, 放大10倍
     * \endif
     */
    public int 						nCamerAngle;

    /**
     * \if ENGLISH_LANG
     * Calibration source information
     * \else
     * 校准源信息
     * \endif
     */
    public NET_REGULATOR_INFO 			stRegulatorInfo = new NET_REGULATOR_INFO();
}
