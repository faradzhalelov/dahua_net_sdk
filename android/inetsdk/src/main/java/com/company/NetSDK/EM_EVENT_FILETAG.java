package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * event file's tag type
 * \else
 * 事件文件的文件标签类型
 * \endif
 */
public class EM_EVENT_FILETAG implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     * Before ATM Paste
     * \else
     * ATM贴条前
     * \endif
     */
    public static final int SDK_ATMBEFOREPASTE = 1;

    /**
     * \if ENGLISH_LANG
     * After ATM Paste
     * \else
     * ATM贴条后
     * \endif
     */
    public static final int SDK_ATMAFTERPASTE = 2;
}
