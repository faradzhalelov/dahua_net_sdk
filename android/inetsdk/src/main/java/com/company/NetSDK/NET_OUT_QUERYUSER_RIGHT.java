package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * query user right output parameter
 * \else
 * 查询用户权限出参
 * \endif
 */
public class NET_OUT_QUERYUSER_RIGHT implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;


    /**
     * \if ENGLISH_LANG
     * right num
     * \else
     * 权限个数
     * \endif
     */
    public int				dwRightNum;

    /**
     * \if ENGLISH_LANG
     * right list
     * \else
     * 权限信息
     * \endif
     */
    public OPR_RIGHT_NEW		rightList[] = new OPR_RIGHT_NEW[FinalVar.SDK_NEW_MAX_RIGHT_NUM];

    /**
     * \if ENGLISH_LANG
     * user info
     * \else
     * 用户信息
     * \endif
     */
    public USER_INFO_NEW		userInfo = new USER_INFO_NEW();

    /**
     * \if ENGLISH_LANG
     * mask锛?x00000001 - support user reuse锛?x00000002 - modify password needs check
     * \else
     * 掩码；0x00000001 - 支持用户复用，0x00000002 - 密码修改需要校验
     * \endif
     */
    public int				dwFunctionMask;

    public NET_OUT_QUERYUSER_RIGHT()
    {
        for (int i = 0; i < rightList.length; ++i) {
            rightList[i] = new OPR_RIGHT_NEW();
        }
    }
}
