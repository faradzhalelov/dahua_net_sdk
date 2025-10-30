package com.company.NetSDK;

import java.io.Serializable;
import java.util.Arrays;

/**
 * \if ENGLISH_LANG
 * PIR Dectct window info
 * \else
 * PIR检测区域信息
 * \endif
 */
public class NET_DETECT_WINDOW_IFNO implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     * Region ID
     * \else
     * 动态窗口ID
     * \endif
     */
    public int				    nRegionID;

    /**
     * \if ENGLISH_LANG
     * Region Name
     * \else
     * 动态窗口名称
     * \endif
     */
    public byte                szRegionName[] = new byte[FinalVar.SDK_COMMON_STRING_128];

    /**
     * \if ENGLISH_LANG
     * Threshold, value:[0, 100]
     * \else
     * 面积阀值, 取值[0, 100]
     * \endif
     */
    public int                 nThreshold;

    /**
     * \if ENGLISH_LANG
     * Sensitive, value:[0, 100]
     * \else
     * 灵敏度, 取值[0, 100]
     * \endif
     */
    public int					nSensitive;

    /**
     * \if ENGLISH_LANG
     * Region Row count
     * \else
     * 动态检测区域的行数
     * \endif
     */
    public int					nRegionRow;

    /**
     * \if ENGLISH_LANG
     * Region Col count
     * \else
     * 动态检测区域的列数
     * \endif
     */
    public int					nRegionCol;

    /**
     * \if ENGLISH_LANG
     * Detect Region
     * \else
     * 检测区域, 最多32*32块区域
     * \endif
     */
    public byte[][]			byRegion = new byte[FinalVar.SDK_MOTION_ROW][FinalVar.SDK_MOTION_COL];

    @Override
    public String toString() {
        return "NET_DETECT_WINDOW_IFNO{" +
                "nRegionID=" + nRegionID +
                ", szRegionName=" + Arrays.toString(szRegionName) +
                ", nThreshold=" + nThreshold +
                ", nSensitive=" + nSensitive +
                ", nRegionRow=" + nRegionRow +
                ", nRegionCol=" + nRegionCol +
                ", byRegion=" + Arrays.toString(byRegion) +
                '}';
    }
}
