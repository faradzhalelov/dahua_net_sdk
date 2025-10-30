package com.company.NetSDK;

import com.company.NetSDK.EM_MATRIX_SUB_CARD_TYPE;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * @brief Anti-overexposure for fill light
 * \else
 * @brief 防补光过曝
 * \endif
 */
public class NET_ANTIFILLLIGHTOVEREXPOSURE implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     * Supported target modes for anti fill light overexposure {@link EM_LC_TARGETMODE}
     * \else
     * 支持防补光过曝的目标类型 {@link EM_LC_TARGETMODE}
     * \endif
     */
    public int					emTargetMode[] = new int[16];

    /**
     * \if ENGLISH_LANG
     * Number of target types for preventing overexposure of fill light
     * \else
     * 防补光过曝的目标类型数量
     * \endif
     */
    public int					nTargetModeNumber;

    /**
     * \if ENGLISH_LANG
     * Whether the anti-fill light configuration is not mutually exclusive with strong light suppression and backlight compensation.
     * \else
     * 防补光配置是否不与强光抑制、背光补偿互斥
     * \endif
     */
    public boolean					bNotConflitBacklight;

    /**
     * \if ENGLISH_LANG
     * Supports intelligent fill light with priority for license plate recognition, and linking to select the target vehicle
     * \else
     * 是否支持智能补光车牌优先联动选中目标车
     * \endif
     */
    public boolean					bSupportedPlateLinktoVehicle;

    /**
     * \if ENGLISH_LANG
     * Supports intelligent fill light with priority for facial recognition, and linking to select the target person
     * \else
     * 是否支持智能补光人脸优先联动选中目标人
     * \endif
     */
    public boolean					bSupportedFaceLinktoHuman;

}