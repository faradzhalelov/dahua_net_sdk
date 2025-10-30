package com.company.NetSDK;


import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * VTO device push result related information
 * \else
 * VTO设备推送结果相关信息
 * \endif
 */
public class EM_VTO_PUSH_RESULT_TYPE implements Serializable {

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
    public static final int EM_VTO_PUSH_RESULT_TYPE_UNKNOWN = 0;

    /**
     * \if ENGLISH_LANG
     * Push success
     * \else
     * 推送成功
     * \endif
     */
    public static final int EM_VTO_PUSH_RESULT_TYPE_SUCCESS = 1;

    /**
     * \if ENGLISH_LANG
     * Push tcp connect error
     * \else
     * 与服务器TCP连接失败, 可能网络较差
     * \endif
     */
    public static final int EM_VTO_PUSH_RESULT_TYPE_TCP_CONNECT_ERROR = 2;

    /**
     * \if ENGLISH_LANG
     * Push ssl write time out error
     * \else
     * 向推送服务器Ssl写数据超时
     * \endif
     */
    public static final int EM_VTO_PUSH_RESULT_TYPE_SSL_WRITE_TIME_OUT_ERROR = 3;

    /**
     * \if ENGLISH_LANG
     * Push ssl connect error
     * \else
     * 与推送服务器Ssl连接失败
     * \endif
     */
    public static final int EM_VTO_PUSH_RESULT_TYPE_SSL_ERROR = 4;

    /**
     * \if ENGLISH_LANG
     * Push ssl read time out error
     * \else
     * 读推送服务器SSL数据超时
     * \endif
     */
    public static final int EM_VTO_PUSH_RESULT_TYPE_SSL_READ_TIME_OUT_ERROR = 5;

    /**
     * \if ENGLISH_LANG
     * Push ssl send error
     * \else
     * 设备SSL发送数据失败
     * \endif
     */
    public static final int EM_VTO_PUSH_RESULT_TYPE_SSL_SEND_ERROR = 6;

    /**
     * \if ENGLISH_LANG
     * Push dns error
     * \else
     * 设备DNS解析失败
     * \endif
     */
    public static final int EM_VTO_PUSH_RESULT_TYPE_DNS_ERROR = 7;

    /**
     * \if ENGLISH_LANG
     * Push msg time out
     * \else
     * 网络异常导致消息超时
     * \endif
     */
    public static final int EM_VTO_PUSH_RESULT_TYPE_MSG_TIME_OUT = 8;

    /**
     * \if ENGLISH_LANG
     * Push cert error
     * \else
     * 设备保存的证书有误
     * \endif
     */
    public static final int EM_VTO_PUSH_RESULT_TYPE_CERT_ERROR = 9;

    /**
     * \if ENGLISH_LANG
     * Push ssl recv error
     * \else
     * 设备SSL接收失败
     * \endif
     */
    public static final int EM_VTO_PUSH_RESULT_TYPE_SSL_RECV_ERROR = 10;

    /**
     * \if ENGLISH_LANG
     * Push msg too long error
     * \else
     * 推送的消息过长
     * \endif
     */
    public static final int EM_VTO_PUSH_RESULT_TYPE_TOO_LONG_ERROR = 11;

    /**
     * \if ENGLISH_LANG
     * Fcm invalid registration error
     * \else
     * 在FCM上为非法的注册ID
     * \endif
     */
    public static final int EM_VTO_PUSH_RESULT_TYPE_FCM_INVALID_REGISTRATION_ERROR = 12;

    /**
     * \if ENGLISH_LANG
     * Fcm not registered error
     * \else
     * 未在FCM上进行注册
     * \endif
     */
    public static final int EM_VTO_PUSH_RESULT_TYPE_FCM_NOT_REGISTERED_ERROR = 13;

    /**
     * \if ENGLISH_LANG
     * Fcm message rate exceeded error
     * \else
     * 推送FCM上的消息频率过高
     * \endif
     */
    public static final int EM_VTO_PUSH_RESULT_TYPE_FCM_MSG_RATE_EXCEEDED_ERROR = 14;

    /**
     * \if ENGLISH_LANG
     * Fcm auth error
     * \else
     * FCM鉴权失败
     * \endif
     */
    public static final int EM_VTO_PUSH_RESULT_TYPE_FCM_AUTH_ERROR = 15;

    /**
     * \if ENGLISH_LANG
     * Fcm json error
     * \else
     * FCM Json 格式错误
     * \endif
     */
    public static final int EM_VTO_PUSH_RESULT_TYPE_FCM_JSON_ERROR = 16;

    /**
     * \if ENGLISH_LANG
     * Fcm unavailable error
     * \else
     * FCM 资源错误
     * \endif
     */
    public static final int EM_VTO_PUSH_RESULT_TYPE_FCM_UNAVAILABLE_ERROR = 17;

    /**
     * \if ENGLISH_LANG
     * Fcm other error
     * \else
     * FCM其它错误
     * \endif
     */
    public static final int EM_VTO_PUSH_RESULT_TYPE_FCM_OTHER_ERROR = 18;

    /**
     * \if ENGLISH_LANG
     * Push normal full error
     * \else
     * 普通事件队列满错误
     * \endif
     */
    public static final int EM_VTO_PUSH_RESULT_TYPE_NORMAL_FULL_ERROR = 19;

    /**
     * \if ENGLISH_LANG
     * Push high full error
     * \else
     * 高优先级队列满错误
     * \endif
     */
    public static final int EM_VTO_PUSH_RESULT_TYPE_HIGH_FULL_ERROR = 20;

    /**
     * \if ENGLISH_LANG
     * Currently, no push server IP is available
     * \else
     * 目前暂无可用推送服务器IP
     * \endif
     */
    public static final int EM_VTO_PUSH_RESULT_TYPE_DNS_CHECK_ERROR = 21;

    /**
     * \if ENGLISH_LANG
     * Internal attach error
     * \else
     * 内部attach错误
     * \endif
     */
    public static final int EM_VTO_PUSH_RESULT_TYPE_ATTTACH_ERROR = 22;

    /**
     * \if ENGLISH_LANG
     * Time not in push schedule
     * \else
     * 时间不在推送时间表内
     * \endif
     */
    public static final int EM_VTO_PUSH_RESULT_TYPE_TIME_NOT_IN_SCHEDULE = 23;

    /**
     * \if ENGLISH_LANG
     * Event condition filtering
     * \else
     * 事件自定义条件过滤
     * \endif
     */
    public static final int EM_VTO_PUSH_RESULT_TYPE_EVENT_CUSTOM_FILERED = 24;

    /**
     * \if ENGLISH_LANG
     * Other internal errors
     * \else
     * 其他内部错误
     * \endif
     */
    public static final int EM_VTO_PUSH_RESULT_TYPE_OTHER_ERROR = 25;

}
