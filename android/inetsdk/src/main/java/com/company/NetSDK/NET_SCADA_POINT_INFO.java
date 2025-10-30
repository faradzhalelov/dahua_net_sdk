package com.company.NetSDK;

import java.io.Serializable;
import java.util.Arrays;

/**
 * \if ENGLISH_LANG
 * Spot chart info
 * \else
 * 点表信息
 * \endif
 */
public class NET_SCADA_POINT_INFO implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     * device name
     * \else
     * 设备名称
     * \endif
     */
    public byte[]            szDevName = new byte[FinalVar.SDK_COMMON_STRING_64];

    /**
     * \if ENGLISH_LANG
     * valid count of YX type spot in anYX
     * \else
     * 有效遥信个数
     * \endif
     */
    public int               nYX;

    /**
     * \if ENGLISH_LANG
     * value of YX type spots
     * \else
     * 遥信信息
     * \endif
     */
    public int[]             anYX = new int[FinalVar.MAX_SCADA_YX_NUM];

    /**
     * \if ENGLISH_LANG
     * valid count of YC type spot in afYC
     * \else
     * 有效遥测个数
     * \endif
     */
    public int               nYC;

    /**
     * \if ENGLISH_LANG
     * value of YC type spots
     * \else
     * 遥测信息
     * \endif
     */
    public float[]           afYC = new float[FinalVar.MAX_SCADA_YC_NUM];

    @Override
    public String toString() {
        return "NET_SCADA_POINT_INFO{" +
                "szDevName=" + new String(szDevName).trim() +
                ", nYX=" + nYX +
                ", anYX=" + Arrays.toString(anYX) +
                ", nYC=" + nYC +
                ", afYC=" + Arrays.toString(afYC) +
                '}';
    }
}
