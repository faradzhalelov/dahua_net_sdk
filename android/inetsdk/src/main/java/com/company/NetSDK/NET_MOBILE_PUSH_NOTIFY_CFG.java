package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Mobile push notification configuration, using RegisterID + AppID subscription
 * \else
 * 手机push notification配置,  使用RegisterID+AppID订阅
 * \endif
 */
public class NET_MOBILE_PUSH_NOTIFY_CFG implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Mobile phone registered returned with the Appple/Android server, every time is different 
	 * \else
	 * 手机向Appple/ Android服务器注册返回的，每次不同
	 * \endif
	 */
	public byte                           szRegisterID[] = new byte[FinalVar.MAX_REGISTER_ID_LEN];
	
	/**
	 * \if ENGLISH_LANG
	 * Mobile phone for every client, will produce one 
	 * \else
	 * 手机每开一个客户端，会产生一个
	 * \endif
	 */
	public byte                           szAppID[] = new byte[FinalVar.MAX_APP_ID_LEN];
	
	/**
	 * \if ENGLISH_LANG
	 * Platform Type, refer to {@link EM_MOBILE_SERVER_TYPE}
	 * \else
	 * 平台类型, 取值参考 {@link EM_MOBILE_SERVER_TYPE}
	 * \endif
	 */
	public int                             emServerType;
	
	/**
	 * \if ENGLISH_LANG
	 * Push the gateway type, refer to {@link EM_PUSH_GATEWAY_TYPE}, when emServerType is EM_MOBILE_SERVER_TYPE_SDKCLOUD effective
	 * \else
	 * 推送网关类型,取值参考 {@link EM_PUSH_GATEWAY_TYPE}, emServerType为EM_MOBILE_SERVER_TYPE_SDKCLOUD时有效
	 * \endif
	 */
	public int                             emPushGatewayType;
	
	/**
	 * \if ENGLISH_LANG
	 * Valid time, the unit is in seconds
	 * \else
	 * 有效时间，单位为秒
	 * \endif
	 */
	public int                             nPeriodOfValidity;
	
	/**
	 * \if ENGLISH_LANG
	 * Android authentication server address
	 * \else
	 * Android验证服务器地址
	 * \endif
	 */
	public byte                          szAuthServerAddr[] = new byte[FinalVar.MAX_URL_LEN];
	
	/**
	 * \if ENGLISH_LANG
	 * Android authentication server port
	 * \else
	 * Android验证服务器端口
	 * \endif
	 */
	public int                             nAuthServerPort;
	
	/**
	 * \if ENGLISH_LANG
	 * Push the address of the server (PRIVATE agent, at the end of the selected server, for compatible)
	 * By PRIVATE server according to the requirements of the official server, use the latest encryption algorithm and then forwarded to the official server
	 * \else
	 * 推送服务器地址(私有代理，末选服务器，供兼容)
	 * 由私有服务器按官方服务器要求，选用最新的加密算法再转发给官方服务器
	 * \endif
	 */
	public byte                          szPushServerAddr[] = new byte[FinalVar.MAX_URL_LEN];
	
	/**
	 * \if ENGLISH_LANG
	 * Push server port (PRIVATE agent)
	 * \else
	 * 推送服务器端口(私有代理)
	 * \endif
	 */
	public int                             nPushServerPort;
	
	/**
	 * \if ENGLISH_LANG
	 * Set display equipment alias, mobile terminal 
	 * \else
	 * 设备别名，手机端设置显示
	 * \endif
	 */
	public byte                            szDevName[] = new byte[FinalVar.SDK_COMMON_STRING_64];
	
	/**
	 * \if ENGLISH_LANG
	 * Device identifier, mobile terminal settings to use 
	 * \else
	 * 设备标识，手机端设置使用
	 * \endif
	 */
	public byte                            szDevID[] = new byte[FinalVar.SDK_COMMON_STRING_64];
	
	/**
	 * \if ENGLISH_LANG
	 * Login user name 
	 * \else
	 * 登陆用户名
	 * \endif
	 */
	public byte                            szUser[] = new byte[FinalVar.SDK_COMMON_STRING_64];
	
	/**
	 * \if ENGLISH_LANG
	 * Password
	 * \else
	 * 密码
	 * \endif
	 */
	public byte                            szPassword[] = new byte[FinalVar.SDK_COMMON_STRING_64];
	
	/**
	 * \if ENGLISH_LANG
	 * ios certificate information, string after Base64, effective when need to use TLS encryption 
	 * \else
	 * ios证书信息，base64之后的字符串，需要采用TLS加密时有效
	 * \endif
	 */
	public byte                          szCertificate[] = new byte[FinalVar.MAX_IOS_CERTIFICATE_LEN];
	
	/**
	 * \if ENGLISH_LANG
	 * ios secret key,after the base64 string 
	 * \else
	 * ios密钥，base64之后字符串
	 * \endif
	 */
	public byte                          szSecretKey[] = new byte[FinalVar.MAX_IOS_SECRET_KEY_LEN];
	
	/**
	 * \if ENGLISH_LANG
	 * Subscription number MAX, number of object in  pstuSubscribes
	 * \else
	 * 最大订阅类型个数, 表示pstuSubscribes的对象数量
	 * \endif
	 */
	public int                            nSubScribeMax;
	
	/**
	 * \if ENGLISH_LANG
	 * Subscription number in actual, valid in get configuration
	 * \else
	 * 实际的订阅类型个数, 获取配置有效
	 * \endif
	 */
	public int                             nSubScribeNum;
	
	/**
	 * \if ENGLISH_LANG
	 * Subscription type
	 * \else
	 * 订阅类型
	 * \endif
	 */
	public NET_SUBSCRIBE_INFO              pstuSubscribes[];
	
	/**
	 * \if ENGLISH_LANG
	 * Push the server configuration, the official. Preferred server, if push fail, and try again redirection or proxy server 
	 * \else
	 * 推送服务器配置, 官方。首选服务器，如果推送失败，再尝试重定向或代理服务器
	 * \endif
	 */
	public NET_PUSH_SERVER_INFO            stuPushServerMain = new NET_PUSH_SERVER_INFO();
	
	/**
	 * \if ENGLISH_LANG
	 * Push the server configuration (PRIVATE redirection, second server)
	 * \else
	 * 推送服务器配置(私有重定向，次选服务器)
	 * \endif
	 */
	public NET_PUSH_SERVER_INFO            stuPushRedirectServer = new NET_PUSH_SERVER_INFO();

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

	public NET_MOBILE_PUSH_NOTIFY_CFG(int nSubScribeMax) {
		this.nSubScribeMax = nSubScribeMax;
		pstuSubscribes = new NET_SUBSCRIBE_INFO[nSubScribeMax];
		for (int i = 0; i < nSubScribeMax; i++) {
			pstuSubscribes[i] = new NET_SUBSCRIBE_INFO();
		}
	}
}
