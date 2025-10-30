package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * {@link INetSDK#TrafficSnapByNetwork} 's input param
 * \else
 * 接口 {@link INetSDK#TrafficSnapByNetwork} 输入参数
 * \endif
 */
public class NET_IN_SNAPSHOT implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Trigger type
	 * \else
	 * 触发类型	0-未知	1-中网络触发 2-客户端触发（传入 {@link NET_CLIENT_SNAP_INFO}类的对象）
	 * \endif
	 */
	public int					nTriggerType;			

	public Object				objType;				
}
