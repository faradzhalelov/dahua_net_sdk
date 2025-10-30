package com.company.NetSDK;

/**
 * \if ENGLISH_LANG
 * Subscribe to PTZ metadata interface and callback function prototypes
 * Pbufs at this stage mainly SDK_PTZ_LOCATION_INFO type ,
 * lAttachHandle is AttachPTZStatusProc return value
 * \else
 * 订阅云台元数据接口回调函数原型
 * pBuf 现阶段主要为 SDK_PTZ_LOCATION_INFO 类型
 * lAttachHandle是 AttachPTZStatusProc的返回值
 * \endif
 */
public interface CB_fPTZStatusProcCallBack{

    /**
     * \if ENGLISH_LANG
     * tour status call function
     * @param lLoginID Login Handler, return from{@link INetSDK#LoginEx}Or{@link INetSDK#Login}
     * @param lAttachHandle return from{@link INetSDK#AttachPTZStatusProc}返回值
     * @param pBuf {@link SDK_PTZ_LOCATION_INFO}
     *  @param nBufLen
     * \else
     * 轮训状态回调函数
     * @param lLoginID 登录句柄, {@link INetSDK#LoginEx}或者{@link INetSDK#Login}的返回值
     * @param lAttachHandle {@link INetSDK#AttachPTZStatusProc}返回值
     * @param pBuf 状态信息，{@link SDK_PTZ_LOCATION_INFO}
     * @param nBufLen pBuf的大小
     * \endif
     */
    public void invoke(long lLoginID, long lAttachHandle, Object pBuf, int nBufLen);
}
