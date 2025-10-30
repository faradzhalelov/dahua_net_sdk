package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * @brief Non Motor vehicle StorageBox
 * \else
 * @brief 非机动车后备箱
 * \endif
 */
public class EM_OBJECT_STORAGEBOX_TYPE implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     *  unknown
     * \else
     *  未知
     * \endif
     */
    public static final int					EM_OBJECT_STORAGEBOX_UNKNOWN = 0;

    /**
     * \if ENGLISH_LANG
     *  no
     * \else
     *  无后备箱
     * \endif
     */
    public static final int					EM_OBJECT_STORAGEBOX_NO = 1;

    /**
     * \if ENGLISH_LANG
     *  own Box
     * \else
     *  自带箱
     * \endif
     */
    public static final int					EM_OBJECT_STORAGEBOX_OWNBOX = 2;

    /**
     * \if ENGLISH_LANG
     *  self Packing Box
     * \else
     *  自装箱
     * \endif
     */
    public static final int					EM_OBJECT_STORAGEBOX_SELFPACK = 3;

    /**
     * \if ENGLISH_LANG
     *  both ownBox and self Packing Box 
     * \else
     *  自装箱和自带箱都有
     * \endif
     */
    public static final int					EM_OBJECT_STORAGEBOX_ALL = 4;

}
