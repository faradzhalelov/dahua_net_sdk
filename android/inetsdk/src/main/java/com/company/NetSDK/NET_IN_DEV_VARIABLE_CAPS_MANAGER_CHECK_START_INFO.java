package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * {@link INetSDK#QueryDevInfo} {@link FinalVar#NET_QUERY_DEV_VARIABLE_CAPS_MANAGER_CHECK_START} command to input parameter
 * \else
 * {@link INetSDK#QueryDevInfo} 接口 {@link FinalVar#NET_QUERY_DEV_VARIABLE_CAPS_MANAGER_CHECK_START} 命令入参
 * \endif
 */
public class NET_IN_DEV_VARIABLE_CAPS_MANAGER_CHECK_START_INFO implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     * Channel no
     * \else
     * 通道号
     * \endif
     */
    public int                  nChannel;

    /**
     * \if ENGLISH_LANG
     * Preset point number[range:0~255]
     * \else
     * 预置点编号【范围：0~255】
     * \endif
     */
    public int                  nPtzPresetID[] = new int[256];

    /**
     * \if ENGLISH_LANG
     * Number of preset points
     * \else
     * 预置点个数
     * \endif
     */
    public int                  nPtzPresetNum;

    /**
     * \if ENGLISH_LANG
     * Detection function,,{@link EM_DEV_VARIABLE_CARS_MANAGER_FUNC_TYPE}
     * \else
     * 检测功能,{@link EM_DEV_VARIABLE_CARS_MANAGER_FUNC_TYPE}
     * \endif
     */
    public int                  emFuncType;

    /**
     * \if ENGLISH_LANG
     * Information corresponding to the function
     * \else
     * 功能对应的信息
     * \endif
     */
    public Object               pFuncTypeInfo;
}
