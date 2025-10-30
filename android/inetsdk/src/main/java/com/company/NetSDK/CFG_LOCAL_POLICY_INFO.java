package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * @brief General configuration local GUI locking policy
 * \else
 * @brief 普通配置本地GUI锁定策略
 * \endif
 */
public class CFG_LOCAL_POLICY_INFO implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     *  Enable login failure attempts
     * \else
     *  登陆失败可尝试次数使能
     * \endif
     */
    public boolean					bLockLoginEnable;

    /**
     * \if ENGLISH_LANG
     *  Zeroing cycle, if the number of login attempts within the specified time does not exceed the number of attempts, the number of attempts will be reset to zero
     * \else
     *  清零周期，如果规定时间内登陆次数未超过可尝试次数，尝试次数清零
     * \endif
     */
    public int					nCheckDuration;

    /**
     * \if ENGLISH_LANG
     *  Number of attempts to log in failed
     * \else
     *  登陆失败可尝试次数
     * \endif
     */
    public int					nLockLoginTimes;

    /**
     * \if ENGLISH_LANG
     *  Login failure lock time
     * \else
     *  登陆失败锁定时间
     * \endif
     */
    public int					nLoginFailLockTime;

}