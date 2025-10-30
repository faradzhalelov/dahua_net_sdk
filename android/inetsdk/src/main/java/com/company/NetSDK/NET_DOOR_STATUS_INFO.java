package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * access control status info, {@link INetSDK#QueryDevState} port input parameter, corresponding to command {@link FinalVar#SDK_DEVSTATE_DOOR_STATE}
 * \else
 * 门禁状态信息,{@link INetSDK#QueryDevState}接口输入参数,对应命令 {@link FinalVar#SDK_DEVSTATE_DOOR_STATE}
 * \endif
 */
public class NET_DOOR_STATUS_INFO implements Serializable{
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * access control channel no.
	 * \else
	 * 门禁通道号
	 * \endif
	 */
    public int                         nChannel;      
    
	/**
	 * \if ENGLISH_LANG
	 * access control status info, refer to {@link EM_NET_DOOR_STATUS_TYPE}
	 * \else
	 * 门禁状态信息,取值参考 {@link EM_NET_DOOR_STATUS_TYPE}
	 * \endif
	 */
    public int      				  emStateType;            
}
