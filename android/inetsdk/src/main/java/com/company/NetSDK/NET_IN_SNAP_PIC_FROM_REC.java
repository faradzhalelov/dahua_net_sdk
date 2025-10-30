package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * CLIENT_SnapPicFromRecord in param
 * \else
 * CLIENT_SnapPicFromRecord 接口入参
 * \endif
 */
public class NET_IN_SNAP_PIC_FROM_REC implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     * channel
     * \else
     * 抓图通道号
     * \endif
     */
    public int nChannel;

    /**
     * \if ENGLISH_LANG
     * stream type. 0-main 1-extra
     * \else
     * 码流类型, 0-主码流1-辅码流
     * \endif
     */
    public int nStreamType;

    /**
     * \if ENGLISH_LANG
     * snap picture time in the record
     * \else
     * 回放抓图时间点
     * \endif
     */
    public NET_TIME stuTime = new NET_TIME();

}
