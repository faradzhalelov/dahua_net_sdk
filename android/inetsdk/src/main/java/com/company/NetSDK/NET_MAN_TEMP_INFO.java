package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * Temperature information of personnel in the area
 * \else
 * 区域内人员体温信息
 * \endif
 */
public class NET_MAN_TEMP_INFO implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     *  Object ID
     * \else
     *  物体ID
     * \endif
     */
    public int					nObjectID;

    /**
     * \if ENGLISH_LANG
     *  information, 8192 coordinate system
     * \else
     * 坐标信息, 8192坐标系
     * \endif
     */
    public NET_RECT					stRect = new NET_RECT();

    /**
     * \if ENGLISH_LANG
     *  Maximum temperature
     * \else
     *  最温度异常度
     * \endif
     */
    public double					dbHighTemp;

    /**
     * \if ENGLISH_LANG
     * Temperature unit (0 ° C 1 ° F 2 Kelvin)
     * \else
     *  温度单位(0摄氏度 1华氏度 2开尔文)
     * \endif
     */
    public int					nTempUnit;

    /**
     * \if ENGLISH_LANG
     *  Is it abnormal temperature
     * \else
     *  是否超温
     * \endif
     */
    public boolean					bIsOverTemp;

    /**
     * \if ENGLISH_LANG
     *  Is it Abnormal temperature
     * \else
     *  是否温度异常
     * \endif
     */
    public boolean					bIsUnderTemp;

    /**
     * \if ENGLISH_LANG
     *  The shift of small face image feature value in binary data block
     * \else
     *  目标小图特征值在二进制数据块中的偏移
     * \endif
     */
    public int					nOffset;

    /**
     * \if ENGLISH_LANG
     *  Length of eigenvalue of small face image, unit: byte
     * \else
     *  目标小图特征值长度, 单位:字节
     * \endif
     */
    public int					nLength;

    /**
     * \if ENGLISH_LANG
     *  Test results of respirator,EM_MASK_DETECT_RESULT_TYPE	
     * \else
     *  口罩检测结果,EM_MASK_DETECT_RESULT_TYPE
     * \endif
     */
    public int					emMaskDetectResult;

    /**
     * \if ENGLISH_LANG
     *  information range: [0,8191]
     * \else
     *  坐标信息(坐标系：8192)
     * \endif
     */
    public NET_RECT					stThermalRect = new NET_RECT();

    /**
     * \if ENGLISH_LANG
     *  Age
     * \else
     *  年龄
     * \endif
     */
    public int					nAge;

    /**
     * \if ENGLISH_LANG
     *  Sex,EM_DEV_EVENT_FACEDETECT_SEX_TYPE
     * \else
     *  性别,EM_DEV_EVENT_FACEDETECT_SEX_TYPE
     * \endif
     */
    public int					emSex;

}
