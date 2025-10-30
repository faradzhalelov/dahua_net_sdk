package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * @brief Stop PTZ control, Corresponding to the SDK_EXTPTZ_STOP enumeration
 * \else
 * @brief 结束云台控制 对应SDK_EXTPTZ_STOP枚举
 * \endif
 */
public class NET_IN_PTZ_STOP_INFO implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     *  code
     * \else
     *  命令码
     * \endif
     */
    public byte					szCode[] = new byte[32];

    /**
     * \if ENGLISH_LANG
     *  arg1
     * \else
     *  控制参数1
     * \endif
     */
    public int					nArg1;

    /**
     * \if ENGLISH_LANG
     *  arg2
     * \else
     *  控制参数2
     * \endif
     */
    public int					nArg2;

    /**
     * \if ENGLISH_LANG
     *  arg3
     * \else
     *  控制参数3
     * \endif
     */
    public int					nArg3;

    /**
     * \if ENGLISH_LANG
     *  arg4
     * \else
     *  控制参数4
     * \endif
     */
    public int					nArg4;

}