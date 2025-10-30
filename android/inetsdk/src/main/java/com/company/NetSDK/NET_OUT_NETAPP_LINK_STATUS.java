package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * access to physical link state output param
 * \else
 * 获取物理链路状态输出结构体
 * \endif
 */
public class NET_OUT_NETAPP_LINK_STATUS implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     * Whether working
     * \else
     * 是否正在工作
     * \endif
     */
    public boolean bWorking;

    /**
     * \if ENGLISH_LANG
     * Whether IP conflict
     * \else
     * IP是否冲突
     * \endif
     */
    public boolean bIPConflict;
}
