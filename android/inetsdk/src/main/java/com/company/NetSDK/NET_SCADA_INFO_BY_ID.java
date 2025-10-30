package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Monitor control and data collection device spot chart path capacity info, {@link INetSDK#QueryDevState} corresponding to command {@link FinalVar#SDK_DEVSTATE_SCADA_INFO_BY_ID}
 * \else
 * 通过设备、获取监测点位信息, {@link INetSDK#QueryDevState} 对应命令 {@link FinalVar#SDK_DEVSTATE_SCADA_INFO_BY_ID}
 * \endif
 */
public class NET_SCADA_INFO_BY_ID implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     * input param, sensor ID
     * \else
     * 输入参数, 探测器ID
     * \endif
     */
    public byte[]                       szSensorID = new byte[FinalVar.SDK_COMMON_STRING_64];

    /**
     * \if ENGLISH_LANG
     * input param, valid count of spot id in szIDs
     * \else
     * 输入参数, 有效点位ID个数
     * \endif
     */
    public int                          nIDs;

    /**
     * \if ENGLISH_LANG
     * input param, spot IDs
     * \else
     * 输入参数, 点位ID
     * \endif
     */
    public byte[][]                     szIDs = new byte[FinalVar.MAX_SCADA_ID_OF_SENSOR_NUM][FinalVar.SDK_COMMON_STRING_64];

    /**
     * \if ENGLISH_LANG
     * input param, return data is handle or not.
     * \else
     * 输入参数，返回数据是否经过处理
     * \endif
     */
    public boolean					  bIsHandle;
    /**
     * \if ENGLISH_LANG
     * input param, count of NET_SCADA_POINT_BY_ID_INFO in pstuInfo
     * \else
     * 输入参数, pstuInfo对应数组个数
     * \endif
     */
    public int                          nMaxCount;

    /**
     * \if ENGLISH_LANG
     * output param, returned count of NET_SCADA_POINT_BY_ID_INFO from device, may be larger than nMaxCount
     * \else
     * 输出参数, pstInfo实际返回有效个数, 可能大于用户分配个数nMaxCount
     * \endif
     */
    public int                          nRetCount;

    /**
     * \if ENGLISH_LANG
     * input/output param, user allocates the memory, apply to sizeof(NET_SCADA_POINT_BY_ID_INFO)*nMaxCount
     * \else
     * 输入输出参数, 用户分配缓存,大小为sizeof(NET_SCADA_POINT_BY_ID_INFO)*nMaxCount
     * \endif
     */
    public NET_SCADA_POINT_BY_ID_INFO[] pstuInfo;

    public NET_SCADA_INFO_BY_ID() {
        this.nMaxCount = 1;
        pstuInfo = new NET_SCADA_POINT_BY_ID_INFO[1];
        pstuInfo[0] = new NET_SCADA_POINT_BY_ID_INFO();
    }

    /**
     * @param nMaxCount 点位信息最大个数
     */
    public NET_SCADA_INFO_BY_ID(int nMaxCount) {
        if(nMaxCount > 0) {
            this.nMaxCount = nMaxCount;
            pstuInfo = new NET_SCADA_POINT_BY_ID_INFO[nMaxCount];

            for(int i = 0; i < nMaxCount; i++) {
                pstuInfo[i] = new NET_SCADA_POINT_BY_ID_INFO();
            }
        } else{
            this.nMaxCount = 1;
            pstuInfo = new NET_SCADA_POINT_BY_ID_INFO[1];
            pstuInfo[0] = new NET_SCADA_POINT_BY_ID_INFO();
        }
    }
}
