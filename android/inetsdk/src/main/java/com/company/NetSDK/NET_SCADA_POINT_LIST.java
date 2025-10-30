package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Spot chart path info
 * \else
 * 点位表路径信息
 * \endif
 */
public class NET_SCADA_POINT_LIST implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     * Valid config subscript number
     * \else
     * 有效的配置下标个数
     * \endif
     */
    public int                  nIndexValidNum;

    /**
     * \if ENGLISH_LANG
     * SCADADev config config subscript value , start from 0
     * \else
     * SCADADev配置下标值, 从0开始
     * \endif
     */
    public int[]                nIndex = new int[FinalVar.MAX_SCADA_POINT_LIST_INDEX];

    /**
     * \if ENGLISH_LANG
     * chart complete path
     * \else
     * 点表的完整路径
     * \endif
     */
    public byte[]              szPath = new byte[FinalVar.SDK_COMMON_STRING_256];
}
