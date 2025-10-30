package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * output param, the corresponding interface {@link INetSDK#GetDevCaps},the corresponding command {@link FinalVar#NET_COAXIAL_CONTROL_IO_STATUS}
 * \else
 * 出参, 对应接口 {@link INetSDK#GetDevCaps},对应命令 {@link FinalVar#NET_COAXIAL_CONTROL_IO_STATUS}
 * \endif
 */
public class NET_OUT_GET_COAXIAL_CONTROL_IO_STATUS implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     * White Light Status, refer to {@link EM_COAXIAL_CONTROL_IO_STATUS}
     * \else
     * 白光灯操作类型, 参考 {@link EM_COAXIAL_CONTROL_IO_STATUS}
     * \endif
     */
    public int	             emWhiteLight;

    /**
     * \if ENGLISH_LANG
     * Speaker Status, refer to {@link EM_COAXIAL_CONTROL_IO_STATUS}
     * \else
     * 喇叭操作类型, 参考 {@link EM_COAXIAL_CONTROL_IO_STATUS}
     * \endif
     */
    public int	              emSpeaker;
}
