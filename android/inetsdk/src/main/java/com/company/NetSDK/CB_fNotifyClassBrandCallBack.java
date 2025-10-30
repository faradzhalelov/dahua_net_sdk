package com.company.NetSDK;



/**
 * \if ENGLISH_LANG
 * Callback function for transmitting and receiving data on the electronic signboard subscription platform
 * \else
 * 电子班牌订阅平台上下行透传回调
 * \endif
 */
public interface CB_fNotifyClassBrandCallBack {
    /**
     * \if ENGLISH_LANG
     * callback function
     * @param lAttchHandle handle, return from {@link INetSDK#AttachClassBrand}
     * @param pstClassBrandInfo pstClassBrandInfo Information for transmitting and receiving data on the electronic signboard subscription platform
     * \else
     * 回调函数
     * @param lAttchHandle 订阅句柄
     * @param pstClassBrandInfo 电子班牌订阅平台上下行透传数据信息
     * \endif
     */
    public void invoke(long lAttchHandle, NET_CB_CLASS_BRAND_INFO pstClassBrandInfo);
}
