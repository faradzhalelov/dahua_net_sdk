package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * interface {@link INetSDK#AttachNASRepairState} input parameter
 * \else
 *  接口 {@link INetSDK#AttachNASRepairState} 接口输入参数
 * \endif
 */
public class NET_IN_ATTACH_NAS_REPAIRSTATE implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     * LV repair state callback
     * \else
     * 分区修复状态回调
     * \endif
     */
    public CB_fLVRepairStateCallBack   cbLVRepairState;
}
