package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * @brief Flat field correction mode
 * \else
 * @brief 平场聚焦校准模式
 * \endif
 */
public class EM_FLAT_FIELD_CORRECTION_MODE implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     *   unknown,Used to represent an unknown pattern acquired by GetNewDevConfig,which SetNewDevConfig cannot use
     * \else
     *   未知模式,用于表示GetNewDevConfig获取到的未知模式,SetNewDevConfig不可使用该模式
     * \endif
     */
    public static final int					EM_FLAT_FIELD_CORRECTION_UNKNOWN = 0;

    /**
     * \if ENGLISH_LANG
     *  "Auto": Automatic flat field correction
     * \else
     *  "Auto":自动平场聚焦校准
     * \endif
     */
    public static final int					EM_FLAT_FIELD_CORRECTION_AUTO = 1;

    /**
     * \if ENGLISH_LANG
     *  "Manual": Manual flat field correction
     * \else
     *  "Manual":手动平场聚焦校准
     * \endif
     */
    public static final int					EM_FLAT_FIELD_CORRECTION_MANUAL = 2;

}