package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * @brief CLIENT_QueryDevInfo NET_QUERY_PTZBASE_GET_VFOV_VALUE Type interface output parameters
 * \else
 * @brief CLIENT_QueryDevInfo NET_QUERY_PTZBASE_GET_VFOV_VALUE 类型接口输出参数
 * \endif
 */
public class NET_OUT_PTZBASE_GET_VFOV_VALUE implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     *  Corresponding magnification vertical field angle,the unit is 0.01 degrees, and it is expressed by 100 times
     * \else
     *  对应倍率垂直视场角,单位0.01度，扩大100倍表示
     * \endif
     */
    public int					nValue;

    /**
     * \if ENGLISH_LANG
     *  Minimum vertical field angle of view of lens,the unit is the same as nValue
     * \else
     *  镜头最小垂直视场角,单位同nValue
     * \endif
     */
    public int					nMinValue;

    /**
     * \if ENGLISH_LANG
     *  Maximum vertical field angle of view of lens,the unit is the same as nValue	
     * \else
     *  镜头最大垂直视场角,单位同nValue	
     * \endif
     */
    public int					nMaxValue;

}
