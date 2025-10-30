package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * @brief Burn warning configuration information
 * \else
 * @brief 灼伤预警配置信息
 * \endif
 */
public class NET_CFG_BURNING_CHECK_INFO implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     *  Number of configured channels
     * \else
     *  配置通道数
     * \endif
     */
    public int					nChannelNum;

    /**
     * \if ENGLISH_LANG
     *  Burn warning configuration information array, corresponding to the subscript of the array as the video channel number, the memory is allocated and released by the user, with a size of(nChannelNum * sizeof(BURNING_CHECK_INFO))
     * \else
     *  灼烧预警配置信息数组，对应数组下标为视频通道号，需用户申请内存，大小为nChannelNum * sizeof(BURNING_CHECK_INFO)
     * \endif
     */
    public BURNING_CHECK_INFO[]     pstuBurningCheckInfo;

    /**
     * \if ENGLISH_LANG
     *  The actual number of channels returned
     * \else
     *  实际返回的通道数
     * \endif
     */
    public int					nReturnChannelNum;

    public NET_CFG_BURNING_CHECK_INFO(int nChannelNum) {
        this.nChannelNum = nChannelNum;
        pstuBurningCheckInfo = new BURNING_CHECK_INFO[nChannelNum];
        for(int i = 0; i < nChannelNum; i ++){
            pstuBurningCheckInfo[i] = new BURNING_CHECK_INFO();
        }
    }
}