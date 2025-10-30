package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * interface {@link INetSDK#CloudUpgraderGetState} output parameter
 * \else
 *  接口 {@link INetSDK#CloudUpgraderGetState} 出参
 * \endif
 */
public class NET_OUT_CLOUD_UPGRADER_GET_STATE implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     * upgrade state
     * \else
     * 升级状态
     * \endif
     */
    public int              emState;

    /**
     * \if ENGLISH_LANG
     * upgrade progress
     * \else
     * 升级进度
     * \endif
     */
    public int              nProgress;

    /**
     * \if ENGLISH_LANG
     * file name
     * \else
     * 升级文件
     * \endif
     */
   public byte             szFileName[] = new byte[FinalVar.SDK_COMMON_STRING_128];
}
