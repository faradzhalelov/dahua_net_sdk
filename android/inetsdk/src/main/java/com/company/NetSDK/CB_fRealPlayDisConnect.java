package com.company.NetSDK;

/**
 * \if ENGLISH_LANG
 * Monitor disconnect callback function
 * \else
 * 视频预览断开回调函数
 * \endif
 */
public interface CB_fRealPlayDisConnect {
	/**
	 * \if ENGLISH_LANG
	 * Monitor disconnect callback function
	 * @param lOperateHandle handle, return from {@link INetSDK#StartRealPlay}
	 * @param dwEventType event type，{@link EM_REALPLAY_DISCONNECT_EVENT_TYPE},as: 
	 * <pre>
	 * <tr><td>enumerated type</td><td>meaning</td></tr>
	 * <tr><td>DISCONNECT_EVENT_REAVE</td><td>means advanced user occupy resource of low-level user</td></tr>
	 * <tr><td>DISCONNECT_EVENT_NETFORBID</td><td>net in prohibit </td></tr>
	 * <tr><td>DISCONNECT_EVENT_SUBCONNECT</td><td>dynamic sub connection disconnect</td></tr>
	 * </pre>
	 * \else
	 * 视频预览断开回调函数
	 * @param lOperateHandle 预览句柄 ,{@link INetSDK#StartRealPlay}返回值
	 * @param dwEventType 事件类型, {@link EM_REALPLAY_DISCONNECT_EVENT_TYPE}，见下表： 枚举类型 意义 
	 * <pre>
	 * <tr><td>枚举类型</td><td>意义</td></tr>
	 * <tr><td>DISCONNECT_EVENT_REAVE</td><td>表示高级用户抢占低级用户资源 </td></tr>
	 * <tr><td>DISCONNECT_EVENT_NETFORBID</td><td>禁止入网 </td></tr>
	 * <tr><td>DISCONNECT_EVENT_SUBCONNECT</td><td>动态子链接断开 </td></tr>
	 * </pre>
	 * \endif
	 */
	public void invoke(long lOperateHandle, int dwEventType);
}
