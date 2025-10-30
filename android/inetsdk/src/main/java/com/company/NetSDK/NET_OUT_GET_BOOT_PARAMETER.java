package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * @brief out of CLIENT_GetBootParameter
 * \else
 * @brief CLIENT_GetBootParameter 出参
 * \endif
 */
public class NET_OUT_GET_BOOT_PARAMETER implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     *  return parameter number
     * \else
     *  实际返回的参数个数
     * \endif
     */
    public int					nRetBootParamNum;

    /**
     * \if ENGLISH_LANG
     *  return parameter info
     * \else
     *  具体参数信息
     * \endif
     */
    public NET_BOOT_PARAMETER_INFO					stuBootParamInfo[] = new NET_BOOT_PARAMETER_INFO[32];

    public NET_OUT_GET_BOOT_PARAMETER() {
        for(int i = 0; i < 32; i ++){
            this.stuBootParamInfo[i] = new NET_BOOT_PARAMETER_INFO();
        }
    }
}