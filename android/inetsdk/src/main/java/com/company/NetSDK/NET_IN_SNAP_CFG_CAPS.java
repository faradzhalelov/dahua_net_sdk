package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * @brief get snap config capbility input parameter
 * \else
 * @brief 获取设备编码配置对应能力输入参数
 * \endif
 */
public class NET_IN_SNAP_CFG_CAPS implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     *  channel num(start from 0) 	 	 	 
     * \else
     *  通道号(起始通道0) 	 	 	 
     * \endif
     */
    public int					nChannelId;

}
