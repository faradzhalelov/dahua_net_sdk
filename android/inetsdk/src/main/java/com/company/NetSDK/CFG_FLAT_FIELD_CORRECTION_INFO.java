package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * @brief Thermal imaging flat field correction config
 * \else
 * @brief 平场聚焦校准
 * \endif
 */
public class CFG_FLAT_FIELD_CORRECTION_INFO implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     *  Flat field correction mode,see {@link EM_FLAT_FIELD_CORRECTION_MODE} for details
     * \else
     *  平场聚焦校准模式,详见{@link EM_FLAT_FIELD_CORRECTION_MODE}
     * \endif
     */
    public int					emMode;

    /**
     * \if ENGLISH_LANG
     *  Automatic switching cycle in seconds,the numerical range refers to stFFCPeriod in NET_OUT_THERMO_GETCAPS
     * \else
     *  自动切换周期，单位为秒，数值范围参考NET_OUT_THERMO_GETCAPS中的stFFCPeriod
     * \endif
     */
    public int					nPeriod;

}