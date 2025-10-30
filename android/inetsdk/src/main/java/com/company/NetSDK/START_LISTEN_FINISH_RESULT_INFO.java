package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * SDK_START_LISTEN_FINISH_EVENT information
 * \else
 * 订阅事件接口完成异步通知事件(SDK_START_LISTEN_FINISH_EVENT)信息结构体
 * \endif
 */
public class START_LISTEN_FINISH_RESULT_INFO implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     * Event subscribe result, NET_NOERROR:success; non-zero:failed errorcode
     * \else
     * 事件订阅返回结果 NET_NOERROR：成功  非0：失败，值为错误码
     * \endif
     */
    public int		dwEventResult;
}
