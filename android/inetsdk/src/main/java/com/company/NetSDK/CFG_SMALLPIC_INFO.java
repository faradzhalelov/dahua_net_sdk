package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * @brief small picture information window
 * \else
 * @brief 小画面窗口信息
 * \endif
 */
public class CFG_SMALLPIC_INFO implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

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
     *  whether the big picture mixes small picture's aduio
     * \else
     *  大画面是否混合小画面音频
     * \endif
     */
    public boolean					bAudio;

    /**
     * \if ENGLISH_LANG
     *  the relative coordinate system,range from 0 to 8192
     * \else
     *  使用相对坐标体系，取值均为0-8192,在整个屏幕上的位置
     * \endif
     */
    public CFG_RECT					stuPosition = new CFG_RECT();

}