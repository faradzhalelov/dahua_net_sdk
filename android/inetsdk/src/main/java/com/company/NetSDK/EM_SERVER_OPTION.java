package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 *  Server Option
 * \else
 * 单个平台接入启动选项
 * \endif
 */
public class EM_SERVER_OPTION implements Serializable{

    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     * unknow
     * \else
     * 未知
     * \endif
     */
    public static final int EM_SERVER_OPTION_UNKNOWN = 0;

    /**
     * \if ENGLISH_LANG
     * Server option unable
     * \else
     * 平台接入不启动
     * \endif
     */
    public static final int EM_SERVER_OPTION_DISABLE = 1;

    /**
     * \if ENGLISH_LANG
     * Open with GB28181 access
     * \else
     * 以28181接入方式开启
     * \endif
     */
    public static final int EM_SERVER_OPTION_GB28181 = 2;

    /**
     * \if ENGLISH_LANG
     * Open with GB35114 access
     * \else
     * 以35114接入方式开启
     * \endif
     */
    public static final int EM_SERVER_OPTION_GB35114 = 3;

}
