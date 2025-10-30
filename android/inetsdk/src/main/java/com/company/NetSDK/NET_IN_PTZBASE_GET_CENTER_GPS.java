package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * @brief CLIENT_QueryDevInfo NET_QUERY_PTZBASE_GET_CENTER_GPS Type interface input parameters
 * \else
 * @brief CLIENT_QueryDevInfo NET_QUERY_PTZBASE_GET_CENTER_GPS 类型接口输入参数
 * \endif
 */
public class NET_IN_PTZBASE_GET_CENTER_GPS implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     *  The channel number starts from 0
     * \else
     *  通道号从0开始
     * \endif
     */
    public int					nChannel;

    /**
     * \if ENGLISH_LANG
     *  a flag, if TRUE, use the dPosition info to calculate the gps info, if FALSE, use the real postion to calculate the gps info
     * \else
     *  计算GPS信息标志位，为TRUE时使用dPosition中的位置信息来进行计算，为FALSE时使用当前云台PT位置信息计算GPS 
     * \endif
     */
    public boolean					bPosEnable;

    /**
     * \if ENGLISH_LANG
     *  position info,first element is the horizontal angle, second is vertical Angle
     * \else
     *  云台方向信息，第一个元素为水平角度，第二个元素为垂直角度
     * \endif
     */
    public double					dPosition[] = new double[2];

}
