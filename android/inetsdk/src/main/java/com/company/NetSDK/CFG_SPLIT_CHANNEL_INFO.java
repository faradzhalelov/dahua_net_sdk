package com.company.NetSDK;


import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * @brief split channel
 * \else
 * @brief 分割通道
 * \endif
 */
public class CFG_SPLIT_CHANNEL_INFO implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     *  enable
     * \else
     *  使能
     * \endif
     */
    public boolean					bEnable;

    /**
     * \if ENGLISH_LANG
     *  device ID
     * \else
     *  设备ID
     * \endif
     */
    public byte					szDeviceID[] = new byte[FinalVar.AV_CFG_Device_ID_Len];

    /**
     * \if ENGLISH_LANG
     *  channel ID(from 0)
     * \else
     *  通道号(0开始)
     * \endif
     */
    public int					nChannelID;

    /**
     * \if ENGLISH_LANG
     *  number of small picture,each channel has a CFG_SMALLPIC_INFO, maxinum device channel number - 1
     * \else
     *  小画面通道个数，每个通道一个CFG_SMALLPIC_INFO,这里最大应该是设备通道数减一
     * \endif
     */
    public int					nMaxSmallChannels;

    /**
     * \if ENGLISH_LANG
     *  parses the returned or packaging to send small picture of the channel number
     * \else
     *  解析返回的或封装发送的小画面通道个数
     * \endif
     */
    public int					nReturnSmallChannels;

    /**
     * \if ENGLISH_LANG
     *  small picture info 
     * \else
     *  小画面信息
     * \endif
     */
    public CFG_SMALLPIC_INFO[]					pPicInfo;

    public CFG_SPLIT_CHANNEL_INFO(int nMaxSmallChannels) {
        this.nMaxSmallChannels = nMaxSmallChannels;
        this.pPicInfo = new CFG_SMALLPIC_INFO[nMaxSmallChannels];
        for(int i = 0; i < nMaxSmallChannels; i ++){
            this.pPicInfo[i] = new CFG_SMALLPIC_INFO();
        }
    }
}