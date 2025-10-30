package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * {@link INetSDK#QueryDevInfo} port {@link FinalVar#NET_QUERY_DEV_VARIABLE_CAPS_MANAGER_CHECK_START} command to output parameter
 * \else
 * {@link INetSDK#QueryDevInfo} 接口 {@link FinalVar#NET_QUERY_DEV_VARIABLE_CAPS_MANAGER_CHECK_START} 命令出参
 * \endif
 */
public class NET_OUT_DEV_VARIABLE_CAPS_MANAGER_CHECK_START_INFO implements Serializable {

    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     * Reboot type，{@link DEV_VARIABLE_CARS_MANAGER_REBOOT_TYPE}
     * \else
     * 重启类型，{@link DEV_VARIABLE_CARS_MANAGER_REBOOT_TYPE}
     * \endif
     */
    public int                 emRebootType;

    /**
     * \if ENGLISH_LANG
     * Maximum number of input query detection types
     * \else
     * 最大输入查询检测类型数量
     * \endif
     */
    public int                 nMaxCheckStartCount;

    /**
     * \if ENGLISH_LANG
     * Actual number of detection types
     * \else
     * 实际的检测类型个数
     * \endif
     */
    public int                 nRetCheckStartCount;

    /**
     * \if ENGLISH_LANG
     * Detect intelligent type information
     * \else
     * 检测智能类型信息
     * \endif
     */
    public DEV_VARIABLE_CARS_MANAGER_FUN_TYPE_INFO[] pstuCheckStartInfo;

    public NET_OUT_DEV_VARIABLE_CAPS_MANAGER_CHECK_START_INFO(int nMaxCheckStartCount)
    {
        this.nMaxCheckStartCount = nMaxCheckStartCount;
        pstuCheckStartInfo = new DEV_VARIABLE_CARS_MANAGER_FUN_TYPE_INFO[nMaxCheckStartCount];
        for(int i = 0; i < nMaxCheckStartCount; ++i)
        {
            pstuCheckStartInfo[i] = new DEV_VARIABLE_CARS_MANAGER_FUN_TYPE_INFO();
        }
    }

}
