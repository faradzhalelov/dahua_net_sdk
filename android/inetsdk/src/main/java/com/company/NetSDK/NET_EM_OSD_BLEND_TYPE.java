package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Overlay Type
 * \else
 * 叠加类型
 * \endif
 */
public class NET_EM_OSD_BLEND_TYPE implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     * unknow overlay type
     * \else
     * 未知叠加类型
     * \endif
     */
    public static final int NET_EM_OSD_BLEND_TYPE_UNKNOWN = 0;

    /**
     * \if ENGLISH_LANG
     * Overlay to main stream
     * \else
     * 叠加到主码流
     * \endif
     */
    public static final int NET_EM_OSD_BLEND_TYPE_MAIN = 1;

    /**
     * \if ENGLISH_LANG
     * Overlay to extra stream 1
     * \else
     * 叠加到辅码流1
     * \endif
     */
    public static final int NET_EM_OSD_BLEND_TYPE_EXTRA1 = 2;

    /**
     * \if ENGLISH_LANG
     * Overlay to extra stream 2
     * \else
     * 叠加到辅码流2
     * \endif
     */
    public static final int NET_EM_OSD_BLEND_TYPE_EXTRA2 = 3;

    /**
     * \if ENGLISH_LANG
     * Overlay to extra stream 3
     * \else
     * 叠加到辅码流3
     * \endif
     */
    public static final int NET_EM_OSD_BLEND_TYPE_EXTRA3 = 4;

    /**
     * \if ENGLISH_LANG
     * Overlay to snap
     * \else
     * 叠加到抓图
     * \endif
     */
    public static final int NET_EM_OSD_BLEND_TYPE_SNAPSHOT = 5;

    /**
     * \if ENGLISH_LANG
     * Overlay to preview mode
     * \else
     * 叠加到预览视频
     * \endif
     */
    public static final int NET_EM_OSD_BLEND_TYPE_PREVIEW = 6;
}
