package com.company.NetSDK;

import java.io.Serializable;


public class NET_NUMBERSTAT_TYPE implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     * "Region" Region type
     * \else
     * "Region" 区域类型
     * \endif
     */
    public static final int NET_EM_NUMSTAT_TYPE_REGION = 0;

    /**
     * \if ENGLISH_LANG
     * "Entrance"  Entrance type
     * \else
     * "Entrance" 出入口类型
     * \endif
     */
    public static final int NET_EM_NUMSTAT_TYPE_ENTRANCE = 1;

    /**
     * \if ENGLISH_LANG
     * Other
     * \else
     * 其他
     * \endif
     */
    public static final int NET_EM_NUMSTAT_TYPE_OTHER = 2;
}
