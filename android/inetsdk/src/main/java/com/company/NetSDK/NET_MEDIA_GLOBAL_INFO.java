package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * @brief Media global config
 * \else
 * @brief 媒体组件全局配置
 * \endif
 */
public class NET_MEDIA_GLOBAL_INFO implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     *  0:by time,1:by size
     * \else
     *  0:按时间,1：按大小
     * \endif
     */
    public int					nPacketType;

    /**
     * \if ENGLISH_LANG
     *  Record packet time length. unit:minite. 1-255
     * \else
     *  录像打包时间长度,单位分钟。1-255
     * \endif
     */
    public byte					byPacketLength;

    /**
     * \if ENGLISH_LANG
     *  align
     * \else
     *  对齐
     * \endif
     */
    public byte					byAlign[] = new byte[3];

    /**
     * \if ENGLISH_LANG
     *  Record packet file size. unit:KB
     * \else
     *  录像打包文件长度,单位KB
     * \endif
     */
    public int					dwPacketSize;

    /**
     * \if ENGLISH_LANG
     *  Is wirte record's log
     * \else
     *  是否记录录像日志
     * \endif
     */
    public boolean					bLogRecord;

    /**
     * \if ENGLISH_LANG
     *  Is write abnormal encode's log
     * \else
     *  是否记录编码异常日志
     * \endif
     */
    public boolean					bLogEncode;

    /**
     * \if ENGLISH_LANG
     *  Snap format reference; If device not support set snap format independently, snap format use reference,{@link EM_MEDIA_GLOBAL_SNAP_FORMAT_AS}
     * \else
     *  抓图流编码格式参照格式；设备不支持独立配置抓图流分辨率格式时，抓图格式根据参照格式设置,{@link EM_MEDIA_GLOBAL_SNAP_FORMAT_AS}
     * \endif
     */
    public int					emSnapFormatAs;

}
