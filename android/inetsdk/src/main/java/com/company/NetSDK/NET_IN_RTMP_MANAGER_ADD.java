package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * Bitstream type
 * \else
 * 码流类型
 * \endif
 */
public class NET_IN_RTMP_MANAGER_ADD implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     *  Add streaming address type
     * \else
     *  添加推流地址类型
     * \endif
     */
    public int					emType;

    /**
     * \if ENGLISH_LANG
     *  If the type is 0, it means Live stream, which needs to be filled in
     * \else
     *  Type为0表示实时流时，需要填写
     * \endif
     */
    public NET_RTMP_MANAGER_LIVE_STREAM					stuLiveStream = new NET_RTMP_MANAGER_LIVE_STREAM();

    /**
     * \if ENGLISH_LANG
     *  If the type is 1, it means Record stream, which needs to be filled in
     * \else
     *  Type为1表示回放流时，需要填写
     * \endif
     */
    public NET_RTMP_MANAGER_RECORD_STREAM					stuRecordStream = new NET_RTMP_MANAGER_RECORD_STREAM();

    /**
     * \if ENGLISH_LANG
     *  Add streaming address
     * \else
     *  添加推流地址
     * \endif
     */
    public byte					szUrl[] = new byte[512];

}
