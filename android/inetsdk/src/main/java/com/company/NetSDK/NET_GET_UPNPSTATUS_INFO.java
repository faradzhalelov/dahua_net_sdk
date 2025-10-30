package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 *
 * @brief Get UPnP mapping status(corresponding to SDK_DEVSTATE_GET_UPNP_STATUS)
 * \else
 * @brief 获取UPnP映射状态(对应SDK_DEVSTATE_GET_UPNP_STATUS)
 * \endif
 */
public class NET_GET_UPNPSTATUS_INFO implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     * whether it is working
     * \else
     * 是否正在工作
     * \endif
     */
    public boolean bWorking;

    /**
     * \if ENGLISH_LANG
     * status, {@link EM_UPNP_STATUS_TYPE}
     * \else
     * 状态, {@link EM_UPNP_STATUS_TYPE}
     * \endif
     */
    public int emStatus;

    /**
     * \if ENGLISH_LANG
     * internal address
     * \else
     * 内部IP
     * \endif
     */
    public byte szInnerAddress[] = new byte[FinalVar.MAX_COMMON_STRING_64];

    /**
     * \if ENGLISH_LANG
     * external address
     * \else
     * 外部IP
     * \endif
     */
    public byte szOuterAddress[] = new byte[FinalVar.MAX_COMMON_STRING_64];

    /**
     * \if ENGLISH_LANG
     * number of requested port mapping states
     * \else
     * 申请的端口映射状态个数
     * \endif
     */
    public int nMaxPortMapStatus;

    /**
     * \if ENGLISH_LANG
     * number of actually returned port mapping states
     * \else
     * 实际返回的端口映射状态个数
     * \endif
     */
    public int nReturnNum;

    /**
     * \if ENGLISH_LANG
     * pointer fo tag array, user malloc the memory, the size is nMaxPortMapStatus*sizeof{@link EM_PORTMAP_STATUS_TYPE}
     * \else
     * 端口映射状态信息指针，由调用者分配内存,分配的大小为 nMaxPortMapStatus*sizeof {@link EM_PORTMAP_STATUS_TYPE}
     * \endif
     */
    public int[] pemPortMapStatus;

    public NET_GET_UPNPSTATUS_INFO(int nMaxPortMapStatus) {
        this.nMaxPortMapStatus = nMaxPortMapStatus;
        this.pemPortMapStatus = new int[nMaxPortMapStatus];
    }
}
