package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Hang up video phone, Corresponding {@link CtrlType#SDK_CTRL_VTP_DISCONNECT}
 * \else
 * 挂断视频电话, 对应命令 {@link CtrlType#SDK_CTRL_VTP_DISCONNECT}
 * \endif
 */
public class NET_CTRL_VTP_DISCONNECT implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * The device ID to be forward , NULL means don’t forward
	 * \else
	 * 转发目标设备ID,为NULL表示不转发
	 * \endif
	 */
	public String                   szTargetID; 
	
	/**
	 * \if ENGLISH_LANG
	 * Call type, refer to {@link EM_NET_VTP_CALL_TYPE}
	 * \else
	 * 呼叫类型, 取值参考 {@link EM_NET_VTP_CALL_TYPE}
	 * \endif
	 */
	public int                      emCallType; 
	
	/**
	 * \if ENGLISH_LANG
	 * Intercom unique identifier
	 * \else
	 * 对讲唯一标识
	 * \endif
	 */
	public byte                     szCallID[] = new byte[FinalVar.SDK_COMMON_STRING_128];
}
