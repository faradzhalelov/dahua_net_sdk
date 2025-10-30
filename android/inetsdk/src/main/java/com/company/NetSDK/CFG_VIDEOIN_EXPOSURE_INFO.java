package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Device exposure configuration, the corresponding interface {@link INetSDK#GetNewDevConfig} and {@link INetSDK#SetNewDevConfig},the corresponding command {@link FinalVar#CFG_CMD_VIDEOIN_EXPOSURE}
 * \else
 * 设备曝光配置, 对应接口 {@link INetSDK#GetNewDevConfig} 和 {@link INetSDK#SetNewDevConfig},对应命令 {@link FinalVar#CFG_CMD_VIDEOIN_EXPOSURE}
 * \endif
 */
public class CFG_VIDEOIN_EXPOSURE_INFO implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     * the maximum number of Configure
     * \else
     * 配置的最大个数
     * \endif
     */
    public int                       dwMaxExposureNum;

    /**
     * \if ENGLISH_LANG
     * The maximum number of actual use(query returns the actual number parsing, according to the number of this value when the packaging)
     * \else
     * 实际使用的最大个数(查询时返回实际解析个数, 封装时按照此值个数封装)
     * \endif
     */
    public int                       dwRetExposureNum;

    /**
     * \if ENGLISH_LANG
     * Exposure configuration information, user malloc memory, size is sizeof({@link CFG_VIDEOIN_EXPOSURE_BASE}) * dwMaxExposureNum
     * \else
     * 曝光配置信息,由用户申请内存,大小为sizeof({@link CFG_VIDEOIN_EXPOSURE_BASE}) * dwMaxExposureNum
     * \endif
     */
    public CFG_VIDEOIN_EXPOSURE_BASE[]   pstuVideoInExposure;

    public CFG_VIDEOIN_EXPOSURE_INFO(int dwMaxExposureNum) {
        this.dwMaxExposureNum = dwMaxExposureNum;
        pstuVideoInExposure = new CFG_VIDEOIN_EXPOSURE_BASE[dwMaxExposureNum];
        for(int i = 0; i < dwMaxExposureNum; i++) {
            pstuVideoInExposure[i] = new CFG_VIDEOIN_EXPOSURE_BASE();
        }
    }
}
