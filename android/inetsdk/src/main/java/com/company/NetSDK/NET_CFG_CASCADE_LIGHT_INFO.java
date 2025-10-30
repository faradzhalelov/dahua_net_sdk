package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * NVR cascade control IPC light configuration
 * \else
 * NVR级联控制IPC灯光配置
 * \endif
 */
public class NET_CFG_CASCADE_LIGHT_INFO implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     * light count
     * \else
     * 实际灯光个数
     * \endif
     */
    public int						nCount;

    /**
     * \if ENGLISH_LANG
     * light enable
     * \else
     * 灯光使能
     * \endif
     */
    public boolean						[]bEnable = new boolean[16];
}
