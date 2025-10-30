package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * NET_WORK_MODE
 * \else
 * NET_WORK_MODE
 * \endif
 */
public class NET_WORK_MODE implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     * work mode, EM_WORK_MODE
     * \else
     * 工作模式, EM_WORK_MODE
     * \endif
     */
    public int emMode;

    /**
     * \if ENGLISH_LANG
     * Custom mode use
     * \else
     * 自定义模式有效
     * \endif
     */
    public NET_WORK_PARAM stuModeParam = new NET_WORK_PARAM();


}
