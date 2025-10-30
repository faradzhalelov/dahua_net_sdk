package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * call lift action
 * \else
 * 呼叫电梯方式
 * \endif
 */
public class EM_CALLLIFT_ACTION implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     * Unknown
     * \else
     * 未知
     * \endif
     */
    public static final int EM_CALLLIFT_ACTION_UNKNOWN = -1;

    /**
     * \if ENGLISH_LANG
     * user opens unit door lock through intercom and calls lift to the unit door
     * \else
     * 用户通过对讲分机打开单元门锁，同时呼叫电梯到单元门处
     * \endif
     */
    public static final int EM_CALLLIFT_ACTION_USER_UNLOCK_CALL = 0;

    /**
     * \if ENGLISH_LANG
     * user calls lift directly to his floor
     * \else
     * 用户呼叫电梯到用户所在楼层
     * \endif
     */
    public static final int EM_CALLLIFT_ACTION_USER_DIRECT_CALL = 1;

    /**
     * \if ENGLISH_LANG
     * user calls lift from one floor to another
     * \else
     * 用户呼叫电梯经由某层到某层
     * \endif
     */
    public static final int EM_CALLLIFT_ACTION_USER_REDIRECT_CALL = 2;

    /**
     * \if ENGLISH_LANG
     * user opens unit door lock directly and calls lift to the unit door
     * \else
     * 单元门开锁，同时呼叫电梯到单元门处
     * \endif
     */
    public static final int EM_CALLLIFT_ACTION_DIRECT_UNLOCK_CALL = 3;
}
