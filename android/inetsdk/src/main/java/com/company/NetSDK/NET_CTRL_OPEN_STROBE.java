package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * open gateway parameter(corresponding to SDK_CTRL_OPEN_STROBE command)
 * \else
 * 开启道闸参数(对应SDK_CTRL_OPEN_STROBE命令)
 * \endif
 */
public class NET_CTRL_OPEN_STROBE implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     *  channel no., when nChannelId is -1,denotes unused channel no. and single channel device
     * \else
     *  通道号, nChannelId为-1时表示未使用通道号, 表示单通道设备
     * \endif
     */
    public int					nChannelId;

    /**
     * \if ENGLISH_LANG
     *  plate no.
     * \else
     *  车牌号码
     * \endif
     */
    public byte					szPlateNumber[] = new byte[FinalVar.MAX_PLATENUMBER_LEN];

    /**
     * \if ENGLISH_LANG
     *  open strobe type,{@link EM_OPEN_STROBE_TYPE}
     * \else
     *  开闸类型,{@link EM_OPEN_STROBE_TYPE}
     * \endif
     */
    public int					emOpenType;

}
