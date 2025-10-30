package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * thermal imaging config, the corresponding interface {@link INetSDK#GetNewDevConfig} and {@link INetSDK#SetNewDevConfig},the corresponding command {@link FinalVar#CFG_CMD_THERMO_GRAPHY}
 * \else
 * 热成像摄像头属性配置, 对应接口 {@link INetSDK#GetNewDevConfig} 和 {@link INetSDK#SetNewDevConfig},对应命令 {@link FinalVar#CFG_CMD_THERMO_GRAPHY}
 * \endif
 */
public class CFG_THERMOGRAPHY_INFO implements Serializable{

    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     * mode number, only one currently
     * \else
     * 模式个数，目前只有一个
     * \endif
     */
    public int                         nModeCount;             // 模式个数，目前只有一个

    /**
     * \if ENGLISH_LANG
     * corresponding to different mode config
     * \else
     * 对应不同模式的配置
     * \endif
     */
    public CFG_THERMOGRAPHY_OPTION[]    stOptions = new CFG_THERMOGRAPHY_OPTION[16];          // 对应不同模式的配置

    public CFG_THERMOGRAPHY_INFO(){
        for(int i = 0; i < 16; ++i){
            stOptions[i] = new CFG_THERMOGRAPHY_OPTION();
        }
    }
}
