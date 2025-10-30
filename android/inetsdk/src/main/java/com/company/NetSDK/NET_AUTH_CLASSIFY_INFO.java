package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * authority info 
 * \else
 * 权限类型信息
 * \endif
 */
public class NET_AUTH_CLASSIFY_INFO implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * the main authority, refer to {@link EM_AUTHORITY_MAIN_TYPE}
	 * \else
	 * 主权限类型,取值参考 {@link EM_AUTHORITY_MAIN_TYPE}
	 * \endif
	 */
    public int 					 	emMainAuthority;     
    
	/**
	 * \if ENGLISH_LANG
	 * the sub authority, refer to {@link EM_AUTHORITY_SUB_TYPE}
	 * \else
	 * 子权限类型.取值参考{@link EM_AUTHORITY_SUB_TYPE}
	 * \endif
	 */
    public int   					emSubAuthority;      
    
	/**
	 * \if ENGLISH_LANG
	 * the channel,it is valid only when the emSubAuthority is EM_AUTHORITY_SUB_TYPE_MONITOR_FOR_CHANNEL, EM_AUTHORITY_SUB_TYPE_REPLAY_FOR_CHANNEL,EM_AUTHORITY_SUB_TYPE_NET_PREVIEW_FOR_CHANNEL or EM_AUTHORITY_SUB_TYPE_PTZ_FOR_CHANNEL.
	 * \else
	 * 通道号,emSubAuthority为 EM_AUTHORITY_SUB_TYPE_MONITOR_FOR_CHANNEL,EM_AUTHORITY_SUB_TYPE_REPLAY_FOR_CHANNEL,EM_AUTHORITY_SUB_TYPE_NET_PREVIEW_FOR_CHANNEL,EM_AUTHORITY_SUB_TYPE_PTZ_FOR_CHANNEL 时此字段有效
	 * \endif
	 */
    public int                     nChannel;            
}
