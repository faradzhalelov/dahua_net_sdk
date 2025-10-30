package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * @brief Temperature Monitoring rule
 * \else
 * @brief 测温规则
 * \endif
 */
public class CFG_RADIOMETRY_RULE implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     *  Temperature Monitoring enable
     * \else
     *  测温使能
     * \endif
     */
    public boolean					bEnable;

    /**
     * \if ENGLISH_LANG
     *  preset point no.
     * \else
     *  预置点编号
     * \endif
     */
    public int					nPresetId;

    /**
     * \if ENGLISH_LANG
     *  rule no.
     * \else
     *  规则编号
     * \endif
     */
    public int					nRuleId;

    /**
     * \if ENGLISH_LANG
     *  custom name
     * \else
     *  自定义名称
     * \endif
     */
    public byte					szName[] = new byte[128];

    /**
     * \if ENGLISH_LANG
     *  Temperature Monitoring mode type, see NET_RADIOMETRY_METERTYPE
     * \else
     *  测温模式的类型，见 NET_RADIOMETRY_METERTYPE
     * \endif
     */
    public int					nMeterType;

    /**
     * \if ENGLISH_LANG
     *  temperature point coordinate, use relative coordinate system, take average value as 0~8191
     * \else
     *  测温点坐标	使用相对坐标体系，取值均为0~8191
     * \endif
     */
    public CFG_POLYGON					stCoordinates[] = new CFG_POLYGON[64];

    /**
     * \if ENGLISH_LANG
     *  Temperature Monitoring point coordinate actual number
     * \else
     *  测温点坐标实际个数
     * \endif
     */
    public int					nCoordinateCnt;

    /**
     * \if ENGLISH_LANG
     *  temperature sampling period unit :s
     * \else
     *  温度采样周期	单位 : 秒
     * \endif
     */
    public int					nSamplePeriod;

    /**
     * \if ENGLISH_LANG
     *  Temperature Monitoring point alarm setup
     * \else
     *  测温点报警设置
     * \endif
     */
    public CFG_RADIOMETRY_ALARMSETTING					stAlarmSetting[] = new CFG_RADIOMETRY_ALARMSETTING[64];

    /**
     * \if ENGLISH_LANG
     *  actual number of measurement points alarm settings
     * \else
     *  测温点报警设置实际个数
     * \endif
     */
    public int					nAlarmSettingCnt;

    /**
     * \if ENGLISH_LANG
     *  local parameter setup
     * \else
     *  本地参数配置
     * \endif
     */
    public CFG_RADIOMETRY_LOCALPARAM					stLocalParameters = new CFG_RADIOMETRY_LOCALPARAM();

    /**
     * \if ENGLISH_LANG
     *  Regional Temperature Monitoring subtypes
     * \else
     *  区域测温的子类型			
     * \endif
     */
    public int					emAreaSubType;

    public CFG_RADIOMETRY_RULE() {
        for(int i = 0; i < 64; i ++){
            stCoordinates[i] = new CFG_POLYGON();
            stAlarmSetting[i] = new CFG_RADIOMETRY_ALARMSETTING();
        }
    }
}