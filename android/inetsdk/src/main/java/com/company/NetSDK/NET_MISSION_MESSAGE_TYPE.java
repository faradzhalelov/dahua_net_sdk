package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * @brief message type (mobile)
 * \else
 * @brief 消息类型(车载)
 * \endif
 */
public class NET_MISSION_MESSAGE_TYPE implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     * text info 
     * \else
     * 文本消息 
     * \endif
     */
    public static final int					NET_MISSION_MESSAGE_TEXT = 0;

    /**
     * \if ENGLISH_LANG
     * ad info 
     * \else
     * 广告信息
     * \endif
     */
    public static final int					NET_MISSION_MESSAGE_AD = 1;

    /**
     * \if ENGLISH_LANG
     * broadcast info
     * \else
     * 广播消息
     * \endif
     */
    public static final int					NET_MISSION_MESSAGE_BROAD = 2;

    /**
     * \if ENGLISH_LANG
     * driver info
     * \else
     * 司机消息
     * \endif
     */
    public static final int					NET_MISSION_MESSAGE_DRIVER = 3;

    /**
     * \if ENGLISH_LANG
     * dispatch command
     * \else
     * 调度指令
     * \endif
     */
    public static final int					NET_MISSION_MESSAGE_DISPATCH = 4;

    /**
     * \if ENGLISH_LANG
     * transparent data   
     * \else
     * 透明数据      
     * \endif
     */
    public static final int					NET_MISSION_MESSAGE_TRANSPARENT = 5;

    /**
     * \if ENGLISH_LANG
     * emergency
     * \else
     * 紧急事件
     * \endif
     */
    public static final int					NET_MISSION_MESSAGE_URGENT = 6;

    /**
     * \if ENGLISH_LANG
     *  Call Type
     * \else
     * 呼叫类型
     * \endif
     */
    public static final int					NET_MISSION_MESSAGE_CALL = 7;

    /**
     * \if ENGLISH_LANG
     *  General alarm type
     * \else
     *  通用报警类型
     * \endif
     */
    public static final int					NET_MISSION_MESSAGE_GENERAL_ALARM = 8;

    /**
     * \if ENGLISH_LANG
     *  One-key alarm for access control
     * \else
     *  门禁一键报警
     * \endif
     */
    public static final int					NET_MISSION_MESSAGE_ACCESS_ONE_KEY_ALARM = 9;

    /**
     * \if ENGLISH_LANG
     *  Abnormal human body TM alarm
     * \else
     *  人体测温异常报警
     * \endif
     */
    public static final int					NET_MISSION_MESSAGE_ABNORMAL_HUMAN_BODY_TEMPERATURE_MEASUREMENT_ALARM = 10;

    /**
     * \if ENGLISH_LANG
     *  No TM alarm
     * \else
     *  未测温报警
     * \endif
     */
    public static final int					NET_MISSION_MESSAGE_NO_TEMPERATURE_MEASUREMENT_ALARM = 11;

    /**
     * \if ENGLISH_LANG
     *  Abnormal breathing
     * \else
     *  呼吸异常
     * \endif
     */
    public static final int					NET_MISSION_MESSAGE_ABNORMAL_BREATH = 12;

    /**
     * \if ENGLISH_LANG
     *  Abnormal heartbeat
     * \else
     *  心跳异常
     * \endif
     */
    public static final int					NET_MISSION_MESSAGE_ABNORMAL_HEARTBEAT = 13;

    /**
     * \if ENGLISH_LANG
     *  Abnormal in getting out of bed
     * \else
     *  在离床异常
     * \endif
     */
    public static final int					NET_MISSION_MESSAGE_ABNORMAL_GET_OUT_BED = 14;

    /**
     * \if ENGLISH_LANG
     *  Abnormal number of people
     * \else
     *  人数异常
     * \endif
     */
    public static final int					NET_MISSION_MESSAGE_ABNORMAL_PEOPLE_NUMBER = 15;

    /**
     * \if ENGLISH_LANG
     *  Falls (Indoor Radar)
     * \else
     *  跌倒(室内雷达)
     * \endif
     */
    public static final int					NET_MISSION_MESSAGE_FALL = 16;

    /**
     * \if ENGLISH_LANG
     *  Dressing change request
     * \else
     *  换药请求
     * \endif
     */
    public static final int					NET_MISSION_MESSAGE_DRESSING_CHANGE_REQUEST = 17;

    /**
     * \if ENGLISH_LANG
     *  Request support
     * \else
     *  请求支援
     * \endif
     */
    public static final int					NET_MISSION_MESSAGE_REQUEST_SUPPORT = 18;

    /**
     * \if ENGLISH_LANG
     *  Nursing request
     * \else
     *  护理请求
     * \endif
     */
    public static final int					NET_MISSION_MESSAGE_NURSING_REQUEST = 19;

    /**
     * \if ENGLISH_LANG
     *  Door light control
     * \else
     *  门灯控制
     * \endif
     */
    public static final int					NET_MISSION_MESSAGE_DOOR_LIGHT_CONTROL = 20;

    /**
     * \if ENGLISH_LANG
     *  Handle disconnected alarm
     * \else
     *  手柄掉线报警
     * \endif
     */
    public static final int					NET_MISSION_MESSAGE_HANDLE_DISCONNECTED_ALARM = 21;

    /**
     * \if ENGLISH_LANG
     *  Police Vehicle Data
     * \else
     *  警车数据
     * \endif
     */
    public static final int					NET_MISSION_MESSAGE_POLICECAR = 22;

    /**
     * \if ENGLISH_LANG
     *    NET_MISSION_MESSAGE_MAX ,
     * \else
     *    NET_MISSION_MESSAGE_MAX  ,
     * \endif
     */
    public static final int					NET_MISSION_MESSAGE_MAX = 23;

}