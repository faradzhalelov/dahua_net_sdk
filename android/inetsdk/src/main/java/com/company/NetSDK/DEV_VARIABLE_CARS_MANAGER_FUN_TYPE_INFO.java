package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Detect intelligent method type information
 * \else
 * 检测智能方法类型信息
 * \endif
 */
public class DEV_VARIABLE_CARS_MANAGER_FUN_TYPE_INFO implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     * Mutual exclusion function information,{@link EM_DEV_VARIABLE_CARS_MANAGER_FUNC_TYPE}
     * \else
     * 互斥功能,{@link EM_DEV_VARIABLE_CARS_MANAGER_FUNC_TYPE}
     * \endif
     */
    public int              emMutexFuncType[] = new int[1024];

    /**
     * \if ENGLISH_LANG
     * Number of mutually exclusive functions
     * \else
     * 互斥功能个数
     * \endif
     */
    public int                  nMutexFuncTypeNum;

    /**
     * \if ENGLISH_LANG
     * Preset point number [range: 0 ~ 255]
     * \else
     * 预置点编号【范围：0~255】
     * \endif
     */
    public int                  nPtzPresetID;

    /**
     * \if ENGLISH_LANG
     * Number of resource shortage types
     * \else
     * 资源不足的个数
     * \endif
     */
    public int                  nOutofResorecesTypeNum;

    /**
     * \if ENGLISH_LANG
     * Resource shortage type,{@link EM_DEV_VARIABLE_CARS_MANAGER_OUTOF_RESOURCES_TYPE}
     * \else
     * 资源不足类型,{@link EM_DEV_VARIABLE_CARS_MANAGER_OUTOF_RESOURCES_TYPE}
     * \endif
     */
    public int             emOutofResorecesType[] = new int[32];
}
