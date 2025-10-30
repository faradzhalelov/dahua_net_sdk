package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * {@link INetSDK#AttachPTZStatusProc} Interface Input Parameters
 * \else
 * {@link INetSDK#AttachPTZStatusProc} 接口输入参数
 * \endif
 */

public class NET_IN_PTZ_STATUS_PROC implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     * PTZ Channel
     * \else
     * 云台通道
     * \endif
     */
    public int              nChannel;

    /**
     * \if ENGLISH_LANG
     * Callback function
     * \else
     * 状态回调函数
     * \endif
     */
    public CB_fPTZStatusProcCallBack cbPTZStatusProc;
}
