package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Mobile push notification general information
 * \else
 * 手机push notification 通用信息
 * \endif
 */
public class NET_MOBILE_PUSH_NOTIFICATION_GENERAL_INFO implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     * RegisterID
     * \else
     * 手机向Appple Android服务器注册返回的,每次不同
     * \endif
     */
    public byte						szRegisterID[] = new byte[FinalVar.MAX_REGISTER_ID_LEN];
    /**
     * \if ENGLISH_LANG
     * AppID
     * \else
     * 手机每开一个客户端,会产生一个
     * \endif
     */
    public byte						szAppID[] = new byte[FinalVar.MAX_APP_ID_LEN];

    /**
     * \if ENGLISH_LANG
     * Server Type {@link EM_MOBILE_SERVER_TYPE}
     * \else
     * 平台类型 {@link EM_MOBILE_SERVER_TYPE}
     * \endif
     */
    public int		emServerType;

    /**
     * \if ENGLISH_LANG
     * Push Gateway Type {@link EM_PUSH_GATEWAY_TYPE}
     * \else
     * 推送网关类型, emServerType为EM_MOBILE_SERVER_TYPE_SDKCLOUD时有效 {@link EM_PUSH_GATEWAY_TYPE}
     * \endif
     */
    public int        emPushGatewayType;

    /**
     * \if ENGLISH_LANG
     * Period Of Validity, unit:second
     * \else
     * 有效时间,单位为秒
     * \endif
     */
    public int                         nPeriodOfValidity;

    /**
     * \if ENGLISH_LANG
     * Android server address
     * \else
     * Android验证服务器地址
     * \endif
     */
    public byte                        szAuthServerAddr[] = new byte[FinalVar.MAX_URL_LEN];

    /**
     * \if ENGLISH_LANG
     * Android server port
     * \else
     * Android验证服务器端口
     * \endif
     */
    public int                         nAuthServerPort;

    /**
     * \if ENGLISH_LANG
     * Device ID
     * \else
     * 设备别名,手机端设置显示
     * \endif
     */
    public byte                        szDevName[] = new byte[FinalVar.SDK_COMMON_STRING_64];

    /**
     * \if ENGLISH_LANG
     * Push verification username
     * \else
     * 设备标识,手机端设置使用
     * \endif
     */
    public byte                        szDevID[] = new byte[FinalVar.SDK_COMMON_STRING_64];

    /**
     * \if ENGLISH_LANG
     * Certificate
     * \else
     * google的GCM/C2DM推送验证用户名
     * \endif
     */
    public byte                        szUser[] = new byte[FinalVar.SDK_COMMON_STRING_256];

    /**
     * \if ENGLISH_LANG
     * Secret Key
     * \else
     * 证书信息,base64之后的字符串,需要采用TLS加密时有效, iOS需要
     * \endif
     */
    public byte                        szCertificate[] = new byte[FinalVar.MAX_IOS_CERTIFICATE_LEN];

    /**
     * \if ENGLISH_LANG
     * number of subscribe
     * \else
     * 极光(Jpush)推送密钥, 明文字符串, Android极光Jpush推送需要
     * \endif
     */
    public byte                        szSecretKey[] = new byte[FinalVar.MAX_IOS_SECRET_KEY_LEN];

    /**
     * \if ENGLISH_LANG
     * The user name bound by the app configuration (when deleting the user, you need to delete the configuration at the same time, so that it will not be pushed to the app)
     * \else
     * APP配置所绑定的用户名(当删除该用户时候，需要同时把该条配置删除，实现不再推送到APP)
     * \endif
     */
    public byte                         szBindingUserName[] = new byte[FinalVar.SDK_COMMON_STRING_64];

    /**
     * \if ENGLISH_LANG
     * max number of subscribe
     * \else
     * 最大订阅类型个数, 表示pstuSubscribes的对象数量
     * \endif
     */
    public int                          nSubScribeMax;

    /**
     * \if ENGLISH_LANG
     * number of subscribe
     * \else
     * 实际的订阅类型个数, 获取配置有效
     * \endif
     */
    public int                          nSubScribeNum;

    /**
     * \if ENGLISH_LANG
     *
     * \else
     * 订阅类型,由用户申请内存，大小为sizeof(NET_SUBSCRIBE_INFO)*nSubScribeMax
     * \endif
     */
    public NET_SUBSCRIBE_INFO_EX[]		pstuSubscribes;

    /**
     * \if ENGLISH_LANG
     * push server config info
     * \else
     * 推送服务器配置, 官方。首选服务器,如果推送失败,再尝试重定向或代理服务器
     * \endif
     */
    public NET_PUSH_SERVER_INFO            stuPushServerMain = new NET_PUSH_SERVER_INFO();

    /**
     * \if ENGLISH_LANG
     * The device push time period is a 7 * 6 two-dimensional array, with 7 elements corresponding to 7 days per week (the first is Sunday), and up to 6 separate time periods per day.
     * The first number 1 of each time period represents the enabled time period, and 0 is the non enabled state.
     * When bIsTimeEnable is TRUE, need set valid time period; When bIsTimeEnable is FALSE, device push is limited by time.
     * \else
     * 设备推送时间段，为一个7*6的二维数组，7个元素对应每周7天（第一个为星期日），每天内最多6个单独时间段。
     * 每个时间段的第一个数字1代表该时间段使能，0为非使能状态。
     * 当bIsTimeEnable为true时，必须设置有效推送时间段; bIsTimeEnable为false时,设备推送不受时间限制
     * \endif
     */
    public SDK_TSECT[][]					stuAllEventPushTime = new SDK_TSECT[FinalVar.SDK_N_WEEKS][FinalVar.SDK_N_TSECT];

    public NET_MOBILE_PUSH_NOTIFICATION_GENERAL_INFO(int nSubScribeMax) {
        this.nSubScribeMax = nSubScribeMax;
        pstuSubscribes = new NET_SUBSCRIBE_INFO_EX[nSubScribeMax];
        for (int i = 0; i < nSubScribeMax; ++i) {
            pstuSubscribes[i] = new NET_SUBSCRIBE_INFO_EX();
        }
        for (int i = 0; i < FinalVar.SDK_N_WEEKS; i++) {
            for (int j = 0; j < FinalVar.SDK_N_TSECT; j++) {
                stuAllEventPushTime[i][j] = new SDK_TSECT();
            }
        }
    }
}
