package com.company.NetSDK;

public interface CB_fRadiometryAttachCB {
    /**
     * \if ENGLISH_LANG
     * temperature distribution data state callback function
     * @param lAttachHandle return from{@link INetSDK#RadiometryAttach}
     * @param pBuf heat map data info
     * \else
     * 温度分布数据状态回调函数
     * @param lAttachHandle {@link INetSDK#RadiometryAttach}返回值
     * @param pBuf 热图数据信息
     * \endif
     */
    public void invoke(long lAttachHandle,NET_RADIOMETRY_DATA pBuf,int nBufLen);
}
