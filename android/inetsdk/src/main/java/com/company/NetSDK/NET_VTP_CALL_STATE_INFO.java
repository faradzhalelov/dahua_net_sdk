package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Video phone status informations
 * \else
 * 视频电话状态信息
 * \endif
 */
public class NET_VTP_CALL_STATE_INFO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Call number
	 * \else
	 * 呼叫号码
	 * \endif
	 */
    public byte                        szNumber[] = new byte[FinalVar.SDK_COMMON_STRING_128];
    
    /**
     * \if ENGLISH_LANG
     * Intercom unique identifier
     * \else
     * 对讲唯一标识
     * \endif
     */
    public byte                        szCallID[] = new byte[FinalVar.SDK_COMMON_STRING_128];
    
    /**
     * \if ENGLISH_LANG
     * Call status, refer to  {@link EM_NET_VTP_CALL_STATE_TYPE}
     * \else
     * 呼叫状态 , 取值参考 {@link EM_NET_VTP_CALL_STATE_TYPE}
     * \endif
     */
    public int                         emCallState; 
}
