package com.company.NetSDK;

import java.io.Serializable;
import java.util.Arrays;

/**
 * \if ENGLISH_LANG
 * Region info of motion detection
 * \else
 * 动检区域信息
 * \endif
 */
public class NET_MOTIONDETECT_REGION_INFO implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     * region ID
     * \else
     * 区域ID
     * \endif
     */
    public int                             nRegionID;

    /**
     * \if ENGLISH_LANG
     * region name
     * \else
     * 区域名称
     * \endif
     */
    public byte                            szRegionName[] = new byte[64];

    @Override
    public String toString() {
        return "NET_MOTIONDETECT_REGION_INFO{" +
                "nRegionID=" + nRegionID +
                ", szRegionName=" + new String(szRegionName).trim() +
                '}';
    }
}
