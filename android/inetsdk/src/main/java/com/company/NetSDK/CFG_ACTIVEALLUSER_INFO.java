package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Get all active user info， the corresponding interface {@link INetSDK#QueryNewSystemInfo},the corresponding command {@link FinalVar#CFG_USERMANAGER_ACTIVEUSER}
 * \else
 * 得到所有活动的用户信息, 对应接口{@link INetSDK#QueryNewSystemInfo},对应命令 {@link FinalVar#CFG_USERMANAGER_ACTIVEUSER}
 * \endif
 */
public class CFG_ACTIVEALLUSER_INFO implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     * Valid group number
     * \else
     * 有效数组个数
     * \endif
     */
    public int nCount;

    /**
     * \if ENGLISH_LANG
     * Max active user list
     * \else
     * 最大活动用户列表
     * \endif
     */
    public CFG_ACTIVEUSER_INFO[] stuActiveUserInfo = new CFG_ACTIVEUSER_INFO[FinalVar.MAX_ACTIVEUSER_NUM];

    public CFG_ACTIVEALLUSER_INFO() {
        for(int i = 0; i < FinalVar.MAX_ACTIVEUSER_NUM; i++) {
            stuActiveUserInfo[i] = new CFG_ACTIVEUSER_INFO();
        }
    }
}
