package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * NMP device port status callback information
 * \else
 * NMP 设备端口状态回调信息
 * \endif
 */
public class NET_CB_NMP_PORT_STATUS_INFO implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;


    /**
     * \if ENGLISH_LANG
     * ip
     * \else
     * ip 地址
     * \endif
     */
    public byte                szAddress[] = new byte[64];

    /**
     * \if ENGLISH_LANG
     * MAC
     * \else
     * MAC地址
     * \endif
     */
    public byte                szMAC[] = new byte[24];

    /**
     * \if ENGLISH_LANG
     * Port status information list, memory is requested and released by the SDK
     * \else
     * 端口状态信息列表, 内存由sdk 内部申请和释放
     * \endif
     */
    public NET_NMP_PORT_STATUS[] pstPortStatusList = new NET_NMP_PORT_STATUS[256];

    /**
     * \if ENGLISH_LANG
     * The actual number of ports returned, that is, the number of valid elements in the pstPortStatusList array
     * \else
     * 实际返回的端口数量, 即pstPortStatusList 数组中有效的元素个数
     * \endif
     */
    public int                nRetPortNum;

    public NET_CB_NMP_PORT_STATUS_INFO(){
        for(int i = 0; i < 256; i++){
            pstPortStatusList[i] = new NET_NMP_PORT_STATUS();
        }

    }
}
