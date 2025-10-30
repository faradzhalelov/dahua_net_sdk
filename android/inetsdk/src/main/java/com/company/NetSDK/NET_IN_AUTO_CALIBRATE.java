package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * @brief CLIENT_AutoCalibrate Interface input parameters
 * \else
 * @brief CLIENT_AutoCalibrate 接口输入参数
 * \endif
 */
public class NET_IN_AUTO_CALIBRATE implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     *  Calibration modes, 1, 2, 3 represent "from bottom to top", "from top to bottom", "top first and then bottom".
     * \else
     *  标定的模式，1 ，2， 3 分别代表“从下到上”，“从上到下”，“先上后下”
     * \endif
     */
    public int					nMode;

}