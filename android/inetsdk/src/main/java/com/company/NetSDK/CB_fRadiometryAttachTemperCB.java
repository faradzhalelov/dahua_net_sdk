package com.company.NetSDK;

/**
 * \if ENGLISH_LANG
 * radiometry temper data state callback function
 * \else
 * 测温温度数据状态回调函数
 * \endif
 */
public interface CB_fRadiometryAttachTemperCB {

    /**
     * \if ENGLISH_LANG
     * radiometry temper data state callback function
     * @param lAttachTemperHandle return from{@link INetSDK#RadiometryAttachTemper}
     * @param pBuf {@link NET_RADIOMETRY_TEMPER_DATA} radiometry temper data
     * @param nBufLen state info length
     * \else
     * 监听透明串口数据的回调函数
     * @param lAttachTemperHandle {@link INetSDK#RadiometryAttachTemper}返回值
     * @param pBuf {@link NET_RADIOMETRY_TEMPER_DATA} 测温温度数据
     * @param nBufLen 状态信息长度
     * \endif
     */
    public void invoke(long lAttachTemperHandle, NET_RADIOMETRY_TEMPER_DATA pBuf, int nBufLen);

}
