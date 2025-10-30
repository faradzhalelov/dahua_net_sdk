package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * @brief Target matching event triggers corresponding ball machine information
 * \else
 * @brief 目标比对事件触发对应球机信息
 * \endif
 */
public class NET_FACECOMPARISON_PTZ_INFO implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     *  Preset point name when the ball machine captures the Target
     * \else
     *  球机抓拍到目标时预置点名称
     * \endif
     */
    public byte					szPresetName[] = new byte[64];

    /**
     * \if ENGLISH_LANG
     *  Preset point number when the ball machine captures the Target	
     * \else
     *  球机抓拍到目标时预置点编号	
     * \endif
     */
    public int					dwPresetNumber;

}