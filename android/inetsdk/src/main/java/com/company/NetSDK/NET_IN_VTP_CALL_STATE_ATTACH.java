package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Input parameter about the status informations of subscribe to video phone
 * \else
 * 订阅视频电话状态信息 输入参数
 * \endif
 */
public class NET_IN_VTP_CALL_STATE_ATTACH implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * The call type for checking, refer to {@link EM_NET_VTP_CALL_TYPE}
	 * \else
	 * 待查询的呼叫类型, 取值参考 {@link EM_NET_VTP_CALL_TYPE}
	 * \endif
	 */
    public int        emCallType; 
    
    /**
     * \if ENGLISH_LANG
     * The device ID for forward, NULL means not formard
     * \else
     * 转发目标设备ID,为NULL表示不转发
     * \endif
     */
    public String     szTargetID; 
}
