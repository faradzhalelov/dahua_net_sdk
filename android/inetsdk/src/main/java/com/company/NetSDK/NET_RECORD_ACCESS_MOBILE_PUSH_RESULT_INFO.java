package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * VTO device push information record
 * \else
 * VTO设备推送信息记录
 * \endif
 */
public class NET_RECORD_ACCESS_MOBILE_PUSH_RESULT_INFO implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;
    /**
     * \if ENGLISH_LANG
     * Record Number
     * \else
     * 记录集编号
     * \endif
     */
    public int                   nRecNo;

    /**
     * \if ENGLISH_LANG
     * Time of occurrence(UTC)
     * \else
     * 事件产生的时间（UTC时间）
     * \endif
     */
    public int                   nCreateTime;


    /**
     * \if ENGLISH_LANG
     * Platform type，{@link EM_VTO_PUSH_TO_SERVER_TYPE}
     * \else
     * 平台类型,参考{@link EM_VTO_PUSH_TO_SERVER_TYPE}
     * \endif
     */
    public int                   emPushToServerType;

    /**
     * \if ENGLISH_LANG
     * Event name
     * \else
     * 事件名称
     * \endif
     */
    public byte                   szEventName[] = new byte[30];

    /**
     * \if ENGLISH_LANG
     * Push results，{@link EM_VTO_PUSH_RESULT_TYPE}
     * \else
     * 推送结果,参考{@link EM_VTO_PUSH_RESULT_TYPE}
     * \endif
     */
    public int                   emPushResult;

    /**
     * \if ENGLISH_LANG
     * App subscription channel
     * \else
     *  APP订阅通道
     * \endif
     */
    public int                   nChannel;

    /**
     * \if ENGLISH_LANG
     * App registration ID
     * \else
     * App注册ID
     * \endif
     */
    public byte                   szAppRegisterID[] = new byte[256];

    /**
     * \if ENGLISH_LANG
     * App ID
     * \else
     * AppID
     * \endif
     */
    public byte                   szAppID[] = new byte[256];

    /**
     * \if ENGLISH_LANG
     * Device name (mobile terminal setting display)
     * \else
     * 设备名称（手机端设置显示）
     * \endif
     */
    public byte                   szDevName[] = new byte[64];
}
