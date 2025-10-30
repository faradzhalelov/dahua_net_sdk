package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * driver's illegal info
 * \else
 * 驾驶位违规信息
 * \endif
 */
public class EVENT_COMM_SEAT implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     * whether seat info detected
     * \else
     * 是否检测到座驾信息
     * \endif
     */
    public boolean                    bEnable;

    /**
     * \if ENGLISH_LANG
     * seat type,refer to {@link EM_COMMON_SEAT_TYPE}
     * \else
     * 座驾类型, 0:未识别; 1:主驾驶; 2:副驾驶, 取值参考 {@link EM_COMMON_SEAT_TYPE}
     * \endif
     */
     public int                     emSeatType;

    /**
     * \if ENGLISH_LANG
     * illegal state
     * \else
     * 违规状态
     * \endif
     */
    public EVENT_COMM_STATUS       stStatus = new EVENT_COMM_STATUS();

    /**
     * \if ENGLISH_LANG
     * safe belt state, refer to {@link NET_SAFEBELT_STATE}
     * \else
     * 安全带状态, 取值参考 {@link NET_SAFEBELT_STATE}
     * \endif
     */
    public int                   emSafeBeltStatus ;

    /**
     * \if ENGLISH_LANG
     * sun shade state, refer to {@link NET_SUNSHADE_STATE}
     * \else
     * 遮阳板状态, 取值参考 {@link NET_SUNSHADE_STATE}
     * \endif
     */
    public int                  emSunShadeStatus;
}
