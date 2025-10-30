package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Snap Mode param
 * \else
 * 抓图模式配置
 * \endif
 */

public class NET_SNAP_MODE implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     * Snap Mode:0:Automatic capture, 1:Manual capture, 2:Close captrue
     * \else
     * 0:自动抓图，1:手动抓图，2:关闭抓图
     * \endif
     */
    public int             nMode;

    /**
     * \if ENGLISH_LANG
     * Direct Storage Mode, false:close, true:open
     * \else
     * 直存模式，false:关闭, true:开启
     * \endif
     */
    public boolean 			   bDirectStorageMode;
}
