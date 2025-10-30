package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * @brief UPNP configuration, corresponding to CFG_CMD_UPNP
 * \else
 * @brief UPNP配置，对应配置CFG_CMD_UPNP
 * \endif
 */
public class CFG_UPNP_INFO implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     *  port mapping enable
     * \else
     *  端口映射使能
     * \endif
     */
    public boolean					bEnable;

    /**
     * \if ENGLISH_LANG
     *  whether to enable the UPnP lookup function
     * \else
     *  是否开启UPnP被查找功能
     * \endif
     */
    public boolean					bStartDeviceDiscover;

    /**
     * \if ENGLISH_LANG
     *  mode,{@link EM_CONFIGURATION_MODE}
     * \else
     *  模式,{@link EM_CONFIGURATION_MODE}
     * \endif
     */
    public int					emMode;

    /**
     * \if ENGLISH_LANG
     *  maximum number of mapping tables
     * \else
     *  最大映射表个数
     * \endif
     */
    public int					nMaxTable;

    /**
     * \if ENGLISH_LANG
     *  number of actual mapping tables
     * \else
     *  实际映射表个数,下发配置时按此字段来决定数量
     * \endif
     */
    public int					nReturnTable;

    /**
     * \if ENGLISH_LANG
     *  mapping table information
     * \else
     *  映射表信息
     * \endif
     */
    public CFG_MAP_TABLE_INFO[]					pstuMapTable;

    public CFG_UPNP_INFO(int nMaxTable) {
        this.nMaxTable = nMaxTable;
        this.pstuMapTable = new CFG_MAP_TABLE_INFO[nMaxTable];
        for(int i = 0; i < nMaxTable; i ++){
            this.pstuMapTable[i] = new CFG_MAP_TABLE_INFO();
        }
    }
}
