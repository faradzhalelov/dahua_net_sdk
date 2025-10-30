package com.company.NetSDK;

/**
 * Created by 32940 on 2018/9/6.
 */
public interface CB_fLVRepairStateCallBack {

    /**
     * \if ENGLISH_LANG
     * Network re-connection callback function original shape
     * @param lAttachHandle attach handle
     * @param pBuf LV info
     * \else
     * 网络连接恢复回调函数
     * @param lAttachHandle 订阅句柄
     * @param pBuf 分区信息
     * \endif
     */
    public void invoke(long lAttachHandle, NET_LV_STATE pBuf);
}
