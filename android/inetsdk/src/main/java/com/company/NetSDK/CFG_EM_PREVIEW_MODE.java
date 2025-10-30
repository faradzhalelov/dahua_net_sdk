package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * @brief  Encoding Capability Set
 * \else
 * @brief 多画面预览工作模式
 * \endif
 */
public class CFG_EM_PREVIEW_MODE implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     *  
     * \else
     *  
     * \endif
     */
    public static final int					CFG_EM_PREVIEW_MODE_UNKNOWN = 0;

    /**
     * \if ENGLISH_LANG
     *  a snapshot
     * \else
     *  快照方式
     * \endif
     */
    public static final int					CFG_EM_PREVIEW_MODE_SNAPSHOT = 1;

    /**
     * \if ENGLISH_LANG
     *  division encoding
     * \else
     *  分割编码方式
     * \endif
     */
    public static final int					CFG_EM_PREVIEW_MODE_SPLITENCODE = 2;

    /**
     * \if ENGLISH_LANG
     *  Split Snapshot mode
     * \else
     *  分割快照方式
     * \endif
     */
    public static final int					CFG_EM_PREVIEW_MODE_SPLITSNAP = 3;

}
