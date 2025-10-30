package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * {@link INetSDK#GetNMPPortInfoByPage} output param
 * \else
 * {@link INetSDK#GetNMPPortInfoByPage} 输出参数
 * \endif
 */
public class NET_OUT_GET_NMPPORT_BY_PAGE implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     * Total device ports
     * \else
     * 设备端口总数
     * \endif
     */
    public int                    nTotalSize;

    /**
     * \if ENGLISH_LANG
     * The maximum number of elements in the pstPortList array, specified by the user
     * \else
     * pstPortList数组的最大元素个数值, 由用户指定
     * \endif
     */
    public int                    nMaxPortCount;

    /**
     * \if ENGLISH_LANG
     * The actual number of ports obtained, that is, the number of valid values in the pstPortList array
     * \else
     * 实际获取到的端口数量, 即pstPortList 数组中有效值的个数
     * \endif
     */
    public int                    nRetPortCount;

    /**
     * \if ENGLISH_LANG
     * Device port information list.
     * \else
     * 设备端口信息列表
     * \endif
     */
    public NET_NMPDEVPORT_INFO[]     pstPortList;


    public NET_OUT_GET_NMPPORT_BY_PAGE(int nMaxPortCount){
        this.nMaxPortCount = nMaxPortCount;
        pstPortList = new NET_NMPDEVPORT_INFO[nMaxPortCount];
        for(int i = 0; i < nMaxPortCount; ++i){
            pstPortList[i] = new NET_NMPDEVPORT_INFO();
        }
    }
}
