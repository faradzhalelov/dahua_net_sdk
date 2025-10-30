package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * image stable config of video input
 * \else
 * 图像防抖配置
 * \endif
 */
public class NET_VIDEOIN_STABLE_INFO implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * config type, you need set the value wether set or get config, refer to {@link NET_EM_CONFIG_TYPE}
	 * \else
	 * 配置类型,获取和设置时都要指定,取值参考 {@link NET_EM_CONFIG_TYPE}
	 * \endif
	 */
	public int	emCfgType;			 
		
	/**
	 * \if ENGLISH_LANG
	 * image stable type, refer to {@link NET_EM_STABLE_TYPE}
	 * \else
	 * 防抖配置,取值参考 {@link NET_EM_STABLE_TYPE}
	 * \endif
	 */
	public int	emStableType;		
}
