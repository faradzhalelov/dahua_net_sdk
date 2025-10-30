package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Calibrating area capacity info
 * \else
 * 标定区域能力信息
 * \endif
 */
public class CFG_CAP_CELIBRATE_AREA implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     * Calibrating area type, refer to {@link EM_CALIBRATEAREA_TYPE}
     * \else
     * 标定区域类型, 参考 {@link EM_CALIBRATEAREA_TYPE}
     * \endif
     */
    public int                     emType;

    /**
     * \if ENGLISH_LANG
     * Supported horizontal staff max number
     * \else
     * 支持的水平标尺最大个数
     * \endif
     */
    public byte                   byMaxHorizontalStaffNum;

    /**
     * \if ENGLISH_LANG
     * Supported horizontal staff min number
     * \else
     * 支持的水平标尺最小个数
     * \endif
     */
    public byte                   byMinHorizontalStaffNum;

    /**
     * \if ENGLISH_LANG
     * Supported vertical staff max number
     * \else
     * 支持的垂直标尺最大个数
     * \endif
     */
    public byte                   byMaxVerticalStaffNum;

    /**
     * \if ENGLISH_LANG
     * Supported vertical staff min number
     * \else
     * 支持的垂直标尺最小个数
     * \endif
     */
    public byte                   byMinVerticalStaffNum;

    @Override
    public String toString() {
        return "CFG_CAP_CELIBRATE_AREA{" +
                "emType=" + emType +
                ", byMaxHorizontalStaffNum=" + byMaxHorizontalStaffNum +
                ", byMinHorizontalStaffNum=" + byMinHorizontalStaffNum +
                ", byMaxVerticalStaffNum=" + byMaxVerticalStaffNum +
                ", byMinVerticalStaffNum=" + byMinVerticalStaffNum +
                '}';
    }
}
