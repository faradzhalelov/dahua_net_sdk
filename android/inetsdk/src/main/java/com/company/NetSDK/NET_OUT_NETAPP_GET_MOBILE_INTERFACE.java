package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * EM_PRC_NETAPP_TYPE_GET_MOBILE_INTERFACE output param
 * \else
 * EM_PRC_NETAPP_TYPE_GET_MOBILE_INTERFACE 出参
 * \endif
 */
public class NET_OUT_NETAPP_GET_MOBILE_INTERFACE implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     *  valid number of mobile network interface
     * \else
     *  网络接口有效个数
     * \endif
     */
    public int					nInterfaceNum;

    /**
     * \if ENGLISH_LANG
     *  mobile network interfaces
     * \else
     *  移动网络接口信息
     * \endif
     */
    public SDKDEV_NETINTERFACE_INFO					stuInterface[] = new SDKDEV_NETINTERFACE_INFO[64];

    public NET_OUT_NETAPP_GET_MOBILE_INTERFACE() {
        for(int i = 0; i < 64; i ++){
            this.stuInterface[i] = new SDKDEV_NETINTERFACE_INFO();
        }
    }

    public NET_OUT_NETAPP_GET_MOBILE_INTERFACE(int nInterfaceNum) {
        this.nInterfaceNum = nInterfaceNum;
        for(int i = 0; i < nInterfaceNum; i ++){
            this.stuInterface[i] = new SDKDEV_NETINTERFACE_INFO();
        }
    }
}