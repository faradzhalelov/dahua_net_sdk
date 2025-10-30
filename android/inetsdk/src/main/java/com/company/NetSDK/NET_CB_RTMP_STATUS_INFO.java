package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * NET_CB_RTMP_STATUS_INFO
 * \else
 * NET_CB_RTMP_STATUS_INFO
 * \endif
 */
public class NET_CB_RTMP_STATUS_INFO implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     *  Subscription ID number
     * \else
     *  订阅id号
     * \endif
     */
    public int					nSID;

    /**
     * \if ENGLISH_LANG
     *  Pushed data content	
     * \else
     *  推送的数据内容	
     * \endif
     */
    public NET_CB_RTMP_MANAGER_INFO					stuInfo = new NET_CB_RTMP_MANAGER_INFO();

}
