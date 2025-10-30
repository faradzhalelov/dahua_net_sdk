package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * 
 * \else
 * @brief 异常事件类型
 * \endif
 */
public class EM_EXCEPTION_TYPE implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     * 
     * \else
     *  未知类型
     * \endif
     */
    public static final int					EM_EXCEPTION_KNOWN = 0;

    /**
     * \if ENGLISH_LANG
     * 
     * \else
     *  不被允许的IP访问设备
     * \endif
     */
    public static final int					EM_EXCEPTION_NOTALLOWED_IPLOGIN = 1;

    /**
     * \if ENGLISH_LANG
     * 
     * \else
     *  账户在非允许时间范围内发起登录
     * \endif
     */
    public static final int					EM_EXCEPTION_NOTALLOWED_TIMELOGIN = 2;

    /**
     * \if ENGLISH_LANG
     * 
     * \else
     *  Web路径爆破行为
     * \endif
     */
    public static final int					EM_EXCEPTION_URLERROR_OVERLIMIT = 3;

    /**
     * \if ENGLISH_LANG
     * 
     * \else
     *  会话连接数超限
     * \endif
     */
    public static final int					EM_EXCEPTION_SESSIONNUM_OVERLIMIT = 4;

    /**
     * \if ENGLISH_LANG
     * 
     * \else
     *  会话ID爆破行为
     * \endif
     */
    public static final int					EM_EXCEPTION_SESSIONID_ERROR_OVERLIMIT = 5;

    /**
     * \if ENGLISH_LANG
     * 
     * \else
     *   网络连接资源被耗尽
     * \endif
     */
    public static final int					EM_EXCEPTION_FDEXHAUSTION = 6;

    /**
     * \if ENGLISH_LANG
     * 
     * \else
     *  可信环境监测到异常程序运行
     * \endif
     */
    public static final int					EM_EXCEPTION_EXCEPTIONPROGRAMRUN = 7;

    /**
     * \if ENGLISH_LANG
     * 
     * \else
     *  用户名密码爆破行为
     * \endif
     */
    public static final int					EM_EXCEPTION_ACCOUNTORPWDERROROVERLIMIT = 8;

    /**
     * \if ENGLISH_LANG
     * 
     * \else
     *  Rootkit检测
     * \endif
     */
    public static final int					EM_EXCEPTION_ROOTKIT_DETECTION = 9;

    /**
     * \if ENGLISH_LANG
     * 
     * \else
     *  隐藏进程检测
     * \endif
     */
    public static final int					EM_EXCEPTION_HIDE_PROCESS_DETECTION = 10;

}
