package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * NetSDK optimize type
 * \else
 * SDK设置内部优化方案
 * \endif
 */
public class EM_OPTIMIZE_TYPE implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * default to do nothing
	 * \else
	 * 默认不优化
	 * \endif
	 */
	public final static int EM_OPT_TYPE_DEFAULT = 0;
	
	/**
	 * \if ENGLISH_LANG
	 * optimized for mobile
	 * \else
	 * 和选项EM_OPT_TYPE_MOBILE_OPTION冲突，两者只能使用一个，不支持异步登陆优化
     * 手机使用优化,开启后，默认过滤设备属性和硬盘信息.
	 * \endif
	 */
	public final static int EM_OPT_TYPE_MOBILE_V1 = 1;
	
	/**
	 * \if ENGLISH_LANG
	 * the set for P2P network param, pParam's type is {@link NET_PARAM}
	 * \else
	 * P2P网络参数设置， pParam 为 {@link NET_PARAM}
	 * \endif
	 */
	public final static int EM_OPT_TYPE_P2P_NETPARAM_V1 = 2;

	/**
	 * \if ENGLISH_LANG
	 * 	mobile login filter option,value type int,bit value for low to high,see {@link EM_LOGIN_OPTTYPE_MOBILE_TYPE}
	 * \else
	 * 和选项EM_OPT_TYPE_MOBILE_V1冲突，两者只能使用一个,支持异步登陆优化
     * 手机登陆过滤可选方式,参数int,按位从低到高，传入的值参考枚举类型{@link EM_LOGIN_OPTTYPE_MOBILE_TYPE}
	 * \endif
	 */
	public final static int EM_OPT_TYPE_MOBILE_OPTION = 3;
}
