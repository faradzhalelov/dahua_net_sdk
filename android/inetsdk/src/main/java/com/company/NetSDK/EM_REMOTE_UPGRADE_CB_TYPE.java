package com.company.NetSDK;

import java.io.Serializable;



/**
 * \if ENGLISH_LANG
 * RemoteUpgrade callback type
 * \else
 * 远程升级回调类型
 * \endif
 */
public class EM_REMOTE_UPGRADE_CB_TYPE implements Serializable {

    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     * appending callback	nParam1:total file size, nParam2:send file size
     * \else
     * 推送回调	nParam1 文件总大小 nParam2 已发送大小
     * \endif
     */
    public static final int    EM_REMOTE_UPGRADE_CB_TYPE_APPENDING = 0;

    /**
     * \if ENGLISH_LANG
     * execute callback	nParam1 result of execute
     * \else
     * 完成回调	nParam1不等于０表示错误码，０表示无错误
     * \endif
     */
    public static final int    EM_REMOTE_UPGRADE_CB_TYPE_EXECUTE = 1;

    /**
     * \if ENGLISH_LANG
     * failed callback nParam1 error code
     * \else
     * 失败回调 nParam1 错误码
     * \endif
     */
    public static final int    EM_REMOTE_UPGRADE_CB_TYPE_FAILED = 2;

    /**
     * \if ENGLISH_LANG
     * cancel callback
     * \else
     * 用户取消
     * \endif
     */
    public static final int    EM_REMOTE_UPGRADE_CB_TYPE_CANCEL = 3;
}
