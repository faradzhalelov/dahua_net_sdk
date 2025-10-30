package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * coaxial local alarm info，the corresponding interface {@link INetSDK#StartListenEx},the corresponding {@link NET_EM_CFG_OPERATE_TYPE#NET_EM_CFG_COAXIAL_ALARMLOCAL}
 * \else
 *  CVI外部报警配置, 对应接口 {@link INetSDK#StartListenEx},对应命令 {@link NET_EM_CFG_OPERATE_TYPE#NET_EM_CFG_COAXIAL_ALARMLOCAL}
 * \endif
 */
public class NET_COAXIAL_ALARMLOCAL_INFO implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     *  config info
     * \else
     * 配置信息
     * \endif
     */
    public NET_CFG_COAXIAL_ALARMLOCAL[]	pstuAlaramCfg;

    public NET_COAXIAL_ALARMLOCAL_INFO(int nCount) {
        this.nCount = nCount;
        pstuAlaramCfg = new NET_CFG_COAXIAL_ALARMLOCAL[nCount];
        for (int i = 0; i < nCount; i++) {
            pstuAlaramCfg[i] = new NET_CFG_COAXIAL_ALARMLOCAL();
        }
    }

    /**
     * \if ENGLISH_LANG
     * pstuAlaramCfg count
     * \else
     * pstuAlaramCfg 个数
     * \endif
     */
    public int								nCount;					// pstuAlaramCfg count

    /**
     * \if ENGLISH_LANG
     * count return
     * \else
     * 实际返回的配置个数
     * \endif
     */
    public int								nCountRet;				// count return
}
