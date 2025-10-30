package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Light setting (corresponding CFG_CMD_LIGHTING command)
 * \else
 * 灯光设置(对应 CFG_CMD_LIGHTING 命令)
 * \endif
 */
public class CFG_LIGHTING_INFO  implements Serializable {

    /**
     *
     */
    private static final long serialVersionUID = 1L;
    /**
     * \if ENGLISH_LANG
     * Light setting effective number
     * \else
     * 灯光设置有效个数
     * \endif
     */
    public int                         nLightingDetailNum;

    /**
     * \if ENGLISH_LANG
     * Light setting information list
     * \else
     * 灯光设置信息列表
     * \endif
     */
    public CFG_LIGHTING_DETAIL[]         stuLightingDetail = new CFG_LIGHTING_DETAIL[FinalVar.MAX_LIGHTING_DETAIL_NUM];

    public CFG_LIGHTING_INFO(){
        for(int i=0; i<FinalVar.MAX_LIGHTING_DETAIL_NUM; ++i) {
            stuLightingDetail[i] = new CFG_LIGHTING_DETAIL();
        }
    }

}
