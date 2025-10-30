package com.company.NetSDK;

/**
 * \if ENGLISH_LANG
 * attach VK call function
 * \else
 * 订阅VK回调函数原形
 * \endif
 */
public interface CB_fAttachVK {
    /**
     * \if ENGLISH_LANG
     * attach VK call function
     * @param lLoginID  login handle, {@link INetSDK#LoginEx} or{@link INetSDK#Login} return value
     * @param lAttachHandle attach handle, {@link INetSDK#AttachVK} return value
     * @param nChannelID channel ID
     * @param pstVKInfo VK and VKID info，see {@link NET_VKINFO }
     * \else
     * 订阅VK回调函数
     * @param lLoginID 登录句柄, {@link INetSDK#LoginEx}或者{@link INetSDK#Login}的返回值
     * @param lAttachHandle 订阅句柄, {@link INetSDK#AttachVK}的返回值
     * @param nChannelID 渠道ID
     * @param pstVKInfo VK二值对信息，详见 {@link NET_VKINFO}
     * \endif
     */
    public void invoke(long lLoginID, long lAttachHandle,int nChannelID, NET_VKINFO pstVKInfo);
}
