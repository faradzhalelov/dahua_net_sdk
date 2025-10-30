package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * When OperateDebugInfo interface emType is EM_DBGINFO_OP_TYPE.EM_DBGINFO_OP_GET_INFO,{@link INetSDK#OperateDebugInfo}output param
 * \else
 * 当OperateDebugInfo接口的emType为EM_DBGINFO_OP_TYPE.EM_DBGINFO_OP_GET_INFO时{@link INetSDK#OperateDebugInfo}出参
 * \endif
 */
public class NET_OUT_DBGINFO_GET_INFO implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     * Redirected state,{@link EM_DBGINFO_REDIR_STATUS}
     * \else
     * 重定向状态,{@link EM_DBGINFO_REDIR_STATUS}
     * \endif
     */
    public int      emStatus;

    /**
     * \if ENGLISH_LANG
     * File info
     * \else
     * 文件信息
     * \endif
     */
    public NET_DBGINFO_FILEINFO      stuFile[] = new NET_DBGINFO_FILEINFO[10];

    /**
     * \if ENGLISH_LANG
     * Return file info num
     * \else
     * 返回的stuFile有效的个数
     * \endif
     */
    public int                  nRetFileCount;

    public NET_OUT_DBGINFO_GET_INFO(){
        for(int i = 0; i < 10; ++i)
        {
            stuFile[i] = new NET_DBGINFO_FILEINFO();
        }
    }

}
