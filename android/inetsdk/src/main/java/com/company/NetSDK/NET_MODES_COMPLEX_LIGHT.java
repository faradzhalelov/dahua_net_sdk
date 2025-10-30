package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Supported mode's information
 * \else
 * 灯光支持的模式信息
 * \endif
 */
public class NET_MODES_COMPLEX_LIGHT implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;


    /**
     * \if ENGLISH_LANG
     * Mode of Infrared Light,refer to {@link EM_LC_MODE}
     * \else
     * 红外灯支持的模式,具体参考{@link EM_LC_MODE}
     * \endif
     */
    public int[]		anInfraredLight = new int[FinalVar.SUPPORTED_LC_COMPLEX_MODES];

    /**
     * \if ENGLISH_LANG
     * Mode's number of Infrared Light
     * \else
     * 红外灯支持的模式数量
     * \endif
     */
    public int				nInfraredLightLen;

    /**
     * \if ENGLISH_LANG
     * Mode of wight light,refer to {@link EM_LC_MODE}
     * \else
     * 白光灯支持的模式,具体参考{@link EM_LC_MODE}
     * \endif
     */
    public int[]		anWhiteLight = new int[FinalVar.SUPPORTED_LC_COMPLEX_MODES];

    /**
     * \if ENGLISH_LANG
     * Mode's number of wight light
     * \else
     * 白光灯支持的模式数量
     * \endif
     */
    public int				nWhiteLightLen;

    /**
     * \if ENGLISH_LANG
     * Mode of laser Light,refer to {@link EM_LC_MODE}
     * \else
     * 激光灯支持的模式,具体参考{@link EM_LC_MODE}
     * \endif
     */
    public int[]		anLaserLight = new int[FinalVar.SUPPORTED_LC_COMPLEX_MODES];

    /**
     * \if ENGLISH_LANG
     * Mode's number of laser Light
     * \else
     * 激光灯支持的模式数量
     * \endif
     */
    public int				nLaserLightLen;

    /**
     * \if ENGLISH_LANG
     * Mode supported by intelligent mixed light,refer to {@link EM_LC_MODE}
     * \else
     * 智能混光灯支持的模式,具体参考{@link EM_LC_MODE}
     * \endif
     */
    public int[]	emAIMixLight = new int[FinalVar.SUPPORTED_AIMIX_LIGHT];

    /**
     * \if ENGLISH_LANG
     * Number of modes supported by the intelligent mixing lamp
     * \else
     * 智能混光灯支持的模式数量
     * \endif
     */
    public int				nAIMixLight;

}
