package com.company.NetSDK;
import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * euler angle
 * \else
 * 姿态角数据
 * \endif
 */
public class NET_EULER_ANGLE implements Serializable{
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     * pitch
     * \else
     * 仰俯角
     * \endif
     */
    public int		nPitch;				// pitch

    /**
     * \if ENGLISH_LANG
     * yaw
     * \else
     * 偏航角
     * \endif
     */
    public int		nYaw;				// yaw

    /**
     * \if ENGLISH_LANG
     * roll
     * \else
     * 翻滚角
     * \endif
     */
    public int		nRoll;				// roll

}
