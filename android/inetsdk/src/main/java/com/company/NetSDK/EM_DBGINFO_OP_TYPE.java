package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * Debug info operate type，corresponding to {@link OperateDebugInfo}
 * \else
 * 调试日志操作类型,对应{@link OperateDebugInfo}接口
 * \endif
 */
public class EM_DBGINFO_OP_TYPE implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     * Set serial port printing to redirect to local storage ,pInParam {@link NET_IN_DBGINFO_SET_REDIR_LOCAL}, pOutParam {@link NET_OUT_DBGINFO_SET_REDIR_LOCAL}
     * \else
     * 设置串口打印重定向到本地存储 ,pInParam {@link NET_IN_DBGINFO_SET_REDIR_LOCAL}, pOutParam {@link NET_OUT_DBGINFO_SET_REDIR_LOCAL}
     * \endif
     */
    public static final int EM_DBGINFO_OP_REDIR_SET_LOCAL = 0;

    /**
     * \if ENGLISH_LANG
     * Cancel serial port printing to redirect to local storage, pInParam {@link NET_IN_DBGINFO_CANCEL_REDIR_LOCAL}, pOutParam {@link NET_OUT_DBGINFO_CANCEL_REDIR_LOCAL}
     * \else
     * 取消串口打印重定向到本地存储 pInParam {@link NET_IN_DBGINFO_CANCEL_REDIR_LOCAL}, pOutParam {@link NET_OUT_DBGINFO_CANCEL_REDIR_LOCAL}
     * \endif
     */
    public static final int EM_DBGINFO_OP_REDIR_CANCEL_LOCAL = 1;

    /**
     * \if ENGLISH_LANG
     * Read log redirection information,pInParam{@link NET_IN_DBGINFO_GET_INFO}, pOutParam{@link NET_OUT_DBGINFO_GET_INFO}
     * \else
     * 读取日志重定向的信息,pInParam{@link NET_IN_DBGINFO_GET_INFO}, pOutParam{@link NET_OUT_DBGINFO_GET_INFO}
     * \endif
     */
    public static final int EM_DBGINFO_OP_GET_INFO = 2;

    /**
     * \if ENGLISH_LANG
     * Get the capability set of acquisition serial port log device,pInParam{@link NET_IN_DBGINFO_GET_CAPS}, pOutParam{@link NET_OUT_DBGINFO_GET_CAPS}
     * \else
     * 获取采集串口日志设备能力集,pInParam{@link NET_IN_DBGINFO_GET_CAPS}, pOutParam{@link NET_OUT_DBGINFO_GET_CAPS}
     * \endif
     */
    public static final int EM_DBGINFO_OP_GET_CAPS = 3;

}
