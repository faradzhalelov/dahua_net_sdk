package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * The config of external door bell
 * \else
 * 外接门铃配置
 * \endif
 */
public class NET_CFG_DOORBELL_EXTERNALDOORBELL implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     * Door bell type {@link NET_EM_DOORBELL_TYPE}
     * \else
     * 门铃类型 {@link NET_EM_DOORBELL_TYPE}
     * \endif
     */
    public int            emDoorBellType;

    /**
     * \if ENGLISH_LANG
     * External door bell enable
     * \else
     * 外接门铃使能
     * \endif
     */
    public boolean             bEnable;
}
