package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * @brief CLIENT_GetCalibrateStatus Interface output parameters
 * \else
 * @brief CLIENT_GetCalibrateStatus 接口输出参数
 * \endif
 */
public class NET_OUT_GET_CALIBRATE_STATUS implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     *  Get calibration status: 1: Never performed one-key automatic calibration since startup; 2: Currently performing one-key calibration; 3: Last one-key calibration was successful; 4: Last one-key calibration was unsuccessful.
     * \else
     *  获取标定状态,1：启动后从未一键自动标定过 2：正在一键标定中 3：上次一键标定的结果是成功 4：上次一键标定的结果是失败
     * \endif
     */
    public int					nAutoCalibrateResult;

}