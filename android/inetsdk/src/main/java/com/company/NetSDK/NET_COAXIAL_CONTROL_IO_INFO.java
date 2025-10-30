package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * coaxial IO info
 * \else
 * 同轴IO信息结构体
 * \endif
 */
public class NET_COAXIAL_CONTROL_IO_INFO implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     * coaxial IO type，refer to {@link EM_COAXIAL_CONTROL_IO_TYPE}
     * \else
     * 同轴IO控制类型, 取值参考 {@link EM_COAXIAL_CONTROL_IO_TYPE}
     * \endif
     */
    public int          			emType;

    /**
     * \if ENGLISH_LANG
     * coaxial IO switch, refer to {@link EM_COAXIAL_CONTROL_IO_SWITCH}
     * \else
     * 同轴IO控制开关, 取值参考 {@link EM_COAXIAL_CONTROL_IO_SWITCH}
     * \endif
     */
    public int              		emSwicth;

    /**
     * \if ENGLISH_LANG
     * coaxial IO tragger mode, refer to {@link EM_COAXIAL_CONTROL_IO_TRIGGER_MODE}
     * \else
     * 同轴IO触发方式, 取值参考 {@link EM_COAXIAL_CONTROL_IO_TRIGGER_MODE}
     * \endif
     */
    public int                  	emMode;
}
