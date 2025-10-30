package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Auto scan information
 * \else
 * 线扫信息
 * \endif
 */
public class NET_AUTOSCAN_INFO implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;


    /**
     * \if ENGLISH_LANG
     * Scan name
     * \else
     * 线扫号名称
     * \endif
     */
    public byte         szName[] = new byte[32];
    /**
     * \if ENGLISH_LANG
     * Scan speed,0~7
     * \else
     * 线扫速度,0~7
     * \endif
     */
    public int						nScanSpeed;

    /**
     * \if ENGLISH_LANG
     * Left enable
     * \else
     * 该线扫左边界是否生效
     * \endif
     */
    public boolean						bLeftEnable;

    /**
     * \if ENGLISH_LANG
     * Right enable
     * \else
     * 该线扫右边界是否生效
     * \endif
     */
    public boolean						bRightEnable;

}
