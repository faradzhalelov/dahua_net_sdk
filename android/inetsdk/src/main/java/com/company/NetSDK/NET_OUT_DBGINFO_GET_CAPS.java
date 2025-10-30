package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * When OperateDebugInfo interface emType is EM_DBGINFO_OP_TYPE.EM_DBGINFO_OP_GET_CAPS,{@link INetSDK#OperateDebugInfo}output param
 * \else
 * 当OperateDebugInfo接口的emType为EM_DBGINFO_OP_TYPE.EM_DBGINFO_OP_GET_CAPS时{@link INetSDK#OperateDebugInfo}出参
 * \endif
 */
public class NET_OUT_DBGINFO_GET_CAPS implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     * Whether serial log redirection is supported,Includes file storage and callbacks
     * \else
     * 是否支持串口日志重定向，包含存文件和回调两种。
     * \endif
     */
    public boolean              bSupportRedir;
}
