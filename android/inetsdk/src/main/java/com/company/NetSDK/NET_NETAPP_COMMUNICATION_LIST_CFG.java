package com.company.NetSDK;

import java.io.Serializable;
public class NET_NETAPP_COMMUNICATION_LIST_CFG implements Serializable{
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     * num of communication list config
     * \else
     * 实际的通讯录配置个数
     * \endif
     */
    public int					nConmmunicationListNum;

    /**
     * \if ENGLISH_LANG
     * communication config array
     * \else
     *  通讯录配置数组
     * \endif
     */
    public NET_NETAPP_COMMUNICATION_LIST stuCommunication[] = new NET_NETAPP_COMMUNICATION_LIST[10];

    public NET_NETAPP_COMMUNICATION_LIST_CFG() {
        for (int i = 0; i < 10; ++i) {
            stuCommunication[i] = new NET_NETAPP_COMMUNICATION_LIST();
        }
    }
}
