package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * patrol path
 * \else
 *  巡航路径
 * \endif
 */
public class CFG_PTZTOUR_SINGLE implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;


    /**
     * \if ENGLISH_LANG
     * enable
     * \else
     * 使能
     * \endif
     */
    public boolean                        bEnable;

    /**
     * \if ENGLISH_LANG
     * name
     * \else
     * 名称
     * \endif
     */
    public byte                        szName[] = new byte[FinalVar.CFG_COMMON_STRING_64];

    /**
     * \if ENGLISH_LANG
     *  preset quantity
     * \else
     * 预置点数量
     * \endif
     */
    public int                         nPresetsNum;

    /**
     * \if ENGLISH_LANG
     *  this path included preset parameter
     * \else
     * 该路径包含的预置点参数
     * \endif
     */
    public CFG_PTZTOUR_PRESET                         stPresets[] = new CFG_PTZTOUR_PRESET[FinalVar.CFG_MAX_PTZTOUR_PRESET_NUM];

    public CFG_PTZTOUR_SINGLE(){
        for(int i = 0; i < FinalVar.CFG_MAX_PTZTOUR_PRESET_NUM; ++i)
        {
            stPresets[i] = new CFG_PTZTOUR_PRESET();
        }
    }
}
