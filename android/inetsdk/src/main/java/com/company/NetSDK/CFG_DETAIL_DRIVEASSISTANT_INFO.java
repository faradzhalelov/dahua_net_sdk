package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Scene configuration of driving assistance
 * \else
 * 驾驶辅助场景配置
 * \endif
 */
public class CFG_DETAIL_DRIVEASSISTANT_INFO implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     * Valid or not
     * \else
     * 是否有效
     * \endif
     */
    public boolean				bValid;

    /**
     * \if ENGLISH_LANG
     * Vehicle Width 0-5000mm Unit:mm
     * \else
     * 车宽 0-5000mm 单位mm
     * \endif
     */
    public int                  nVehicleWidth;

    /**
     * \if ENGLISH_LANG
     * Camera Height 0-5000mm Unit:mm
     * \else
     * 相机高度 0-5000mm 单位mm
     * \endif
     */
    public int                  nCamHeight;

    /**
     * \if ENGLISH_LANG
     * Distance from the front of the car to the camera 0-5000mm Unit:mm
     * \else
     * 车头到相机的距离 0-5000mm 单位mm
     * \endif
     */
    public int                  nCamToCarHead;

    /**
     * \if ENGLISH_LANG
     * Lane Center Point
     * \else
     * 车道中心点
     * \endif
     */
    public SDK_POINT            stuCenterPoint = new SDK_POINT();

}
