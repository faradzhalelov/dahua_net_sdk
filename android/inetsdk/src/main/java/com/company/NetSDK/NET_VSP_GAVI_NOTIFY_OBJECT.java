package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 *  notify object info of vsp gavi
 * \else
 * 上报对象信息
 * \endif
 */
public class NET_VSP_GAVI_NOTIFY_OBJECT implements Serializable {

    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     *
     * \else
     * 目标选中
     * \endif
     */
    public boolean							bFaceChecked;

    /**
     * \if ENGLISH_LANG
     * the face is checked
     * \else
     * 人体选中
     * \endif
     */
    public boolean							bPersonChecked;

    /**
     * \if ENGLISH_LANG
     * the body is checked
     * \else
     * 机动车选中
     * \endif
     */
    public boolean							bMotorVehicleChecked;

    /**
     * \if ENGLISH_LANG
     * the motor vehicle is checked
     * \else
     * 非机动车选中
     * \endif
     */
    public boolean							bNonMotorVehicleChecked;

    /**
     * \if ENGLISH_LANG
     * the non motor vehicle is checked
     * \else
     * 图片选中
     * \endif
     */
    public boolean							bImageChecked;

}
