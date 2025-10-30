package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * Course lock type
 * \else
 * 课程录像锁定类型
 * \endif
 */
public class EM_COURSE_LOCK_TYPE implements Serializable {

    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     * unknown
     * \else
     * 未知
     * \endif
     */
    public final static int EM_COURSE_LOCK_TYPE_UNKNOWN              = -1;
    /**
     * \if ENGLISH_LANG
     * all type
     * \else
     * 全部类型
     * \endif
     */
    public final static int EM_COURSE_LOCK_TYPE_ALL              = 0;

    /**
     * \if ENGLISH_LANG
     * Non locking
     * \else
     * 非锁定类型
     * \endif
     */
    public final static int EM_COURSE_LOCK_TYPE_NON_LOCKING            = 1;

    /**
     * \if ENGLISH_LANG
     * Lock type
     * \else
     * 锁定类型
     * \endif
     */
    public final static int EM_COURSE_LOCK_TYPE_LOCK    = 2;

}
