package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * operate type of userinfo
 * \else
 * 人员信息操作类型
 * \endif
 */
public class NET_EM_ACCESS_CTL_USER_SERVICE implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     * insert user info, Corresponding to pstInparam = {@link NET_IN_ACCESS_USER_SERVICE_INSERT}, pstOutParam = {@link NET_OUT_ACCESS_USER_SERVICE_INSERT}
     * \else
     * 添加人员信息, 对应结构体 pstInparam = {@link NET_IN_ACCESS_USER_SERVICE_INSERT}, pstOutParam = {@link NET_OUT_ACCESS_USER_SERVICE_INSERT}
     * \endif
     */
    public static final int NET_EM_ACCESS_CTL_USER_SERVICE_INSERT = 0;

    /**
     * \if ENGLISH_LANG
     * get user info, Corresponding to pstInparam = {@link NET_IN_ACCESS_USER_SERVICE_GET}, pstOutParam = {@link NET_OUT_ACCESS_USER_SERVICE_GET}
     * \else
     * 获取人员信息, 对应结构体 pstInparam = {@link NET_IN_ACCESS_USER_SERVICE_GET}, pstOutParam = {@link NET_OUT_ACCESS_USER_SERVICE_GET}
     * \endif
     */
    public static final int NET_EM_ACCESS_CTL_USER_SERVICE_GET = 1;

    /**
     * \if ENGLISH_LANG
     * delete user info, Corresponding to pstInparam = {@link NET_IN_ACCESS_USER_SERVICE_REMOVE}, pstOutParam = {@link NET_OUT_ACCESS_USER_SERVICE_REMOVE}
     * \else
     * 删除人员信息, 对应结构体 pstInparam = {@link NET_IN_ACCESS_USER_SERVICE_REMOVE}, pstOutParam = {@link NET_OUT_ACCESS_USER_SERVICE_REMOVE}
     * \endif
     */
    public static final int NET_EM_ACCESS_CTL_USER_SERVICE_REMOVE = 2;

    /**
     * \if ENGLISH_LANG
     * clear user info, Corresponding to pstInparam = {@link NET_IN_ACCESS_USER_SERVICE_CLEAR}, pstOutParam = {@link NET_OUT_ACCESS_USER_SERVICE_CLEAR}
     * \else
     * 清空所有人员信息, 对应结构体 pstInparam = {@link NET_IN_ACCESS_USER_SERVICE_CLEAR}, pstOutParam = {@link NET_OUT_ACCESS_USER_SERVICE_CLEAR}
     * \endif
     */
    public static final int NET_EM_ACCESS_CTL_USER_SERVICE_CLEAR = 3;

}
