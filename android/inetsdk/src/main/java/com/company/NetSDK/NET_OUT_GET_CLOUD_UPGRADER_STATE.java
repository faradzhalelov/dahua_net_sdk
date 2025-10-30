package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * output parameter about Get Cloud Upgrader State
 * \else
 * 检查是否有可用升级包 出参
 * \endif
 */
public class NET_OUT_GET_CLOUD_UPGRADER_STATE implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

     /**
     * \if ENGLISH_LANG
     * upgrader state, refer to {@link EM_CLOUD_UPGRADER_STATE}
     * \else
     * 升级状态 ,取值参考 {@link EM_CLOUD_UPGRADER_STATE}
     * \endif
     */
    public int				emState;				// 升级状态， EM_CLOUD_UPGRADER_STATE

     /**
     * \if ENGLISH_LANG
     * Progres
     * \else
     * 升级进度
     * \endif
     */
    public int 			nProgress;				// 升级进度, 状态是Downloading/Upgrading时有意义
}
