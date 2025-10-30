package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * {@link INetSDK#RemoveRemoteFiles}'s interface input param
 * \else
 * {@link INetSDK#RemoveRemoteFiles} 接口输入参数
 * \endif
 */
public class SDK_IN_REMOVE_REMOTE_FILES implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     * pointer of file path
     * \else
     * 文件路径数组指针
     * \endif
     */
    public String[]            pszPath;

    /**
     * \if ENGLISH_LANG
     * count of file
     * \else
     * 文件路径数量
     * \endif
     */
    public int                 nFileCount;

    public SDK_IN_REMOVE_REMOTE_FILES(int nFileCount) {
        this.nFileCount = nFileCount;
        pszPath = new String[nFileCount];
    }
}
