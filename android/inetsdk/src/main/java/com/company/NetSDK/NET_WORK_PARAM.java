package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * Custom mode use
 * \else
 * 自定义模式有效
 * \endif
 */
public class NET_WORK_PARAM implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     * PIR recording duration, 0 means unlimited, value range [10,60] seconds
     * \else
     * pir录像时长,0表示无限制,取值范围[10,60]秒
     * \endif
     */
    public int nPirRecordTime;

    /**
     * \if ENGLISH_LANG
     * PIR trigger interval, value range [0,60] seconds
     * \else
     * pir触发时间间隔,取值范围[0,60]秒
     * \endif
     */
    public int nPirPeriod;

    /**
     * \if ENGLISH_LANG
     * Resolution name
     * \else
     * 分辨率名称
     * \endif
     */
    public byte szResolution[] = new byte[16];

    /**
     * \if ENGLISH_LANG
     * Whether the white light is linked, 0: not linked, 1: linked
     * \else
     * 是否联动白光，0:不联动 1:联动
     * \endif
     */
    public int nWhiteLight;


}
