package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * EM_MEDIA_GLOBAL_SNAP_FORMAT_AS
 * \else
 * @brief 抓图流编码格式参照格式
 * \endif
 */
public class EM_MEDIA_GLOBAL_SNAP_FORMAT_AS implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     * EM_MEDIA_GLOBAL_SNAP_FORMAT_AS_UNKNOWN,
     * \else
     * EM_MEDIA_GLOBAL_SNAP_FORMAT_AS_UNKNOWN,
     * \endif
     */
    public static final int					EM_MEDIA_GLOBAL_SNAP_FORMAT_AS_UNKNOWN = 0;

    /**
     * \if ENGLISH_LANG
     *  refer to main stream
     * \else
     *  参照主码流
     * \endif
     */
    public static final int					EM_MEDIA_GLOBAL_SNAP_FORMAT_AS_MAIN_FORMAT = 1;

    /**
     * \if ENGLISH_LANG
     *  refer to sub stream1
     * \else
     *  参照辅码流1
     * \endif
     */
    public static final int					EM_MEDIA_GLOBAL_SNAP_FORMAT_AS_EXTRA_FORMAT = 2;

    /**
     * \if ENGLISH_LANG
     *  refer to sub stream2
     * \else
     *  参照辅码流2
     * \endif
     */
    public static final int					EM_MEDIA_GLOBAL_SNAP_FORMAT_AS_EXTRA2_FORMAT = 3;

    /**
     * \if ENGLISH_LANG
     *  refer to sub stream3
     * \else
     *  参照辅码流3
     * \endif
     */
    public static final int					EM_MEDIA_GLOBAL_SNAP_FORMAT_AS_EXTRA3_FORMAT = 4;

}
