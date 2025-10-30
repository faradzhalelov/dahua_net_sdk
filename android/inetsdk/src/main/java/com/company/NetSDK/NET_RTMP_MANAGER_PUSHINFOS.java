package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * Information of created streaming task
 * \else
 * 已创建推流任务的信息
 * \endif
 */
public class NET_RTMP_MANAGER_PUSHINFOS implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     *  Push flow ID
     * \else
     *  推流ID
     * \endif
     */
    public int					nPushId;

    /**
     * \if ENGLISH_LANG
     *  Streaming address type
     * \else
     *  推流地址类型,NET_EM_RTMP_MANAGER_ADD_TYPE
     * \endif
     */
    public int					emType;

    /**
     * \if ENGLISH_LANG
     *  Push flow state
     * \else
     *  推流状态,NET_EM_RTMP_MANAGER_STATUS
     * \endif
     */
    public int					emStatus;

    /**
     * \if ENGLISH_LANG
     *  Reserved
     * \else
     *  预留字节
     * \endif
     */
    public byte					szReserved[] = new byte[1028];

}
