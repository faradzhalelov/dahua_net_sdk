package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * {@link INetSDK#QueryDevInfo} port {@link FinalVar#NET_QUERY_DEV_VARIABLE_CAPS_MANAGER_GET_FUNC_TYPE_LIST} command to output parameter
 * \else
 * {@link INetSDK#QueryDevInfo} 接口 {@link FinalVar#NET_QUERY_DEV_VARIABLE_CAPS_MANAGER_GET_FUNC_TYPE_LIST} 命令出参
 * \endif
 */
public class NET_OUT_DEV_VARIABLE_CAPS_MANAGER_GET_FUNC_TYPE_LIST_INFO implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     * Number of functions
     * \else
     * 功能个数
     * \endif
     */
    public int              nFuncTypeNum;

    /**
     * \if ENGLISH_LANG
     * Function list,{@link EM_DEV_VARIABLE_CARS_MANAGER_FUNC_TYPE}
     * \else
     * 功能个数,{@link EM_DEV_VARIABLE_CARS_MANAGER_FUNC_TYPE}
     * \endif
     */
    public int              emFuncTypeList[] = new int[1024];
}
