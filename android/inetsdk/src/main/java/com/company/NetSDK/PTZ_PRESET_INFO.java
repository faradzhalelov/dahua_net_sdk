package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * @brief PTZ preset configuration corresponds to the structure
 * \else
 * @brief 云台预置点配置对应结构
 * \endif
 */
public class PTZ_PRESET_INFO implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     *  The maximum number of Preset point
     * \else
     *  最大预置点个数
     * \endif
     */
    public int					dwMaxPtzPresetNum;

    /**
     * \if ENGLISH_LANG
     *  Actual Use Preset Number 
     * \else
     *  实际使用预置点个数
     * \endif
     */
    public int					dwRetPtzPresetNum;

    /**
     * \if ENGLISH_LANG
     *  Preset Point Information (according to the maximum number of application memory) 
     * \else
     *  预置点信息(根据最大个数申请内存)
     * \endif
     */
    public PTZ_PRESET[]					pstPtzPreset;

    public PTZ_PRESET_INFO(int dwMaxPtzPresetNum) {
        this.dwMaxPtzPresetNum = dwMaxPtzPresetNum;
        this.pstPtzPreset = new PTZ_PRESET[dwMaxPtzPresetNum];
        for(int i = 0; i < dwMaxPtzPresetNum; i ++){
            this.pstPtzPreset[i] = new PTZ_PRESET();
        }
    }
}