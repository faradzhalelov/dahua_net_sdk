package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Attendance state
 * \else
 * 考勤状态
 * \endif
 */
public class NET_ATTENDANCESTATE implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     * Unknown
     * \else
     * 未知
     * \endif
     */
    public static final int NET_ATTENDANCESTATE_UNKNOWN = 0;

    /**
     * \if ENGLISH_LANG
     * sign in
     * \else
     * 签入
     * \endif
     */
    public static final int NET_ATTENDANCESTATE_SIGNIN = 1;

    /**
     * \if ENGLISH_LANG
     * go out
     * \else
     * 外出
     * \endif
     */
    public static final int NET_ATTENDANCESTATE_GOOUT = 2;

    /**
     * \if ENGLISH_LANG
     * go out and return
     * \else
     * 外出归来
     * \endif
     */
    public static final int NET_ATTENDANCESTATE_GOOUT_AND_RETRUN = 3;

    /**
     * \if ENGLISH_LANG
     * sign out
     * \else
     * 签出
     * \endif
     */
    public static final int NET_ATTENDANCESTATE_SIGNOUT = 4;

    /**
     * \if ENGLISH_LANG
     * work overtime sign in
     * \else
     * 加班签到
     * \endif
     */
    public static final int NET_ATTENDANCESTATE_WORK_OVERTIME_SIGNIN = 5;

    /**
     * \if ENGLISH_LANG
     * work overtime sign out
     * \else
     * 加班签出
     * \endif
     */
    public static final int NET_ATTENDANCESTATE_WORK_OVERTIME_SIGNOUT = 6;
}
