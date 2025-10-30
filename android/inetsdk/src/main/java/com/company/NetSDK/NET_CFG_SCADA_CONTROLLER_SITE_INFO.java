package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Controller
 * \else
 * 控制器
 * \endif
 */
public class NET_CFG_SCADA_CONTROLLER_SITE_INFO implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     * Controller num
     * \else
     * 控制器个数
     * \endif
     */
    public int									nControllerNum;

    /**
     * \if ENGLISH_LANGsss
     * Controller information
     * \else
     * 控制器信息
     * \endif
     */
    public NET_SCADA_CONTROLLER_SITE_INFO[]	stuControllerInfo = new NET_SCADA_CONTROLLER_SITE_INFO[128];

    public NET_CFG_SCADA_CONTROLLER_SITE_INFO() {
        for(int i = 0; i < 128; i++) {
            stuControllerInfo[i] = new NET_SCADA_CONTROLLER_SITE_INFO();
        }
    }
}
