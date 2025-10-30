package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * {@link INetSDK#AddMobilePusherNotification} input Parameter
 * \else
 * {@link INetSDK#AddMobilePusherNotification} 入参
 * \endif
 */
public class NET_IN_ADD_MOBILE_PUSHER_NOTIFICATION implements Serializable {

	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * RegisterID
	 * \else
	 * RegisterID, 机向Appple/Android服务器注册返回的, 每次不同
	 * \endif
	 */
	public byte						szRegisterID[] = new byte[FinalVar.MAX_REGISTER_ID_LEN];

	/**
	 * \if ENGLISH_LANG
	 * AppID
	 * \else
	 * AppID
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
	 * push server config
	 * \else
	 * 推送服务器配置, 官方。首选服务器,如果推送失败,再尝试重定向或代理服务器
	 * \endif
	 */
	public NET_PUSH_SERVER_INFO_EX     stuPushServerMain = new NET_PUSH_SERVER_INFO_EX();

	/**
	 * \if ENGLISH_LANG
	 * push server address
	 * \else
	 * 推送服务器地址(私有代理,末选服务器,供兼容)
	 * \endif
	 */
	public byte                        szPushServerAddr[] = new byte[FinalVar.MAX_URL_LEN];

	/**
	 * \if ENGLISH_LANG
	 * Device name
	 * \else
	 * 推送服务器端口(私有代理)
	 * \endif
	 */
	public int                         nPushServerPort;

	/**
	 * \if ENGLISH_LANG
	 * Device ID
	 * \else
	 * 设备别名,手机端设置显示
	 * \endif
	 */
	public byte                        szDevName[] = new byte[FinalVar.MAX_COMMON_STRING_64];

	/**
	 * \if ENGLISH_LANG
	 * Push verification username
	 * \else
	 * 设备标识,手机端设置使用
	 * \endif
	 */
	public byte                        szDevID[] = new byte[FinalVar.MAX_COMMON_STRING_64];

	/**
	 * \if ENGLISH_LANG
	 * Certificate
	 * \else
	 * google的GCM/C2DM推送验证用户名
	 * \endif
	 */
	public byte                        szUser[] = new byte[FinalVar.MAX_COMMON_STRING_64];

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
	 * subscribe info, user malloc memory,apply to sizeof(NET_SUBSCRIBE_INFO)*nSubScribeMax
	 * \else
	 * 实际的订阅类型个数, 获取配置有效
	 * \endif
	 */
	public int                         nSubScribeNum;

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
	 * The device push time period is a 7 * 6 two-dimensional array, with 7 elements corresponding to 7 days per week (the first is Sunday), and up to 6 separate time periods per day.
	 * The first number 1 of each time period represents the enabled time period, and 0 is the non enabled state.
	 * When bIsTimeEnable is true, need set valid time period; When bIsTimeEnable is false, device push is limited by time.
	 * \else
	 * 设备推送时间段，为一个7*6的二维数组，7个元素对应每周7天（第一个为星期日），每天内最多6个单独时间段。
	 * 每个时间段的第一个数字1代表该时间段使能，0为非使能状态。
	 * 当bIsTimeEnable为true时，必须设置有效推送时间段; bIsTimeEnable为false时,设备推送不受时间限制
	 * \endif
	 */
	public SDK_TSECT[][]					stuAllEventPushTime = new SDK_TSECT[FinalVar.SDK_N_WEEKS][FinalVar.SDK_N_TSECT];

	/**
	 * \if ENGLISH_LANG
	 * Whether the extension of user name is valid
	 * \else
	 * 登陆用户名的扩展是否有效
	 * \endif
	 */
	public boolean					bUserEx;

	/**
	 * \if ENGLISH_LANG
	 * Extension of user name
	 * \else
	 * 登陆用户名的扩展
	 * \endif
	 */
	public byte                        szUserEx[] = new byte[256];

	/**
	 * \if ENGLISH_LANG
	 * Whether the  stuAllEventPushTime  is enable,default value is false
	 * \else
	 * 设备推送时间段(stuAllEventPushTime)字段是否有效,默认为false
	 * \endif
	 */
	public boolean						bIsTimeEnable;

	/**
	 * \if ENGLISH_LANG
	 * The user name bound to the APP configuration (when deleting the user, the configuration needs to be deleted at the same time)
	 * \else
	 * APP配置所绑定的用户名(当删除该用户时候，需要同时把该条配置删除，实现不再推送到APP)
	 * \endif
	 */
	public byte						szBindingUserName[] = new byte[64];

    public NET_IN_ADD_MOBILE_PUSHER_NOTIFICATION(int nSubScribeNum) {
        this.nSubScribeNum = nSubScribeNum;
        pstuSubscribes = new NET_SUBSCRIBE_INFO_EX[nSubScribeNum];
        for(int i=0; i< nSubScribeNum; ++i) {
            pstuSubscribes[i] = new NET_SUBSCRIBE_INFO_EX();
        }
		for(int i = 0; i < FinalVar.SDK_N_WEEKS; i++) {
			for(int j = 0; j < FinalVar.SDK_N_TSECT; j++) {
				stuAllEventPushTime[i][j] = new SDK_TSECT();
			}
		}
    }
}
